package c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends e<K, V> implements Map<K, V> {

    /* renamed from: k  reason: collision with root package name */
    d<K, V> f595k;

    /* renamed from: c.a$a  reason: collision with other inner class name */
    class C0009a extends d<K, V> {
        C0009a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i3, int i4) {
            return a.this.f631e[(i3 << 1) + i4];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f632f;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k3, V v3) {
            a.this.put(k3, v3);
        }

        /* access modifiers changed from: protected */
        public void h(int i3) {
            a.this.j(i3);
        }

        /* access modifiers changed from: protected */
        public V i(int i3, V v3) {
            return a.this.k(i3, v3);
        }
    }

    public a() {
    }

    public a(int i3) {
        super(i3);
    }

    private d<K, V> m() {
        if (this.f595k == null) {
            this.f595k = new C0009a();
        }
        return this.f595k;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return d.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f632f + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m().n();
    }
}
