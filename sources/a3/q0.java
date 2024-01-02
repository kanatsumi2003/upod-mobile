package a3;

import k2.m;
import k2.n;
import k2.s;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.f;
import m2.d;
import m2.g;

public final class q0 {
    public static final <T> void a(p0<? super T> p0Var, int i3) {
        d<? super T> c4 = p0Var.c();
        boolean z3 = i3 == 4;
        if (z3 || !(c4 instanceof f) || b(i3) != b(p0Var.f86f)) {
            d(p0Var, c4, z3);
            return;
        }
        f0 f0Var = ((f) c4).f2125g;
        g context = c4.getContext();
        if (f0Var.g(context)) {
            f0Var.f(context, p0Var);
        } else {
            e(p0Var);
        }
    }

    public static final boolean b(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static final boolean c(int i3) {
        return i3 == 2;
    }

    public static final <T> void d(p0<? super T> p0Var, d<? super T> dVar, boolean z3) {
        Object obj;
        Object i3 = p0Var.i();
        Throwable d4 = p0Var.d(i3);
        if (d4 != null) {
            m.a aVar = m.f2075d;
            obj = n.a(d4);
        } else {
            m.a aVar2 = m.f2075d;
            obj = p0Var.e(i3);
        }
        Object a4 = m.a(obj);
        if (z3) {
            f fVar = (f) dVar;
            d<T> dVar2 = fVar.f2126h;
            Object obj2 = fVar.f2128j;
            g context = dVar2.getContext();
            Object c4 = b0.c(context, obj2);
            d2<?> e4 = c4 != b0.f2109a ? e0.e(dVar2, context, c4) : null;
            try {
                fVar.f2126h.resumeWith(a4);
                s sVar = s.f2081a;
            } finally {
                if (e4 == null || e4.x0()) {
                    b0.a(context, c4);
                }
            }
        } else {
            dVar.resumeWith(a4);
        }
    }

    private static final void e(p0<?> p0Var) {
        v0 a4 = b2.f45a.a();
        if (a4.v()) {
            a4.q(p0Var);
            return;
        }
        a4.t(true);
        try {
            d(p0Var, p0Var.c(), true);
            do {
            } while (a4.x());
        } catch (Throwable th) {
            a4.k(true);
            throw th;
        }
        a4.k(true);
    }
}
