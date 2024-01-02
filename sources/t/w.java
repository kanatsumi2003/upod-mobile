package t;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u.b;

public final class w implements Parcelable.Creator<s> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        int i3 = 0;
        ArrayList<m> arrayList = null;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i4 != 2) {
                b.p(parcel, k3);
            } else {
                arrayList = b.g(parcel, k3, m.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new s(i3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new s[i3];
    }
}
