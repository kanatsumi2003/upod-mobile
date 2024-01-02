package a3;

import java.util.concurrent.CancellationException;
import k2.s;
import m2.g;
import t2.l;
import t2.p;

public interface k1 extends g.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f72a = b.f73d;

    public static final class a {
        public static /* synthetic */ void a(k1 k1Var, CancellationException cancellationException, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    cancellationException = null;
                }
                k1Var.n(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(k1 k1Var, R r3, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(k1Var, r3, pVar);
        }

        public static <E extends g.b> E c(k1 k1Var, g.c<E> cVar) {
            return g.b.a.b(k1Var, cVar);
        }

        public static /* synthetic */ t0 d(k1 k1Var, boolean z3, boolean z4, l lVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    z3 = false;
                }
                if ((i3 & 2) != 0) {
                    z4 = true;
                }
                return k1Var.i(z3, z4, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(k1 k1Var, g.c<?> cVar) {
            return g.b.a.c(k1Var, cVar);
        }

        public static g f(k1 k1Var, g gVar) {
            return g.b.a.d(k1Var, gVar);
        }
    }

    public static final class b implements g.c<k1> {

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ b f73d = new b();

        private b() {
        }
    }

    boolean b();

    r h(t tVar);

    t0 i(boolean z3, boolean z4, l<? super Throwable, s> lVar);

    CancellationException m();

    void n(CancellationException cancellationException);

    boolean start();
}
