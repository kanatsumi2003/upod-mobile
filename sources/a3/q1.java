package a3;

import kotlin.jvm.internal.i;

public abstract class q1 extends b0 implements t0, f1 {

    /* renamed from: g  reason: collision with root package name */
    public r1 f88g;

    public final void A(r1 r1Var) {
        this.f88g = r1Var;
    }

    public void a() {
        z().g0(this);
    }

    public boolean b() {
        return true;
    }

    public v1 h() {
        return null;
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + "[job@" + m0.b(z()) + ']';
    }

    public final r1 z() {
        r1 r1Var = this.f88g;
        if (r1Var != null) {
            return r1Var;
        }
        i.o("job");
        return null;
    }
}
