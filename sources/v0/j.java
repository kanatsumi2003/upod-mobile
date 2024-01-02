package v0;

import android.net.Uri;
import android.text.TextUtils;
import g0.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u0.h;

public class j extends f {

    /* renamed from: n  reason: collision with root package name */
    private final JSONObject f3141n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3142o;

    public j(h hVar, d dVar, JSONObject jSONObject, String str) {
        super(hVar, dVar);
        this.f3141n = jSONObject;
        this.f3142o = str;
        if (TextUtils.isEmpty(str)) {
            this.f3123a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "start");
        super.H("X-Goog-Upload-Header-Content-Type", str);
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    public JSONObject h() {
        return this.f3141n;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> m() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", k());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    public Uri v() {
        String authority = t().a().getAuthority();
        Uri.Builder buildUpon = t().b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
