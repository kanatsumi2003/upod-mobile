package m2;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import m2.g;
import t2.p;

public final class h implements g, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final h f2357d = new h();

    private h() {
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        i.e(pVar, "operation");
        return r3;
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        i.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public g minusKey(g.c<?> cVar) {
        i.e(cVar, "key");
        return this;
    }

    public g plus(g gVar) {
        i.e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
