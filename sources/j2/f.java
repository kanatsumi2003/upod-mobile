package j2;

import m.a;

public final class f {
    public static void a(String str) {
        if (str.length() >= 124) {
            str = str.substring(0, 124) + "...";
        }
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
