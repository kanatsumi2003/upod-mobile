package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.s.a;
import f0.e;
import f0.f;
import f0.g;
import f0.h;
import f0.k;
import f0.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import t.o;
import t0.c;
import t0.d;
import t0.i;
import t0.j;

public abstract class s<ResultT extends a> extends t0.b<ResultT> {

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f981j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f982k;

    /* renamed from: a  reason: collision with root package name */
    protected final Object f983a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final y<h<? super ResultT>, ResultT> f984b = new y<>(this, 128, new m(this));

    /* renamed from: c  reason: collision with root package name */
    final y<g, ResultT> f985c = new y<>(this, 64, new n(this));

    /* renamed from: d  reason: collision with root package name */
    final y<f<ResultT>, ResultT> f986d = new y<>(this, 448, new o(this));

    /* renamed from: e  reason: collision with root package name */
    final y<e, ResultT> f987e = new y<>(this, 256, new p(this));

    /* renamed from: f  reason: collision with root package name */
    final y<d<? super ResultT>, ResultT> f988f = new y<>(this, -465, new q());

    /* renamed from: g  reason: collision with root package name */
    final y<c<? super ResultT>, ResultT> f989g = new y<>(this, 16, new r());

    /* renamed from: h  reason: collision with root package name */
    private volatile int f990h = 1;

    /* renamed from: i  reason: collision with root package name */
    private ResultT f991i;

    protected interface a {
        Exception a();
    }

    public class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Exception f992a;

        public b(Exception exc) {
            j jVar;
            Status status;
            if (exc == null) {
                if (s.this.l()) {
                    status = Status.f755n;
                } else if (s.this.I() == 64) {
                    status = Status.f753l;
                } else {
                    jVar = null;
                    this.f992a = jVar;
                    return;
                }
                jVar = j.c(status);
                this.f992a = jVar;
                return;
            }
            this.f992a = exc;
        }

        public Exception a() {
            return this.f992a;
        }

        public l b() {
            return c().O();
        }

