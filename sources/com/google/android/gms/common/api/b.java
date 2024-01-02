package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import q.a;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = u.b.q(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = u.b.k(parcel);
            int i5 = u.b.i(k3);
            if (i5 == 1) {
                i4 = u.b.m(parcel, k3);
            } else if (i5 == 2) {
                str = u.b.d(parcel, k3);
            } else if (i5 == 3) {
                pendingIntent = (PendingIntent) u.b.c(parcel, k3, PendingIntent.CREATOR);
            } else if (i5 == 4) {
                aVar = (a) u.b.c(parcel, k3, a.CREATOR);
            } else if (i5 != 1000) {
                u.b.p(parcel, k3);
            } else {
                i3 = u.b.m(parcel, k3);
            }
        }
        u.b.h(parcel, q3);
        return new Status(i3, i4, str, pendingIntent, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new Status[i3];
    }
}
