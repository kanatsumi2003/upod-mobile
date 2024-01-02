package c;

public class f<E> implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f633h = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f634d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f635e;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f636f;

    /* renamed from: g  reason: collision with root package name */
    private int f637g;

    public f() {
        this(10);
    }

    public f(int i3) {
        this.f634d = false;
        if (i3 == 0) {
            this.f635e = c.f608a;
            this.f636f = c.f610c;
            return;
        }
        int d4 = c.d(i3);
        this.f635e = new int[d4];
        this.f636f = new Object[d4];
    }

    private void c() {
        int i3 = this.f637g;
        int[] iArr = this.f635e;
        Object[] objArr = this.f636f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f633h) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f634d = false;
        this.f637g = i4;
    }

    public void a() {
        int i3 = this.f637g;
        Object[] objArr = this.f636f;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f637g = 0;
        this.f634d = false;
    }

    /* renamed from: b */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f635e = (int[]) this.f635e.clone();
            fVar.f636f = (Object[]) this.f636f.clone();
            return fVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public E d(int i3) {
        return e(i3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f636f[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E e(int r3, E r4) {
        /*
            r2 = this;
            int[] r0 = r2.f635e
            int r1 = r2.f637g
            int r3 = c.c.a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f636f
            r3 = r0[r3]
            java.lang.Object r0 = f633h
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.e(int, java.lang.Object):java.lang.Object");
    }

    public int f(int i3) {
        if (this.f634d) {
            c();
        }
        return c.a(this.f635e, this.f637g, i3);
    }

    public int g(int i3) {
        if (this.f634d) {
            c();
        }
        return this.f635e[i3];
    }

    public void h(int i3, E e4) {
        int a4 = c.a(this.f635e, this.f637g, i3);
        if (a4 >= 0) {
            this.f636f[a4] = e4;
            return;
        }
        int i4 = ~a4;
        int i5 = this.f637g;
        if (i4 < i5) {
            Object[] objArr = this.f636f;
            if (objArr[i4] == f633h) {
                this.f635e[i4] = i3;
                objArr[i4] = e4;
                return;
            }
        }
        if (this.f634d && i5 >= this.f635e.length) {
            c();
            i4 = ~c.a(this.f635e, this.f637g, i3);
        }
        int i6 = this.f637g;
        if (i6 >= this.f635e.length) {
            int d4 = c.d(i6 + 1);
            int[] iArr = new int[d4];
            Object[] objArr2 = new Object[d4];
            int[] iArr2 = this.f635e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f636f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f635e = iArr;
            this.f636f = objArr2;
        }
        int i7 = this.f637g;
        if (i7 - i4 != 0) {
            int[] iArr3 = this.f635e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr4 = this.f636f;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f637g - i4);
        }
        this.f635e[i4] = i3;
        this.f636f[i4] = e4;
        this.f637g++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f636f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f635e
            int r1 = r3.f637g
            int r4 = c.c.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f636f
            r1 = r0[r4]
            java.lang.Object r2 = f633h
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f634d = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.i(int):void");
    }

    public int j() {
        if (this.f634d) {
            c();
        }
        return this.f637g;
    }

    public E k(int i3) {
        if (this.f634d) {
            c();
        }
        return this.f636f[i3];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f637g * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f637g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(g(i3));
            sb.append('=');
            Object k3 = k(i3);
            if (k3 != this) {
                sb.append(k3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
