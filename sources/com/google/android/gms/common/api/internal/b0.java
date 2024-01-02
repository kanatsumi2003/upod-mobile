package com.google.android.gms.common.api.internal;

import a0.f;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import q.a;
import s.e;

public abstract class b0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    protected volatile boolean f807b;

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicReference<y> f808c = new AtomicReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final Handler f809d = new f(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    protected final q.f f810e;

    b0(e eVar, q.f fVar) {
        super(eVar);
        this.f810e = fVar;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar, int i3) {
        this.f808c.set((Object) null);
        m(aVar, i3);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.f808c.set((Object) null);
        n();
    }

    private static final int p(y yVar) {
        if (yVar == null) {
            return -1;
        }
        return yVar.a();
    }

    public final void e(int i3, int i4, Intent intent) {
        y yVar = this.f808c.get();
        if (i3 != 1) {
            if (i3 == 2) {
                int e4 = this.f810e.e(b());
                if (e4 == 0) {
                    o();
                    return;
                } else if (yVar != null) {
                    if (yVar.b().b() == 18 && e4 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i4 == -1) {
            o();
            return;
        } else if (i4 == 0) {
            if (yVar != null) {
                int i5 = 13;
                if (intent != null) {
                    i5 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new a(i5, (PendingIntent) null, yVar.b().toString()), p(yVar));
                return;
            }
            return;
        }
        if (yVar != null) {
            l(yVar.b(), yVar.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f808c.set(bundle.getBoolean("resolving_error", false) ? new y(new a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        y yVar = this.f808c.get();
        if (yVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", yVar.a());
            bundle.putInt("failed_status", yVar.b().b());
            bundle.putParcelable("failed_resolution", yVar.b().d());
        }
    }

    public void j() {
        super.j();
        this.f807b = true;
    }

    public void k() {
        super.k();
        this.f807b = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(a aVar, int i3);

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        l(new a(13, (PendingIntent) null), p(this.f808c.get()));
    }

    public final void s(a aVar, int i3) {
        y yVar = new y(aVar, i3);
        if (s.b0.a(this.f808c, (Object) null, yVar)) {
            this.f809d.post(new a0(this, yVar));
        }
    }
}
