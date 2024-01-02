package com.google.firebase.storage;

import android.util.Log;
import f0.l;
import org.json.JSONException;
import t.o;
import u0.c;
import v0.d;

class i implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private final l f935d;

    /* renamed from: e  reason: collision with root package name */
    private final l<h> f936e;

    /* renamed from: f  reason: collision with root package name */
    private final c f937f;

    /* renamed from: g  reason: collision with root package name */
    private final String f938g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f939h;

    i(l lVar, Integer num, String str, l<h> lVar2) {
        o.h(lVar);
        o.h(lVar2);
        this.f935d = lVar;
        this.f939h = num;
        this.f938g = str;
        this.f936e = lVar2;
        d o3 = lVar.o();
        this.f937f = new c(o3.a().l(), o3.c(), o3.b(), o3.j());
    }

    public void run() {
        h hVar;
        d dVar = new d(this.f935d.p(), this.f935d.e(), this.f939h, this.f938g);
        this.f937f.d(dVar);
        if (dVar.w()) {
            try {
                hVar = h.a(this.f935d.o(), dVar.o());
            } catch (JSONException e4) {
                Log.e("ListTask", "Unable to parse response body. " + dVar.n(), e4);
                this.f936e.b(j.d(e4));
                return;
            }
        } else {
            hVar = null;
        }
        l<h> lVar = this.f936e;
        if (lVar != null) {
            dVar.a(lVar, hVar);
        }
    }
}
