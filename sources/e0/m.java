package e0;

import android.os.Parcel;
import android.os.Parcelable;
import q.a;
import t.k0;
import u.b;

public final class m implements Parcelable.Creator<l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        a aVar = null;
        k0 k0Var = null;
        int i3 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i4 == 2) {
                aVar = (a) b.c(parcel, k3, a.CREATOR);
            } else if (i4 != 3) {
                b.p(parcel, k3);
            } else {
                k0Var = (k0) b.c(parcel, k3, k0.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new l(i3, aVar, k0Var);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new l[i3];
    }
}
