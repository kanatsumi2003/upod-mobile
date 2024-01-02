package q;

import android.os.Parcel;
import android.os.Parcelable;
import u.b;

public final class o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        String str = null;
        int i3 = 0;
        long j3 = -1;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                str = b.d(parcel, k3);
            } else if (i4 == 2) {
                i3 = b.m(parcel, k3);
            } else if (i4 != 3) {
                b.p(parcel, k3);
            } else {
                j3 = b.n(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new c(str, i3, j3);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new c[i3];
    }
}
