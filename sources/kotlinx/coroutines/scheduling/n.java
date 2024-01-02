package kotlinx.coroutines.scheduling;

import a3.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2217b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f2218c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f2219d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f2220e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<i> f2221a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<n> cls = n.class;
        f2217b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f2218c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f2219d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f2220e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static /* synthetic */ i b(n nVar, i iVar, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return nVar.a(iVar, z3);
    }

    private final i c(i iVar) {
        boolean z3 = true;
        if (iVar.f2209e.c() != 1) {
            z3 = false;
        }
        if (z3) {
            f2220e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i3 = this.producerIndex & 127;
        while (this.f2221a.get(i3) != null) {
            Thread.yield();
        }
        this.f2221a.lazySet(i3, iVar);
        f2218c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            boolean z3 = true;
            if (iVar.f2209e.c() != 1) {
                z3 = false;
            }
            if (z3) {
                f2220e.decrementAndGet(this);
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i3 = this.consumerIndex;
            if (i3 - this.producerIndex == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (f2219d.compareAndSet(this, i3, i3 + 1) && (andSet = this.f2221a.getAndSet(i4, (Object) null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i3 = i();
        if (i3 == null) {
            return false;
        }
        dVar.a(i3);
        return true;
    }

    private final long m(n nVar, boolean z3) {
        i iVar;
        do {
            iVar = (i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z3) {
                boolean z4 = true;
                if (iVar.f2209e.c() != 1) {
                    z4 = false;
                }
                if (!z4) {
                    return -2;
                }
            }
            long a4 = l.f2216f.a() - iVar.f2208d;
            long j3 = l.f2211a;
            if (a4 < j3) {
                return j3 - a4;
            }
        } while (!l.a(f2217b, nVar, iVar, (Object) null));
        b(this, iVar, false, 2, (Object) null);
        return -1;
    }

    public final i a(i iVar, boolean z3) {
        if (z3) {
            return c(iVar);
        }
        i iVar2 = (i) f2217b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) f2217b.getAndSet(this, (Object) null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        do {
        } while (j(dVar));
    }

    public final i h() {
        i iVar = (i) f2217b.getAndSet(this, (Object) null);
        return iVar == null ? i() : iVar;
    }

    public final long k(n nVar) {
        int i3 = nVar.consumerIndex;
        int i4 = nVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = nVar.f2221a;
        while (true) {
            boolean z3 = true;
            if (i3 == i4) {
                break;
            }
            int i5 = i3 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i5);
            if (iVar != null) {
                if (iVar.f2209e.c() != 1) {
                    z3 = false;
                }
                if (z3 && m.a(atomicReferenceArray, i5, iVar, (Object) null)) {
                    f2220e.decrementAndGet(nVar);
                    b(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i3++;
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        i i3 = nVar.i();
        if (i3 == null) {
            return m(nVar, false);
        }
        b(this, i3, false, 2, (Object) null);
        return -1;
    }
}
