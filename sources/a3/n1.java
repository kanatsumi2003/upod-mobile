package a3;

public class n1 extends r1 implements x {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f83e = s0();

    public n1(k1 k1Var) {
        super(true);
        R(k1Var);
    }

    private final boolean s0() {
        s sVar;
        r N = N();
        s sVar2 = N instanceof s ? (s) N : null;
        if (sVar2 == null) {
            return false;
        }
        do {
            r1 z3 = sVar2.z();
            if (z3.K()) {
                return true;
            }
            r N2 = z3.N();
            if (N2 instanceof s) {
                sVar = (s) N2;
                continue;
            } else {
                sVar = null;
                continue;
            }
        } while (sVar2 != null);
        return false;
    }

    public boolean K() {
        return this.f83e;
    }

    public boolean L() {
        return true;
    }
}
