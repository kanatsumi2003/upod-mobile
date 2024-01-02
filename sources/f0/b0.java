package f0;

final class b0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f1190d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c0 f1191e;

    b0(c0 c0Var, k kVar) {
        this.f1191e = c0Var;
        this.f1190d = kVar;
    }

    public final void run() {
        synchronized (this.f1191e.f1193b) {
            c0 c0Var = this.f1191e;
            if (c0Var.f1194c != null) {
                c0Var.f1194c.b(this.f1190d.k());
            }
        }
    }
}
