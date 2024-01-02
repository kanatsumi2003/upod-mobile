package s;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import d0.e;
import e0.d;
import e0.l;
import java.util.Set;
import r.a;
import r.f;
import t.k0;
import t.o;

public final class y extends d implements f.a, f.b {

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0047a<? extends d0.f, d0.a> f2866h = e.f1048c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2867a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2868b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0047a<? extends d0.f, d0.a> f2869c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Scope> f2870d;

    /* renamed from: e  reason: collision with root package name */
    private final t.d f2871e;

    /* renamed from: f  reason: collision with root package name */
    private d0.f f2872f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public x f2873g;

    public y(Context context, Handler handler, t.d dVar) {
        a.C0047a<? extends d0.f, d0.a> aVar = f2866h;
        this.f2867a = context;
        this.f2868b = handler;
        this.f2871e = (t.d) o.i(dVar, "ClientSettings must not be null");
        this.f2870d = dVar.e();
        this.f2869c = aVar;
    }

    static /* bridge */ /* synthetic */ void n(y yVar, l lVar) {
        q.a b4 = lVar.b();
        if (b4.f()) {
            k0 k0Var = (k0) o.h(lVar.c());
            b4 = k0Var.b();
            if (!b4.f()) {
                String valueOf = String.valueOf(b4);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                yVar.f2873g.b(k0Var.c(), yVar.f2870d);
                yVar.f2872f.n();
            }
        }
        yVar.f2873g.c(b4);
        yVar.f2872f.n();
    }

    public final void a(int i3) {
        this.f2872f.n();
    }

    public final void b(q.a aVar) {
        this.f2873g.c(aVar);
    }

    public final void c(Bundle bundle) {
        this.f2872f.k(this);
    }

    public final void g(l lVar) {
        this.f2868b.post(new w(this, lVar));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [d0.f, r.a$f] */
    public final void o(x xVar) {
        d0.f fVar = this.f2872f;
        if (fVar != null) {
            fVar.n();
        }
        this.f2871e.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0047a aVar = this.f2869c;
        Context context = this.f2867a;
        Looper looper = this.f2868b.getLooper();
        t.d dVar = this.f2871e;
        this.f2872f = aVar.a(context, looper, dVar, dVar.f(), this, this);
        this.f2873g = xVar;
        Set<Scope> set = this.f2870d;
        if (set == null || set.isEmpty()) {
            this.f2868b.post(new v(this));
        } else {
            this.f2872f.p();
        }
    }

    public final void p() {
        d0.f fVar = this.f2872f;
        if (fVar != null) {
            fVar.n();
        }
    }
}
