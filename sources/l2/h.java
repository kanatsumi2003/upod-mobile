package l2;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.i;

class h {
    public static final <T> List<T> a(T t3) {
        List<T> singletonList = Collections.singletonList(t3);
        i.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
