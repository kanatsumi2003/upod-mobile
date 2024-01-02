package a3;

import k2.s;
import t2.l;

final class h1 extends i {

    /* renamed from: d  reason: collision with root package name */
    private final l<Throwable, s> f62d;

    public h1(l<? super Throwable, s> lVar) {
        this.f62d = lVar;
    }

    public void a(Throwable th) {
        this.f62d.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return s.f2081a;
    }

    public String toString() {
        return "InvokeOnCancel[" + m0.a(this.f62d) + '@' + m0.b(this) + ']';
    }
}
