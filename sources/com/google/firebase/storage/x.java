package com.google.firebase.storage;

import com.google.firebase.storage.s;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f1023d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1024e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s.a f1025f;

    public /* synthetic */ x(y yVar, Object obj, s.a aVar) {
        this.f1023d = yVar;
        this.f1024e = obj;
        this.f1025f = aVar;
    }

    public final void run() {
        this.f1023d.f(this.f1024e, this.f1025f);
    }
}
