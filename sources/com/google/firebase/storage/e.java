package com.google.firebase.storage;

import g0.d;
import java.util.HashMap;
import java.util.Map;
import k0.a;
import q0.b;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f921a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final d f922b;

    /* renamed from: c  reason: collision with root package name */
    private final b<a> f923c;

    /* renamed from: d  reason: collision with root package name */
    private final b<i0.b> f924d;

    e(d dVar, b<a> bVar, b<i0.b> bVar2) {
        this.f922b = dVar;
        this.f923c = bVar;
        this.f924d = bVar2;
    }

    /* access modifiers changed from: package-private */
    public synchronized d a(String str) {
        d dVar;
        dVar = this.f921a.get(str);
        if (dVar == null) {
            dVar = new d(str, this.f922b, this.f923c, this.f924d);
            this.f921a.put(str, dVar);
        }
        return dVar;
    }
}
