package kotlinx.coroutines.scheduling;

import a3.m0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import k2.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.x;

public final class a implements Executor, Closeable {

    /* renamed from: k  reason: collision with root package name */
    public static final C0033a f2165k = new C0033a((e) null);

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2166l = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f2167m = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f2168n = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: o  reason: collision with root package name */
    public static final x f2169o = new x("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final int f2170d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2171e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2172f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2173g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2174h;

    /* renamed from: i  reason: collision with root package name */
    public final d f2175i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceArray<c> f2176j;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    public static final class C0033a {
        private C0033a() {
        }

        public /* synthetic */ C0033a(e eVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2177a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f2177a = iArr;
        }
    }

    public final class c extends Thread {

        /* renamed from: k  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f2178k = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: d  reason: collision with root package name */
        public final n f2179d;

        /* renamed from: e  reason: collision with root package name */
        public d f2180e;

        /* renamed from: f  reason: collision with root package name */
        private long f2181f;

        /* renamed from: g  reason: collision with root package name */
        private long f2182g;

        /* renamed from: h  reason: collision with root package name */
        private int f2183h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2184i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f2179d = new n();
            this.f2180e = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f2169o;
            this.f2183h = u2.c.f3111d.b();
        }

        public c(int i3) {
            this();
            n(i3);
        }

        private final void a(int i3) {
            if (i3 != 0) {
                a.f2167m.addAndGet(a.this, -2097152);
                if (this.f2180e != d.TERMINATED) {
                    this.f2180e = d.DORMANT;
                }
            }
        }

        private final void b(int i3) {
            if (i3 != 0 && r(d.BLOCKING)) {
                a.this.n();
            }
        }

        private final void c(i iVar) {
            int c4 = iVar.f2209e.c();
            h(c4);
            b(c4);
            a.this.k(iVar);
            a(c4);
        }

        private final i d(boolean z3) {
            i l3;
            i l4;
            if (z3) {
                boolean z4 = j(a.this.f2170d * 2) == 0;
                if (z4 && (l4 = l()) != null) {
                    return l4;
                }
                i h3 = this.f2179d.h();
                if (h3 != null) {
                    return h3;
                }
                if (!z4 && (l3 = l()) != null) {
                    return l3;
                }
            } else {
                i l5 = l();
                if (l5 != null) {
                    return l5;
                }
            }
            return s(false);
        }

        private final void h(int i3) {
            this.f2181f = 0;
            if (this.f2180e == d.PARKING) {
                this.f2180e = d.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f2169o;
        }

        private final void k() {
            if (this.f2181f == 0) {
                this.f2181f = System.nanoTime() + a.this.f2172f;
            }
            LockSupport.parkNanos(a.this.f2172f);
            if (System.nanoTime() - this.f2181f >= 0) {
                this.f2181f = 0;
                t();
            }
        }

        private final i l() {
            d dVar;
            if (j(2) == 0) {
                i iVar = (i) a.this.f2174h.d();
                if (iVar != null) {
                    return iVar;
                }
                dVar = a.this.f2175i;
            } else {
                i iVar2 = (i) a.this.f2175i.d();
                if (iVar2 != null) {
                    return iVar2;
                }
                dVar = a.this.f2174h;
            }
            return (i) dVar.d();
        }

        private final void m() {
            loop0:
            while (true) {
                boolean z3 = false;
                while (!a.this.isTerminated() && this.f2180e != d.TERMINATED) {
                    i e4 = e(this.f2184i);
                    if (e4 != null) {
                        this.f2182g = 0;
                        c(e4);
                    } else {
                        this.f2184i = false;
                        if (this.f2182g == 0) {
                            q();
                        } else if (!z3) {
                            z3 = true;
                        } else {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f2182g);
                            this.f2182g = 0;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            boolean z3;
            if (this.f2180e != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j3 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j3) >> 42)) != 0) {
                        if (a.f2167m.compareAndSet(aVar, j3, j3 - 4398046511104L)) {
                            z3 = true;
                            break;
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                }
                if (!z3) {
                    return false;
                }
                this.f2180e = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.i(this);
                return;
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f2180e != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z3) {
            int i3 = (int) (a.this.controlState & 2097151);
            if (i3 < 2) {
                return null;
            }
            int j3 = j(i3);
            a aVar = a.this;
            long j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < i3; i4++) {
                j3++;
                if (j3 > i3) {
                    j3 = 1;
                }
                c cVar = aVar.f2176j.get(j3);
                if (!(cVar == null || cVar == this)) {
                    n nVar = this.f2179d;
                    n nVar2 = cVar.f2179d;
                    long k3 = z3 ? nVar.k(nVar2) : nVar.l(nVar2);
                    if (k3 == -1) {
                        return this.f2179d.h();
                    }
                    if (k3 > 0) {
                        j4 = Math.min(j4, k3);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f2182g = j4;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f2176j) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f2170d) {
                        if (f2178k.compareAndSet(this, -1, 1)) {
                            int f4 = f();
                            n(0);
                            aVar.j(this, f4, 0);
                            int andDecrement = (int) (a.f2167m.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != f4) {
                                c cVar = aVar.f2176j.get(andDecrement);
                                i.b(cVar);
                                c cVar2 = cVar;
                                aVar.f2176j.set(f4, cVar2);
                                cVar2.n(f4);
                                aVar.j(cVar2, andDecrement, f4);
                            }
                            aVar.f2176j.set(andDecrement, (Object) null);
                            s sVar = s.f2081a;
                            this.f2180e = d.TERMINATED;
                        }
                    }
                }
            }
        }

        public final i e(boolean z3) {
            i iVar;
            if (p()) {
                return d(z3);
            }
            if (!z3 || (iVar = this.f2179d.h()) == null) {
                iVar = (i) a.this.f2175i.d();
            }
            return iVar == null ? s(true) : iVar;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i3) {
            int i4 = this.f2183h;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >> 17);
            int i7 = i6 ^ (i6 << 5);
            this.f2183h = i7;
            int i8 = i3 - 1;
            return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
        }

