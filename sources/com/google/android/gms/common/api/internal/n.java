package com.google.android.gms.common.api.internal;

import q.c;
import s.b;
import s.m;

final class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f846a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f847b;

    /* synthetic */ n(b bVar, c cVar, m mVar) {
        this.f846a = bVar;
        this.f847b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            return t.n.a(this.f846a, nVar.f846a) && t.n.a(this.f847b, nVar.f847b);
        }
    }

    public final int hashCode() {
        return t.n.b(this.f846a, this.f847b);
    }

    public final String toString() {
        return t.n.c(this).a("key", this.f846a).a("feature", this.f847b).toString();
    }
}
