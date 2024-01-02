package l0;

public final class d0 {
    public static void a(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T c(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z3, String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }
}
