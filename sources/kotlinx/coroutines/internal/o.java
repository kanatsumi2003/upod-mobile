package kotlinx.coroutines.internal;

import a3.l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e;

public final class o<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f2141e = new a((e) null);

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2142f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2143g;

    /* renamed from: h  reason: collision with root package name */
    public static final x f2144h = new x("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f2145a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2146b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2147c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f2148d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final int a(long j3) {
            return (j3 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j3, int i3) {
            return d(j3, 1073741823) | (((long) i3) << 0);
        }

        public final long c(long j3, int i3) {
            return d(j3, 1152921503533105152L) | (((long) i3) << 30);
        }

        public final long d(long j3, long j4) {
            return j3 & (~j4);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2149a;

        public b(int i3) {
            this.f2149a = i3;
        }
    }

    static {
        Class<o> cls = o.class;
        f2142f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f2143g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public o(int i3, boolean z3) {
        this.f2145a = i3;
        this.f2146b = z3;
        int i4 = i3 - 1;
        this.f2147c = i4;
        this.f2148d = new AtomicReferenceArray(i3);
        boolean z4 = false;
        if (i4 <= 1073741823) {
            if (!((i3 & i4) == 0 ? true : z4)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final o<E> b(long j3) {
        o<E> oVar = new o<>(this.f2145a * 2, this.f2146b);
        int i3 = (int) ((1073741823 & j3) >> 0);
        int i4 = (int) ((1152921503533105152L & j3) >> 30);
        while (true) {
            int i5 = this.f2147c;
            if ((i3 & i5) != (i4 & i5)) {
                Object obj = this.f2148d.get(i5 & i3);
                if (obj == null) {
                    obj = new b(i3);
                }
                oVar.f2148d.set(oVar.f2147c & i3, obj);
                i3++;
            } else {
                oVar._state = f2141e.d(j3, 1152921504606846976L);
                return oVar;
            }
        }
    }

    private final o<E> c(long j3) {
        while (true) {
            o<E> oVar = (o) this._next;
            if (oVar != null) {
                return oVar;
            }
            l.a(f2142f, this, (Object) null, b(j3));
        }
    }

    private final o<E> e(int i3, E e4) {
        Object obj = this.f2148d.get(this.f2147c & i3);
        if (!(obj instanceof b) || ((b) obj).f2149a != i3) {
            return null;
        }
        this.f2148d.set(i3 & this.f2147c, e4);
        return this;
    }

    private final long h() {
        long j3;
        long j4;
        do {
            j3 = this._state;
            if ((j3 & 1152921504606846976L) != 0) {
                return j3;
            }
            j4 = j3 | 1152921504606846976L;
        } while (!f2143g.compareAndSet(this, j3, j4));
        return j4;
    }

    private final o<E> k(int i3, int i4) {
        long j3;
        int i5;
        do {
            j3 = this._state;
            i5 = (int) ((1073741823 & j3) >> 0);
            if ((1152921504606846976L & j3) != 0) {
                return i();
            }
        } while (!f2143g.compareAndSet(this, j3, f2141e.b(j3, i4)));
        this.f2148d.set(i5 & this.f2147c, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x007a, LOOP_START, PHI: r0 
      PHI: (r0v15 kotlinx.coroutines.internal.o) = (r0v14 kotlinx.coroutines.internal.o), (r0v17 kotlinx.coroutines.internal.o) binds: [B:18:0x0060, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.o$a r13 = f2141e
            int r13 = r13.a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r10 = r12.f2147c
            int r0 = r9 + 2
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r0 = r12.f2146b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f2148d
            r11 = r9 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x004d
            int r0 = r12.f2145a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004c
            int r9 = r9 - r1
            r1 = r9 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f2143g
            kotlinx.coroutines.internal.o$a r4 = f2141e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f2148d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            kotlinx.coroutines.internal.o r0 = r0.i()
            kotlinx.coroutines.internal.o r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x0068
        L_0x007c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j3;
        do {
            j3 = this._state;
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!f2143g.compareAndSet(this, j3, j3 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j3 = this._state;
        return 1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j3) >> 0)));
    }

    public final boolean g() {
        long j3 = this._state;
        return ((int) ((1073741823 & j3) >> 0)) == ((int) ((j3 & 1152921503533105152L) >> 30));
    }

    public final o<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j3 = this._state;
            if ((1152921504606846976L & j3) != 0) {
                return f2144h;
            }
            int i3 = (int) ((1073741823 & j3) >> 0);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f2147c;
            if ((i4 & i5) == (i3 & i5)) {
                return null;
            }
            Object obj = this.f2148d.get(i5 & i3);
            if (obj == null) {
                if (this.f2146b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i6 = (i3 + 1) & 1073741823;
                if (f2143g.compareAndSet(this, j3, f2141e.b(j3, i6))) {
                    this.f2148d.set(this.f2147c & i3, (Object) null);
                    return obj;
                } else if (this.f2146b) {
                    o oVar = this;
                    do {
                        oVar = oVar.k(i3, i6);
                    } while (oVar != null);
                    return obj;
                }
            }
        }
    }
}
