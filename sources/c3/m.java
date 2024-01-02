package c3;

import java.util.concurrent.locks.ReentrantLock;
import k2.s;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import t2.l;

public class m<E> extends a<E> {

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantLock f730e = new ReentrantLock();

    /* renamed from: f  reason: collision with root package name */
    private Object f731f = b.f703a;

    public m(l<? super E, s> lVar) {
        super(lVar);
    }

    private final f0 x(Object obj) {
        l<E, s> lVar;
        Object obj2 = this.f731f;
        f0 f0Var = null;
        if (!(obj2 == b.f703a || (lVar = this.f710b) == null)) {
            f0Var = kotlinx.coroutines.internal.s.d(lVar, obj2, (f0) null, 2, (Object) null);
        }
        this.f731f = obj;
        return f0Var;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "(value=" + this.f731f + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public Object i(E e4) {
        q l3;
        ReentrantLock reentrantLock = this.f730e;
        reentrantLock.lock();
        try {
            j<?> d4 = d();
            if (d4 == null) {
                if (this.f731f == b.f703a) {
                    do {
                        l3 = l();
                        if (l3 != null) {
                            if (l3 instanceof j) {
                                reentrantLock.unlock();
                                return l3;
                            }
                        }
                    } while (l3.g(e4, (m.b) null) == null);
                    s sVar = s.f2081a;
                    reentrantLock.unlock();
                    l3.c(e4);
                    return l3.e();
                }
                f0 x3 = x(e4);
                if (x3 == null) {
                    x xVar = b.f704b;
                    reentrantLock.unlock();
                    return xVar;
                }
                throw x3;
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
        ReentrantLock reentrantLock = this.f730e;
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
        return this.f731f == b.f703a;
    }

    /* access modifiers changed from: protected */
    public Object v() {
        ReentrantLock reentrantLock = this.f730e;
        reentrantLock.lock();
        try {
            Object obj = this.f731f;
            x xVar = b.f703a;
            if (obj == xVar) {
                Object d4 = d();
                if (d4 == null) {
                    d4 = b.f706d;
                }
                return d4;
            }
            this.f731f = xVar;
            s sVar = s.f2081a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
