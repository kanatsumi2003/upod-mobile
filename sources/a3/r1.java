package a3;

import a3.k1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.t;
import m2.g;
import t2.p;

public class r1 implements k1, t, y1 {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f90d = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends q1 {

        /* renamed from: h  reason: collision with root package name */
        private final r1 f91h;

        /* renamed from: i  reason: collision with root package name */
        private final b f92i;

        /* renamed from: j  reason: collision with root package name */
        private final s f93j;

        /* renamed from: k  reason: collision with root package name */
        private final Object f94k;

        public a(r1 r1Var, b bVar, s sVar, Object obj) {
            this.f91h = r1Var;
            this.f92i = bVar;
            this.f93j = sVar;
            this.f94k = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            y((Throwable) obj);
            return s.f2081a;
        }

        public void y(Throwable th) {
            this.f91h.E(this.f92i, this.f93j, this.f94k);
        }
    }

    private static final class b implements f1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: d  reason: collision with root package name */
        private final v1 f95d;

        public b(v1 v1Var, boolean z3, Throwable th) {
            this.f95d = v1Var;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable e4 = e();
            if (e4 == null) {
                m(th);
            } else if (th != e4) {
                Object d4 = d();
                if (d4 == null) {
                    l(th);
                } else if (d4 instanceof Throwable) {
                    if (th != d4) {
                        ArrayList<Throwable> c4 = c();
                        c4.add(d4);
                        c4.add(th);
                        s sVar = s.f2081a;
                        l(c4);
                    }
                } else if (d4 instanceof ArrayList) {
                    ((ArrayList) d4).add(th);
                } else {
                    throw new IllegalStateException(i.j("State is ", d4).toString());
                }
            }
        }

        public boolean b() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public v1 h() {
            return this.f95d;
        }

        public final boolean i() {
            return d() == s1.f108e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d4 = d();
            if (d4 == null) {
                arrayList = c();
            } else if (d4 instanceof Throwable) {
                ArrayList<Throwable> c4 = c();
                c4.add(d4);
                arrayList = c4;
            } else if (d4 instanceof ArrayList) {
                arrayList = (ArrayList) d4;
            } else {
                throw new IllegalStateException(i.j("State is ", d4).toString());
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (th != null && !i.a(th, e4)) {
                arrayList.add(th);
            }
            l(s1.f108e);
            return arrayList;
        }

        public final void k(boolean z3) {
            this._isCompleting = z3 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + h() + ']';
        }
    }

