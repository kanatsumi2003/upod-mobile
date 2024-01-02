package f3;

import k2.m;
import k2.n;
import k2.s;
import kotlinx.coroutines.internal.g;
import m2.d;
import t2.l;
import t2.p;

public final class a {
    /* access modifiers changed from: private */
    public static final void b(d<?> dVar, Throwable th) {
        m.a aVar = m.f2075d;
        dVar.resumeWith(m.a(n.a(th)));
        throw th;
    }

    public static final void c(d<? super s> dVar, d<?> dVar2) {
        try {
            d b4 = c.b(dVar);
            m.a aVar = m.f2075d;
            g.c(b4, m.a(s.f2081a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            b(dVar2, th);
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r3, d<? super T> dVar, l<? super Throwable, s> lVar) {
        try {
            d b4 = c.b(c.a(pVar, r3, dVar));
            m.a aVar = m.f2075d;
            g.b(b4, m.a(s.f2081a), lVar);
        } catch (Throwable th) {
            b(dVar, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, l lVar, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
