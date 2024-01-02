package f0;

import java.util.concurrent.Callable;

final class j0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i0 f1206d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Callable f1207e;

    j0(i0 i0Var, Callable callable) {
        this.f1206d = i0Var;
        this.f1207e = callable;
    }

    public final void run() {
        try {
            this.f1206d.p(this.f1207e.call());
        } catch (Exception e4) {
            this.f1206d.o(e4);
        } catch (Throwable th) {
            this.f1206d.o(new RuntimeException(th));
        }
    }
}
