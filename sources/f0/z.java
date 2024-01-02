package f0;

import t.o;

final class z implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f1228d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a0 f1229e;

    z(a0 a0Var, k kVar) {
        this.f1229e = a0Var;
        this.f1228d = kVar;
    }

    public final void run() {
        synchronized (this.f1229e.f1187b) {
            a0 a0Var = this.f1229e;
            if (a0Var.f1188c != null) {
                a0Var.f1188c.c((Exception) o.h(this.f1228d.j()));
            }
        }
    }
}
