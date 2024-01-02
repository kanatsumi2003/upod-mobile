package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.h;

class a {

    /* renamed from: a  reason: collision with root package name */
    private h f1721a;

    a() {
    }

    public boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        h hVar = this.f1721a;
        if (hVar == null) {
            return false;
        }
        return hVar.w(view, view2, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    public void b(h hVar) {
        this.f1721a = hVar;
    }
}
