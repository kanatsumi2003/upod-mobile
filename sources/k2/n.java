package k2;

import k2.m;
import kotlin.jvm.internal.i;

public final class n {
    public static final Object a(Throwable th) {
        i.e(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f2076d;
        }
    }
}
