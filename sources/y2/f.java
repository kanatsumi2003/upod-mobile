package y2;

import java.util.Iterator;
import kotlin.jvm.internal.i;

class f extends e {

    public static final class a implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f3258a;

        public a(Iterator it) {
            this.f3258a = it;
        }

        public Iterator<T> iterator() {
            return this.f3258a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        i.e(it, "<this>");
        return b(new a(it));
    }

    public static final <T> b<T> b(b<? extends T> bVar) {
        i.e(bVar, "<this>");
        return bVar instanceof a ? bVar : new a(bVar);
    }
}
