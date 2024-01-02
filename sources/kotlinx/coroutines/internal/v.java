package kotlinx.coroutines.internal;

import a3.a;
import a3.d0;
import a3.k1;
import a3.r;
import kotlin.coroutines.jvm.internal.e;
import m2.d;
import t2.l;

public class v<T> extends a<T> implements e {

    /* renamed from: f  reason: collision with root package name */
    public final d<T> f2160f;

    /* access modifiers changed from: protected */
    public final boolean T() {
        return true;
    }

    public final e getCallerFrame() {
        d<T> dVar = this.f2160f;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        d<T> dVar = this.f2160f;
        dVar.resumeWith(d0.a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    public void w(Object obj) {
        g.c(c.b(this.f2160f), d0.a(obj, this.f2160f), (l) null, 2, (Object) null);
    }

    public final k1 w0() {
        r N = N();
        if (N == null) {
            return null;
        }
        return N.getParent();
    }
}
