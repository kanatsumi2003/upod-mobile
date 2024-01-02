package f0;

import java.util.concurrent.Executor;

final class c0<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1192a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f1193b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public h<? super TResult> f1194c;

    public c0(Executor executor, h<? super TResult> hVar) {
        this.f1192a = executor;
        this.f1194c = hVar;
    }

    public final void d(k<TResult> kVar) {
        if (kVar.n()) {
            synchronized (this.f1193b) {
                if (this.f1194c != null) {
                    this.f1192a.execute(new b0(this, kVar));
                }
            }
        }
    }
}
