package com.google.firebase.storage;

import f0.l;
import t.o;
import u0.c;
import v0.a;

class b implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private l f897d;

    /* renamed from: e  reason: collision with root package name */
    private l<Void> f898e;

    /* renamed from: f  reason: collision with root package name */
    private c f899f;

    public b(l lVar, l<Void> lVar2) {
        o.h(lVar);
        o.h(lVar2);
        this.f897d = lVar;
        this.f898e = lVar2;
        d o3 = lVar.o();
        this.f899f = new c(o3.a().l(), o3.c(), o3.b(), o3.j());
    }

    public void run() {
        a aVar = new a(this.f897d.p(), this.f897d.e());
        this.f899f.d(aVar);
        aVar.a(this.f898e, null);
    }
}
