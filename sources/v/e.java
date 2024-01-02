package v;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import s.c;
import s.h;
import t.d;
import t.g;
import t.v;

public final class e extends g<a> {
    private final v I;

    public e(Context context, Looper looper, d dVar, v vVar, c cVar, h hVar) {
        super(context, looper, 270, dVar, cVar, hVar);
        this.I = vVar;
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean H() {
        return true;
    }

    public final int f() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final q.c[] u() {
        return a0.d.f14b;
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        return this.I.d();
    }
}
