package v0;

import g0.d;
import org.json.JSONObject;
import u0.h;

public class k extends e {

    /* renamed from: n  reason: collision with root package name */
    private final JSONObject f3143n;

    public k(h hVar, d dVar, JSONObject jSONObject) {
        super(hVar, dVar);
        this.f3143n = jSONObject;
        H("X-HTTP-Method-Override", "PATCH");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "PUT";
    }

    /* access modifiers changed from: protected */
    public JSONObject h() {
        return this.f3143n;
    }
}
