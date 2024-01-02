package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1353d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1354e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1355f;

    public /* synthetic */ n(t tVar, Map map, l lVar) {
        this.f1353d = tVar;
        this.f1354e = map;
        this.f1355f = lVar;
    }

    public final void run() {
        this.f1353d.Q(this.f1354e, this.f1355f);
    }
}
