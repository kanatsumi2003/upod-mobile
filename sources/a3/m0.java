package a3;

import k2.m;
import k2.n;
import kotlinx.coroutines.internal.f;
import m2.d;

public final class m0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        Object obj;
        if (dVar instanceof f) {
            return dVar.toString();
        }
        try {
            m.a aVar = m.f2075d;
            obj = m.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            m.a aVar2 = m.f2075d;
            obj = m.a(n.a(th));
        }
        Throwable b4 = m.b(obj);
        String str = obj;
        if (b4 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
