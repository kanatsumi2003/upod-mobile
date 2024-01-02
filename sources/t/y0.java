package t;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q.c;
import u.a;

public final class y0 extends a {
    public static final Parcelable.Creator<y0> CREATOR = new z0();

    /* renamed from: d  reason: collision with root package name */
    Bundle f3047d;

    /* renamed from: e  reason: collision with root package name */
    c[] f3048e;

    /* renamed from: f  reason: collision with root package name */
    int f3049f;

    /* renamed from: g  reason: collision with root package name */
    e f3050g;

    public y0() {
    }

    y0(Bundle bundle, c[] cVarArr, int i3, e eVar) {
        this.f3047d = bundle;
        this.f3048e = cVarArr;
        this.f3049f = i3;
        this.f3050g = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = u.c.a(parcel);
        u.c.d(parcel, 1, this.f3047d, false);
        u.c.l(parcel, 2, this.f3048e, i3, false);
        u.c.f(parcel, 3, this.f3049f);
        u.c.i(parcel, 4, this.f3050g, i3, false);
        u.c.b(parcel, a4);
    }
}
