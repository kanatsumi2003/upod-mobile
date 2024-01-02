package t;

import android.os.Bundle;
import android.os.Parcel;
import b0.b;
import b0.c;

public abstract class n0 extends b implements k {
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            c.b(parcel);
            j(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i3 == 2) {
            c.b(parcel);
            f(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i3 != 3) {
            return false;
        } else {
            c.b(parcel);
            k(parcel.readInt(), parcel.readStrongBinder(), (y0) c.a(parcel, y0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
