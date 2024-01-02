package l0;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import q0.b;

class y<T> implements b<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<b<T>> f2292a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f2293b = null;

    y(Collection<b<T>> collection) {
        this.f2292a.addAll(collection);
    }

    static y<?> b(Collection<b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (b<T> bVar : this.f2292a) {
            this.f2293b.add(bVar.get());
        }
        this.f2292a = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(b<T> bVar) {
        Set set;
        T t3;
        if (this.f2293b == null) {
            set = this.f2292a;
            t3 = bVar;
        } else {
            set = this.f2293b;
            t3 = bVar.get();
        }
        set.add(t3);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f2293b == null) {
            synchronized (this) {
                if (this.f2293b == null) {
                    this.f2293b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f2293b);
    }
}
