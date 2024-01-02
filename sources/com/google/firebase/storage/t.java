package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class t {

    /* renamed from: c  reason: collision with root package name */
    private static final t f994c = new t();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WeakReference<s<?>>> f995a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f996b = new Object();

    t() {
    }

    static t b() {
        return f994c;
    }

    public void a(s<?> sVar) {
        synchronized (this.f996b) {
            this.f995a.put(sVar.O().toString(), new WeakReference(sVar));
        }
    }

    public void c(s<?> sVar) {
        synchronized (this.f996b) {
            String lVar = sVar.O().toString();
            WeakReference weakReference = this.f995a.get(lVar);
            s<?> sVar2 = weakReference != null ? (s) weakReference.get() : null;
            if (sVar2 == null || sVar2 == sVar) {
                this.f995a.remove(lVar);
            }
        }
    }
}
