package e0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import r.j;
import u.a;
import u.c;

public final class h extends a implements j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f1131d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1132e;

    public h(List<String> list, String str) {
        this.f1131d = list;
        this.f1132e = str;
    }

    public final Status a() {
        return this.f1132e != null ? Status.f751j : Status.f755n;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.k(parcel, 1, this.f1131d, false);
        c.j(parcel, 2, this.f1132e, false);
        c.b(parcel, a4);
    }
}
