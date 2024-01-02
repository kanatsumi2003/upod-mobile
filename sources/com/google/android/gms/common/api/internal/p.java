package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import r.a;
import s.b;
import s.x;
import t.c;
import t.i;

final class p implements c.C0050c, x {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f850a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b<?> f851b;

    /* renamed from: c  reason: collision with root package name */
    private i f852c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f853d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f854e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b f855f;

    public p(b bVar, a.f fVar, b<?> bVar2) {
        this.f855f = bVar;
        this.f850a = fVar;
        this.f851b = bVar2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        i iVar;
        if (this.f854e && (iVar = this.f852c) != null) {
            this.f850a.d(iVar, this.f853d);
        }
    }

    public final void a(q.a aVar) {
        this.f855f.f805p.post(new o(this, aVar));
    }

    public final void b(i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new q.a(4));
            return;
        }
        this.f852c = iVar;
        this.f853d = set;
        h();
    }

    public final void c(q.a aVar) {
        m mVar = (m) this.f855f.f801l.get(this.f851b);
        if (mVar != null) {
            mVar.I(aVar);
        }
    }
}
