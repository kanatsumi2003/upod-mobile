package com.google.firebase.storage;

import android.util.Log;
import com.google.firebase.storage.k;
import f0.l;
import org.json.JSONException;
import u0.c;
import v0.k;

class z implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private final l f1031d;

    /* renamed from: e  reason: collision with root package name */
    private final l<k> f1032e;

    /* renamed from: f  reason: collision with root package name */
    private final k f1033f;

    /* renamed from: g  reason: collision with root package name */
    private k f1034g = null;

    /* renamed from: h  reason: collision with root package name */
    private c f1035h;

    public z(l lVar, l<k> lVar2, k kVar) {
        this.f1031d = lVar;
        this.f1032e = lVar2;
        this.f1033f = kVar;
        d o3 = lVar.o();
        this.f1035h = new c(o3.a().l(), o3.c(), o3.b(), o3.k());
    }

    public void run() {
        k kVar = new k(this.f1031d.p(), this.f1031d.e(), this.f1033f.q());
        this.f1035h.d(kVar);
        if (kVar.w()) {
            try {
                this.f1034g = new k.b(kVar.o(), this.f1031d).a();
            } catch (JSONException e4) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + kVar.n(), e4);
                this.f1032e.b(j.d(e4));
                return;
            }
        }
        l<k> lVar = this.f1032e;
        if (lVar != null) {
            kVar.a(lVar, this.f1034g);
        }
    }
}
