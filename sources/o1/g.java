package o1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final g f2577a = new g();

    private g() {
    }

    public ByteBuffer a(Object obj) {
        return f.f2576a.a(new JSONArray().put(h.a(obj)));
    }

    public ByteBuffer b(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f2578a);
            jSONObject.put("args", h.a(jVar.f2579b));
            return f.f2576a.a(jSONObject);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public ByteBuffer c(String str, String str2, Object obj, String str3) {
        return f.f2576a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    public ByteBuffer d(String str, String str2, Object obj) {
        return f.f2576a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    public j e(ByteBuffer byteBuffer) {
        try {
            Object b4 = f.f2576a.b(byteBuffer);
            if (b4 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b4;
                Object obj = jSONObject.get("method");
                Object g3 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, g3);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b4);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public Object f(ByteBuffer byteBuffer) {
        try {
            Object b4 = f.f2576a.b(byteBuffer);
            if (b4 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b4;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g3 = g(jSONArray.opt(1));
                    Object g4 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g3 == null || (g3 instanceof String))) {
                        throw new e((String) obj, (String) g3, g4);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b4);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    /* access modifiers changed from: package-private */
    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
