package m2;

import k2.m;
import k2.s;
import kotlin.jvm.internal.i;
import t2.p;

public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r3, d<? super T> dVar) {
        i.e(pVar, "<this>");
        i.e(dVar, "completion");
        d b4 = c.b(c.a(pVar, r3, dVar));
        m.a aVar = m.f2075d;
        b4.resumeWith(m.a(s.f2081a));
    }
}
