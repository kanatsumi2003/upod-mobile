package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import u.b;

public final class i implements Parcelable.Creator<h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i3 = b.i(k3);
            if (i3 == 1) {
                arrayList = b.e(parcel, k3);
            } else if (i3 != 2) {
                b.p(parcel, k3);
            } else {
                str = b.d(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new h[i3];
    }
}
