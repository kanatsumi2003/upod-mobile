package p2;

import kotlin.jvm.internal.i;

public class a extends o2.a {

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    private static final class C0045a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0045a f2615a = new C0045a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f2616b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        static {
            /*
                p2.a$a r0 = new p2.a$a
                r0.<init>()
                f2615a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x0020
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0021
            L_0x001f:
            L_0x0020:
                r1 = r0
            L_0x0021:
                if (r1 == 0) goto L_0x002f
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                if (r2 == 0) goto L_0x002f
                r0 = r1
            L_0x002f:
                f2616b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.a.C0045a.<clinit>():void");
        }

        private C0045a() {
        }
    }

    private final boolean c(int i3) {
        Integer num = C0045a.f2616b;
        return num == null || num.intValue() >= i3;
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
