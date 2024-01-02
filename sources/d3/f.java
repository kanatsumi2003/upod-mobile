package d3;

import k2.s;
import m2.d;
import t2.p;

final class f<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<c<? super T>, d<? super s>, Object> f1062a;

    public f(p<? super c<? super T>, ? super d<? super s>, ? extends Object> pVar) {
        this.f1062a = pVar;
    }

    public Object b(c<? super T> cVar, d<? super s> dVar) {
        Object invoke = this.f1062a.invoke(cVar, dVar);
        return invoke == d.c() ? invoke : s.f2081a;
    }
}
