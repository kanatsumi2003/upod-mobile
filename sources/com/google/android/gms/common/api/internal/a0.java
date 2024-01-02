package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import q.a;
import t.o;

final class a0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private final y f784d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b0 f785e;

    a0(b0 b0Var, y yVar) {
        this.f785e = b0Var;
        this.f784d = yVar;
    }

    public final void run() {
        if (this.f785e.f807b) {
            a b4 = this.f784d.b();
            if (b4.e()) {
                b0 b0Var = this.f785e;
                b0Var.f778a.startActivityForResult(GoogleApiActivity.a(b0Var.b(), (PendingIntent) o.h(b4.d()), this.f784d.a(), false), 1);
                return;
            }
            b0 b0Var2 = this.f785e;
            if (b0Var2.f810e.a(b0Var2.b(), b4.b(), (String) null) != null) {
                b0 b0Var3 = this.f785e;
                b0Var3.f810e.t(b0Var3.b(), this.f785e.f778a, b4.b(), 2, this.f785e);
            } else if (b4.b() == 18) {
                b0 b0Var4 = this.f785e;
                Dialog o3 = b0Var4.f810e.o(b0Var4.b(), this.f785e);
                b0 b0Var5 = this.f785e;
                b0Var5.f810e.p(b0Var5.b().getApplicationContext(), new z(this, o3));
            } else {
                this.f785e.l(b4, this.f784d.a());
            }
        }
    }
}
