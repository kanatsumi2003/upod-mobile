package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import s.o;

final class z extends o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f874a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f875b;

    z(a0 a0Var, Dialog dialog) {
        this.f875b = a0Var;
        this.f874a = dialog;
    }

    public final void a() {
        this.f875b.f785e.o();
        if (this.f874a.isShowing()) {
            this.f874a.dismiss();
        }
    }
}
