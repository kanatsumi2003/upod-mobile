package e0;

import android.os.Parcel;
import android.os.Parcelable;
import t.k0;
import u.a;
import u.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: d  reason: collision with root package name */
    final int f1135d;

    /* renamed from: e  reason: collision with root package name */
    private final q.a f1136e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f1137f;

    l(int i3, q.a aVar, k0 k0Var) {
        this.f1135d = i3;
        this.f1136e = aVar;
        this.f1137f = k0Var;
    }

    public final q.a b() {
        return this.f1136e;
    }

    public final k0 c() {
        return this.f1137f;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f1135d);
        c.i(parcel, 2, this.f1136e, i3, false);
        c.i(parcel, 3, this.f1137f, i3, false);
        c.b(parcel, a4);
    }
}
