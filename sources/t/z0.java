package t;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q.c;
import u.b;

public final class z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        e eVar = null;
        int i3 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                bundle = b.a(parcel, k3);
            } else if (i4 == 2) {
                cVarArr = (c[]) b.f(parcel, k3, c.CREATOR);
            } else if (i4 == 3) {
                i3 = b.m(parcel, k3);
            } else if (i4 != 4) {
                b.p(parcel, k3);
            } else {
                eVar = (e) b.c(parcel, k3, e.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new y0(bundle, cVarArr, i3, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new y0[i3];
    }
}
