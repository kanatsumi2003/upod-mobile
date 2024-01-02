package o0;

import l0.d0;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f2552a;

    /* renamed from: b  reason: collision with root package name */
    private final T f2553b;

    public a(Class<T> cls, T t3) {
        this.f2552a = (Class) d0.b(cls);
        this.f2553b = d0.b(t3);
    }

    public Class<T> a() {
        return this.f2552a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f2552a, this.f2553b});
    }
}
