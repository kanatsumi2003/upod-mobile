package m2;

import kotlin.jvm.internal.i;
import m2.g;
import m2.g.b;
import t2.l;

public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: d  reason: collision with root package name */
    private final l<g.b, E> f2349d;

    /* renamed from: e  reason: collision with root package name */
    private final g.c<?> f2350e;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        i.e(cVar, "baseKey");
        i.e(lVar, "safeCast");
        this.f2349d = lVar;
        this.f2350e = cVar instanceof b ? ((b) cVar).f2350e : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        i.e(cVar, "key");
        return cVar == this || this.f2350e == cVar;
    }

    public final E b(g.b bVar) {
        i.e(bVar, "element");
        return (g.b) this.f2349d.invoke(bVar);
    }
}
