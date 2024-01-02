package t;

import android.os.Parcel;
import android.os.Parcelable;
import u.a;
import u.c;

public class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new r0();

    /* renamed from: d  reason: collision with root package name */
    private final int f3024d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3025e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3026f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3027g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3028h;

    public q(int i3, boolean z3, boolean z4, int i4, int i5) {
        this.f3024d = i3;
        this.f3025e = z3;
        this.f3026f = z4;
        this.f3027g = i4;
        this.f3028h = i5;
    }

    public int b() {
        return this.f3027g;
    }

    public int c() {
        return this.f3028h;
    }

    public boolean d() {
        return this.f3025e;
    }

    public boolean e() {
        return this.f3026f;
    }

    public int f() {
        return this.f3024d;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, f());
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.f(parcel, 4, b());
        c.f(parcel, 5, c());
        c.b(parcel, a4);
    }
}
