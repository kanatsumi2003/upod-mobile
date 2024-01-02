package f0;

import java.util.concurrent.Executor;

public abstract class k<TResult> {
    public k<TResult> a(e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public k<TResult> b(Executor executor, e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public k<TResult> c(f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public k<TResult> d(Executor executor, f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract k<TResult> e(g gVar);

    public abstract k<TResult> f(Executor executor, g gVar);

    public abstract k<TResult> g(h<? super TResult> hVar);

    public abstract k<TResult> h(Executor executor, h<? super TResult> hVar);

    public <TContinuationResult> k<TContinuationResult> i(Executor executor, c<TResult, k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();
}
