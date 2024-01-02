package b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    c<K, V> f547d;

    /* renamed from: e  reason: collision with root package name */
    private c<K, V> f548e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f549f = new WeakHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private int f550g = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f554g;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f553f;
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    private static class C0006b<K, V> extends e<K, V> {
        C0006b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f553f;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f554g;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: d  reason: collision with root package name */
        final K f551d;

        /* renamed from: e  reason: collision with root package name */
        final V f552e;

        /* renamed from: f  reason: collision with root package name */
        c<K, V> f553f;

        /* renamed from: g  reason: collision with root package name */
        c<K, V> f554g;

        c(K k3, V v3) {
            this.f551d = k3;
            this.f552e = v3;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f551d.equals(cVar.f551d) && this.f552e.equals(cVar.f552e);
        }

        public K getKey() {
            return this.f551d;
        }

        public V getValue() {
            return this.f552e;
        }

        public int hashCode() {
            return this.f551d.hashCode() ^ this.f552e.hashCode();
        }

        public V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f551d + "=" + this.f552e;
        }
    }

    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: d  reason: collision with root package name */
        private c<K, V> f555d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f556e = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f555d;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f554g;
                this.f555d = cVar3;
                this.f556e = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f556e) {
                this.f556e = false;
                cVar = b.this.f547d;
            } else {
                c<K, V> cVar2 = this.f555d;
                cVar = cVar2 != null ? cVar2.f553f : null;
            }
            this.f555d = cVar;
            return this.f555d;
        }

        public boolean hasNext() {
            if (this.f556e) {
                return b.this.f547d != null;
            }
            c<K, V> cVar = this.f555d;
            return (cVar == null || cVar.f553f == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f558d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f559e;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f558d = cVar2;
            this.f559e = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f559e;
            c<K, V> cVar2 = this.f558d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f558d == cVar && cVar == this.f559e) {
                this.f559e = null;
                this.f558d = null;
            }
            c<K, V> cVar2 = this.f558d;
            if (cVar2 == cVar) {
                this.f558d = b(cVar2);
            }
            if (this.f559e == cVar) {
                this.f559e = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f559e;
            this.f559e = e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f559e != null;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f547d;
    }

    /* access modifiers changed from: protected */
    public c<K, V> b(K k3) {
        c<K, V> cVar = this.f547d;
        while (cVar != null && !cVar.f551d.equals(k3)) {
            cVar = cVar.f553f;
        }
        return cVar;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f549f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f548e;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0006b bVar = new C0006b(this.f548e, this.f547d);
        this.f549f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> e(K k3, V v3) {
        c<K, V> cVar = new c<>(k3, v3);
        this.f550g++;
        c<K, V> cVar2 = this.f548e;
        if (cVar2 == null) {
            this.f547d = cVar;
        } else {
            cVar2.f553f = cVar;
            cVar.f554g = cVar2;
        }
        this.f548e = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public V f(K k3) {
        c b4 = b(k3);
        if (b4 == null) {
            return null;
        }
        this.f550g--;
        if (!this.f549f.isEmpty()) {
            for (f<K, V> a4 : this.f549f.keySet()) {
                a4.a(b4);
            }
        }
        c<K, V> cVar = b4.f554g;
        c<K, V> cVar2 = b4.f553f;
        if (cVar != null) {
            cVar.f553f = cVar2;
        } else {
            this.f547d = cVar2;
        }
        c<K, V> cVar3 = b4.f553f;
        if (cVar3 != null) {
            cVar3.f554g = cVar;
        } else {
            this.f548e = cVar;
        }
        b4.f553f = null;
        b4.f554g = null;
        return b4.f552e;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Map.Entry) it.next()).hashCode();
        }
        return i3;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f547d, this.f548e);
        this.f549f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f550g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
