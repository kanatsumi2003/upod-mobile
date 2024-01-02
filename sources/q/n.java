package q;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import u.b;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i5 = b.i(k3);
            if (i5 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i5 == 2) {
                i4 = b.m(parcel, k3);
            } else if (i5 == 3) {
                pendingIntent = (PendingIntent) b.c(parcel, k3, PendingIntent.CREATOR);
            } else if (i5 != 4) {
                b.p(parcel, k3);
            } else {
                str = b.d(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new a(i3, i4, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
