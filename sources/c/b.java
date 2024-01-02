package c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f597h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    private static final Object[] f598i = new Object[0];

    /* renamed from: j  reason: collision with root package name */
    private static Object[] f599j;

    /* renamed from: k  reason: collision with root package name */
    private static int f600k;

    /* renamed from: l  reason: collision with root package name */
    private static Object[] f601l;

    /* renamed from: m  reason: collision with root package name */
    private static int f602m;

    /* renamed from: d  reason: collision with root package name */
    private int[] f603d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f604e;

    /* renamed from: f  reason: collision with root package name */
    int f605f;

    /* renamed from: g  reason: collision with root package name */
    private d<E, E> f606g;

    class a extends d<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i3, int i4) {
            return b.this.f604e[i3];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f605f;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e4, E e5) {
            b.this.add(e4);
        }

        /* access modifiers changed from: protected */
        public void h(int i3) {
            b.this.g(i3);
        }

        /* access modifiers changed from: protected */
        public E i(int i3, E e4) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i3) {
        if (i3 == 0) {
            this.f603d = f597h;
            this.f604e = f598i;
        } else {
            a(i3);
        }
        this.f605f = 0;
    }

    private void a(int i3) {
        if (i3 == 8) {
            synchronized (b.class) {
                Object[] objArr = f601l;
                if (objArr != null) {
                    this.f604e = objArr;
                    f601l = (Object[]) objArr[0];
                    this.f603d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f602m--;
                    return;
                }
            }
        } else if (i3 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f599j;
                if (objArr2 != null) {
                    this.f604e = objArr2;
                    f599j = (Object[]) objArr2[0];
                    this.f603d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f600k--;
                    return;
                }
            }
        }
        this.f603d = new int[i3];
        this.f604e = new Object[i3];
    }

    private static void c(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f602m < 10) {
                    objArr[0] = f601l;
                    objArr[1] = iArr;
                    for (int i4 = i3 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f601l = objArr;
                    f602m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f600k < 10) {
                    objArr[0] = f599j;
                    objArr[1] = iArr;
                    for (int i5 = i3 - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f599j = objArr;
                    f600k++;
                }
            }
        }
    }

    private d<E, E> d() {
        if (this.f606g == null) {
            this.f606g = new a();
        }
        return this.f606g;
    }

    private int e(Object obj, int i3) {
        int i4 = this.f605f;
        if (i4 == 0) {
            return -1;
        }
        int a4 = c.a(this.f603d, i4, i3);
        if (a4 < 0 || obj.equals(this.f604e[a4])) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f603d[i5] == i3) {
            if (obj.equals(this.f604e[i5])) {
                return i5;
            }
            i5++;
        }
        int i6 = a4 - 1;
        while (i6 >= 0 && this.f603d[i6] == i3) {
            if (obj.equals(this.f604e[i6])) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    private int f() {
        int i3 = this.f605f;
        if (i3 == 0) {
            return -1;
        }
        int a4 = c.a(this.f603d, i3, 0);
        if (a4 < 0 || this.f604e[a4] == null) {
            return a4;
        }
        int i4 = a4 + 1;
        while (i4 < i3 && this.f603d[i4] == 0) {
            if (this.f604e[i4] == null) {
                return i4;
            }
            i4++;
        }
        int i5 = a4 - 1;
        while (i5 >= 0 && this.f603d[i5] == 0) {
            if (this.f604e[i5] == null) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public boolean add(E e4) {
        int i3;
        int i4;
        if (e4 == null) {
            i4 = f();
            i3 = 0;
        } else {
            int hashCode = e4.hashCode();
            i3 = hashCode;
            i4 = e(e4, hashCode);
        }
        if (i4 >= 0) {
            return false;
        }
        int i5 = ~i4;
        int i6 = this.f605f;
        int[] iArr = this.f603d;
        if (i6 >= iArr.length) {
            int i7 = 4;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 >= 4) {
                i7 = 8;
            }
            Object[] objArr = this.f604e;
            a(i7);
            int[] iArr2 = this.f603d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f604e, 0, objArr.length);
            }
            c(iArr, objArr, this.f605f);
        }
        int i8 = this.f605f;
        if (i5 < i8) {
            int[] iArr3 = this.f603d;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f604e;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f605f - i5);
        }
        this.f603d[i5] = i3;
        this.f604e[i5] = e4;
        this.f605f++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        b(this.f605f + collection.size());
        boolean z3 = false;
        for (Object add : collection) {
            z3 |= add(add);
        }
        return z3;
    }

    public void b(int i3) {
        int[] iArr = this.f603d;
        if (iArr.length < i3) {
            Object[] objArr = this.f604e;
            a(i3);
            int i4 = this.f605f;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f603d, 0, i4);
                System.arraycopy(objArr, 0, this.f604e, 0, this.f605f);
            }
            c(iArr, objArr, this.f605f);
        }
    }

    public void clear() {
        int i3 = this.f605f;
        if (i3 != 0) {
            c(this.f603d, this.f604e, i3);
            this.f603d = f597h;
            this.f604e = f598i;
            this.f605f = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f605f) {
                try {
                    if (!set.contains(h(i3))) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i3) {
        E[] eArr = this.f604e;
        E e4 = eArr[i3];
        int i4 = this.f605f;
        if (i4 <= 1) {
            c(this.f603d, eArr, i4);
            this.f603d = f597h;
            this.f604e = f598i;
            this.f605f = 0;
        } else {
            int[] iArr = this.f603d;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                int i6 = i4 - 1;
                this.f605f = i6;
                if (i3 < i6) {
                    int i7 = i3 + 1;
                    System.arraycopy(iArr, i7, iArr, i3, i6 - i3);
                    Object[] objArr = this.f604e;
                    System.arraycopy(objArr, i7, objArr, i3, this.f605f - i3);
                }
                this.f604e[this.f605f] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                a(i5);
                this.f605f--;
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f603d, 0, i3);
                    System.arraycopy(eArr, 0, this.f604e, 0, i3);
                }
                int i8 = this.f605f;
                if (i3 < i8) {
                    int i9 = i3 + 1;
                    System.arraycopy(iArr, i9, this.f603d, i3, i8 - i3);
                    System.arraycopy(eArr, i9, this.f604e, i3, this.f605f - i3);
                }
            }
        }
        return e4;
    }

    public E h(int i3) {
        return this.f604e[i3];
    }

    public int hashCode() {
        int[] iArr = this.f603d;
        int i3 = this.f605f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f605f <= 0;
    }

    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z3 = false;
        for (Object remove : collection) {
            z3 |= remove(remove);
        }
        return z3;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z3 = false;
        for (int i3 = this.f605f - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f604e[i3])) {
                g(i3);
                z3 = true;
            }
        }
        return z3;
    }

    public int size() {
        return this.f605f;
    }

    public Object[] toArray() {
        int i3 = this.f605f;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f604e, 0, objArr, 0, i3);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f605f) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f605f);
        }
        System.arraycopy(this.f604e, 0, tArr, 0, this.f605f);
        int length = tArr.length;
        int i3 = this.f605f;
        if (length > i3) {
            tArr[i3] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f605f * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f605f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object h3 = h(i3);
            if (h3 != this) {
                sb.append(h3);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
