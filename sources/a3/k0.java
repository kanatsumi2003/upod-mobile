package a3;

import f3.b;
import k2.k;
import m2.d;
import m2.f;
import t2.l;
import t2.p;

public enum k0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71a = null;

        static {
            int[] iArr = new int[k0.values().length];
            iArr[k0.DEFAULT.ordinal()] = 1;
            iArr[k0.ATOMIC.ordinal()] = 2;
            iArr[k0.UNDISPATCHED.ordinal()] = 3;
            iArr[k0.LAZY.ordinal()] = 4;
            f71a = iArr;
        }
    }

    public final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r3, d<? super T> dVar) {
        int i3 = a.f71a[ordinal()];
        if (i3 == 1) {
            f3.a.e(pVar, r3, dVar, (l) null, 4, (Object) null);
        } else if (i3 == 2) {
            f.a(pVar, r3, dVar);
        } else if (i3 == 3) {
            b.a(pVar, r3, dVar);
        } else if (i3 != 4) {
            throw new k();
        }
    }

    public final boolean c() {
        return this == LAZY;
    }
}
