package e0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import r.j;
import u.a;
import u.c;

public final class b extends a implements j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: d  reason: collision with root package name */
    final int f1128d;

    /* renamed from: e  reason: collision with root package name */
    private int f1129e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f1130f;

    public b() {
        this(2, 0, (Intent) null);
    }

    b(int i3, int i4, Intent intent) {
        this.f1128d = i3;
        this.f1129e = i4;
        this.f1130f = intent;
    }

    public final Status a() {
        return this.f1129e == 0 ? Status.f751j : Status.f755n;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f1128d);
        c.f(parcel, 2, this.f1129e);
        c.i(parcel, 3, this.f1130f, i3, false);
        c.b(parcel, a4);
    }
}
