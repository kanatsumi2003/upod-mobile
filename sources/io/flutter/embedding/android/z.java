package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.d0;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f1578d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d0.c f1579e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f1580f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f1581g;

    public /* synthetic */ z(b0 b0Var, d0.c cVar, long j3, KeyEvent keyEvent) {
        this.f1578d = b0Var;
        this.f1579e = cVar;
        this.f1580f = j3;
        this.f1581g = keyEvent;
    }

    public final void run() {
        this.f1578d.k(this.f1579e, this.f1580f, this.f1581g);
    }
}
