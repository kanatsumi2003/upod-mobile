package a3;

import a3.k1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.s;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.x;
import m2.d;
import m2.g;
import t2.l;

public class m<T> extends p0<T> implements k<T>, e {

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f75j = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76k = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = d.f49d;

    /* renamed from: g  reason: collision with root package name */
    private final d<T> f77g;

    /* renamed from: h  reason: collision with root package name */
    private final g f78h;

    /* renamed from: i  reason: collision with root package name */
    private t0 f79i;

    public m(d<? super T> dVar, int i3) {
        super(i3);
        this.f77g = dVar;
        this.f78h = dVar.getContext();
    }

    private final boolean A() {
        return q0.c(this.f86f) && ((f) this.f77g).n();
    }

    private final i B(l<? super Throwable, s> lVar) {
        return lVar instanceof i ? (i) lVar : new h1(lVar);
    }

    private final void C(l<? super Throwable, s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        d<T> dVar = this.f77g;
        Throwable th = null;
        f fVar = dVar instanceof f ? (f) dVar : null;
        if (fVar != null) {
            th = fVar.s(this);
        }
        if (th != null) {
            s();
            o(th);
        }
    }

    private final void H(Object obj, int i3, l<? super Throwable, s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof x1) {
            } else {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar != null) {
                            n(lVar, pVar.f133a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw new k2.d();
            }
        } while (!l.a(f76k, this, obj2, J((x1) obj2, obj, i3, lVar, (Object) null)));
        t();
        u(i3);
    }

    static /* synthetic */ void I(m mVar, Object obj, int i3, l lVar, int i4, Object obj2) {
        if (obj2 == null) {
            if ((i4 & 4) != 0) {
                lVar = null;
            }
            mVar.H(obj, i3, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object J(x1 x1Var, Object obj, int i3, l<? super Throwable, s> lVar, Object obj2) {
        if (obj instanceof z) {
            return obj;
        }
        if (!q0.b(i3) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(x1Var instanceof i) || (x1Var instanceof e)) && obj2 == null)) {
            return obj;
        }
        return new y(obj, x1Var instanceof i ? (i) x1Var : null, lVar, obj2, (Throwable) null, 16, (kotlin.jvm.internal.e) null);
    }

    private final boolean K() {
        do {
            int i3 = this._decision;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f75j.compareAndSet(this, 0, 2));
        return true;
    }

    private final x L(Object obj, Object obj2, l<? super Throwable, s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof x1) {
            } else if (!(obj3 instanceof y) || obj2 == null || ((y) obj3).f130d != obj2) {
                return null;
            } else {
                return n.f80a;
            }
        } while (!l.a(f76k, this, obj3, J((x1) obj3, obj, this.f86f, lVar, obj2)));
        t();
        return n.f80a;
    }

    private final boolean M() {
        do {
            int i3 = this._decision;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f75j.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(i.j("Already resumed, but proposed with update ", obj).toString());
    }

    private final void m(l<? super Throwable, s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(i.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean r(Throwable th) {
        if (!A()) {
            return false;
        }
        return ((f) this.f77g).o(th);
    }

    private final void t() {
        if (!A()) {
            s();
        }
    }

    private final void u(int i3) {
        if (!K()) {
            q0.a(this, i3);
        }
    }

    private final String y() {
        Object x3 = x();
        return x3 instanceof x1 ? "Active" : x3 instanceof p ? "Cancelled" : "Completed";
    }

    private final t0 z() {
        k1 k1Var = (k1) getContext().get(k1.f72a);
        if (k1Var == null) {
            return null;
        }
        t0 d4 = k1.a.d(k1Var, true, false, new q(this), 2, (Object) null);
        this.f79i = d4;
        return d4;
    }

    /* access modifiers changed from: protected */
    public String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (!r(th)) {
            o(th);
            t();
        }
    }

    public final boolean G() {
        Object obj = this._state;
        if (!(obj instanceof y) || ((y) obj).f130d == null) {
            this._decision = 0;
            this._state = d.f49d;
            return true;
        }
        s();
        return false;
    }

    public Object a(T t3, Object obj) {
        return L(t3, obj, (l<? super Throwable, s>) null);
    }

    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof x1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof z)) {
                if (obj2 instanceof y) {
                    y yVar = (y) obj2;
                    if (!yVar.c()) {
                        if (l.a(f76k, this, obj2, y.b(yVar, (Object) null, (i) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            yVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (l.a(f76k, this, obj2, new y(obj2, (i) null, (l) null, (Object) null, th, 14, (kotlin.jvm.internal.e) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final d<T> c() {
        return this.f77g;
    }

    public Throwable d(Object obj) {
        Throwable d4 = super.d(obj);
        if (d4 == null) {
            return null;
        }
        c();
        return d4;
    }

    public <T> T e(Object obj) {
        return obj instanceof y ? ((y) obj).f127a : obj;
    }

    public Object f(T t3, Object obj, l<? super Throwable, s> lVar) {
        return L(t3, obj, lVar);
    }

    public void g(T t3, l<? super Throwable, s> lVar) {
        H(t3, this.f86f, lVar);
    }

    public e getCallerFrame() {
        d<T> dVar = this.f77g;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f78h;
    }

    public Object i() {
        return x();
    }

    public void k(l<? super Throwable, s> lVar) {
        i B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (l.a(f76k, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof i) {
                C(lVar, obj);
            } else {
                boolean z3 = obj instanceof z;
                if (z3) {
                    z zVar = (z) obj;
                    if (!zVar.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof p) {
                        Throwable th = null;
                        if (!z3) {
                            zVar = null;
                        }
                        if (zVar != null) {
                            th = zVar.f133a;
                        }
                        m(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof y) {
                    y yVar = (y) obj;
                    if (yVar.f128b != null) {
                        C(lVar, obj);
                    }
                    if (!(B instanceof e)) {
                        if (yVar.c()) {
                            m(lVar, yVar.f131e);
                            return;
                        }
                        if (l.a(f76k, this, obj, y.b(yVar, (Object) null, B, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(B instanceof e)) {
                    if (l.a(f76k, this, obj, new y(obj, B, (l) null, (Object) null, (Throwable) null, 28, (kotlin.jvm.internal.e) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void l(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(i.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void n(l<? super Throwable, s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new c0(i.j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean o(Throwable th) {
        Object obj;
        boolean z3;
        do {
            obj = this._state;
            if (!(obj instanceof x1)) {
                return false;
            }
            z3 = obj instanceof i;
        } while (!l.a(f76k, this, obj, new p(this, th, z3)));
        i iVar = z3 ? (i) obj : null;
        if (iVar != null) {
            l(iVar, th);
        }
        t();
        u(this.f86f);
        return true;
    }

    public Object p(Throwable th) {
        return L(new z(th, false, 2, (kotlin.jvm.internal.e) null), (Object) null, (l<? super Throwable, s>) null);
    }

    public void q(Object obj) {
        u(this.f86f);
    }

    public void resumeWith(Object obj) {
        I(this, d0.b(obj, this), this.f86f, (l) null, 4, (Object) null);
    }

    public final void s() {
        t0 t0Var = this.f79i;
        if (t0Var != null) {
            t0Var.a();
            this.f79i = w1.f126d;
        }
    }

    public String toString() {
        return D() + '(' + m0.c(this.f77g) + "){" + y() + "}@" + m0.b(this);
    }

    public Throwable v(k1 k1Var) {
        return k1Var.m();
    }

    public final Object w() {
        k1 k1Var;
        boolean A = A();
        if (M()) {
            if (this.f79i == null) {
                z();
            }
            if (A) {
                F();
            }
            return d.c();
        }
        if (A) {
            F();
        }
        Object x3 = x();
        if (x3 instanceof z) {
            throw ((z) x3).f133a;
        } else if (!q0.b(this.f86f) || (k1Var = (k1) getContext().get(k1.f72a)) == null || k1Var.b()) {
            return e(x3);
        } else {
            CancellationException m3 = k1Var.m();
            b(x3, m3);
            throw m3;
        }
    }

    public final Object x() {
        return this._state;
    }
}
