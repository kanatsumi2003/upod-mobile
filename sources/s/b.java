package s;

import r.a;
import r.a.d;
import t.n;

public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f2820a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f2821b;

    /* renamed from: c  reason: collision with root package name */
    private final O f2822c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2823d;

    private b(a<O> aVar, O o3, String str) {
        this.f2821b = aVar;
        this.f2822c = o3;
        this.f2823d = str;
        this.f2820a = n.b(aVar, o3, str);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o3, String str) {
        return new b<>(aVar, o3, str);
    }

    public final String b() {
        return this.f2821b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f2821b, bVar.f2821b) && n.a(this.f2822c, bVar.f2822c) && n.a(this.f2823d, bVar.f2823d);
    }

    public final int hashCode() {
        return this.f2820a;
    }
}
