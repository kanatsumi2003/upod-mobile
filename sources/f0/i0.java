package f0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import t.o;

final class i0<TResult> extends k<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1200a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final e0<TResult> f1201b = new e0<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f1202c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f1203d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f1204e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f1205f;

    i0() {
    }

    private final void t() {
        o.k(this.f1202c, "Task is not yet complete");
    }

    private final void u() {
        if (this.f1203d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void v() {
        if (this.f1202c) {
            throw d.a(this);
        }
    }

    private final void w() {
        synchronized (this.f1200a) {
            if (this.f1202c) {
                this.f1201b.b(this);
            }
        }
    }

    public final k<TResult> a(e eVar) {
        b(m.f1209a, eVar);
        return this;
    }

    public final k<TResult> b(Executor executor, e eVar) {
        this.f1201b.a(new w(executor, eVar));
        w();
        return this;
    }

    public final k<TResult> c(f<TResult> fVar) {
        this.f1201b.a(new y(m.f1209a, fVar));
        w();
        return this;
    }

    public final k<TResult> d(Executor executor, f<TResult> fVar) {
        this.f1201b.a(new y(executor, fVar));
        w();
        return this;
    }

    public final k<TResult> e(g gVar) {
        f(m.f1209a, gVar);
        return this;
    }

    public final k<TResult> f(Executor executor, g gVar) {
        this.f1201b.a(new a0(executor, gVar));
        w();
        return this;
    }

    public final k<TResult> g(h<? super TResult> hVar) {
        h(m.f1209a, hVar);
        return this;
    }

    public final k<TResult> h(Executor executor, h<? super TResult> hVar) {
        this.f1201b.a(new c0(executor, hVar));
        w();
        return this;
    }

    public final <TContinuationResult> k<TContinuationResult> i(Executor executor, c<TResult, k<TContinuationResult>> cVar) {
        i0 i0Var = new i0();
        this.f1201b.a(new u(executor, cVar, i0Var));
        w();
        return i0Var;
    }

    public final Exception j() {
        Exception exc;
        synchronized (this.f1200a) {
            exc = this.f1205f;
        }
        return exc;
    }

    public final TResult k() {
        TResult tresult;
        synchronized (this.f1200a) {
            t();
            u();
            Exception exc = this.f1205f;
            if (exc == null) {
                tresult = this.f1204e;
            } else {
                throw new j(exc);
            }
        }
        return tresult;
    }

    public final boolean l() {
        return this.f1203d;
    }

    public final boolean m() {
        boolean z3;
        synchronized (this.f1200a) {
            z3 = this.f1202c;
        }
        return z3;
    }

    public final boolean n() {
        boolean z3;
        synchronized (this.f1200a) {
            z3 = false;
            if (this.f1202c && !this.f1203d && this.f1205f == null) {
                z3 = true;
            }
        }
        return z3;
    }

    public final void o(Exception exc) {
        o.i(exc, "Exception must not be null");
        synchronized (this.f1200a) {
            v();
            this.f1202c = true;
            this.f1205f = exc;
        }
        this.f1201b.b(this);
    }

    public final void p(TResult tresult) {
        synchronized (this.f1200a) {
            v();
            this.f1202c = true;
            this.f1204e = tresult;
        }
        this.f1201b.b(this);
    }

    public final boolean q() {
        synchronized (this.f1200a) {
            if (this.f1202c) {
                return false;
            }
            this.f1202c = true;
            this.f1203d = true;
            this.f1201b.b(this);
            return true;
        }
    }

    public final boolean r(Exception exc) {
        o.i(exc, "Exception must not be null");
        synchronized (this.f1200a) {
            if (this.f1202c) {
                return false;
            }
            this.f1202c = true;
            this.f1205f = exc;
            this.f1201b.b(this);
            return true;
        }
    }

    public final boolean s(TResult tresult) {
        synchronized (this.f1200a) {
            if (this.f1202c) {
                return false;
            }
            this.f1202c = true;
            this.f1204e = tresult;
            this.f1201b.b(this);
            return true;
        }
    }
}
