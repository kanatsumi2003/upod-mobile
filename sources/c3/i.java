package c3;

import kotlin.jvm.internal.e;

public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f726a = new b((e) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final c f727b = new c();

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f728a;

        public a(Throwable th) {
            this.f728a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f728a, ((a) obj).f728a);
        }

        public int hashCode() {
            Throwable th = this.f728a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f728a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(e eVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return i.b(new a(th));
        }

        public final <E> Object b() {
            return i.b(i.f727b);
        }

        public final <E> Object c(E e4) {
            return i.b(e4);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
