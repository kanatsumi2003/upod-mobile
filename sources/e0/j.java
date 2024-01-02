package e0;

import android.os.Parcel;
import android.os.Parcelable;
import t.i0;
import u.a;
import u.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: d  reason: collision with root package name */
    final int f1133d;

    /* renamed from: e  reason: collision with root package name */
    final i0 f1134e;

    j(int i3, i0 i0Var) {
        this.f1133d = i3;
        this.f1134e = i0Var;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f1133d);
        c.i(parcel, 2, this.f1134e, i3, false);
        c.b(parcel, a4);
    }
}
