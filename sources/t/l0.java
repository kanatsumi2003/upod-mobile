package t;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import q.a;
import u.b;

public final class l0 implements Parcelable.Creator<k0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        IBinder iBinder = null;
        a aVar = null;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i4 == 2) {
                iBinder = b.l(parcel, k3);
            } else if (i4 == 3) {
                aVar = (a) b.c(parcel, k3, a.CREATOR);
            } else if (i4 == 4) {
                z3 = b.j(parcel, k3);
            } else if (i4 != 5) {
                b.p(parcel, k3);
            } else {
                z4 = b.j(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new k0(i3, iBinder, aVar, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new k0[i3];
    }
}
