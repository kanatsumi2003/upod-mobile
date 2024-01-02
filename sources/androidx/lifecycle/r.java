package androidx.lifecycle;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final a f502a;

    /* renamed from: b  reason: collision with root package name */
    private final s f503b;

    public interface a {
        <T extends q> T a(Class<T> cls);
    }

    static abstract class b implements a {
        b() {
        }

        public <T extends q> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends q> T b(String str, Class<T> cls);
    }

    public r(s sVar, a aVar) {
        this.f502a = aVar;
        this.f503b = sVar;
    }

    public <T extends q> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q> T b(String str, Class<T> cls) {
        T b4 = this.f503b.b(str);
        if (cls.isInstance(b4)) {
            return b4;
        }
        a aVar = this.f502a;
        T b5 = aVar instanceof b ? ((b) aVar).b(str, cls) : aVar.a(cls);
        this.f503b.c(str, b5);
        return b5;
    }
}
