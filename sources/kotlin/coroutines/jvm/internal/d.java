package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.i;
import m2.e;
import m2.g;

public abstract class d extends a {
    private final g _context;
    private transient m2.d<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(m2.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(m2.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        i.b(gVar);
        return gVar;
    }

    public final m2.d<Object> intercepted() {
        m2.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.f2354c);
            if (eVar == null || (dVar = eVar.r(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        m2.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b bVar = getContext().get(e.f2354c);
            i.b(bVar);
            ((e) bVar).e(dVar);
        }
        this.intercepted = c.f2082d;
    }
}
