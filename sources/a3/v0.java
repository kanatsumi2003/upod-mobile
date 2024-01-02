package a3;

import kotlinx.coroutines.internal.a;

public abstract class v0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    private long f114e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f115f;

    /* renamed from: g  reason: collision with root package name */
    private a<p0<?>> f116g;

    private final long p(boolean z3) {
        return z3 ? 4294967296L : 1;
    }

    public static /* synthetic */ void u(v0 v0Var, boolean z3, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                z3 = false;
            }
            v0Var.t(z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void k(boolean z3) {
        long p3 = this.f114e - p(z3);
        this.f114e = p3;
        if (p3 <= 0 && this.f115f) {
            shutdown();
        }
    }

    public final void q(p0<?> p0Var) {
        a<p0<?>> aVar = this.f116g;
        if (aVar == null) {
            aVar = new a<>();
            this.f116g = aVar;
        }
        aVar.a(p0Var);
    }

    /* access modifiers changed from: protected */
    public long s() {
        a<p0<?>> aVar = this.f116g;
        return (aVar != null && !aVar.c()) ? 0 : Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    public final void t(boolean z3) {
        this.f114e += p(z3);
        if (!z3) {
            this.f115f = true;
        }
    }

    public final boolean v() {
        return this.f114e >= p(true);
    }

    public final boolean w() {
        a<p0<?>> aVar = this.f116g;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean x() {
        p0 d4;
        a<p0<?>> aVar = this.f116g;
        if (aVar == null || (d4 = aVar.d()) == null) {
            return false;
        }
        d4.run();
        return true;
    }
}
