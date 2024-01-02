package v;

import a0.c;
import android.os.IBinder;
import android.os.Parcel;
import t.s;

public final class a extends a0.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void l(s sVar) {
        Parcel a4 = a();
        c.b(a4, sVar);
        c(1, a4);
    }
}
