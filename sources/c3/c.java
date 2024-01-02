package c3;

import a3.m0;
import a3.n;
import c3.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import t2.l;

public abstract class c<E> implements t<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f709d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b  reason: collision with root package name */
    protected final l<E, s> f710b;

    /* renamed from: c  reason: collision with root package name */
    private final k f711c = new k();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: g  reason: collision with root package name */
        public final E f712g;

        public a(E e4) {
            this.f712g = e4;
        }

        public x A(m.b bVar) {
            return n.f80a;
        }

        public String toString() {
            return "SendBuffered@" + m0.b(this) + '(' + this.f712g + ')';
        }

        public void y() {
        }

        public Object z() {
            return this.f712g;
        }
    }

    public c(l<? super E, s> lVar) {
        this.f710b = lVar;
    }

    private final int b() {
        k kVar = this.f711c;
        int i3 = 0;
        for (m mVar = (m) kVar.o(); !i.a(mVar, kVar); mVar = mVar.p()) {
            if (mVar instanceof m) {
                i3++;
            }
        }
        return i3;
    }

    private final String f() {
        m p3 = this.f711c.p();
        if (p3 == this.f711c) {
            return "EmptyQueue";
        }
        String mVar = p3 instanceof j ? p3.toString() : p3 instanceof o ? "ReceiveQueued" : p3 instanceof s ? "SendQueued" : i.j("UNEXPECTED:", p3);
        m q3 = this.f711c.q();
        if (q3 == p3) {
            return mVar;
        }
        String str = mVar + ",queueSize=" + b();
        if (!(q3 instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + q3;
    }

    private final void g(j<?> jVar) {
        Object b4 = j.b((Object) null, 1, (e) null);
        while (true) {
            m q3 = jVar.q();
            o oVar = q3 instanceof o ? (o) q3 : null;
            if (oVar == null) {
                break;
            } else if (!oVar.u()) {
                oVar.r();
            } else {
                b4 = j.c(b4, oVar);
            }
        }
        if (b4 != null) {
            if (!(b4 instanceof ArrayList)) {
                ((o) b4).z(jVar);
            } else {
                ArrayList arrayList = (ArrayList) b4;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        ((o) arrayList.get(size)).z(jVar);
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.F();
    }

    public final Object a(E e4) {
        j<?> jVar;
        i.b bVar;
        Object i3 = i(e4);
        if (i3 == b.f704b) {
            return i.f726a.c(s.f2081a);
        }
        if (i3 == b.f705c) {
            jVar = d();
            if (jVar == null) {
                return i.f726a.b();
            }
            bVar = i.f726a;
        } else if (i3 instanceof j) {
            bVar = i.f726a;
            jVar = (j) i3;
        } else {
            throw new IllegalStateException(kotlin.jvm.internal.i.j("trySend returned ", i3).toString());
        }
        return bVar.a(h(jVar));
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "";
    }

    /* access modifiers changed from: protected */
    public final j<?> d() {
        m q3 = this.f711c.q();
        j<?> jVar = q3 instanceof j ? (j) q3 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    public final k e() {
        return this.f711c;
    }

    /* access modifiers changed from: protected */
    public Object i(E e4) {
        q l3;
        do {
            l3 = l();
            if (l3 == null) {
                return b.f705c;
            }
        } while (l3.g(e4, (m.b) null) == null);
        l3.c(e4);
        return l3.e();
    }

    /* access modifiers changed from: protected */
    public void j(m mVar) {
    }

    /* access modifiers changed from: protected */
    public final q<?> k(E e4) {
        m q3;
        k kVar = this.f711c;
        a aVar = new a(e4);
        do {
            q3 = kVar.q();
            if (q3 instanceof q) {
                return (q) q3;
            }
        } while (!q3.j(aVar, kVar));
        return null;
    }

    /* access modifiers changed from: protected */
    public q<E> l() {
        m mVar;
        m v3;
        k kVar = this.f711c;
        while (true) {
            mVar = (m) kVar.o();
            if (mVar != kVar && (mVar instanceof q)) {
                if (((((q) mVar) instanceof j) && !mVar.t()) || (v3 = mVar.v()) == null) {
                    break;
                }
                v3.s();
            }
        }
        mVar = null;
        return (q) mVar;
    }

    /* access modifiers changed from: protected */
    public final s m() {
        m mVar;
        m v3;
        k kVar = this.f711c;
        while (true) {
            mVar = (m) kVar.o();
            if (mVar != kVar && (mVar instanceof s)) {
                if (((((s) mVar) instanceof j) && !mVar.t()) || (v3 = mVar.v()) == null) {
                    break;
                }
                v3.s();
            }
        }
        mVar = null;
        return (s) mVar;
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + '{' + f() + '}' + c();
    }
}
