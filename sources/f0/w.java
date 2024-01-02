package f0;

import java.util.concurrent.Executor;

final class w<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1220a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f1221b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public e f1222c;

    public w(Executor executor, e eVar) {
        this.f1220a = executor;
        this.f1222c = eVar;
    }

    public final void d(k<TResult> kVar) {
        if (kVar.l()) {
            synchronized (this.f1221b) {
                if (this.f1222c != null) {
                    this.f1220a.execute(new v(this));
                }
            }
        }
    }
}
