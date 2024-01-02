package y2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import t2.l;

class h extends g {
    public static <T, R> b<R> c(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        i.e(bVar, "<this>");
        i.e(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C d(b<? extends T> bVar, C c4) {
        i.e(bVar, "<this>");
        i.e(c4, "destination");
        for (Object add : bVar) {
            c4.add(add);
        }
        return c4;
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        i.e(bVar, "<this>");
        return i.e(f(bVar));
    }

    public static final <T> List<T> f(b<? extends T> bVar) {
        i.e(bVar, "<this>");
        return (List) d(bVar, new ArrayList());
    }
}
