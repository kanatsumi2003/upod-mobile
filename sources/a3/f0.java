package a3;

import kotlin.jvm.internal.j;
import kotlinx.coroutines.internal.f;
import m2.b;
import m2.d;
import m2.e;
import m2.g;
import t2.l;

public abstract class f0 extends m2.a implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f56d = new a((kotlin.jvm.internal.e) null);

    public static final class a extends b<e, f0> {

        /* renamed from: a3.f0$a$a  reason: collision with other inner class name */
        static final class C0002a extends j implements l<g.b, f0> {

            /* renamed from: d  reason: collision with root package name */
            public static final C0002a f57d = new C0002a();

            C0002a() {
                super(1);
            }

            /* renamed from: a */
            public final f0 invoke(g.b bVar) {
                if (bVar instanceof f0) {
                    return (f0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.f2354c, C0002a.f57d);
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public f0() {
        super(e.f2354c);
    }

    public final void e(d<?> dVar) {
        ((f) dVar).r();
    }

    public abstract void f(g gVar, Runnable runnable);

    public boolean g(g gVar) {
        return true;
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public final <T> d<T> r(d<? super T> dVar) {
        return new f(this, dVar);
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
