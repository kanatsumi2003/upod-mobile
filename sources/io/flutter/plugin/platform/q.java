package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.plugin.platform.s;

public final /* synthetic */ class q implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s.a f1758a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1759b;

    public /* synthetic */ q(s.a aVar, int i3) {
        this.f1758a = aVar;
        this.f1759b = i3;
    }

    public final void onFocusChange(View view, boolean z3) {
        this.f1758a.o(this.f1759b, view, z3);
    }
}
