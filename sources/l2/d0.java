package l2;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.i;

class d0 {
    public static final <T> Set<T> a(T t3) {
        Set<T> singleton = Collections.singleton(t3);
        i.d(singleton, "singleton(element)");
        return singleton;
    }
}
