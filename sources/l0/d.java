package l0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2228a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<? super T>> f2229b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f2230c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2231d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2232e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f2233f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f2234g;

    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f2235a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Class<? super T>> f2236b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f2237c;

        /* renamed from: d  reason: collision with root package name */
        private int f2238d;

        /* renamed from: e  reason: collision with root package name */
        private int f2239e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f2240f;

        /* renamed from: g  reason: collision with root package name */
        private Set<Class<?>> f2241g;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f2235a = null;
            HashSet hashSet = new HashSet();
            this.f2236b = hashSet;
            this.f2237c = new HashSet();
            this.f2238d = 0;
            this.f2239e = 0;
            this.f2241g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c4 : clsArr) {
                d0.c(c4, "Null interface");
            }
            Collections.addAll(this.f2236b, clsArr);
        }

        /* access modifiers changed from: private */
        public b<T> e() {
            this.f2239e = 1;
            return this;
        }

        private void g(Class<?> cls) {
            d0.a(!this.f2236b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            g(rVar.b());
            this.f2237c.add(rVar);
            return this;
        }

        public d<T> c() {
            d0.d(this.f2240f != null, "Missing required property: factory.");
            return new d(this.f2235a, new HashSet(this.f2236b), new HashSet(this.f2237c), this.f2238d, this.f2239e, this.f2240f, this.f2241g);
        }

        public b<T> d(h<T> hVar) {
            this.f2240f = (h) d0.c(hVar, "Null factory");
            return this;
        }

        public b<T> f(String str) {
            this.f2235a = str;
            return this;
        }
    }

    private d(String str, Set<Class<? super T>> set, Set<r> set2, int i3, int i4, h<T> hVar, Set<Class<?>> set3) {
        this.f2228a = str;
        this.f2229b = Collections.unmodifiableSet(set);
        this.f2230c = Collections.unmodifiableSet(set2);
        this.f2231d = i3;
        this.f2232e = i4;
        this.f2233f = hVar;
        this.f2234g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> j(T t3, Class<T> cls) {
        return k(cls).d(new b(t3)).c();
    }

    public static <T> b<T> k(Class<T> cls) {
        return c(cls).e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object o(Object obj, e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object p(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> q(T t3, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).d(new c(t3)).c();
    }

    public Set<r> e() {
        return this.f2230c;
    }

    public h<T> f() {
        return this.f2233f;
    }

    public String g() {
        return this.f2228a;
    }

    public Set<Class<? super T>> h() {
        return this.f2229b;
    }

    public Set<Class<?>> i() {
        return this.f2234g;
    }

    public boolean l() {
        return this.f2231d == 1;
    }

    public boolean m() {
        return this.f2231d == 2;
    }

    public boolean n() {
        return this.f2232e == 0;
    }

    public d<T> r(h<T> hVar) {
        return new d(this.f2228a, this.f2229b, this.f2230c, this.f2231d, this.f2232e, hVar, this.f2234g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f2229b.toArray()) + ">{" + this.f2231d + ", type=" + this.f2232e + ", deps=" + Arrays.toString(this.f2230c.toArray()) + "}";
    }
}
