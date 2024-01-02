package kotlinx.coroutines.internal;

import a3.i0;
import m2.g;

public final class e implements i0 {

    /* renamed from: d  reason: collision with root package name */
    private final g f2119d;

    public e(g gVar) {
        this.f2119d = gVar;
    }

    public g c() {
        return this.f2119d;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + c() + ')';
    }
}
