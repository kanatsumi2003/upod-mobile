package o1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class f implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2576a = new f();

    private f() {
    }

    public ByteBuffer a(Object obj) {
        s sVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a4 = h.a(obj);
        if (a4 instanceof String) {
            sVar = s.f2596b;
            obj2 = JSONObject.quote((String) a4);
        } else {
            sVar = s.f2596b;
            obj2 = a4.toString();
        }
        return sVar.a(obj2);
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(s.f2596b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }
}
