package q;

import android.os.Parcel;
import android.os.Parcelable;
import t.n;
import u.a;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: d  reason: collision with root package name */
    private final String f2625d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private final int f2626e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2627f;

    public c(String str, int i3, long j3) {
        this.f2625d = str;
        this.f2626e = i3;
        this.f2627f = j3;
    }

    public c(String str, long j3) {
        this.f2625d = str;
        this.f2627f = j3;
        this.f2626e = -1;
    }

    public String b() {
        return this.f2625d;
    }

    public long c() {
        long j3 = this.f2627f;
        return j3 == -1 ? (long) this.f2626e : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return ((b() != null && b().equals(cVar.b())) || (b() == null && cVar.b() == null)) && c() == cVar.c();
        }
    }

    public final int hashCode() {
        return n.b(b(), Long.valueOf(c()));
    }

    public final String toString() {
        n.a c4 = n.c(this);
        c4.a("name", b());
        c4.a("version", Long.valueOf(c()));
        return c4.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = u.c.a(parcel);
        u.c.j(parcel, 1, b(), false);
        u.c.f(parcel, 2, this.f2626e);
        u.c.h(parcel, 3, c());
        u.c.b(parcel, a4);
    }
}
