package f3;

import k2.m;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.internal.b0;
import m2.d;
import m2.g;
import t2.p;

public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r3, d<? super T> dVar) {
        Object obj;
        g context;
        Object c4;
        d<? super T> a4 = h.a(dVar);
        try {
            context = dVar.getContext();
            c4 = b0.c(context, (Object) null);
            if (pVar != null) {
                obj = ((p) n.a(pVar, 2)).invoke(r3, a4);
                b0.a(context, c4);
                if (obj == d.c()) {
                    return;
                }
                a4.resumeWith(m.a(obj));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            m.a aVar = m.f2075d;
            obj = k2.n.a(th);
        }
    }
}
