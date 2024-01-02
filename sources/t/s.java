package t;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import u.a;
import u.c;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new w();

    /* renamed from: d  reason: collision with root package name */
    private final int f3031d;

    /* renamed from: e  reason: collision with root package name */
    private List<m> f3032e;

    public s(int i3, List<m> list) {
        this.f3031d = i3;
        this.f3032e = list;
    }

    public final int b() {
        return this.f3031d;
    }

    public final List<m> c() {
        return this.f3032e;
    }

    public final void d(m mVar) {
        if (this.f3032e == null) {
            this.f3032e = new ArrayList();
        }
        this.f3032e.add(mVar);
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f3031d);
        c.m(parcel, 2, this.f3032e, false);
        c.b(parcel, a4);
    }
}
