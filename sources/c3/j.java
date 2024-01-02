package c3;

import a3.m0;
import a3.n;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;

public final class j<E> extends s implements q<E> {

    /* renamed from: g  reason: collision with root package name */
    public final Throwable f729g;

    public x A(m.b bVar) {
        return n.f80a;
    }

    /* renamed from: C */
    public j<E> e() {
        return this;
    }

    /* renamed from: D */
    public j<E> z() {
        return this;
    }

    public final Throwable E() {
        Throwable th = this.f729g;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable F() {
        Throwable th = this.f729g;
        return th == null ? new l("Channel was closed") : th;
    }

    public void c(E e4) {
    }

    public x g(E e4, m.b bVar) {
        return n.f80a;
    }

    public String toString() {
        return "Closed@" + m0.b(this) + '[' + this.f729g + ']';
    }

    public void y() {
    }
}
