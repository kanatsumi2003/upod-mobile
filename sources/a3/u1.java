package a3;

public abstract class u1 extends f0 {
    public abstract u1 k();

    /* access modifiers changed from: protected */
    public final String p() {
        u1 u1Var;
        u1 c4 = s0.c();
        if (this == c4) {
            return "Dispatchers.Main";
        }
        try {
            u1Var = c4.k();
        } catch (UnsupportedOperationException unused) {
            u1Var = null;
        }
        if (this == u1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String p3 = p();
        if (p3 != null) {
            return p3;
        }
        return m0.a(this) + '@' + m0.b(this);
    }
}
