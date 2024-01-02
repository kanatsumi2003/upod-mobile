package f0;

import java.util.concurrent.Executor;

final class y<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1225a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f1226b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f<TResult> f1227c;

    public y(Executor executor, f<TResult> fVar) {
        this.f1225a = executor;
        this.f1227c = fVar;
    }

    public final void d(k<TResult> kVar) {
        synchronized (this.f1226b) {
            if (this.f1227c != null) {
                this.f1225a.execute(new x(this, kVar));
            }
        }
    }
}
