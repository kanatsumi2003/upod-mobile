package j;

public final class d {
    public static <T> T a(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T b(T t3, Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
