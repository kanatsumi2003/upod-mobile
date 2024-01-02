package w2;

import kotlin.jvm.internal.e;
import l2.v;
import o2.c;

public class a implements Iterable<Integer> {

    /* renamed from: g  reason: collision with root package name */
    public static final C0053a f3152g = new C0053a((e) null);

    /* renamed from: d  reason: collision with root package name */
    private final int f3153d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3154e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3155f;

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    public static final class C0053a {
        private C0053a() {
        }

        public /* synthetic */ C0053a(e eVar) {
            this();
        }

        public final a a(int i3, int i4, int i5) {
            return new a(i3, i4, i5);
        }
    }

    public a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i5 != Integer.MIN_VALUE) {
            this.f3153d = i3;
            this.f3154e = c.b(i3, i4, i5);
            this.f3155f = i5;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int a() {
        return this.f3153d;
    }

    public final int b() {
        return this.f3154e;
    }

    public final int c() {
        return this.f3155f;
    }

    /* renamed from: d */
    public v iterator() {
        return new b(this.f3153d, this.f3154e, this.f3155f);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f3153d == aVar.f3153d && this.f3154e == aVar.f3154e && this.f3155f == aVar.f3155f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3153d * 31) + this.f3154e) * 31) + this.f3155f;
    }

    public boolean isEmpty() {
        if (this.f3155f > 0) {
            if (this.f3153d > this.f3154e) {
                return true;
            }
        } else if (this.f3153d < this.f3154e) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i3;
        StringBuilder sb;
        if (this.f3155f > 0) {
            sb = new StringBuilder();
            sb.append(this.f3153d);
            sb.append("..");
            sb.append(this.f3154e);
            sb.append(" step ");
            i3 = this.f3155f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f3153d);
            sb.append(" downTo ");
            sb.append(this.f3154e);
            sb.append(" step ");
            i3 = -this.f3155f;
        }
        sb.append(i3);
        return sb.toString();
    }
}
