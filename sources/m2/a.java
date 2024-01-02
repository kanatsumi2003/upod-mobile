package m2;

import kotlin.jvm.internal.i;
import m2.g;
import t2.p;

public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        i.e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r3, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.key;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
