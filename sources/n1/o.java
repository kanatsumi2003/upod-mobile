package n1;

import b1.b;
import java.util.HashMap;
import o1.a;
import o1.f;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final a<Object> f2491a;

    public o(c1.a aVar) {
        this.f2491a = new a<>(aVar, "flutter/system", f.f2576a);
    }

    public void a() {
        b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f2491a.c(hashMap);
    }
}
