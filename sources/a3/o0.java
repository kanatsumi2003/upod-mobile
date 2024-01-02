package a3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.v;
import t2.l;

public final class o0<T> extends v<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f84g = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean x0() {
        do {
            int i3 = this._decision;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f84g.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
        if (!x0()) {
            g.c(c.b(this.f2160f), d0.a(obj, this.f2160f), (l) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void w(Object obj) {
        s0(obj);
    }
}
