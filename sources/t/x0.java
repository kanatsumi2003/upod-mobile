package t;

import android.os.Bundle;
import q.a;

public final class x0 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f3046g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(c cVar, int i3, Bundle bundle) {
        super(cVar, i3, (Bundle) null);
        this.f3046g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (!this.f3046g.s() || !c.f0(this.f3046g)) {
            this.f3046g.f2906p.a(aVar);
            this.f3046g.K(aVar);
            return;
        }
        c.b0(this.f3046g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f3046g.f2906p.a(a.f2617h);
        return true;
    }
}
