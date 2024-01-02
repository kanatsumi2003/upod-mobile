package s;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class f0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f2834d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f2835e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g0 f2836f;

    f0(g0 g0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2836f = g0Var;
        this.f2834d = lifecycleCallback;
        this.f2835e = str;
    }

    public final void run() {
        g0 g0Var = this.f2836f;
        if (g0Var.Z > 0) {
            this.f2834d.f(g0Var.f2850a0 != null ? g0Var.f2850a0.getBundle(this.f2835e) : null);
        }
        if (this.f2836f.Z >= 2) {
            this.f2834d.j();
        }
        if (this.f2836f.Z >= 3) {
            this.f2834d.h();
        }
        if (this.f2836f.Z >= 4) {
            this.f2834d.k();
        }
        if (this.f2836f.Z >= 5) {
            this.f2834d.g();
        }
    }
}
