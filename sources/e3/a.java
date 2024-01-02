package e3;

import kotlin.jvm.internal.e;
import m2.g;
import t2.p;

public final class a implements g.b {

    /* renamed from: f  reason: collision with root package name */
    public static final C0020a f1169f = new C0020a((e) null);

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f1170d;

    /* renamed from: e  reason: collision with root package name */
    private final g.c<?> f1171e = f1169f;

    /* renamed from: e3.a$a  reason: collision with other inner class name */
    public static final class C0020a implements g.c<a> {
        private C0020a() {
        }

        public /* synthetic */ C0020a(e eVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f1170d = th;
    }

    public <R> R fold(R r3, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r3, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.f1171e;
    }

    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
