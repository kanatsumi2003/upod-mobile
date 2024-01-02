package t;

import android.os.Bundle;
import r.a;

public class v implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final v f3039b = c().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f3040a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f3041a;

        /* synthetic */ a(x xVar) {
        }

        public v a() {
            return new v(this.f3041a, (y) null);
        }
    }

    /* synthetic */ v(String str, y yVar) {
        this.f3040a = str;
    }

    public static a c() {
        return new a((x) null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f3040a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return n.a(this.f3040a, ((v) obj).f3040a);
    }

    public final int hashCode() {
        return n.b(this.f3040a);
    }
}
