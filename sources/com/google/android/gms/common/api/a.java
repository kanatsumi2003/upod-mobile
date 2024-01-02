package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import u.b;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        int i3 = 0;
        String str = null;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i4 = b.i(k3);
            if (i4 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i4 != 2) {
                b.p(parcel, k3);
            } else {
                str = b.d(parcel, k3);
            }
        }
        b.h(parcel, q3);
        return new Scope(i3, str);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new Scope[i3];
    }
}
