package a3;

import m2.g;
import t2.p;

final class e2 implements g.b, g.c<e2> {

    /* renamed from: d  reason: collision with root package name */
    public static final e2 f54d = new e2();

    private e2() {
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r3, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
