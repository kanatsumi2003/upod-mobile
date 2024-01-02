package a1;

import java.util.HashMap;
import java.util.Map;
import y0.e;

public class h {
    public static Map<String, Object> a(f fVar) {
        e d4 = fVar.d();
        if (d4 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d4.c());
        hashMap.put("arguments", d4.b());
        return hashMap;
    }
}
