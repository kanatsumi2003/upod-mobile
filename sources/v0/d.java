package v0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import u0.h;

public class d extends e {

    /* renamed from: n  reason: collision with root package name */
    private final Integer f3118n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3119o;

    public d(h hVar, g0.d dVar, Integer num, String str) {
        super(hVar, dVar);
        this.f3118n = num;
        this.f3119o = str;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public Map<String, String> m() {
        HashMap hashMap = new HashMap();
        String k3 = k();
        if (!k3.isEmpty()) {
            hashMap.put("prefix", k3 + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f3118n;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f3119o)) {
            hashMap.put("pageToken", this.f3119o);
        }
        return hashMap;
    }

    public Uri v() {
        String authority = t().a().getAuthority();
        return Uri.parse(t().b() + "/b/" + authority + "/o");
    }
}
