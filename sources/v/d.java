package v;

import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import f0.k;
import r.a;
import r.e;
import t.s;
import t.u;
import t.v;

public final class d extends e<v> implements u {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g<e> f3114k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0047a<e, v> f3115l;

    /* renamed from: m  reason: collision with root package name */
    private static final a<v> f3116m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f3117n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f3114k = gVar;
        c cVar = new c();
        f3115l = cVar;
        f3116m = new a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f3116m, vVar, e.a.f2676c);
    }

    public final k<Void> a(s sVar) {
        c.a a4 = c.a();
        a4.d(a0.d.f13a);
        a4.c(false);
        a4.b(new b(sVar));
        return c(a4.a());
    }
}
