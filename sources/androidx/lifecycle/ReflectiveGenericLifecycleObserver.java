package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f468a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0004a f469b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f468a = obj;
        this.f469b = a.f471c.c(obj.getClass());
    }

    public void d(g gVar, d.a aVar) {
        this.f469b.a(gVar, aVar, this.f468a);
    }
}
