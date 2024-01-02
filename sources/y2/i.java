package y2;

import java.util.Iterator;
import t2.l;

public final class i<T, R> implements b<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f3259a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f3260b;

    public static final class a implements Iterator<R> {

        /* renamed from: d  reason: collision with root package name */
        private final Iterator<T> f3261d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i<T, R> f3262e;

        a(i<T, R> iVar) {
            this.f3262e = iVar;
            this.f3261d = iVar.f3259a.iterator();
        }

        public boolean hasNext() {
            return this.f3261d.hasNext();
        }

        public R next() {
            return this.f3262e.f3260b.invoke(this.f3261d.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.i.e(bVar, "sequence");
        kotlin.jvm.internal.i.e(lVar, "transformer");
        this.f3259a = bVar;
        this.f3260b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
