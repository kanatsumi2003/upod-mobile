package q;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.window.R;
import t.n;
import u.c;

public final class a extends u.a {
    public static final Parcelable.Creator<a> CREATOR = new n();

    /* renamed from: h  reason: collision with root package name */
    public static final a f2617h = new a(0);

    /* renamed from: d  reason: collision with root package name */
    final int f2618d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2619e;

    /* renamed from: f  reason: collision with root package name */
    private final PendingIntent f2620f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2621g;

    public a(int i3) {
        this(i3, (PendingIntent) null, (String) null);
    }

    a(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f2618d = i3;
        this.f2619e = i4;
        this.f2620f = pendingIntent;
        this.f2621g = str;
    }

    public a(int i3, PendingIntent pendingIntent) {
        this(i3, pendingIntent, (String) null);
    }

    public a(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str);
    }

    static String g(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case R.styleable.SplitPairRule_splitMinWidth:
                return "INVALID_ACCOUNT";
            case R.styleable.SplitPairRule_splitRatio:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i3 + ")";
                }
        }
    }

    public int b() {
        return this.f2619e;
    }

    public String c() {
        return this.f2621g;
    }

    public PendingIntent d() {
        return this.f2620f;
    }

    public boolean e() {
        return (this.f2619e == 0 || this.f2620f == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2619e == aVar.f2619e && n.a(this.f2620f, aVar.f2620f) && n.a(this.f2621g, aVar.f2621g);
    }

    public boolean f() {
        return this.f2619e == 0;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f2619e), this.f2620f, this.f2621g);
    }

    public String toString() {
        n.a c4 = n.c(this);
        c4.a("statusCode", g(this.f2619e));
        c4.a("resolution", this.f2620f);
        c4.a("message", this.f2621g);
        return c4.toString();
    }

    public void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f2618d);
        c.f(parcel, 2, b());
        c.i(parcel, 3, d(), i3, false);
        c.j(parcel, 4, c(), false);
        c.b(parcel, a4);
    }
}
