package a3;

import kotlin.jvm.internal.i;
import m2.d;
import m2.g;
import t2.l;
import t2.p;

public abstract class a<T> extends r1 implements d<T>, i0 {

    /* renamed from: e  reason: collision with root package name */
    private final g f40e;

    public a(g gVar, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            R((k1) gVar.get(k1.f72a));
        }
        this.f40e = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    public String B() {
        return i.j(m0.a(this), " was cancelled");
    }

    public final void Q(Throwable th) {
        h0.a(this.f40e, th);
    }

    public String X() {
        String b4 = e0.b(this.f40e);
        if (b4 == null) {
            return super.X();
        }
        return '\"' + b4 + "\":" + super.X();
    }

    public boolean b() {
        return super.b();
    }

    public g c() {
        return this.f40e;
    }

    /* access modifiers changed from: protected */
    public final void c0(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            t0(zVar.f133a, zVar.a());
            return;
        }
        u0(obj);
    }

    public final g getContext() {
        return this.f40e;
    }

    public final void resumeWith(Object obj) {
        Object V = V(d0.d(obj, (l) null, 1, (Object) null));
        if (V != s1.f105b) {
            s0(V);
        }
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        w(obj);
    }

    /* access modifiers changed from: protected */
    public void t0(Throwable th, boolean z3) {
    }

    /* access modifiers changed from: protected */
    public void u0(T t3) {
    }

    public final <R> void v0(k0 k0Var, R r3, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        k0Var.b(pVar, r3, this);
    }
}
