package l2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.l;
import kotlin.jvm.internal.i;

class z extends y {
    public static final <K, V> Map<K, V> d() {
        t tVar = t.f2296d;
        i.c(tVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return tVar;
    }

    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        i.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends l<? extends K, ? extends V>> iterable) {
        i.e(map, "<this>");
        i.e(iterable, "pairs");
        for (l lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> g(Iterable<? extends l<? extends K, ? extends V>> iterable) {
        i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(y.a(collection.size())));
        }
        return y.b((l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends l<? extends K, ? extends V>> iterable, M m3) {
        i.e(iterable, "<this>");
        i.e(m3, "destination");
        f(m3, iterable);
        return m3;
    }
}
