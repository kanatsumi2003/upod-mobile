package e0;

import android.os.Parcel;
import android.os.Parcelable;
import t.i0;
import u.b;

public final class k implements Parcelable.Creator<j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        int i3 = 0;
        i0 i0Var = null;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i4 != 2) {
                b.p(parcel, k3);
            } else {
                i0Var = (i0) b.c(parcel, k3, i0.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new j(i3, i0Var);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new j[i3];
    }
}
