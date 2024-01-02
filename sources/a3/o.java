package a3;

import kotlinx.coroutines.internal.f;
import m2.d;

public final class o {
    public static final <T> m<T> a(d<? super T> dVar) {
        if (!(dVar instanceof f)) {
            return new m<>(dVar, 1);
        }
        m<T> l3 = ((f) dVar).l();
        if (l3 == null || !l3.G()) {
            l3 = null;
        }
        return l3 == null ? new m<>(dVar, 2) : l3;
    }
}
