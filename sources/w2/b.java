package w2;

import java.util.NoSuchElementException;
import l2.v;

public final class b extends v {

    /* renamed from: d  reason: collision with root package name */
    private final int f3156d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3157e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3158f;

    /* renamed from: g  reason: collision with root package name */
    private int f3159g;

    public b(int i3, int i4, int i5) {
        this.f3156d = i5;
        this.f3157e = i4;
        boolean z3 = true;
        if (i5 <= 0 ? i3 < i4 : i3 > i4) {
            z3 = false;
        }
        this.f3158f = z3;
        this.f3159g = !z3 ? i4 : i3;
    }

    public boolean hasNext() {
        return this.f3158f;
    }

    public int nextInt() {
        int i3 = this.f3159g;
        if (i3 != this.f3157e) {
            this.f3159g = this.f3156d + i3;
        } else if (this.f3158f) {
            this.f3158f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i3;
    }
}
