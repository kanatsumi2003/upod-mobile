package t;

import android.os.Parcel;
import android.os.Parcelable;
import u.b;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i6 = b.i(k3);
            if (i6 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i6 == 2) {
                z3 = b.j(parcel, k3);
            } else if (i6 == 3) {
                z4 = b.j(parcel, k3);
            } else if (i6 == 4) {
                i4 = b.m(parcel, k3);
            } else if (i6 != 5) {
                b.p(parcel, k3);
            } else {
                i5 = b.m(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new q(i3, z3, z4, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new q[i3];
    }
}