    public static final class c extends m.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f96d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r1 f97e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f98f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m mVar, r1 r1Var, Object obj) {
            super(mVar);
            this.f96d = mVar;
            this.f97e = r1Var;
            this.f98f = obj;
        }

        /* renamed from: i */
        public Object g(m mVar) {
            if (this.f97e.O() == this.f98f) {
                return null;
            }
            return l.a();
        }
    }

    public r1(boolean z3) {
        this._state = z3 ? s1.f110g : s1.f109f;
        this._parentHandle = null;
    }

    private final boolean A(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        r N = N();
        return (N == null || N == w1.f126d) ? z3 : N.f(th) || z3;
    }

    private final void D(f1 f1Var, Object obj) {
        r N = N();
        if (N != null) {
            N.a();
            h0(w1.f126d);
        }
        Throwable th = null;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            th = zVar.f133a;
        }
        if (f1Var instanceof q1) {
            try {
                ((q1) f1Var).y(th);
            } catch (Throwable th2) {
                Q(new c0("Exception in completion handler " + f1Var + " for " + this, th2));
            }
        } else {
            v1 h3 = f1Var.h();
            if (h3 != null) {
                a0(h3, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void E(b bVar, s sVar, Object obj) {
        s Y = Y(sVar);
        if (Y == null || !r0(bVar, Y, obj)) {
            w(G(bVar, obj));
        }
    }

    private final Throwable F(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new l1(B(), (Throwable) null, this) : th;
        } else if (obj != null) {
            return ((y1) obj).j();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final Object G(b bVar, Object obj) {
        boolean f4;
        Throwable J;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar == null ? null : zVar.f133a;
        synchronized (bVar) {
            f4 = bVar.f();
            List<Throwable> j3 = bVar.j(th);
            J = J(bVar, j3);
            if (J != null) {
                v(J, j3);
            }
        }
        boolean z3 = false;
        if (!(J == null || J == th)) {
            obj = new z(J, false, 2, (e) null);
        }
        if (J != null) {
            if (A(J) || P(J)) {
                z3 = true;
            }
            if (z3) {
                if (obj != null) {
                    ((z) obj).b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!f4) {
            b0(J);
        }
        c0(obj);
        l.a(f90d, this, bVar, s1.g(obj));
        D(bVar, obj);
        return obj;
    }

    private final s H(f1 f1Var) {
        s sVar = f1Var instanceof s ? (s) f1Var : null;
        if (sVar != null) {
            return sVar;
        }
        v1 h3 = f1Var.h();
        if (h3 == null) {
            return null;
        }
        return Y(h3);
    }

    private final Throwable I(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f133a;
    }

    private final Throwable J(b bVar, List<? extends Throwable> list) {
        T t3 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t3 = next;
                    break;
                }
            }
            Throwable th = (Throwable) t3;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.f()) {
            return new l1(B(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final v1 M(f1 f1Var) {
        v1 h3 = f1Var.h();
        if (h3 != null) {
            return h3;
        }
        if (f1Var instanceof u0) {
            return new v1();
        }
        if (f1Var instanceof q1) {
            f0((q1) f1Var);
            return null;
        }
        throw new IllegalStateException(i.j("State should have list: ", f1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        Z(((a3.r1.b) r2).h(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return a3.s1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object U(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.O()
            boolean r3 = r2 instanceof a3.r1.b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            a3.r1$b r3 = (a3.r1.b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.x r7 = a3.s1.f107d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            a3.r1$b r3 = (a3.r1.b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.f()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.F(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            a3.r1$b r7 = (a3.r1.b) r7     // Catch:{ all -> 0x004f }
            r7.a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            a3.r1$b r7 = (a3.r1.b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            a3.r1$b r2 = (a3.r1.b) r2
            a3.v1 r7 = r2.h()
            r6.Z(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.x r7 = a3.s1.f104a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof a3.f1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.F(r7)
        L_0x005c:
            r3 = r2
            a3.f1 r3 = (a3.f1) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.o0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.x r7 = a3.s1.f104a
            return r7
        L_0x0070:
            a3.z r3 = new a3.z
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.p0(r2, r3)
            kotlinx.coroutines.internal.x r4 = a3.s1.f104a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.x r2 = a3.s1.f106c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.String r7 = "Cannot happen in "
            java.lang.String r7 = kotlin.jvm.internal.i.j(r7, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x009a:
            kotlinx.coroutines.internal.x r7 = a3.s1.f107d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r1.U(java.lang.Object):java.lang.Object");
    }

    private final q1 W(t2.l<? super Throwable, s> lVar, boolean z3) {
        q1 q1Var = null;
        if (z3) {
            if (lVar instanceof m1) {
                q1Var = (m1) lVar;
            }
            if (q1Var == null) {
                q1Var = new i1(lVar);
            }
        } else {
            q1 q1Var2 = lVar instanceof q1 ? (q1) lVar : null;
            if (q1Var2 != null) {
                q1Var = q1Var2;
            }
            if (q1Var == null) {
                q1Var = new j1(lVar);
            }
        }
        q1Var.A(this);
        return q1Var;
    }

    private final s Y(m mVar) {
        while (mVar.t()) {
            mVar = mVar.q();
        }
        while (true) {
            mVar = mVar.p();
            if (!mVar.t()) {
                if (mVar instanceof s) {
                    return (s) mVar;
                }
                if (mVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    private final void Z(v1 v1Var, Throwable th) {
        c0 c0Var;
        b0(th);
        c0 c0Var2 = null;
        for (m mVar = (m) v1Var.o(); !i.a(mVar, v1Var); mVar = mVar.p()) {
            if (mVar instanceof m1) {
                q1 q1Var = (q1) mVar;
                try {
                    q1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 != null) {
            Q(c0Var2);
        }
        A(th);
    }

    private final void a0(v1 v1Var, Throwable th) {
        c0 c0Var;
        c0 c0Var2 = null;
        for (m mVar = (m) v1Var.o(); !i.a(mVar, v1Var); mVar = mVar.p()) {
            if (mVar instanceof q1) {
                q1 q1Var = (q1) mVar;
                try {
                    q1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + q1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 != null) {
            Q(c0Var2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [a3.e1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e0(a3.u0 r3) {
        /*
            r2 = this;
            a3.v1 r0 = new a3.v1
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            a3.e1 r1 = new a3.e1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f90d
            a3.l.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r1.e0(a3.u0):void");
    }

    private final void f0(q1 q1Var) {
        q1Var.k(new v1());
        l.a(f90d, this, q1Var, q1Var.p());
    }

    private final int i0(Object obj) {
        if (obj instanceof u0) {
            if (((u0) obj).b()) {
                return 0;
            }
            if (!l.a(f90d, this, obj, s1.f110g)) {
                return -1;
            }
            d0();
            return 1;
        } else if (!(obj instanceof e1)) {
            return 0;
        } else {
            if (!l.a(f90d, this, obj, ((e1) obj).h())) {
                return -1;
            }
            d0();
            return 1;
        }
    }

    private final String j0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof f1 ? ((f1) obj).b() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException l0(r1 r1Var, Throwable th, String str, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            return r1Var.k0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean n0(f1 f1Var, Object obj) {
        if (!l.a(f90d, this, f1Var, s1.g(obj))) {
            return false;
        }
        b0((Throwable) null);
        c0(obj);
        D(f1Var, obj);
        return true;
    }

    private final boolean o0(f1 f1Var, Throwable th) {
        v1 M = M(f1Var);
        if (M == null) {
            return false;
        }
        if (!l.a(f90d, this, f1Var, new b(M, false, th))) {
            return false;
        }
        Z(M, th);
        return true;
    }

    private final Object p0(Object obj, Object obj2) {
        return !(obj instanceof f1) ? s1.f104a : (((obj instanceof u0) || (obj instanceof q1)) && !(obj instanceof s) && !(obj2 instanceof z)) ? n0((f1) obj, obj2) ? obj2 : s1.f106c : q0((f1) obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        Z(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r7 = H(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r7 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r0(r1, r7, r8) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        return a3.s1.f105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        return G(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object q0(a3.f1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            a3.v1 r0 = r6.M(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.x r7 = a3.s1.f106c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof a3.r1.b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            a3.r1$b r1 = (a3.r1.b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            a3.r1$b r1 = new a3.r1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.g()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.x r7 = a3.s1.f104a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.k(r3)     // Catch:{ all -> 0x0078 }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f90d     // Catch:{ all -> 0x0078 }
            boolean r4 = a3.l.a(r4, r6, r7, r1)     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.x r7 = a3.s1.f106c     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = r1.f()     // Catch:{ all -> 0x0078 }
            boolean r5 = r8 instanceof a3.z     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x004a
            r5 = r8
            a3.z r5 = (a3.z) r5     // Catch:{ all -> 0x0078 }
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            java.lang.Throwable r5 = r5.f133a     // Catch:{ all -> 0x0078 }
            r1.a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0053:
            java.lang.Throwable r5 = r1.e()     // Catch:{ all -> 0x0078 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x005b
            r2 = r5
        L_0x005b:
            k2.s r3 = k2.s.f2081a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r6.Z(r0, r2)
        L_0x0064:
            a3.s r7 = r6.H(r7)
            if (r7 == 0) goto L_0x0073
            boolean r7 = r6.r0(r1, r7, r8)
            if (r7 == 0) goto L_0x0073
            kotlinx.coroutines.internal.x r7 = a3.s1.f105b
            return r7
        L_0x0073:
            java.lang.Object r7 = r6.G(r1, r8)
            return r7
        L_0x0078:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r1.q0(a3.f1, java.lang.Object):java.lang.Object");
    }

    private final boolean r0(b bVar, s sVar, Object obj) {
        while (k1.a.d(sVar.f99h, false, false, new a(this, bVar, sVar, obj), 1, (Object) null) == w1.f126d) {
            sVar = Y(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(Object obj, v1 v1Var, q1 q1Var) {
        int x3;
        c cVar = new c(q1Var, this, obj);
        do {
            x3 = v1Var.q().x(q1Var, v1Var, cVar);
            if (x3 == 1) {
                return true;
            }
        } while (x3 != 2);
        return false;
    }

    private final void v(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    private final Object z(Object obj) {
        Object p02;
        do {
            Object O = O();
            if (!(O instanceof f1) || ((O instanceof b) && ((b) O).g())) {
                return s1.f104a;
            }
            p02 = p0(O, new z(F(obj), false, 2, (e) null));
        } while (p02 == s1.f106c);
        return p02;
    }

    /* access modifiers changed from: protected */
    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && K();
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return false;
    }

    public final r N() {
        return (r) this._parentHandle;
    }

    public final Object O() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean P(Throwable th) {
        return false;
    }

    public void Q(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void R(k1 k1Var) {
        if (k1Var == null) {
            h0(w1.f126d);
            return;
        }
        k1Var.start();
        r h3 = k1Var.h(this);
        h0(h3);
        if (S()) {
            h3.a();
            h0(w1.f126d);
        }
    }

    public final boolean S() {
        return !(O() instanceof f1);
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return false;
    }

    public final Object V(Object obj) {
        Object p02;
        do {
            p02 = p0(O(), obj);
            if (p02 == s1.f104a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, I(obj));
            }
        } while (p02 == s1.f106c);
        return p02;
    }

    public String X() {
        return m0.a(this);
    }

    public boolean b() {
        Object O = O();
        return (O instanceof f1) && ((f1) O).b();
    }

    /* access modifiers changed from: protected */
    public void b0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void c0(Object obj) {
    }

    public final void d(y1 y1Var) {
        x(y1Var);
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        return k1.a.b(this, r3, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(a3.q1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.O()
            boolean r1 = r0 instanceof a3.q1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f90d
            a3.u0 r2 = a3.s1.f110g
            boolean r0 = a3.l.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof a3.f1
            if (r1 == 0) goto L_0x0027
            a3.f1 r0 = (a3.f1) r0
            a3.v1 r0 = r0.h()
            if (r0 == 0) goto L_0x0027
            r4.u()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r1.g0(a3.q1):void");
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return k1.a.c(this, cVar);
    }

    public final g.c<?> getKey() {
        return k1.f72a;
    }

    public final r h(t tVar) {
        return (r) k1.a.d(this, true, false, new s(tVar), 2, (Object) null);
    }

    public final void h0(r rVar) {
        this._parentHandle = rVar;
    }

    public final t0 i(boolean z3, boolean z4, t2.l<? super Throwable, s> lVar) {
        q1 W = W(lVar, z3);
        while (true) {
            Object O = O();
            if (O instanceof u0) {
                u0 u0Var = (u0) O;
                if (!u0Var.b()) {
                    e0(u0Var);
                } else if (l.a(f90d, this, O, W)) {
                    return W;
                }
            } else {
                Throwable th = null;
                if (O instanceof f1) {
                    v1 h3 = ((f1) O).h();
                    if (h3 != null) {
                        t0 t0Var = w1.f126d;
                        if (z3 && (O instanceof b)) {
                            synchronized (O) {
                                th = ((b) O).e();
                                if (th == null || ((lVar instanceof s) && !((b) O).g())) {
                                    if (u(O, h3, W)) {
                                        if (th == null) {
                                            return W;
                                        }
                                        t0Var = W;
                                    }
                                }
                                s sVar = s.f2081a;
                            }
                        }
                        if (th != null) {
                            if (z4) {
                                lVar.invoke(th);
                            }
                            return t0Var;
                        } else if (u(O, h3, W)) {
                            return W;
                        }
                    } else if (O != null) {
                        f0((q1) O);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z4) {
                        z zVar = O instanceof z ? (z) O : null;
                        if (zVar != null) {
                            th = zVar.f133a;
                        }
                        lVar.invoke(th);
                    }
                    return w1.f126d;
                }
            }
        }
    }

    public CancellationException j() {
        Throwable th;
        Object O = O();
        CancellationException cancellationException = null;
        if (O instanceof b) {
            th = ((b) O).e();
        } else if (O instanceof z) {
            th = ((z) O).f133a;
        } else if (!(O instanceof f1)) {
            th = null;
        } else {
            throw new IllegalStateException(i.j("Cannot be cancelling child in this state: ", O).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new l1(i.j("Parent job is ", j0(O)), th, this) : cancellationException;
    }

    /* access modifiers changed from: protected */
    public final CancellationException k0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = B();
            }
            cancellationException = new l1(str, th, this);
        }
        return cancellationException;
    }

    public final CancellationException m() {
        Object O = O();
        if (O instanceof b) {
            Throwable e4 = ((b) O).e();
            if (e4 != null) {
                return k0(e4, i.j(m0.a(this), " is cancelling"));
            }
            throw new IllegalStateException(i.j("Job is still new or active: ", this).toString());
        } else if (!(O instanceof f1)) {
            return O instanceof z ? l0(this, ((z) O).f133a, (String) null, 1, (Object) null) : new l1(i.j(m0.a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(i.j("Job is still new or active: ", this).toString());
        }
    }

    public final String m0() {
        return X() + '{' + j0(O()) + '}';
    }

    public g minusKey(g.c<?> cVar) {
        return k1.a.e(this, cVar);
    }

    public void n(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new l1(B(), (Throwable) null, this);
        }
        y(cancellationException);
    }

    public g plus(g gVar) {
        return k1.a.f(this, gVar);
    }

    public final boolean start() {
        int i02;
        do {
            i02 = i0(O());
            if (i02 == 0) {
                return false;
            }
        } while (i02 != 1);
        return true;
    }

    public String toString() {
        return m0() + '@' + m0.b(this);
    }

    /* access modifiers changed from: protected */
    public void w(Object obj) {
    }

    public final boolean x(Object obj) {
        Object a4 = s1.f104a;
        if (L() && (a4 = z(obj)) == s1.f105b) {
            return true;
        }
        if (a4 == s1.f104a) {
            a4 = U(obj);
        }
        if (a4 == s1.f104a || a4 == s1.f105b) {
            return true;
        }
        if (a4 == s1.f107d) {
            return false;
        }
        w(a4);
        return true;
    }

    public void y(Throwable th) {
        x(th);
    }
}
