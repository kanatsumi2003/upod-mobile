package com.google.android.gms.common.api.internal;

import android.util.Log;
import q.a;
import t.i;

final class o implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f848d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p f849e;

    o(p pVar, a aVar) {
        this.f849e = pVar;
        this.f848d = aVar;
    }

    public final void run() {
        p pVar = this.f849e;
        m mVar = (m) pVar.f855f.f801l.get(pVar.f851b);
        if (mVar != null) {
            if (this.f848d.f()) {
                this.f849e.f854e = true;
                if (this.f849e.f850a.o()) {
                    this.f849e.h();
                    return;
                }
                try {
                    p pVar2 = this.f849e;
                    pVar2.f850a.d((i) null, pVar2.f850a.b());
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    this.f849e.f850a.c("Failed to get service from broker.");
                    mVar.H(new a(10), (Exception) null);
                }
            } else {
                mVar.H(this.f848d, (Exception) null);
            }
        }
    }
}