        public final void n(int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f2173g);
            sb.append("-worker-");
            sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
            setName(sb.toString());
            this.indexInArray = i3;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f2180e;
            boolean z3 = dVar2 == d.CPU_ACQUIRED;
            if (z3) {
                a.f2167m.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f2180e = dVar;
            }
            return z3;
        }

        public void run() {
            m();
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i3, int i4, long j3, String str) {
        this.f2170d = i3;
        this.f2171e = i4;
        this.f2172f = j3;
        this.f2173g = str;
        if (i3 >= 1) {
            if (i4 >= i3) {
                if (i4 <= 2097150) {
                    if (j3 > 0) {
                        this.f2174h = new d();
                        this.f2175i = new d();
                        this.parkedWorkersStack = 0;
                        this.f2176j = new AtomicReferenceArray<>(i4 + 1);
                        this.controlState = ((long) i3) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i4 + " should be greater than or equals to core pool size " + i3).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
    }

    private final boolean a(i iVar) {
        boolean z3 = true;
        if (iVar.f2209e.c() != 1) {
            z3 = false;
        }
        return (z3 ? this.f2175i : this.f2174h).a(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int b() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.a$c> r0 = r10.f2176j
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r6 - r2
            r2 = 0
            int r1 = w2.f.a(r1, r2)     // Catch:{ all -> 0x007a }
            int r5 = r10.f2170d     // Catch:{ all -> 0x007a }
            if (r1 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f2171e     // Catch:{ all -> 0x007a }
            if (r6 < r5) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.a$c> r7 = r10.f2176j     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.scheduling.a$c r7 = new kotlinx.coroutines.scheduling.a$c     // Catch:{ all -> 0x007a }
            r7.<init>(r6)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.a$c> r8 = r10.f2176j     // Catch:{ all -> 0x007a }
            r8.set(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f2167m     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007a }
            if (r6 != r4) goto L_0x005b
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.b():int");
    }

    private final c d() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && i.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    public static /* synthetic */ void f(a aVar, Runnable runnable, j jVar, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            jVar = g.f2206d;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        aVar.e(runnable, jVar, z3);
    }

    private final int g(c cVar) {
        int f4;
        do {
            Object g3 = cVar.g();
            if (g3 == f2169o) {
                return -1;
            }
            if (g3 == null) {
                return 0;
            }
            cVar = (c) g3;
            f4 = cVar.f();
        } while (f4 == 0);
        return f4;
    }

    private final c h() {
        while (true) {
            long j3 = this.parkedWorkersStack;
            c cVar = this.f2176j.get((int) (2097151 & j3));
            if (cVar == null) {
                return null;
            }
            long j4 = (2097152 + j3) & -2097152;
            int g3 = g(cVar);
            if (g3 >= 0) {
                if (f2166l.compareAndSet(this, j3, ((long) g3) | j4)) {
                    cVar.o(f2169o);
                    return cVar;
                }
            }
        }
    }

    private final void m(boolean z3) {
        long addAndGet = f2167m.addAndGet(this, 2097152);
        if (!z3 && !r() && !p(addAndGet)) {
            r();
        }
    }

    private final i o(c cVar, i iVar, boolean z3) {
        if (cVar == null || cVar.f2180e == d.TERMINATED) {
            return iVar;
        }
        if (iVar.f2209e.c() == 0 && cVar.f2180e == d.BLOCKING) {
            return iVar;
        }
        cVar.f2184i = true;
        return cVar.f2179d.a(iVar, z3);
    }

    private final boolean p(long j3) {
        if (f.a(((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21)), 0) < this.f2170d) {
            int b4 = b();
            if (b4 == 1 && this.f2170d > 1) {
                b();
            }
            if (b4 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean q(a aVar, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = aVar.controlState;
        }
        return aVar.p(j3);
    }

    private final boolean r() {
        c h3;
        do {
            h3 = h();
            if (h3 == null) {
                return false;
            }
        } while (!c.f2178k.compareAndSet(h3, -1, 0));
        LockSupport.unpark(h3);
        return true;
    }

    public final i c(Runnable runnable, j jVar) {
        long a4 = l.f2216f.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a4, jVar);
        }
        i iVar = (i) runnable;
        iVar.f2208d = a4;
        iVar.f2209e = jVar;
        return iVar;
    }

    public void close() {
        l(10000);
    }

    public final void e(Runnable runnable, j jVar, boolean z3) {
        a3.c.a();
        i c4 = c(runnable, jVar);
        c d4 = d();
        i o3 = o(d4, c4, z3);
        if (o3 == null || a(o3)) {
            boolean z4 = z3 && d4 != null;
            if (c4.f2209e.c() != 0) {
                m(z4);
            } else if (!z4) {
                n();
            }
        } else {
            throw new RejectedExecutionException(i.j(this.f2173g, " was terminated"));
        }
    }

    public void execute(Runnable runnable) {
        f(this, runnable, (j) null, false, 6, (Object) null);
    }

    public final boolean i(c cVar) {
        long j3;
        int f4;
        if (cVar.g() != f2169o) {
            return false;
        }
        do {
            j3 = this.parkedWorkersStack;
            f4 = cVar.f();
            cVar.o(this.f2176j.get((int) (2097151 & j3)));
        } while (!f2166l.compareAndSet(this, j3, ((2097152 + j3) & -2097152) | ((long) f4)));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(c cVar, int i3, int i4) {
        while (true) {
            long j3 = this.parkedWorkersStack;
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & -2097152;
            if (i5 == i3) {
                i5 = i4 == 0 ? g(cVar) : i4;
            }
            if (i5 >= 0) {
                if (f2166l.compareAndSet(this, j3, j4 | ((long) i5))) {
                    return;
                }
            }
        }
    }

    public final void k(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            a3.c.a();
            throw th;
        }
        a3.c.a();
    }

    public final void l(long j3) {
        int i3;
        if (f2168n.compareAndSet(this, 0, 1)) {
            c d4 = d();
            synchronized (this.f2176j) {
                i3 = (int) (this.controlState & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    int i5 = i4 + 1;
                    c cVar = this.f2176j.get(i4);
                    i.b(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != d4) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j3);
                        }
                        cVar2.f2179d.g(this.f2175i);
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4 = i5;
                }
            }
            this.f2175i.b();
            this.f2174h.b();
            while (true) {
                i e4 = d4 == null ? null : d4.e(true);
                if (e4 == null && (e4 = (i) this.f2174h.d()) == null && (e4 = (i) this.f2175i.d()) == null) {
                    break;
                }
                k(e4);
            }
            if (d4 != null) {
                d4.r(d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public final void n() {
        if (!r() && !q(this, 0, 1, (Object) null)) {
            r();
        }
    }

    public String toString() {
        int i3;
        int i4;
        int i5;
        int i6;
        char c4;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.f2176j.length();
        int i7 = 0;
        if (1 < length) {
            i5 = 0;
            int i8 = 0;
            i4 = 0;
            i3 = 0;
            int i9 = 1;
            while (true) {
                int i10 = i9 + 1;
                c cVar = this.f2176j.get(i9);
                if (cVar != null) {
                    int f4 = cVar.f2179d.f();
                    int i11 = b.f2177a[cVar.f2180e.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i5++;
                            sb = new StringBuilder();
                            sb.append(f4);
                            c4 = 'b';
                        } else if (i11 == 3) {
                            i8++;
                            sb = new StringBuilder();
                            sb.append(f4);
                            c4 = 'c';
                        } else if (i11 == 4) {
                            i4++;
                            if (f4 > 0) {
                                sb = new StringBuilder();
                                sb.append(f4);
                                c4 = 'd';
                            }
                        } else if (i11 == 5) {
                            i3++;
                        }
                        sb.append(c4);
                        arrayList.add(sb.toString());
                    } else {
                        i7++;
                    }
                }
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
            i6 = i7;
            i7 = i8;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        long j3 = this.controlState;
        return this.f2173g + '@' + m0.b(this) + "[Pool Size {core = " + this.f2170d + ", max = " + this.f2171e + "}, Worker States {CPU = " + i7 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i4 + ", terminated = " + i3 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f2174h.c() + ", global blocking queue size = " + this.f2175i.c() + ", Control State {created workers= " + ((int) (2097151 & j3)) + ", blocking tasks = " + ((int) ((4398044413952L & j3) >> 21)) + ", CPUs acquired = " + (this.f2170d - ((int) ((9223367638808264704L & j3) >> 42))) + "}]";
    }
}
