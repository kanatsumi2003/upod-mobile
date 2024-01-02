package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f0.l;
import q.c;
import r.a;
import s.j;
import s.q;

public final class v<ResultT> extends q {

    /* renamed from: b  reason: collision with root package name */
    private final c<a.b, ResultT> f867b;

    /* renamed from: c  reason: collision with root package name */
    private final l<ResultT> f868c;

    /* renamed from: d  reason: collision with root package name */
    private final j f869d;

    public v(int i3, c<a.b, ResultT> cVar, l<ResultT> lVar, j jVar) {
        super(i3);
        this.f868c = lVar;
        this.f867b = cVar;
        this.f869d = jVar;
        if (i3 == 2 && cVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f868c.d(this.f869d.a(status));
    }

    public final void b(Exception exc) {
        this.f868c.d(exc);
    }

    public final void c(m<?> mVar) {
        try {
            this.f867b.b(mVar.v(), this.f868c);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            a(x.e(e5));
        } catch (RuntimeException e6) {
            this.f868c.d(e6);
        }
    }

    public final void d(e eVar, boolean z3) {
        eVar.b(this.f868c, z3);
    }

    public final boolean f(m<?> mVar) {
        return this.f867b.c();
    }

    public final c[] g(m<?> mVar) {
        return this.f867b.e();
    }
}
