package t;

import android.os.Parcel;
import android.os.Parcelable;
import u.a;
import u.c;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new a1();

    /* renamed from: d  reason: collision with root package name */
    private final q f2941d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2942e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2943f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f2944g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2945h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f2946i;

    public e(q qVar, boolean z3, boolean z4, int[] iArr, int i3, int[] iArr2) {
        this.f2941d = qVar;
        this.f2942e = z3;
        this.f2943f = z4;
        this.f2944g = iArr;
        this.f2945h = i3;
        this.f2946i = iArr2;
    }

    public int b() {
        return this.f2945h;
    }

    public int[] c() {
        return this.f2944g;
    }

    public int[] d() {
        return this.f2946i;
    }

    public boolean e() {
        return this.f2942e;
    }

    public boolean f() {
        return this.f2943f;
    }

    public final q g() {
        return this.f2941d;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, this.f2941d, i3, false);
        c.c(parcel, 2, e());
        c.c(parcel, 3, f());
        c.g(parcel, 4, c(), false);
        c.f(parcel, 5, b());
        c.g(parcel, 6, d(), false);
        c.b(parcel, a4);
    }
}
