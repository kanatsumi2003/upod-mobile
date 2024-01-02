package t;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t.i;
import u.a;
import u.c;

public final class k0 extends a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: d  reason: collision with root package name */
    final int f2993d;

    /* renamed from: e  reason: collision with root package name */
    final IBinder f2994e;

    /* renamed from: f  reason: collision with root package name */
    private final q.a f2995f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2996g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2997h;

    k0(int i3, IBinder iBinder, q.a aVar, boolean z3, boolean z4) {
        this.f2993d = i3;
        this.f2994e = iBinder;
        this.f2995f = aVar;
        this.f2996g = z3;
        this.f2997h = z4;
    }

    public final q.a b() {
        return this.f2995f;
    }

    public final i c() {
        IBinder iBinder = this.f2994e;
        if (iBinder == null) {
            return null;
        }
        return i.a.b(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f2995f.equals(k0Var.f2995f) && n.a(c(), k0Var.c());
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f2993d);
        c.e(parcel, 2, this.f2994e, false);
        c.i(parcel, 3, this.f2995f, i3, false);
        c.c(parcel, 4, this.f2996g);
        c.c(parcel, 5, this.f2997h);
        c.b(parcel, a4);
    }
}
