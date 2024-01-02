package k2;

import java.io.Serializable;
import kotlin.jvm.internal.i;

public final class l<A, B> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private final A f2073d;

    /* renamed from: e  reason: collision with root package name */
    private final B f2074e;

    public l(A a4, B b4) {
        this.f2073d = a4;
        this.f2074e = b4;
    }

    public final A a() {
        return this.f2073d;
    }

    public final B b() {
        return this.f2074e;
    }

    public final A c() {
        return this.f2073d;
    }

    public final B d() {
        return this.f2074e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i.a(this.f2073d, lVar.f2073d) && i.a(this.f2074e, lVar.f2074e);
    }

    public int hashCode() {
        A a4 = this.f2073d;
        int i3 = 0;
        int hashCode = (a4 == null ? 0 : a4.hashCode()) * 31;
        B b4 = this.f2074e;
        if (b4 != null) {
            i3 = b4.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        return '(' + this.f2073d + ", " + this.f2074e + ')';
    }
}
