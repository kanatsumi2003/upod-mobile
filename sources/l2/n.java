package l2;

import java.util.Collection;
import kotlin.jvm.internal.i;

class n extends m {
    public static <T> boolean h(Collection<? super T> collection, Iterable<? extends T> iterable) {
        i.e(collection, "<this>");
        i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z3 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z3 = true;
            }
        }
        return z3;
    }
}
