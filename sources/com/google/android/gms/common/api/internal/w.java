package com.google.android.gms.common.api.internal;

import f0.l;
import q.c;
import s.f;

public final class w extends t<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final f<?> f870c;

    public w(f<?> fVar, l<Boolean> lVar) {
        super(4, lVar);
        this.f870c = fVar;
    }

    public final /* bridge */ /* synthetic */ void d(e eVar, boolean z3) {
    }

    public final boolean f(m<?> mVar) {
        if (mVar.x().get(this.f870c) == null) {
            return false;
        }
        throw null;
    }

    public final c[] g(m<?> mVar) {
        if (mVar.x().get(this.f870c) == null) {
            return null;
        }
        throw null;
    }

    public final void h(m<?> mVar) {
        if (mVar.x().remove(this.f870c) == null) {
            this.f866b.e(Boolean.FALSE);
        } else {
            mVar.v();
            throw null;
        }
    }
}
