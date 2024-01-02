package l2;

import java.util.Set;
import kotlin.jvm.internal.i;

class e0 extends d0 {
    public static <T> Set<T> b() {
        return u.f2297d;
    }

    public static final <T> Set<T> c(Set<? extends T> set) {
        i.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : d0.a(set.iterator().next()) : b();
    }
}
