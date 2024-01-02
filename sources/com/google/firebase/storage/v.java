package com.google.firebase.storage;

import com.google.firebase.storage.s;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f1018d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1019e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s.a f1020f;

    public /* synthetic */ v(y yVar, Object obj, s.a aVar) {
        this.f1018d = yVar;
        this.f1019e = obj;
        this.f1020f = aVar;
    }

    public final void run() {
        this.f1018d.g(this.f1019e, this.f1020f);
    }
}
