package kotlinx.coroutines.internal;

import a3.a0;
import a3.b2;
import a3.d0;
import a3.f0;
import a3.k;
import a3.l;
import a3.m;
import a3.m0;
import a3.p0;
import a3.v0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.s;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.i;
import m2.d;
import m2.g;

public final class f<T> extends p0<T> implements e, d<T> {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2124k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g  reason: collision with root package name */
    public final f0 f2125g;

    /* renamed from: h  reason: collision with root package name */
    public final d<T> f2126h;

    /* renamed from: i  reason: collision with root package name */
    public Object f2127i = g.f2129a;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2128j = b0.b(getContext());

    public f(f0 f0Var, d<? super T> dVar) {
        super(-1);
        this.f2125g = f0Var;
        this.f2126h = dVar;
    }

    private final m<?> m() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof m) {
            return (m) obj;
        }
        return null;
    }

    public void b(Object obj, Throwable th) {
        if (obj instanceof a0) {
            ((a0) obj).f42b.invoke(th);
        }
    }

    public d<T> c() {
        return this;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f2126h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f2126h.getContext();
    }

    public Object i() {
        Object obj = this.f2127i;
        this.f2127i = g.f2129a;
        return obj;
    }

    public final void j() {
        do {
        } while (this._reusableCancellableContinuation == g.f2130b);
    }

    public final m<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f2130b;
                return null;
            } else if (obj instanceof m) {
                if (l.a(f2124k, this, obj, g.f2130b)) {
                    return (m) obj;
                }
            } else if (obj != g.f2130b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(i.j("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean n() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            x xVar = g.f2130b;
            if (i.a(obj, xVar)) {
                if (l.a(f2124k, this, xVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (l.a(f2124k, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        m<?> m3 = m();
        if (m3 != null) {
            m3.s();
        }
    }

    public void resumeWith(Object obj) {
        g context;
        Object c4;
        g context2 = this.f2126h.getContext();
        Object d4 = d0.d(obj, (t2.l) null, 1, (Object) null);
        if (this.f2125g.g(context2)) {
            this.f2127i = d4;
            this.f86f = 0;
            this.f2125g.f(context2, this);
            return;
        }
        v0 a4 = b2.f45a.a();
        if (a4.v()) {
            this.f2127i = d4;
            this.f86f = 0;
            a4.q(this);
            return;
        }
        a4.t(true);
        try {
            context = getContext();
            c4 = b0.c(context, this.f2128j);
            this.f2126h.resumeWith(obj);
            s sVar = s.f2081a;
            b0.a(context, c4);
            do {
            } while (a4.x());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a4.k(true);
                throw th2;
            }
        }
        a4.k(true);
    }

    public final Throwable s(k<?> kVar) {
        x xVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            xVar = g.f2130b;
            if (obj != xVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(i.j("Inconsistent state ", obj).toString());
                } else if (l.a(f2124k, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!l.a(f2124k, this, xVar, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f2125g + ", " + m0.c(this.f2126h) + ']';
    }
}
