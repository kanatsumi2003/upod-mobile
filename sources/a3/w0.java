package a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.o;
import m2.g;

public abstract class w0 extends x0 {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f121i;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, t0, d0 {

        /* renamed from: d  reason: collision with root package name */
        public long f122d;

        /* renamed from: e  reason: collision with root package name */
        private Object f123e;

        /* renamed from: f  reason: collision with root package name */
        private int f124f;

        public final synchronized void a() {
            Object obj = this.f123e;
            if (obj != z0.f134a) {
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.g(this);
                }
                this.f123e = z0.f134a;
            }
        }

        public void b(c0<?> c0Var) {
            if (this.f123e != z0.f134a) {
                this.f123e = c0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public c0<?> c() {
            Object obj = this.f123e;
            if (obj instanceof c0) {
                return (c0) obj;
            }
            return null;
        }

        /* renamed from: d */
        public int compareTo(a aVar) {
            int i3 = ((this.f122d - aVar.f122d) > 0 ? 1 : ((this.f122d - aVar.f122d) == 0 ? 0 : -1));
            if (i3 > 0) {
                return 1;
            }
            return i3 < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int e(long r8, a3.w0.b r10, a3.w0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f123e     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.x r1 = a3.z0.f134a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                kotlinx.coroutines.internal.d0 r0 = r10.b()     // Catch:{ all -> 0x0048 }
                a3.w0$a r0 = (a3.w0.a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.G()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f125b = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f122d     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f125b     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f122d     // Catch:{ all -> 0x0048 }
                long r3 = r10.f125b     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x0042
                r7.f122d = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a3.w0.a.e(long, a3.w0$b, a3.w0):int");
        }

        public final boolean g(long j3) {
            return j3 - this.f122d >= 0;
        }

        public int getIndex() {
            return this.f124f;
        }

        public void setIndex(int i3) {
            this.f124f = i3;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f122d + ']';
        }
    }

    public static final class b extends c0<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f125b;

        public b(long j3) {
            this.f125b = j3;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<w0> cls2 = w0.class;
        f120h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f121i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    private final void C() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (l.a(f120h, this, (Object) null, z0.f135b)) {
                    return;
                }
            } else if (obj instanceof o) {
                ((o) obj).d();
                return;
            } else if (obj != z0.f135b) {
                o oVar = new o(8, true);
                oVar.a((Runnable) obj);
                if (l.a(f120h, this, obj, oVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable D() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                Object j3 = oVar.j();
                if (j3 != o.f2144h) {
                    return (Runnable) j3;
                }
                l.a(f120h, this, obj, oVar.i());
            } else if (obj == z0.f135b) {
                return null;
            } else {
                if (l.a(f120h, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean F(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (G()) {
                return false;
            }
            if (obj == null) {
                if (l.a(f120h, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof o) {
                o oVar = (o) obj;
                int a4 = oVar.a(runnable);
                if (a4 == 0) {
                    return true;
                }
                if (a4 == 1) {
                    l.a(f120h, this, obj, oVar.i());
                } else if (a4 == 2) {
                    return false;
                }
            } else if (obj == z0.f135b) {
                return false;
            } else {
                o oVar2 = new o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (l.a(f120h, this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    public final boolean G() {
        return this._isCompleted;
    }

    private final void J() {
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a aVar = bVar == null ? null : (a) bVar.i();
            if (aVar != null) {
                z(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    private final int M(long j3, a aVar) {
        if (G()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            l.a(f121i, this, (Object) null, new b(j3));
            Object obj = this._delayed;
            i.b(obj);
            bVar = (b) obj;
        }
        return aVar.e(j3, bVar, this);
    }

    private final void N(boolean z3) {
        this._isCompleted = z3 ? 1 : 0;
    }

    private final boolean O(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : (a) bVar.e()) == aVar;
    }

    public final void E(Runnable runnable) {
        if (F(runnable)) {
            A();
        } else {
            n0.f81j.E(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        if (!w()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof o ? ((o) obj).g() : obj == z0.f135b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long I() {
        /*
            r9 = this;
            boolean r0 = r9.x()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            a3.w0$b r0 = (a3.w0.b) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0045
            a3.c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.d0 r5 = r0.b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
        L_0x0024:
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            a3.w0$a r5 = (a3.w0.a) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.g(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.F(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0024
            kotlinx.coroutines.internal.d0 r5 = r0.h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
            goto L_0x0024
        L_0x003d:
            a3.w0$a r6 = (a3.w0.a) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.D()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w0.I():long");
    }

    /* access modifiers changed from: protected */
    public final void K() {
        this._queue = null;
        this._delayed = null;
    }

    public final void L(long j3, a aVar) {
        int M = M(j3, aVar);
        if (M != 0) {
            if (M == 1) {
                z(j3, aVar);
            } else if (M != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (O(aVar)) {
            A();
        }
    }

    public final void f(g gVar, Runnable runnable) {
        E(runnable);
    }

    /* access modifiers changed from: protected */
    public long s() {
        if (super.s() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof o)) {
                return obj == z0.f135b ? Long.MAX_VALUE : 0;
            }
            if (!((o) obj).g()) {
                return 0;
            }
        }
        b bVar = (b) this._delayed;
        a aVar = bVar == null ? null : (a) bVar.e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j3 = aVar.f122d;
        c.a();
        return f.b(j3 - System.nanoTime(), 0);
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        b2.f45a.b();
        N(true);
        C();
        do {
        } while (I() <= 0);
        J();
    }
}
