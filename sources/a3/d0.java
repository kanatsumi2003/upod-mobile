package a3;

import k2.m;
import k2.n;
import k2.s;
import kotlin.jvm.internal.e;
import m2.d;
import t2.l;

public final class d0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof z) {
            m.a aVar = m.f2075d;
            obj = n.a(((z) obj).f133a);
        }
        return m.a(obj);
    }

    public static final <T> Object b(Object obj, k<?> kVar) {
        Throwable b4 = m.b(obj);
        return b4 == null ? obj : new z(b4, false, 2, (e) null);
    }

    public static final <T> Object c(Object obj, l<? super Throwable, s> lVar) {
        Throwable b4 = m.b(obj);
        return b4 == null ? lVar != null ? new a0(obj, lVar) : obj : new z(b4, false, 2, (e) null);
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
