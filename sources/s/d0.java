package s;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class d0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f2825d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f2826e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f2827f;

    d0(e0 e0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f2827f = e0Var;
        this.f2825d = lifecycleCallback;
        this.f2826e = str;
    }

    public final void run() {
        e0 e0Var = this.f2827f;
        if (e0Var.f2830b > 0) {
            this.f2825d.f(e0Var.f2831c != null ? e0Var.f2831c.getBundle(this.f2826e) : null);
        }
        if (this.f2827f.f2830b >= 2) {
            this.f2825d.j();
        }
        if (this.f2827f.f2830b >= 3) {
            this.f2825d.h();
        }
        if (this.f2827f.f2830b >= 4) {
            this.f2825d.k();
        }
        if (this.f2827f.f2830b >= 5) {
            this.f2825d.g();
        }
    }
}
