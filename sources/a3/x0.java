package a3;

import a3.w0;
import java.util.concurrent.locks.LockSupport;

public abstract class x0 extends v0 {
    /* access modifiers changed from: protected */
    public final void A() {
        Thread y3 = y();
        if (Thread.currentThread() != y3) {
            c.a();
            LockSupport.unpark(y3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Thread y();

    /* access modifiers changed from: protected */
    public final void z(long j3, w0.a aVar) {
        n0.f81j.L(j3, aVar);
    }
}
