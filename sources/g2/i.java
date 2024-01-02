package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1342d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1343e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1344f;

    public /* synthetic */ i(t tVar, Map map, l lVar) {
        this.f1342d = tVar;
        this.f1343e = map;
        this.f1344f = lVar;
    }

    public final void run() {
        this.f1342d.M(this.f1343e, this.f1344f);
    }
}
