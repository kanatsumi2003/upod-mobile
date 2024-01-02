package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import f0.l;
import org.json.JSONObject;
import t.o;
import u0.c;
import v0.b;

class f implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private l f925d;

    /* renamed from: e  reason: collision with root package name */
    private l<Uri> f926e;

    /* renamed from: f  reason: collision with root package name */
    private c f927f;

    f(l lVar, l<Uri> lVar2) {
        o.h(lVar);
        o.h(lVar2);
        this.f925d = lVar;
        this.f926e = lVar2;
        if (!lVar.n().k().equals(lVar.k())) {
            d o3 = this.f925d.o();
            this.f927f = new c(o3.a().l(), o3.c(), o3.b(), o3.k());
            return;
        }
        throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
    }

    private Uri a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f925d.p().c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    public void run() {
        b bVar = new b(this.f925d.p(), this.f925d.e());
        this.f927f.d(bVar);
        Uri a4 = bVar.w() ? a(bVar.o()) : null;
        l<Uri> lVar = this.f926e;
        if (lVar != null) {
            bVar.a(lVar, a4);
        }
    }
}
