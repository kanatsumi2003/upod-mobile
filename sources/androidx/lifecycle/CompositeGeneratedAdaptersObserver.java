package androidx.lifecycle;

import androidx.lifecycle.d;

class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f446a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f446a = cVarArr;
    }

    public void d(g gVar, d.a aVar) {
        k kVar = new k();
        for (c a4 : this.f446a) {
            a4.a(gVar, aVar, false, kVar);
        }
        for (c a5 : this.f446a) {
            a5.a(gVar, aVar, true, kVar);
        }
    }
}
