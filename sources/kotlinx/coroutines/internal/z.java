package kotlinx.coroutines.internal;

final /* synthetic */ class z {

    /* renamed from: a  reason: collision with root package name */
    private static final int f2164a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f2164a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
