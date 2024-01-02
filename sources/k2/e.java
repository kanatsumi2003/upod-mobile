package k2;

import kotlin.jvm.internal.i;
import w2.c;

public final class e implements Comparable<e> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f2066h = new a((kotlin.jvm.internal.e) null);

    /* renamed from: i  reason: collision with root package name */
    public static final e f2067i = f.a();

    /* renamed from: d  reason: collision with root package name */
    private final int f2068d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2069e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2070f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2071g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public e(int i3, int i4, int i5) {
        this.f2068d = i3;
        this.f2069e = i4;
        this.f2070f = i5;
        this.f2071g = b(i3, i4, i5);
    }

    private final int b(int i3, int i4, int i5) {
        boolean z3 = false;
        if (new c(0, 255).f(i3) && new c(0, 255).f(i4) && new c(0, 255).f(i5)) {
            z3 = true;
        }
        if (z3) {
            return (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i4 + '.' + i5).toString());
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        i.e(eVar, "other");
        return this.f2071g - eVar.f2071g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f2071g == eVar.f2071g;
    }

    public int hashCode() {
        return this.f2071g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2068d);
        sb.append('.');
        sb.append(this.f2069e);
        sb.append('.');
        sb.append(this.f2070f);
        return sb.toString();
    }
}
