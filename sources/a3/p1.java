package a3;

import java.util.concurrent.CancellationException;
import m2.g;

final /* synthetic */ class p1 {
    public static final x a(k1 k1Var) {
        return new n1(k1Var);
    }

    public static /* synthetic */ x b(k1 k1Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            k1Var = null;
        }
        return o1.a(k1Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        k1 k1Var = (k1) gVar.get(k1.f72a);
        if (k1Var != null) {
            k1Var.n(cancellationException);
        }
    }

    public static final void d(k1 k1Var) {
        if (!k1Var.b()) {
            throw k1Var.m();
        }
    }

    public static final void e(g gVar) {
        k1 k1Var = (k1) gVar.get(k1.f72a);
        if (k1Var != null) {
            o1.d(k1Var);
        }
    }
}
