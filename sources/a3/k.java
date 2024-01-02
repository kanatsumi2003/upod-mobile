package a3;

import k2.s;
import m2.d;
import t2.l;

public interface k<T> extends d<T> {

    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int i3, Object obj3) {
            if (obj3 == null) {
                if ((i3 & 2) != 0) {
                    obj2 = null;
                }
                return kVar.a(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    Object a(T t3, Object obj);

    Object f(T t3, Object obj, l<? super Throwable, s> lVar);

    void g(T t3, l<? super Throwable, s> lVar);

    void k(l<? super Throwable, s> lVar);

    Object p(Throwable th);

    void q(Object obj);
}
