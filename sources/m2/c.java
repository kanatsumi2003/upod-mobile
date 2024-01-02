package m2;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m2.g;
import t2.p;

public final class c implements g, Serializable {

    /* renamed from: d  reason: collision with root package name */
    private final g f2351d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b f2352e;

    static final class a extends j implements p<String, g.b, String> {

        /* renamed from: d  reason: collision with root package name */
        public static final a f2353d = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            i.e(str, "acc");
            i.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        i.e(gVar, "left");
        i.e(bVar, "element");
        this.f2351d = gVar;
        this.f2352e = bVar;
    }

    private final boolean a(g.b bVar) {
        return i.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (a(cVar.f2352e)) {
            g gVar = cVar.f2351d;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                i.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
        }
        return false;
    }

    private final int f() {
        int i3 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f2351d;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i3;
            }
            i3++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f() != f() || !cVar.c(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        i.e(pVar, "operation");
        return pVar.invoke(this.f2351d.fold(r3, pVar), this.f2352e);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        i.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e4 = cVar2.f2352e.get(cVar);
            if (e4 != null) {
                return e4;
            }
            g gVar = cVar2.f2351d;
            if (!(gVar instanceof c)) {
                return gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f2351d.hashCode() + this.f2352e.hashCode();
    }

    public g minusKey(g.c<?> cVar) {
        i.e(cVar, "key");
        if (this.f2352e.get(cVar) != null) {
            return this.f2351d;
        }
        g minusKey = this.f2351d.minusKey(cVar);
        return minusKey == this.f2351d ? this : minusKey == h.f2357d ? this.f2352e : new c(minusKey, this.f2352e);
    }

    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f2353d)) + ']';
    }
}
