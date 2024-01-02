package a3;

import k2.s;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.v;
import m2.d;
import m2.g;

public final class d2<T> extends v<T> {

    /* renamed from: g  reason: collision with root package name */
    private g f50g;

    /* renamed from: h  reason: collision with root package name */
    private Object f51h;

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        g gVar = this.f50g;
        d2<?> d2Var = null;
        if (gVar != null) {
            b0.a(gVar, this.f51h);
            this.f50g = d2Var;
            this.f51h = d2Var;
        }
        Object a4 = d0.a(obj, this.f2160f);
        d<T> dVar = this.f2160f;
        g context = dVar.getContext();
        Object c4 = b0.c(context, d2Var);
        if (c4 != b0.f2109a) {
            d2Var = e0.e(dVar, context, c4);
        }
        try {
            this.f2160f.resumeWith(a4);
            s sVar = s.f2081a;
        } finally {
            if (d2Var == null || d2Var.x0()) {
                b0.a(context, c4);
            }
        }
    }

    public final boolean x0() {
        if (this.f50g == null) {
            return false;
        }
        this.f50g = null;
        this.f51h = null;
        return true;
    }

    public final void y0(g gVar, Object obj) {
        this.f50g = gVar;
        this.f51h = obj;
    }
}
