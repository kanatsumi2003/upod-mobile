package n1;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import o1.a;
import o1.c;
import o1.f;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final o1.a<Object> f2371a;

    public interface a {
        void a(boolean z3);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f2372a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f2373b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f2372a = keyEvent;
            this.f2373b = ch;
        }
    }

    public d(c cVar) {
        this.f2371a = new o1.a<>(cVar, "flutter/keyevent", f.f2576a);
    }

    private static a.e<Object> b(a aVar) {
        return new c(aVar);
    }

    private Map<String, Object> c(b bVar, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z3 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f2372a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f2372a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f2372a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f2372a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f2372a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f2372a.getMetaState()));
        Character ch = bVar.f2373b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f2372a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f2372a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f2372a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                b1.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        aVar.a(z3);
    }

    public void e(b bVar, boolean z3, a aVar) {
        this.f2371a.d(c(bVar, z3), b(aVar));
    }
}
