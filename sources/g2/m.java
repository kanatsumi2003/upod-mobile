package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1350d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1351e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1352f;

    public /* synthetic */ m(t tVar, Map map, l lVar) {
        this.f1350d = tVar;
        this.f1351e = map;
        this.f1352f = lVar;
    }

    public final void run() {
        this.f1350d.H(this.f1351e, this.f1352f);
    }
}
