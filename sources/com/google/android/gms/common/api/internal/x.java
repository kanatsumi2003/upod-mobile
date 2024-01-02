package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f871a;

    public x(int i3) {
        this.f871a = i3;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(m<?> mVar);

    public abstract void d(e eVar, boolean z3);
}
