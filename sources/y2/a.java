package y2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.i;

public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<b<T>> f3257a;

    public a(b<? extends T> bVar) {
        i.e(bVar, "sequence");
        this.f3257a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        b andSet = this.f3257a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
