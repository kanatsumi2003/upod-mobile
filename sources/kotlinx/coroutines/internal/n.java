package kotlinx.coroutines.internal;

import a3.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class n<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2140a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public n(boolean z3) {
        this._cur = new o(8, z3);
    }

    public final boolean a(E e4) {
        while (true) {
            o oVar = (o) this._cur;
            int a4 = oVar.a(e4);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                l.a(f2140a, this, oVar, oVar.i());
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (!oVar.d()) {
                l.a(f2140a, this, oVar, oVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((o) this._cur).f();
    }

    public final E d() {
        while (true) {
            o oVar = (o) this._cur;
            E j3 = oVar.j();
            if (j3 != o.f2144h) {
                return j3;
            }
            l.a(f2140a, this, oVar, oVar.i());
        }
    }
}
