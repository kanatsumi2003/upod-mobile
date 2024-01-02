package c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    d<K, V>.b f611a;

    /* renamed from: b  reason: collision with root package name */
    d<K, V>.c f612b;

    /* renamed from: c  reason: collision with root package name */
    d<K, V>.e f613c;

    final class a<T> implements Iterator<T> {

        /* renamed from: d  reason: collision with root package name */
        final int f614d;

        /* renamed from: e  reason: collision with root package name */
        int f615e;

        /* renamed from: f  reason: collision with root package name */
        int f616f;

        /* renamed from: g  reason: collision with root package name */
        boolean f617g = false;

        a(int i3) {
            this.f614d = i3;
            this.f615e = d.this.d();
        }

        public boolean hasNext() {
            return this.f616f < this.f615e;
        }

        public T next() {
            if (hasNext()) {
                T b4 = d.this.b(this.f616f, this.f614d);
                this.f616f++;
                this.f617g = true;
                return b4;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f617g) {
                int i3 = this.f616f - 1;
                this.f616f = i3;
                this.f615e--;
                this.f617g = false;
                d.this.h(i3);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d4 = d.this.d();
            for (Map.Entry entry : collection) {
                d.this.g(entry.getKey(), entry.getValue());
            }
            return d4 != d.this.d();
        }

        public void clear() {
            d.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e4 = d.this.e(entry.getKey());
            if (e4 < 0) {
                return false;
            }
            return c.b(d.this.b(e4, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        public int hashCode() {
            int i3 = 0;
            for (int d4 = d.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = d.this.b(d4, 0);
                Object b5 = d.this.b(d4, 1);
                i3 += (b4 == null ? 0 : b4.hashCode()) ^ (b5 == null ? 0 : b5.hashCode());
            }
            return i3;
        }

        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0010d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return d.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k3) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            d.this.a();
        }

        public boolean contains(Object obj) {
            return d.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return d.j(d.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        public int hashCode() {
            int i3 = 0;
            for (int d4 = d.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = d.this.b(d4, 0);
                i3 += b4 == null ? 0 : b4.hashCode();
            }
            return i3;
        }

        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e4 = d.this.e(obj);
            if (e4 < 0) {
                return false;
            }
            d.this.h(e4);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return d.o(d.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return d.p(d.this.c(), collection);
        }

        public int size() {
            return d.this.d();
        }

        public Object[] toArray() {
            return d.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return d.this.r(tArr, 0);
        }
    }

    /* renamed from: c.d$d  reason: collision with other inner class name */
    final class C0010d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: d  reason: collision with root package name */
        int f621d;

        /* renamed from: e  reason: collision with root package name */
        int f622e;

        /* renamed from: f  reason: collision with root package name */
        boolean f623f = false;

        C0010d() {
            this.f621d = d.this.d() - 1;
            this.f622e = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f622e++;
                this.f623f = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f623f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.b(entry.getKey(), d.this.b(this.f622e, 0)) && c.b(entry.getValue(), d.this.b(this.f622e, 1));
            }
        }

        public K getKey() {
            if (this.f623f) {
                return d.this.b(this.f622e, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f623f) {
                return d.this.b(this.f622e, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f622e < this.f621d;
        }

        public int hashCode() {
            if (this.f623f) {
                int i3 = 0;
                Object b4 = d.this.b(this.f622e, 0);
                Object b5 = d.this.b(this.f622e, 1);
                int hashCode = b4 == null ? 0 : b4.hashCode();
                if (b5 != null) {
                    i3 = b5.hashCode();
                }
                return hashCode ^ i3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f623f) {
                d.this.h(this.f622e);
                this.f622e--;
                this.f621d--;
                this.f623f = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v3) {
            if (this.f623f) {
                return d.this.i(this.f622e, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            d.this.a();
        }

        public boolean contains(Object obj) {
            return d.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f4 = d.this.f(obj);
            if (f4 < 0) {
                return false;
            }
            d.this.h(f4);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d4 = d.this.d();
            int i3 = 0;
            boolean z3 = false;
            while (i3 < d4) {
                if (collection.contains(d.this.b(i3, 1))) {
                    d.this.h(i3);
                    i3--;
                    d4--;
                    z3 = true;
                }
                i3++;
            }
            return z3;
        }

        public boolean retainAll(Collection<?> collection) {
            int d4 = d.this.d();
            int i3 = 0;
            boolean z3 = false;
            while (i3 < d4) {
                if (!collection.contains(d.this.b(i3, 1))) {
                    d.this.h(i3);
                    i3--;
                    d4--;
                    z3 = true;
                }
                i3++;
            }
            return z3;
        }

        public int size() {
            return d.this.d();
        }

        public Object[] toArray() {
            return d.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return d.this.r(tArr, 1);
        }
    }

    d() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i3, int i4);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k3, V v3);

    /* access modifiers changed from: protected */
    public abstract void h(int i3);

    /* access modifiers changed from: protected */
    public abstract V i(int i3, V v3);

    public Set<Map.Entry<K, V>> l() {
        if (this.f611a == null) {
            this.f611a = new b();
        }
        return this.f611a;
    }

    public Set<K> m() {
        if (this.f612b == null) {
            this.f612b = new c();
        }
        return this.f612b;
    }

    public Collection<V> n() {
        if (this.f613c == null) {
            this.f613c = new e();
        }
        return this.f613c;
    }

    public Object[] q(int i3) {
        int d4 = d();
        Object[] objArr = new Object[d4];
        for (int i4 = 0; i4 < d4; i4++) {
            objArr[i4] = b(i4, i3);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i3) {
        int d4 = d();
        if (tArr.length < d4) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d4);
        }
        for (int i4 = 0; i4 < d4; i4++) {
            tArr[i4] = b(i4, i3);
        }
        if (tArr.length > d4) {
            tArr[d4] = null;
        }
        return tArr;
    }
}
