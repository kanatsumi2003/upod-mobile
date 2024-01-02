package com.google.android.gms.common.api.internal;

import android.app.Activity;
import c.b;
import q.a;
import s.e;
import t.o;

public final class f extends b0 {

    /* renamed from: f  reason: collision with root package name */
    private final b<s.b<?>> f823f = new b<>();

    /* renamed from: g  reason: collision with root package name */
    private final b f824g;

    f(e eVar, b bVar, q.f fVar) {
        super(eVar, fVar);
        this.f824g = bVar;
        this.f778a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, s.b<?> bVar2) {
        e c4 = LifecycleCallback.c(activity);
        f fVar = (f) c4.c("ConnectionlessLifecycleHelper", f.class);
        if (fVar == null) {
            fVar = new f(c4, bVar, q.f.k());
        }
        o.i(bVar2, "ApiKey cannot be null");
        fVar.f823f.add(bVar2);
        bVar.c(fVar);
    }

    private final void v() {
        if (!this.f823f.isEmpty()) {
            this.f824g.c(this);
        }
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f824g.d(this);
    }

    /* access modifiers changed from: protected */
    public final void m(a aVar, int i3) {
        this.f824g.F(aVar, i3);
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f824g.a();
    }

    /* access modifiers changed from: package-private */
    public final b<s.b<?>> t() {
        return this.f823f;
    }
}
