package f0;

import java.util.concurrent.Executor;

final class t implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f1214d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u f1215e;

    t(u uVar, k kVar) {
        this.f1215e = uVar;
        this.f1214d = kVar;
    }

    public final void run() {
        try {
            k kVar = (k) this.f1215e.f1217b.a(this.f1214d);
            if (kVar == null) {
                this.f1215e.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = m.f1210b;
            kVar.h(executor, this.f1215e);
            kVar.f(executor, this.f1215e);
            kVar.b(executor, this.f1215e);
        } catch (j e4) {
            if (e4.getCause() instanceof Exception) {
                this.f1215e.f1218c.o((Exception) e4.getCause());
            } else {
                this.f1215e.f1218c.o(e4);
            }
        } catch (Exception e5) {
            this.f1215e.f1218c.o(e5);
        }
    }
}
