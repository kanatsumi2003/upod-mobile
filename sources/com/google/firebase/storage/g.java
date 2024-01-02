package com.google.firebase.storage;

import android.util.Log;
import com.google.firebase.storage.k;
import f0.l;
import org.json.JSONException;
import t.o;
import u0.c;
import v0.b;

class g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private l f928d;

    /* renamed from: e  reason: collision with root package name */
    private l<k> f929e;

    /* renamed from: f  reason: collision with root package name */
    private k f930f;

    /* renamed from: g  reason: collision with root package name */
    private c f931g;

    g(l lVar, l<k> lVar2) {
        o.h(lVar);
        o.h(lVar2);
        this.f928d = lVar;
        this.f929e = lVar2;
        if (!lVar.n().k().equals(lVar.k())) {
            d o3 = this.f928d.o();
            this.f931g = new c(o3.a().l(), o3.c(), o3.b(), o3.j());
            return;
        }
        throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
    }

    public void run() {
        b bVar = new b(this.f928d.p(), this.f928d.e());
        this.f931g.d(bVar);
        if (bVar.w()) {
            try {
                this.f930f = new k.b(bVar.o(), this.f928d).a();
            } catch (JSONException e4) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + bVar.n(), e4);
                this.f929e.b(j.d(e4));
                return;
            }
        }
        l<k> lVar = this.f929e;
        if (lVar != null) {
            bVar.a(lVar, this.f930f);
        }
    }
}
