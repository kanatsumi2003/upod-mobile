package kotlinx.coroutines.internal;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f2104a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f2105b;

    /* renamed from: c  reason: collision with root package name */
    private int f2106c;

    private final void b() {
        Object[] objArr = this.f2104a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = d.c(objArr, objArr3, 0, this.f2105b, 0, 10, (Object) null);
        Object[] objArr4 = this.f2104a;
        int length2 = objArr4.length;
        int i3 = this.f2105b;
        Object[] unused2 = d.c(objArr4, objArr2, length2 - i3, 0, i3, 4, (Object) null);
        this.f2104a = objArr3;
        this.f2105b = 0;
        this.f2106c = length;
    }

    public final void a(T t3) {
        Object[] objArr = this.f2104a;
        int i3 = this.f2106c;
        objArr[i3] = t3;
        int length = (objArr.length - 1) & (i3 + 1);
        this.f2106c = length;
        if (length == this.f2105b) {
            b();
        }
    }

    public final boolean c() {
        return this.f2105b == this.f2106c;
    }

    public final T d() {
        int i3 = this.f2105b;
        if (i3 == this.f2106c) {
            return null;
        }
        T[] tArr = this.f2104a;
        T t3 = tArr[i3];
        tArr[i3] = null;
        this.f2105b = (i3 + 1) & (tArr.length - 1);
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
