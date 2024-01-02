package f0;

import java.util.concurrent.Executor;

final class u<TResult, TContinuationResult> implements h<TContinuationResult>, g, e, d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1216a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c<TResult, k<TContinuationResult>> f1217b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i0<TContinuationResult> f1218c;

    public u(Executor executor, c<TResult, k<TContinuationResult>> cVar, i0<TContinuationResult> i0Var) {
        this.f1216a = executor;
        this.f1217b = cVar;
        this.f1218c = i0Var;
    }

    public final void a() {
        this.f1218c.q();
    }

    public final void b(TContinuationResult tcontinuationresult) {
        this.f1218c.p(tcontinuationresult);
    }

    public final void c(Exception exc) {
        this.f1218c.o(exc);
    }

    public final void d(k<TResult> kVar) {
        this.f1216a.execute(new t(this, kVar));
    }
}
