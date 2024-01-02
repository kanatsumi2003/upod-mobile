package c3;

import k2.s;
import t2.l;

public final class h {
    public static final <E> f<E> a(int i3, e eVar, l<? super E, s> lVar) {
        int i4 = 1;
        if (i3 == -2) {
            if (eVar == e.SUSPEND) {
                i4 = f.f723a.a();
            }
            return new d(i4, eVar, lVar);
        } else if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? (i3 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(i3, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        } else {
            if (eVar != e.SUSPEND) {
                i4 = 0;
            }
            if (i4 != 0) {
                return new m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ f b(int i3, e eVar, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i3 = 0;
        }
        if ((i4 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        return a(i3, eVar, lVar);
    }
}
