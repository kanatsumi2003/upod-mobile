package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.d0;

public class c0<T extends d0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private T[] f2117a;

    private final T[] f() {
        T[] tArr = this.f2117a;
        if (tArr == null) {
            T[] tArr2 = new d0[4];
            this.f2117a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (d0[]) copyOf;
            this.f2117a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i3) {
        this._size = i3;
    }

    private final void k(int i3) {
        while (true) {
            int i4 = (i3 * 2) + 1;
            if (i4 < c()) {
                T[] tArr = this.f2117a;
                i.b(tArr);
                int i5 = i4 + 1;
                if (i5 < c()) {
                    T t3 = tArr[i5];
                    i.b(t3);
                    T t4 = tArr[i4];
                    i.b(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i4 = i5;
                    }
                }
                T t5 = tArr[i3];
                i.b(t5);
                T t6 = tArr[i4];
                i.b(t6);
                if (((Comparable) t5).compareTo(t6) > 0) {
                    m(i3, i4);
                    i3 = i4;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i3) {
        while (i3 > 0) {
            T[] tArr = this.f2117a;
            i.b(tArr);
            int i4 = (i3 - 1) / 2;
            T t3 = tArr[i4];
            i.b(t3);
            T t4 = tArr[i3];
            i.b(t4);
            if (((Comparable) t3).compareTo(t4) > 0) {
                m(i3, i4);
                i3 = i4;
            } else {
                return;
            }
        }
    }

    private final void m(int i3, int i4) {
        T[] tArr = this.f2117a;
        i.b(tArr);
        T t3 = tArr[i4];
        i.b(t3);
        T t4 = tArr[i3];
        i.b(t4);
        tArr[i3] = t3;
        tArr[i4] = t4;
        t3.setIndex(i3);
        t4.setIndex(i4);
    }

    public final void a(T t3) {
        t3.b(this);
        d0[] f4 = f();
        int c4 = c();
        j(c4 + 1);
        f4[c4] = t3;
        t3.setIndex(c4);
        l(c4);
    }

    public final T b() {
        T[] tArr = this.f2117a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b4;
        synchronized (this) {
            b4 = b();
        }
        return b4;
    }

    public final boolean g(T t3) {
        boolean z3;
        synchronized (this) {
            if (t3.c() == null) {
                z3 = false;
            } else {
                h(t3.getIndex());
                z3 = true;
            }
        }
        return z3;
    }

    public final T h(int i3) {
        T[] tArr = this.f2117a;
        i.b(tArr);
        j(c() - 1);
        if (i3 < c()) {
            m(i3, c());
            int i4 = (i3 - 1) / 2;
            if (i3 > 0) {
                T t3 = tArr[i3];
                i.b(t3);
                T t4 = tArr[i4];
                i.b(t4);
                if (((Comparable) t3).compareTo(t4) < 0) {
                    m(i3, i4);
                    l(i4);
                }
            }
            k(i3);
        }
        T t5 = tArr[c()];
        i.b(t5);
        t5.b((c0<?>) null);
        t5.setIndex(-1);
        tArr[c()] = null;
        return t5;
    }

    public final T i() {
        T h3;
        synchronized (this) {
            h3 = c() > 0 ? h(0) : null;
        }
        return h3;
    }
}