        public s<ResultT> c() {
            return s.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f981j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f982k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap2.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, 128})));
        hashMap2.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, 128})));
    }

    protected s() {
    }

    private <ContinuationResultT> k<ContinuationResultT> F(Executor executor, f0.c<ResultT, k<ContinuationResultT>> cVar) {
        f0.b bVar = new f0.b();
        l lVar = new l(bVar.b());
        this.f986d.d((Activity) null, executor, new t0.h(this, cVar, lVar, bVar));
        return lVar.a();
    }

    private void G() {
        if (!m() && !R() && I() != 2 && !m0(256, false)) {
            m0(64, false);
        }
    }

    private ResultT H() {
        ResultT resultt = this.f991i;
        if (resultt != null) {
            return resultt;
        }
        if (!m()) {
            return null;
        }
        if (this.f991i == null) {
            this.f991i = k0();
        }
        return this.f991i;
    }

    private String M(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? i3 != 32 ? i3 != 64 ? i3 != 128 ? i3 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    private String N(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int M : iArr) {
            sb.append(M(M));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(f0.c cVar, l lVar, f0.b bVar, k kVar) {
        try {
            k kVar2 = (k) cVar.a(this);
            if (lVar.a().m()) {
                return;
            }
            if (kVar2 == null) {
                lVar.b(new NullPointerException("Continuation returned null"));
                return;
            }
            kVar2.g(new i(lVar));
            kVar2.e(new j(lVar));
            Objects.requireNonNull(bVar);
            kVar2.a(new t0.g(bVar));
        } catch (f0.j e4) {
            e = e4;
            if (e.getCause() instanceof Exception) {
                e = (Exception) e.getCause();
            }
            lVar.b(e);
        } catch (Exception e5) {
            lVar.b(e5);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T() {
        try {
            i0();
        } finally {
            G();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U(h hVar, a aVar) {
        t.b().c(this);
        hVar.b(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V(g gVar, a aVar) {
        t.b().c(this);
        gVar.c(aVar.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W(f fVar, a aVar) {
        t.b().c(this);
        fVar.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X(e eVar, a aVar) {
        t.b().c(this);
        eVar.a();
    }

    public s<ResultT> A(Executor executor, c<? super ResultT> cVar) {
        o.h(cVar);
        o.h(executor);
        this.f989g.d((Activity) null, executor, cVar);
        return this;
    }

    public s<ResultT> B(Executor executor, d<? super ResultT> dVar) {
        o.h(dVar);
        o.h(executor);
        this.f988f.d((Activity) null, executor, dVar);
        return this;
    }

    /* renamed from: C */
    public s<ResultT> g(h<? super ResultT> hVar) {
        o.h(hVar);
        this.f984b.d((Activity) null, (Executor) null, hVar);
        return this;
    }

    /* renamed from: D */
    public s<ResultT> h(Executor executor, h<? super ResultT> hVar) {
        o.h(executor);
        o.h(hVar);
        this.f984b.d((Activity) null, executor, hVar);
        return this;
    }

    public boolean E() {
        return n0(new int[]{256, 32}, true);
    }

    /* access modifiers changed from: package-private */
    public int I() {
        return this.f990h;
    }

    /* renamed from: J */
    public ResultT k() {
        if (H() != null) {
            Exception a4 = H().a();
            if (a4 == null) {
                return H();
            }
            throw new f0.j(a4);
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public Runnable K() {
        return new t0.f(this);
    }

    public ResultT L() {
        return k0();
    }

    /* access modifiers changed from: package-private */
    public abstract l O();

    /* access modifiers changed from: package-private */
    public Object P() {
        return this.f983a;
    }

    public boolean Q() {
        return (I() & -465) != 0;
    }

    public boolean R() {
        return (I() & 16) != 0;
    }

    /* access modifiers changed from: protected */
    public void Y() {
    }

    /* access modifiers changed from: protected */
    public void Z() {
    }

    /* access modifiers changed from: protected */
    public void a0() {
    }

    /* access modifiers changed from: protected */
    public void b0() {
    }

    /* access modifiers changed from: protected */
    public void c0() {
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public boolean e0() {
        return n0(new int[]{16, 8}, true);
    }

    /* access modifiers changed from: package-private */
    public boolean f0() {
        if (!m0(2, false)) {
            return false;
        }
        j0();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g0() {
    }

    public boolean h0() {
        if (!m0(2, true)) {
            return false;
        }
        g0();
        j0();
        return true;
    }

    public <ContinuationResultT> k<ContinuationResultT> i(Executor executor, f0.c<ResultT, k<ContinuationResultT>> cVar) {
        return F(executor, cVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void i0();

    public Exception j() {
        if (H() == null) {
            return null;
        }
        return H().a();
    }

    /* access modifiers changed from: package-private */
    public abstract void j0();

    /* access modifiers changed from: package-private */
    public ResultT k0() {
        ResultT l02;
        synchronized (this.f983a) {
            l02 = l0();
        }
        return l02;
    }

    public boolean l() {
        return I() == 256;
    }

    /* access modifiers changed from: package-private */
    public abstract ResultT l0();

    public boolean m() {
        return (I() & 448) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean m0(int i3, boolean z3) {
        return n0(new int[]{i3}, z3);
    }

    public boolean n() {
        return (I() & 128) != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n0(int[] r9, boolean r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0005
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r0 = f981j
            goto L_0x0007
        L_0x0005:
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r0 = f982k
        L_0x0007:
            java.lang.Object r1 = r8.f983a
            monitor-enter(r1)
            int r2 = r9.length     // Catch:{ all -> 0x00f4 }
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r4 >= r2) goto L_0x00c2
            r5 = r9[r4]     // Catch:{ all -> 0x00f4 }
            int r6 = r8.I()     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00f4 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x00f4 }
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch:{ all -> 0x00f4 }
            if (r6 == 0) goto L_0x00be
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00f4 }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x00f4 }
            if (r6 == 0) goto L_0x00be
            r8.f990h = r5     // Catch:{ all -> 0x00f4 }
            int r9 = r8.f990h     // Catch:{ all -> 0x00f4 }
            r0 = 2
            if (r9 == r0) goto L_0x005a
            r0 = 4
            if (r9 == r0) goto L_0x0056
            r0 = 16
            if (r9 == r0) goto L_0x0052
            r0 = 64
            if (r9 == r0) goto L_0x004e
            r0 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x004a
            r0 = 256(0x100, float:3.59E-43)
            if (r9 == r0) goto L_0x0046
            goto L_0x0064
        L_0x0046:
            r8.Y()     // Catch:{ all -> 0x00f4 }
            goto L_0x0064
        L_0x004a:
            r8.d0()     // Catch:{ all -> 0x00f4 }
            goto L_0x0064
        L_0x004e:
            r8.Z()     // Catch:{ all -> 0x00f4 }
            goto L_0x0064
        L_0x0052:
            r8.a0()     // Catch:{ all -> 0x00f4 }
            goto L_0x0064
        L_0x0056:
            r8.b0()     // Catch:{ all -> 0x00f4 }
            goto L_0x0064
        L_0x005a:
            com.google.firebase.storage.t r9 = com.google.firebase.storage.t.b()     // Catch:{ all -> 0x00f4 }
            r9.a(r8)     // Catch:{ all -> 0x00f4 }
            r8.c0()     // Catch:{ all -> 0x00f4 }
        L_0x0064:
            com.google.firebase.storage.y<f0.h<? super ResultT>, ResultT> r9 = r8.f984b     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            com.google.firebase.storage.y<f0.g, ResultT> r9 = r8.f985c     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            com.google.firebase.storage.y<f0.e, ResultT> r9 = r8.f987e     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            com.google.firebase.storage.y<f0.f<ResultT>, ResultT> r9 = r8.f986d     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            com.google.firebase.storage.y<t0.c<? super ResultT>, ResultT> r9 = r8.f989g     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            com.google.firebase.storage.y<t0.d<? super ResultT>, ResultT> r9 = r8.f988f     // Catch:{ all -> 0x00f4 }
            r9.h()     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = "StorageTask"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x00f4 }
            if (r9 == 0) goto L_0x00bb
            java.lang.String r9 = "StorageTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "changed internal state to: "
            r0.append(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = r8.M(r5)     // Catch:{ all -> 0x00f4 }
            r0.append(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = " isUser: "
            r0.append(r2)     // Catch:{ all -> 0x00f4 }
            r0.append(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = " from state:"
            r0.append(r10)     // Catch:{ all -> 0x00f4 }
            int r10 = r8.f990h     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = r8.M(r10)     // Catch:{ all -> 0x00f4 }
            r0.append(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.d(r9, r10)     // Catch:{ all -> 0x00f4 }
        L_0x00bb:
            monitor-exit(r1)     // Catch:{ all -> 0x00f4 }
            r9 = 1
            return r9
        L_0x00be:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x00c2:
            java.lang.String r0 = "StorageTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r2.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = "unable to change internal state to: "
            r2.append(r4)     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r8.N(r9)     // Catch:{ all -> 0x00f4 }
            r2.append(r9)     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = " isUser: "
            r2.append(r9)     // Catch:{ all -> 0x00f4 }
            r2.append(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = " from state:"
            r2.append(r9)     // Catch:{ all -> 0x00f4 }
            int r9 = r8.f990h     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r8.M(r9)     // Catch:{ all -> 0x00f4 }
            r2.append(r9)     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f4 }
            return r3
        L_0x00f4:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f4 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.s.n0(int[], boolean):boolean");
    }

    /* renamed from: u */
    public s<ResultT> a(e eVar) {
        o.h(eVar);
        this.f987e.d((Activity) null, (Executor) null, eVar);
        return this;
    }

    /* renamed from: v */
    public s<ResultT> b(Executor executor, e eVar) {
        o.h(eVar);
        o.h(executor);
        this.f987e.d((Activity) null, executor, eVar);
        return this;
    }

    /* renamed from: w */
    public s<ResultT> c(f<ResultT> fVar) {
        o.h(fVar);
        this.f986d.d((Activity) null, (Executor) null, fVar);
        return this;
    }

    /* renamed from: x */
    public s<ResultT> d(Executor executor, f<ResultT> fVar) {
        o.h(fVar);
        o.h(executor);
        this.f986d.d((Activity) null, executor, fVar);
        return this;
    }

    /* renamed from: y */
    public s<ResultT> e(g gVar) {
        o.h(gVar);
        this.f985c.d((Activity) null, (Executor) null, gVar);
        return this;
    }

    /* renamed from: z */
    public s<ResultT> f(Executor executor, g gVar) {
        o.h(gVar);
        o.h(executor);
        this.f985c.d((Activity) null, executor, gVar);
        return this;
    }
}
