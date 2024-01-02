package f0;

final class x implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f1223d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y f1224e;

    x(y yVar, k kVar) {
        this.f1224e = yVar;
        this.f1223d = kVar;
    }

    public final void run() {
        synchronized (this.f1224e.f1226b) {
            y yVar = this.f1224e;
            if (yVar.f1227c != null) {
                yVar.f1227c.a(this.f1223d);
            }
        }
    }
}
