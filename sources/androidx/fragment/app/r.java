package androidx.fragment.app;

import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;

class r implements g {

    /* renamed from: a  reason: collision with root package name */
    private h f445a = null;

    r() {
    }

    public d a() {
        c();
        return this.f445a;
    }

    /* access modifiers changed from: package-private */
    public void b(d.a aVar) {
        this.f445a.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f445a == null) {
            this.f445a = new h(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f445a != null;
    }
}
