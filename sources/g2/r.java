package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1363d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1364e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1365f;

    public /* synthetic */ r(t tVar, Map map, l lVar) {
        this.f1363d = tVar;
        this.f1364e = map;
        this.f1365f = lVar;
    }

    public final void run() {
        this.f1363d.E(this.f1364e, this.f1365f);
    }
}
