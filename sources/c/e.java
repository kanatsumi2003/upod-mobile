package c;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class e<K, V> {

    /* renamed from: g  reason: collision with root package name */
    static Object[] f626g;

    /* renamed from: h  reason: collision with root package name */
    static int f627h;

    /* renamed from: i  reason: collision with root package name */
    static Object[] f628i;

    /* renamed from: j  reason: collision with root package name */
    static int f629j;

    /* renamed from: d  reason: collision with root package name */
    int[] f630d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f631e;

    /* renamed from: f  reason: collision with root package name */
    int f632f;

    public e() {
        this.f630d = c.f608a;
        this.f631e = c.f610c;
        this.f632f = 0;
    }

    public e(int i3) {
        if (i3 == 0) {
            this.f630d = c.f608a;
            this.f631e = c.f610c;
        } else {
            a(i3);
        }
        this.f632f = 0;
    }

    private void a(int i3) {
        Class<e> cls = e.class;
        if (i3 == 8) {
            synchronized (cls) {
                Object[] objArr = f628i;
                if (objArr != null) {
                    this.f631e = objArr;
                    f628i = (Object[]) objArr[0];
                    this.f630d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f629j--;
                    return;
                }
            }
        } else if (i3 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f626g;
                if (objArr2 != null) {
                    this.f631e = objArr2;
                    f626g = (Object[]) objArr2[0];
                    this.f630d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f627h--;
                    return;
                }
            }
        }
        this.f630d = new int[i3];
        this.f631e = new Object[(i3 << 1)];
    }

    private static int b(int[] iArr, int i3, int i4) {
        try {
            return c.a(iArr, i3, i4);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i3) {
        Class<e> cls = e.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f629j < 10) {
                    objArr[0] = f628i;
                    objArr[1] = iArr;
                    for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f628i = objArr;
                    f629j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f627h < 10) {
                    objArr[0] = f626g;
                    objArr[1] = iArr;
                    for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f626g = objArr;
                    f627h++;
                }
            }
        }
    }

    public void c(int i3) {
        int i4 = this.f632f;
        int[] iArr = this.f630d;
        if (iArr.length < i3) {
            Object[] objArr = this.f631e;
            a(i3);
            if (this.f632f > 0) {
                System.arraycopy(iArr, 0, this.f630d, 0, i4);
                System.arraycopy(objArr, 0, this.f631e, 0, i4 << 1);
            }
            d(iArr, objArr, i4);
        }
        if (this.f632f != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i3 = this.f632f;
        if (i3 > 0) {
            int[] iArr = this.f630d;
            Object[] objArr = this.f631e;
            this.f630d = c.f608a;
            this.f631e = c.f610c;
            this.f632f = 0;
            d(iArr, objArr, i3);
        }
        if (this.f632f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i3) {
        int i4 = this.f632f;
        if (i4 == 0) {
            return -1;
        }
        int b4 = b(this.f630d, i4, i3);
        if (b4 < 0 || obj.equals(this.f631e[b4 << 1])) {
            return b4;
        }
        int i5 = b4 + 1;
        while (i5 < i4 && this.f630d[i5] == i3) {
            if (obj.equals(this.f631e[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        int i6 = b4 - 1;
        while (i6 >= 0 && this.f630d[i6] == i3) {
            if (obj.equals(this.f631e[i6 << 1])) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f632f) {
                try {
                    Object i4 = i(i3);
                    Object l3 = l(i3);
                    Object obj2 = eVar.get(i4);
                    if (l3 == null) {
                        if (obj2 != null || !eVar.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l3.equals(obj2)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i5 = 0;
            while (i5 < this.f632f) {
                try {
                    Object i6 = i(i5);
                    Object l4 = l(i5);
                    Object obj3 = map.get(i6);
                    if (l4 == null) {
                        if (obj3 != null || !map.containsKey(i6)) {
                            return false;
                        }
                    } else if (!l4.equals(obj3)) {
                        return false;
                    }
                    i5++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i3 = this.f632f;
        if (i3 == 0) {
            return -1;
        }
        int b4 = b(this.f630d, i3, 0);
        if (b4 < 0 || this.f631e[b4 << 1] == null) {
            return b4;
        }
        int i4 = b4 + 1;
        while (i4 < i3 && this.f630d[i4] == 0) {
            if (this.f631e[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        int i5 = b4 - 1;
        while (i5 >= 0 && this.f630d[i5] == 0) {
            if (this.f631e[i5 << 1] == null) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v3) {
        int f4 = f(obj);
        return f4 >= 0 ? this.f631e[(f4 << 1) + 1] : v3;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i3 = this.f632f * 2;
        Object[] objArr = this.f631e;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f630d;
        Object[] objArr = this.f631e;
        int i3 = this.f632f;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public K i(int i3) {
        return this.f631e[i3 << 1];
    }

    public boolean isEmpty() {
        return this.f632f <= 0;
    }

    public V j(int i3) {
        V[] vArr = this.f631e;
        int i4 = i3 << 1;
        V v3 = vArr[i4 + 1];
        int i5 = this.f632f;
        int i6 = 0;
        if (i5 <= 1) {
            d(this.f630d, vArr, i5);
            this.f630d = c.f608a;
            this.f631e = c.f610c;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f630d;
            int i8 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i9 = i3 + 1;
                    int i10 = i7 - i3;
                    System.arraycopy(iArr, i9, iArr, i3, i10);
                    Object[] objArr = this.f631e;
                    System.arraycopy(objArr, i9 << 1, objArr, i4, i10 << 1);
                }
                Object[] objArr2 = this.f631e;
                int i11 = i7 << 1;
                objArr2[i11] = null;
                objArr2[i11 + 1] = null;
            } else {
                if (i5 > 8) {
                    i8 = i5 + (i5 >> 1);
                }
                a(i8);
                if (i5 == this.f632f) {
                    if (i3 > 0) {
                        System.arraycopy(iArr, 0, this.f630d, 0, i3);
                        System.arraycopy(vArr, 0, this.f631e, 0, i4);
                    }
                    if (i3 < i7) {
                        int i12 = i3 + 1;
                        int i13 = i7 - i3;
                        System.arraycopy(iArr, i12, this.f630d, i3, i13);
                        System.arraycopy(vArr, i12 << 1, this.f631e, i4, i13 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i6 = i7;
        }
        if (i5 == this.f632f) {
            this.f632f = i6;
            return v3;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i3, V v3) {
        int i4 = (i3 << 1) + 1;
        V[] vArr = this.f631e;
        V v4 = vArr[i4];
        vArr[i4] = v3;
        return v4;
    }

    public V l(int i3) {
        return this.f631e[(i3 << 1) + 1];
    }

    public V put(K k3, V v3) {
        int i3;
        int i4;
        int i5 = this.f632f;
        if (k3 == null) {
            i4 = g();
            i3 = 0;
        } else {
            int hashCode = k3.hashCode();
            i3 = hashCode;
            i4 = e(k3, hashCode);
        }
        if (i4 >= 0) {
            int i6 = (i4 << 1) + 1;
            V[] vArr = this.f631e;
            V v4 = vArr[i6];
            vArr[i6] = v3;
            return v4;
        }
        int i7 = ~i4;
        int[] iArr = this.f630d;
        if (i5 >= iArr.length) {
            int i8 = 4;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i8 = 8;
            }
            Object[] objArr = this.f631e;
            a(i8);
            if (i5 == this.f632f) {
                int[] iArr2 = this.f630d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f631e, 0, objArr.length);
                }
                d(iArr, objArr, i5);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr3 = this.f630d;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr2 = this.f631e;
            System.arraycopy(objArr2, i7 << 1, objArr2, i9 << 1, (this.f632f - i7) << 1);
        }
        int i10 = this.f632f;
        if (i5 == i10) {
            int[] iArr4 = this.f630d;
            if (i7 < iArr4.length) {
                iArr4[i7] = i3;
                Object[] objArr3 = this.f631e;
                int i11 = i7 << 1;
                objArr3[i11] = k3;
                objArr3[i11 + 1] = v3;
                this.f632f = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k3, V v3) {
        V v4 = get(k3);
        return v4 == null ? put(k3, v3) : v4;
    }

    public V remove(Object obj) {
        int f4 = f(obj);
        if (f4 >= 0) {
            return j(f4);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f4 = f(obj);
        if (f4 < 0) {
            return false;
        }
        Object l3 = l(f4);
        if (obj2 != l3 && (obj2 == null || !obj2.equals(l3))) {
            return false;
        }
        j(f4);
        return true;
    }

    public V replace(K k3, V v3) {
        int f4 = f(k3);
        if (f4 >= 0) {
            return k(f4, v3);
        }
        return null;
    }

    public boolean replace(K k3, V v3, V v4) {
        int f4 = f(k3);
        if (f4 < 0) {
            return false;
        }
        V l3 = l(f4);
        if (l3 != v3 && (v3 == null || !v3.equals(l3))) {
            return false;
        }
        k(f4, v4);
        return true;
    }

    public int size() {
        return this.f632f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f632f * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f632f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l3 = l(i3);
            if (l3 != this) {
                sb.append(l3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
