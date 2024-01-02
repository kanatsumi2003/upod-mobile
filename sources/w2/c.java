package w2;

import kotlin.jvm.internal.e;

public final class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f3160h = new a((e) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final c f3161i = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final c a() {
            return c.f3161i;
        }
    }

    public c(int i3, int i4) {
        super(i3, i4, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(a() == cVar.a() && b() == cVar.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(int i3) {
        return a() <= i3 && i3 <= b();
    }

    public Integer g() {
        return Integer.valueOf(b());
    }

    public Integer h() {
        return Integer.valueOf(a());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
