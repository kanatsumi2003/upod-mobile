package k2;

import java.io.Serializable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

public final class m<T> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2075d = new a((e) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: d  reason: collision with root package name */
        public final Throwable f2076d;

        public b(Throwable th) {
            i.e(th, "exception");
            this.f2076d = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && i.a(this.f2076d, ((b) obj).f2076d);
        }

        public int hashCode() {
            return this.f2076d.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f2076d + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f2076d;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
