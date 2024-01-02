package k2;

import java.io.Serializable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import t2.a;

final class o<T> implements g<T>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    private a<? extends T> f2077d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f2078e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f2079f;

    public o(a<? extends T> aVar, Object obj) {
        i.e(aVar, "initializer");
        this.f2077d = aVar;
        this.f2078e = q.f2080a;
        this.f2079f = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, Object obj, int i3, e eVar) {
        this(aVar, (i3 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f2078e != q.f2080a;
    }

    public T getValue() {
        T t3;
        T t4 = this.f2078e;
        T t5 = q.f2080a;
        if (t4 != t5) {
            return t4;
        }
        synchronized (this.f2079f) {
            t3 = this.f2078e;
            if (t3 == t5) {
                a aVar = this.f2077d;
                i.b(aVar);
                t3 = aVar.invoke();
                this.f2078e = t3;
                this.f2077d = null;
            }
        }
        return t3;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
