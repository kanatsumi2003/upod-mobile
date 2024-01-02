package e0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import u.b;

public final class c implements Parcelable.Creator<b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        int i3 = 0;
        Intent intent = null;
        int i4 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i5 = b.i(k3);
            if (i5 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i5 == 2) {
                i4 = b.m(parcel, k3);
            } else if (i5 != 3) {
                b.p(parcel, k3);
            } else {
                intent = (Intent) b.c(parcel, k3, Intent.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new b(i3, i4, intent);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new b[i3];
    }
}
