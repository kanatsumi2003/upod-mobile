package c3;

import a3.e;
import a3.k;
import a3.m;
import a3.m0;
import a3.o;
import k2.m;
import k2.n;
import k2.s;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import t2.l;

public abstract class a<E> extends c<E> implements f<E> {

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    private static final class C0014a<E> implements g<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f695a;

        /* renamed from: b  reason: collision with root package name */
        private Object f696b = b.f706d;

        public C0014a(a<E> aVar) {
            this.f695a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f729g == null) {
                return false;
            }
            throw w.a(jVar.E());
        }

        private final Object d(m2.d<? super Boolean> dVar) {
            Object obj;
            m a4 = o.a(c.b(dVar));
            b bVar = new b(this, a4);
            while (true) {
                if (this.f695a.p(bVar)) {
                    this.f695a.w(a4, bVar);
                    break;
                }
                Object v3 = this.f695a.v();
                e(v3);
                if (v3 instanceof j) {
                    j jVar = (j) v3;
                    if (jVar.f729g == null) {
                        obj = kotlin.coroutines.jvm.internal.b.a(false);
                    } else {
                        Throwable E = jVar.E();
                        m.a aVar = k2.m.f2075d;
                        obj = n.a(E);
                    }
                    a4.resumeWith(k2.m.a(obj));
                } else if (v3 != b.f706d) {
                    Boolean a5 = kotlin.coroutines.jvm.internal.b.a(true);
                    l<E, s> lVar = this.f695a.f710b;
                    a4.g(a5, lVar == null ? null : kotlinx.coroutines.internal.s.a(lVar, v3, a4.getContext()));
                }
            }
            Object w3 = a4.w();
            if (w3 == d.c()) {
                h.c(dVar);
            }
            return w3;
        }

        public Object a(m2.d<? super Boolean> dVar) {
            Object b4 = b();
            x xVar = b.f706d;
            if (b4 == xVar) {
                e(this.f695a.v());
                if (b() == xVar) {
                    return d(dVar);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(c(b()));
        }

        public final Object b() {
            return this.f696b;
        }

        public final void e(Object obj) {
            this.f696b = obj;
        }

        public E next() {
            E e4 = this.f696b;
            if (!(e4 instanceof j)) {
                E e5 = b.f706d;
                if (e4 != e5) {
                    this.f696b = e5;
                    return e4;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw w.a(((j) e4).E());
        }
    }

    private static class b<E> extends o<E> {

        /* renamed from: g  reason: collision with root package name */
        public final C0014a<E> f697g;

        /* renamed from: h  reason: collision with root package name */
        public final k<Boolean> f698h;

        public b(C0014a<E> aVar, k<? super Boolean> kVar) {
            this.f697g = aVar;
            this.f698h = kVar;
        }

        public l<Throwable, s> A(E e4) {
            l<E, s> lVar = this.f697g.f695a.f710b;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.s.a(lVar, e4, this.f698h.getContext());
        }

        public void c(E e4) {
            this.f697g.e(e4);
            this.f698h.q(a3.n.f80a);
        }

        public x g(E e4, m.b bVar) {
            if (this.f698h.f(Boolean.TRUE, (Object) null, A(e4)) == null) {
                return null;
            }
            return a3.n.f80a;
        }

        public String toString() {
            return i.j("ReceiveHasNext@", m0.b(this));
        }

        public void z(j<?> jVar) {
            Object a4 = jVar.f729g == null ? k.a.a(this.f698h, Boolean.FALSE, (Object) null, 2, (Object) null) : this.f698h.p(jVar.E());
            if (a4 != null) {
                this.f697g.e(jVar);
                this.f698h.q(a4);
            }
        }
    }

    private final class c extends e {

        /* renamed from: d  reason: collision with root package name */
        private final o<?> f699d;

        public c(o<?> oVar) {
            this.f699d = oVar;
        }

        public void a(Throwable th) {
            if (this.f699d.u()) {
                a.this.t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return s.f2081a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f699d + ']';
        }
    }

    public static final class d extends m.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.m f701d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f702e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.m mVar, a aVar) {
            super(mVar);
            this.f701d = mVar;
            this.f702e = aVar;
        }

        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f702e.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public a(l<? super E, s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q3 = q(oVar);
        if (q3) {
            u();
        }
        return q3;
    }

    /* access modifiers changed from: private */
    public final void w(k<?> kVar, o<?> oVar) {
        kVar.k(new c(oVar));
    }

    public final g<E> iterator() {
        return new C0014a(this);
    }

    /* access modifiers changed from: protected */
    public q<E> l() {
        q<E> l3 = super.l();
        if (l3 != null && !(l3 instanceof j)) {
            t();
        }
        return l3;
    }

    /* access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        int x3;
        kotlinx.coroutines.internal.m q3;
        if (r()) {
            kotlinx.coroutines.internal.k e4 = e();
            do {
                q3 = e4.q();
                if (!(!(q3 instanceof s))) {
                    return false;
                }
            } while (!q3.j(oVar, e4));
        } else {
            kotlinx.coroutines.internal.k e5 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.m q4 = e5.q();
                if (!(!(q4 instanceof s))) {
                    return false;
                }
                x3 = q4.x(oVar, e5, dVar);
                if (x3 != 1) {
                }
            } while (x3 != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: protected */
    public abstract boolean s();

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public Object v() {
        while (true) {
            s m3 = m();
            if (m3 == null) {
                return b.f706d;
            }
            if (m3.A((m.b) null) != null) {
                m3.y();
                return m3.z();
            }
            m3.B();
        }
    }
}
