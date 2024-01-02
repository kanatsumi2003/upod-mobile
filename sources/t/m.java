package t;

import android.os.Parcel;
import android.os.Parcelable;
import u.a;
import u.c;

public class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new h0();

    /* renamed from: d  reason: collision with root package name */
    private final int f3002d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3003e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3004f;

    /* renamed from: g  reason: collision with root package name */
    private final long f3005g;

    /* renamed from: h  reason: collision with root package name */
    private final long f3006h;

    /* renamed from: i  reason: collision with root package name */
    private final String f3007i;

    /* renamed from: j  reason: collision with root package name */
    private final String f3008j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3009k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3010l;

    public m(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f3002d = i3;
        this.f3003e = i4;
        this.f3004f = i5;
        this.f3005g = j3;
        this.f3006h = j4;
        this.f3007i = str;
        this.f3008j = str2;
        this.f3009k = i6;
        this.f3010l = i7;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f3002d);
        c.f(parcel, 2, this.f3003e);
        c.f(parcel, 3, this.f3004f);
        c.h(parcel, 4, this.f3005g);
        c.h(parcel, 5, this.f3006h);
        c.j(parcel, 6, this.f3007i, false);
        c.j(parcel, 7, this.f3008j, false);
        c.f(parcel, 8, this.f3009k);
        c.f(parcel, 9, this.f3010l);
        c.b(parcel, a4);
    }
}
