package l2;

import java.util.Collection;
import kotlin.jvm.internal.i;

class j extends i {
    public static <T> int g(Iterable<? extends T> iterable, int i3) {
        i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}
