package l0;

import java.util.Map;
import o0.a;
import o0.b;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f2284d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f2285e;

    public /* synthetic */ u(Map.Entry entry, a aVar) {
        this.f2284d = entry;
        this.f2285e = aVar;
    }

    public final void run() {
        ((b) this.f2284d.getKey()).a(this.f2285e);
    }
}
