package kotlin.jvm.internal;

public final class k implements b {

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f2098d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2099e;

    public k(Class<?> cls, String str) {
        i.e(cls, "jClass");
        i.e(str, "moduleName");
        this.f2098d = cls;
        this.f2099e = str;
    }

    public Class<?> b() {
        return this.f2098d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(b(), ((k) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
