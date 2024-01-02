package a3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.d;
import m2.g;

public final class c1 extends b1 {

    /* renamed from: f  reason: collision with root package name */
    private final Executor f47f;

    public c1(Executor executor) {
        this.f47f = executor;
        d.a(p());
    }

    private final void k(g gVar, RejectedExecutionException rejectedExecutionException) {
        o1.c(gVar, a1.a("The task was rejected", rejectedExecutionException));
    }

    public void close() {
        Executor p3 = p();
        ExecutorService executorService = p3 instanceof ExecutorService ? (ExecutorService) p3 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof c1) && ((c1) obj).p() == p();
    }

    public void f(g gVar, Runnable runnable) {
        try {
            Executor p3 = p();
            c.a();
            p3.execute(runnable);
        } catch (RejectedExecutionException e4) {
            c.a();
            k(gVar, e4);
            s0.b().f(gVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(p());
    }

    public Executor p() {
        return this.f47f;
    }

    public String toString() {
        return p().toString();
    }
}
