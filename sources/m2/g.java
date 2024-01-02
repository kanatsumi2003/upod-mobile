package m2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m2.e;
import t2.p;

public interface g {

    public static final class a {

        /* renamed from: m2.g$a$a  reason: collision with other inner class name */
        static final class C0036a extends j implements p<g, b, g> {

            /* renamed from: d  reason: collision with root package name */
            public static final C0036a f2356d = new C0036a();

            C0036a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                c cVar;
                i.e(gVar, "acc");
                i.e(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f2357d;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f2354c;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            i.e(gVar2, "context");
            return gVar2 == h.f2357d ? gVar : (g) gVar2.fold(gVar, C0036a.f2356d);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r3, p<? super R, ? super b, ? extends R> pVar) {
                i.e(pVar, "operation");
                return pVar.invoke(r3, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                i.e(cVar, "key");
                if (!i.a(bVar.getKey(), cVar)) {
                    return null;
                }
                i.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> cVar) {
                i.e(cVar, "key");
                return i.a(bVar.getKey(), cVar) ? h.f2357d : bVar;
            }

            public static g d(b bVar, g gVar) {
                i.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r3, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
