package c3;

import k2.s;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.x;
import t2.l;

public class n<E> extends a<E> {
    public n(l<? super E, s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public Object i(E e4) {
        q<?> k3;
        do {
            Object i3 = super.i(e4);
            x xVar = b.f704b;
            if (i3 == xVar) {
                return xVar;
            }
            if (i3 == b.f705c) {
                k3 = k(e4);
                if (k3 == null) {
                    return xVar;
                }
            } else if (i3 instanceof j) {
                return i3;
            } else {
                throw new IllegalStateException(i.j("Invalid offerInternal result ", i3).toString());
            }
        } while (!(k3 instanceof j));
        return k3;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return true;
    }
}
