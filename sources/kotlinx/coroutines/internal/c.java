package kotlinx.coroutines.internal;

import a3.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class c<T> extends t {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2116a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.f2107a;

    public c<?> a() {
        return this;
    }

    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == b.f2107a) {
            obj2 = e(g(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t3, Object obj);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = b.f2107a;
        return obj2 != obj3 ? obj2 : l.a(f2116a, this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0;
    }

    public abstract Object g(T t3);
}
