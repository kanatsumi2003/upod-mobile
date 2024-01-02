package f0;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.o;

public final class n {
    public static <TResult> TResult a(k<TResult> kVar) {
        o.f();
        o.i(kVar, "Task must not be null");
        if (kVar.m()) {
            return e(kVar);
        }
        q qVar = new q((p) null);
        f(kVar, qVar);
        qVar.d();
        return e(kVar);
    }

    public static <TResult> TResult b(k<TResult> kVar, long j3, TimeUnit timeUnit) {
        o.f();
        o.i(kVar, "Task must not be null");
        o.i(timeUnit, "TimeUnit must not be null");
        if (kVar.m()) {
            return e(kVar);
        }
        q qVar = new q((p) null);
        f(kVar, qVar);
        if (qVar.e(j3, timeUnit)) {
            return e(kVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> k<TResult> c(Executor executor, Callable<TResult> callable) {
        o.i(executor, "Executor must not be null");
        o.i(callable, "Callback must not be null");
        i0 i0Var = new i0();
        executor.execute(new j0(i0Var, callable));
        return i0Var;
    }

    public static <TResult> k<TResult> d(TResult tresult) {
        i0 i0Var = new i0();
        i0Var.p(tresult);
        return i0Var;
    }

    private static <TResult> TResult e(k<TResult> kVar) {
        if (kVar.n()) {
            return kVar.k();
        }
        if (kVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.j());
    }

    private static <T> void f(k<T> kVar, r<? super T> rVar) {
        Executor executor = m.f1210b;
        kVar.h(executor, rVar);
        kVar.f(executor, rVar);
        kVar.b(executor, rVar);
    }
}
