package a3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k2.s;
import t2.l;

final class i1 extends m1 {

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f63i = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h  reason: collision with root package name */
    private final l<Throwable, s> f64h;

    public i1(l<? super Throwable, s> lVar) {
        this.f64h = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return s.f2081a;
    }

    public void y(Throwable th) {
        if (f63i.compareAndSet(this, 0, 1)) {
            this.f64h.invoke(th);
        }
    }
}
