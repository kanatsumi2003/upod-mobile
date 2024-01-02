package f0;

import java.util.concurrent.Executor;

final class a0<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1186a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f1187b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public g f1188c;

    public a0(Executor executor, g gVar) {
        this.f1186a = executor;
        this.f1188c = gVar;
    }

    public final void d(k<TResult> kVar) {
        if (!kVar.n() && !kVar.l()) {
            synchronized (this.f1187b) {
                if (this.f1188c != null) {
                    this.f1186a.execute(new z(this, kVar));
                }
            }
        }
    }
}
