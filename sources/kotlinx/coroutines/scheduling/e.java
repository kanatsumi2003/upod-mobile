package kotlinx.coroutines.scheduling;

import a3.b1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m2.g;

final class e extends b1 implements j, Executor {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f2199k = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: f  reason: collision with root package name */
    private final c f2200f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2201g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2202h;

    /* renamed from: i  reason: collision with root package name */
    private final int f2203i;
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: j  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f2204j = new ConcurrentLinkedQueue<>();

    public e(c cVar, int i3, String str, int i4) {
        this.f2200f = cVar;
        this.f2201g = i3;
        this.f2202h = str;
        this.f2203i = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2199k
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f2201g
            if (r1 > r2) goto L_0x0010
            kotlinx.coroutines.scheduling.c r0 = r3.f2200f
            r0.p(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f2204j
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f2201g
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f2204j
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.e.k(java.lang.Runnable, boolean):void");
    }

    public void a() {
        Runnable poll = this.f2204j.poll();
        if (poll != null) {
            this.f2200f.p(poll, this, true);
            return;
        }
        f2199k.decrementAndGet(this);
        Runnable poll2 = this.f2204j.poll();
        if (poll2 != null) {
            k(poll2, true);
        }
    }

    public int c() {
        return this.f2203i;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        k(runnable, false);
    }

    public void f(g gVar, Runnable runnable) {
        k(runnable, false);
    }

    public String toString() {
        String str = this.f2202h;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f2200f + ']';
    }
}
