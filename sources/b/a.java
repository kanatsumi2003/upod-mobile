package b;

import b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: h  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f546h = new HashMap<>();

    /* access modifiers changed from: protected */
    public b.c<K, V> b(K k3) {
        return this.f546h.get(k3);
    }

    public boolean contains(K k3) {
        return this.f546h.containsKey(k3);
    }

    public V f(K k3) {
        V f4 = super.f(k3);
        this.f546h.remove(k3);
        return f4;
    }

    public Map.Entry<K, V> g(K k3) {
        if (contains(k3)) {
            return this.f546h.get(k3).f554g;
        }
        return null;
    }

    public V h(K k3, V v3) {
        b.c b4 = b(k3);
        if (b4 != null) {
            return b4.f552e;
        }
        this.f546h.put(k3, e(k3, v3));
        return null;
    }
}
