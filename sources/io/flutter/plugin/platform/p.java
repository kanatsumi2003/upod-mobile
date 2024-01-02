package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.plugin.platform.s;
import n1.k;

public final /* synthetic */ class p implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s.a f1756a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f1757b;

    public /* synthetic */ p(s.a aVar, k.d dVar) {
        this.f1756a = aVar;
        this.f1757b = dVar;
    }

    public final void onFocusChange(View view, boolean z3) {
        this.f1756a.n(this.f1757b, view, z3);
    }
}
