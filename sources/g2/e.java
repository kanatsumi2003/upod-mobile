package g2;

import f0.l;
import java.util.Map;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1306d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f1307e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1308f;

    public /* synthetic */ e(t tVar, Map map, l lVar) {
        this.f1306d = tVar;
        this.f1307e = map;
        this.f1308f = lVar;
    }

    public final void run() {
        this.f1306d.F(this.f1307e, this.f1308f);
    }
}
