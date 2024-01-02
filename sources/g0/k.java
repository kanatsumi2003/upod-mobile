package g0;

import android.content.Context;
import android.text.TextUtils;
import t.n;
import t.o;
import t.r;
import x.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f1271a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1272b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1273c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1274d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1275e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1276f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1277g;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f1278a;

        /* renamed from: b  reason: collision with root package name */
        private String f1279b;

        /* renamed from: c  reason: collision with root package name */
        private String f1280c;

        /* renamed from: d  reason: collision with root package name */
        private String f1281d;

        /* renamed from: e  reason: collision with root package name */
        private String f1282e;

        /* renamed from: f  reason: collision with root package name */
        private String f1283f;

        /* renamed from: g  reason: collision with root package name */
        private String f1284g;

        public k a() {
            return new k(this.f1279b, this.f1278a, this.f1280c, this.f1281d, this.f1282e, this.f1283f, this.f1284g);
        }

        public b b(String str) {
            this.f1278a = o.e(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f1279b = o.e(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f1280c = str;
            return this;
        }

        public b e(String str) {
            this.f1281d = str;
            return this;
        }

        public b f(String str) {
            this.f1282e = str;
            return this;
        }

        public b g(String str) {
            this.f1284g = str;
            return this;
        }

        public b h(String str) {
            this.f1283f = str;
            return this;
        }
    }

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.k(!i.a(str), "ApplicationId must be set.");
        this.f1272b = str;
        this.f1271a = str2;
        this.f1273c = str3;
        this.f1274d = str4;
        this.f1275e = str5;
        this.f1276f = str6;
        this.f1277g = str7;
    }

    public static k a(Context context) {
        r rVar = new r(context);
        String a4 = rVar.a("google_app_id");
        if (TextUtils.isEmpty(a4)) {
            return null;
        }
        return new k(a4, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f1271a;
    }

    public String c() {
        return this.f1272b;
    }

    public String d() {
        return this.f1273c;
    }

    public String e() {
        return this.f1274d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n.a(this.f1272b, kVar.f1272b) && n.a(this.f1271a, kVar.f1271a) && n.a(this.f1273c, kVar.f1273c) && n.a(this.f1274d, kVar.f1274d) && n.a(this.f1275e, kVar.f1275e) && n.a(this.f1276f, kVar.f1276f) && n.a(this.f1277g, kVar.f1277g);
    }

    public String f() {
        return this.f1275e;
    }

    public String g() {
        return this.f1277g;
    }

    public String h() {
        return this.f1276f;
    }

    public int hashCode() {
        return n.b(this.f1272b, this.f1271a, this.f1273c, this.f1274d, this.f1275e, this.f1276f, this.f1277g);
    }

    public String toString() {
        return n.c(this).a("applicationId", this.f1272b).a("apiKey", this.f1271a).a("databaseUrl", this.f1273c).a("gcmSenderId", this.f1275e).a("storageBucket", this.f1276f).a("projectId", this.f1277g).toString();
    }
}
