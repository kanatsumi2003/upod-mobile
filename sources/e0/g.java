package e0;

import a0.a;
import a0.c;
import android.os.IBinder;
import android.os.Parcel;

public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void l(j jVar, f fVar) {
        Parcel a4 = a();
        c.b(a4, jVar);
        c.c(a4, fVar);
        b(12, a4);
    }
}
