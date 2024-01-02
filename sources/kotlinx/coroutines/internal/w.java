package kotlinx.coroutines.internal;

import k2.m;
import k2.n;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2161a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f2162b;

    static {
        Object obj;
        Object obj2;
        try {
            m.a aVar = m.f2075d;
            obj = m.a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = m.f2075d;
            obj = m.a(n.a(th));
        }
        if (m.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f2161a = (String) obj;
        try {
            obj2 = m.a(w.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar3 = m.f2075d;
            obj2 = m.a(n.a(th2));
        }
        if (m.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f2162b = (String) obj2;
    }

    public static final <E extends Throwable> E a(E e4) {
        return e4;
    }
}
