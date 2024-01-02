package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.d0;

public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f1435d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d0.c f1436e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f1437f;

    public /* synthetic */ a0(b0 b0Var, d0.c cVar, KeyEvent keyEvent) {
        this.f1435d = b0Var;
        this.f1436e = cVar;
        this.f1437f = keyEvent;
    }

    public final void run() {
        this.f1435d.l(this.f1436e, this.f1437f);
    }
}
