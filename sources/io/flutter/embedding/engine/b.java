package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f1603b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f1604a = new HashMap();

    b() {
    }

    public static b b() {
        if (f1603b == null) {
            f1603b = new b();
        }
        return f1603b;
    }

    public a a(String str) {
        return this.f1604a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f1604a.put(str, aVar);
        } else {
            this.f1604a.remove(str);
        }
    }

    public void d(String str) {
        c(str, (a) null);
    }
}
