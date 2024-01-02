package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f0.l;
import r.b;
import s.q;

abstract class t<T> extends q {

    /* renamed from: b  reason: collision with root package name */
    protected final l<T> f866b;

    public t(int i3, l<T> lVar) {
        super(i3);
        this.f866b = lVar;
    }

    public final void a(Status status) {
        this.f866b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.f866b.d(exc);
    }

    public final void c(m<?> mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e4) {
            a(x.e(e4));
            throw e4;
        } catch (RemoteException e5) {
            a(x.e(e5));
        } catch (RuntimeException e6) {
            this.f866b.d(e6);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(m<?> mVar);
}
