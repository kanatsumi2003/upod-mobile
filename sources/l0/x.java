package l0;

import q0.b;

public class x<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2289c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f2290a = f2289c;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f2291b;

    public x(b<T> bVar) {
        this.f2291b = bVar;
    }

    public T get() {
        T t3 = this.f2290a;
        T t4 = f2289c;
        if (t3 == t4) {
            synchronized (this) {
                t3 = this.f2290a;
                if (t3 == t4) {
                    t3 = this.f2291b.get();
                    this.f2290a = t3;
                    this.f2291b = null;
                }
            }
        }
        return t3;
    }
}
