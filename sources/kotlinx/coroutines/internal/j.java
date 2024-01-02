package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.e;

public final class j<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i3, e eVar) {
        if ((i3 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e4) {
        if (obj == null) {
            return a(e4);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e4);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e4);
        return a(arrayList);
    }
}
