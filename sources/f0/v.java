package f0;

final class v implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ w f1219d;

    v(w wVar) {
        this.f1219d = wVar;
    }

    public final void run() {
        synchronized (this.f1219d.f1221b) {
            w wVar = this.f1219d;
            if (wVar.f1222c != null) {
                wVar.f1222c.a();
            }
        }
    }
}
