package l0;

import q0.a;
import q0.b;

class c0<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a<Object> f2224c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private static final b<Object> f2225d = new b0();

    /* renamed from: a  reason: collision with root package name */
    private a<T> f2226a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f2227b;

    private c0(a<T> aVar, b<T> bVar) {
        this.f2226a = aVar;
        this.f2227b = bVar;
    }

    static <T> c0<T> c() {
        return new c0<>(f2224c, f2225d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(b<T> bVar) {
        a<T> aVar;
        if (this.f2227b == f2225d) {
            synchronized (this) {
                aVar = this.f2226a;
                this.f2226a = null;
                this.f2227b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public T get() {
        return this.f2227b.get();
    }
}
