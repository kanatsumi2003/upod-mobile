package kotlin.coroutines.jvm.internal;

import m2.d;
import m2.g;
import m2.h;

public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f2357d)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public g getContext() {
        return h.f2357d;
    }
}
