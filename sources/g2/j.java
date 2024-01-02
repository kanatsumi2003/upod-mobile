package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1345d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1346e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1347f;

    public /* synthetic */ j(t tVar, Map map, l lVar) {
        this.f1345d = tVar;
        this.f1346e = map;
        this.f1347f = lVar;
    }

    public final void run() {
        this.f1345d.R(this.f1346e, this.f1347f);
    }
}
