package io.flutter.plugin.platform;

import android.view.View;

public final /* synthetic */ class n implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f1753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1754b;

    public /* synthetic */ n(s sVar, int i3) {
        this.f1753a = sVar;
        this.f1754b = i3;
    }

    public final void onFocusChange(View view, boolean z3) {
        this.f1753a.Q(this.f1754b, view, z3);
    }
}
