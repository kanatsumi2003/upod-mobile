package a3;

import k2.s;
import m2.d;
import m2.g;
import t2.p;

final /* synthetic */ class h {
    public static final k1 a(i0 i0Var, g gVar, k0 k0Var, p<? super i0, ? super d<? super s>, ? extends Object> pVar) {
        g c4 = e0.c(i0Var, gVar);
        a t1Var = k0Var.c() ? new t1(c4, pVar) : new z1(c4, true);
        t1Var.v0(k0Var, t1Var, pVar);
        return t1Var;
    }

    public static /* synthetic */ k1 b(i0 i0Var, g gVar, k0 k0Var, p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gVar = m2.h.f2357d;
        }
        if ((i3 & 2) != 0) {
            k0Var = k0.DEFAULT;
        }
        return g.a(i0Var, gVar, k0Var, pVar);
    }
}
