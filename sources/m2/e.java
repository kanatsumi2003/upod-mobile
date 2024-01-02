package m2;

import kotlin.jvm.internal.i;
import m2.g;

public interface e extends g.b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f2354c = b.f2355d;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            i.e(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b4 = bVar.b(eVar);
                if (b4 instanceof g.b) {
                    return b4;
                }
                return null;
            } else if (e.f2354c != cVar) {
                return null;
            } else {
                i.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            i.e(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.f2354c == cVar ? h.f2357d : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f2357d;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ b f2355d = new b();

        private b() {
        }
    }

    void e(d<?> dVar);

    <T> d<T> r(d<? super T> dVar);
}
