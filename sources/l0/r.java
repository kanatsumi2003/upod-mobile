package l0;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f2280a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2281b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2282c;

    private r(Class<?> cls, int i3, int i4) {
        this.f2280a = (Class) d0.c(cls, "Null dependency anInterface.");
        this.f2281b = i3;
        this.f2282c = i4;
    }

    private static String a(int i3) {
        if (i3 == 0) {
            return "direct";
        }
        if (i3 == 1) {
            return "provider";
        }
        if (i3 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i3);
    }

    public static r g(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r h(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public Class<?> b() {
        return this.f2280a;
    }

    public boolean c() {
        return this.f2282c == 2;
    }

    public boolean d() {
        return this.f2282c == 0;
    }

    public boolean e() {
        return this.f2281b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2280a == rVar.f2280a && this.f2281b == rVar.f2281b && this.f2282c == rVar.f2282c;
    }

    public boolean f() {
        return this.f2281b == 2;
    }

    public int hashCode() {
        return ((((this.f2280a.hashCode() ^ 1000003) * 1000003) ^ this.f2281b) * 1000003) ^ this.f2282c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2280a);
        sb.append(", type=");
        int i3 = this.f2281b;
        sb.append(i3 == 1 ? "required" : i3 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f2282c));
        sb.append("}");
        return sb.toString();
    }
}
