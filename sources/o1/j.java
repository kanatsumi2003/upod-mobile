package o1;

import java.util.Map;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f2578a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2579b;

    public j(String str, Object obj) {
        this.f2578a = str;
        this.f2579b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f2579b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return this.f2579b;
    }
}
