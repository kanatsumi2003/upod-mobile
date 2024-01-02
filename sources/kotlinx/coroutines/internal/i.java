package kotlinx.coroutines.internal;

import k2.m;
import k2.n;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f2132a;

    static {
        Object obj;
        try {
            m.a aVar = m.f2075d;
            obj = m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = m.f2075d;
            obj = m.a(n.a(th));
        }
        f2132a = m.d(obj);
    }

    public static final boolean a() {
        return f2132a;
    }
}
