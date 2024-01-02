package kotlin.jvm.internal;

import x2.c;
import x2.d;
import x2.e;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final m f2100a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f2101b = new c[0];

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f2100a = mVar;
    }

    public static e a(g gVar) {
        return f2100a.a(gVar);
    }

    public static c b(Class cls) {
        return f2100a.b(cls);
    }

    public static d c(Class cls) {
        return f2100a.c(cls, "");
    }

    public static String d(f fVar) {
        return f2100a.d(fVar);
    }

    public static String e(j jVar) {
        return f2100a.e(jVar);
    }
}
