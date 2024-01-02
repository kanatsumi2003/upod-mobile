package c3;

import java.util.concurrent.locks.ReentrantLock;
import k2.k;
import k2.s;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import t2.l;

public class d<E> extends a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final int f713e;

    /* renamed from: f  reason: collision with root package name */
    private final e f714f;

    /* renamed from: g  reason: collision with root package name */
    private final ReentrantLock f715g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f716h;

    /* renamed from: i  reason: collision with root package name */
    private int f717i;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f718a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f718a = iArr;
        }
    }

    public d(int i3, e eVar, l<? super E, s> lVar) {
        super(lVar);
        this.f713e = i3;
        this.f714f = eVar;
        if (i3 < 1 ? false : true) {
            this.f715g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i3, 8)];
            d.e(objArr, b.f703a, 0, 0, 6, (Object) null);
            s sVar = s.f2081a;
            this.f716h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i3 + " was specified").toString());
    }

    private final void x(int i3, E e4) {
        if (i3 < this.f713e) {
            y(i3);
            Object[] objArr = this.f716h;
            objArr[(this.f717i + i3) % objArr.length] = e4;
            return;
        }
        Object[] objArr2 = this.f716h;
        int i4 = this.f717i;
        objArr2[i4 % objArr2.length] = null;
        objArr2[(i3 + i4) % objArr2.length] = e4;
        this.f717i = (i4 + 1) % objArr2.length;
    }

    private final void y(int i3) {
        Object[] objArr = this.f716h;
        if (i3 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f713e);
            Object[] objArr2 = new Object[min];
            if (i3 > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    Object[] objArr3 = this.f716h;
                    objArr2[i4] = objArr3[(this.f717i + i4) % objArr3.length];
                    if (i5 >= i3) {
                        break;
                    }
                    i4 = i5;
                }
            }
            d.d(objArr2, b.f703a, i3, min);
            this.f716h = objArr2;
            this.f717i = 0;
        }
    }

    private final x z(int i3) {
        if (i3 < this.f713e) {
            this.size = i3 + 1;
            return null;
        }
        int i4 = a.f718a[this.f714f.ordinal()];
        if (i4 == 1) {
            return b.f705c;
        }
        if (i4 == 2) {
            return b.f704b;
        }
        if (i4 == 3) {
            return null;
        }
        throw new k();
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "(buffer:capacity=" + this.f713e + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public Object i(E e4) {
        q l3;
        ReentrantLock reentrantLock = this.f715g;
        reentrantLock.lock();
        try {
            int i3 = this.size;
            j<?> d4 = d();
            if (d4 == null) {
                x z3 = z(i3);
                if (z3 == null) {
                    if (i3 == 0) {
                        do {
                            l3 = l();
                            if (l3 != null) {
                                if (l3 instanceof j) {
                                    this.size = i3;
                                    reentrantLock.unlock();
                                    return l3;
                                }
                            }
                        } while (l3.g(e4, (m.b) null) == null);
                        this.size = i3;
                        s sVar = s.f2081a;
                        reentrantLock.unlock();
                        l3.c(e4);
                        return l3.e();
                    }
                    x(i3, e4);
                    x xVar = b.f704b;
                    reentrantLock.unlock();
                    return xVar;
                }
                reentrantLock.unlock();
                return z3;
            }
            reentrantLock.unlock();
            return d4;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f715g;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    public Object v() {
        ReentrantLock reentrantLock = this.f715g;
        reentrantLock.lock();
        try {
            int i3 = this.size;
            if (i3 == 0) {
                Object d4 = d();
                if (d4 == null) {
                    d4 = b.f706d;
                }
                return d4;
            }
            Object[] objArr = this.f716h;
            int i4 = this.f717i;
            Object obj = objArr[i4];
            s sVar = null;
            objArr[i4] = null;
            this.size = i3 - 1;
            Object obj2 = b.f706d;
            boolean z3 = false;
            if (i3 == this.f713e) {
                s sVar2 = null;
                while (true) {
                    s m3 = m();
                    if (m3 == null) {
                        sVar = sVar2;
                        break;
                    } else if (m3.A((m.b) null) != null) {
                        obj2 = m3.z();
                        sVar = m3;
                        z3 = true;
                        break;
                    } else {
                        m3.B();
                        sVar2 = m3;
                    }
                }
            }
            if (obj2 != b.f706d && !(obj2 instanceof j)) {
                this.size = i3;
                Object[] objArr2 = this.f716h;
                objArr2[(this.f717i + i3) % objArr2.length] = obj2;
            }
            this.f717i = (this.f717i + 1) % this.f716h.length;
            s sVar3 = s.f2081a;
            reentrantLock.unlock();
            if (z3) {
                i.b(sVar);
                sVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
