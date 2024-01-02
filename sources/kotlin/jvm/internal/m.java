package kotlin.jvm.internal;

import x2.c;
import x2.d;
import x2.e;

public class m {
    public e a(g gVar) {
        return gVar;
    }

    public c b(Class cls) {
        return new c(cls);
    }

    public d c(Class cls, String str) {
        return new k(cls, str);
    }

    public String d(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(j jVar) {
        return d(jVar);
    }
}
