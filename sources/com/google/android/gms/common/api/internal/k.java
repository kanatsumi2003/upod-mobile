package com.google.android.gms.common.api.internal;

final class k implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l f831d;

    k(l lVar) {
        this.f831d = lVar;
    }

    public final void run() {
        m mVar = this.f831d.f832a;
        mVar.f834b.c(mVar.f834b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
