package t;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class u0 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    private c f3037a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3038b;

    public u0(c cVar, int i3) {
        this.f3037a = cVar;
        this.f3038b = i3;
    }

    public final void f(int i3, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void j(int i3, IBinder iBinder, Bundle bundle) {
        o.i(this.f3037a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f3037a.M(i3, iBinder, bundle, this.f3038b);
        this.f3037a = null;
    }

    public final void k(int i3, IBinder iBinder, y0 y0Var) {
        c cVar = this.f3037a;
        o.i(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.h(y0Var);
        c.a0(cVar, y0Var);
        j(i3, iBinder, y0Var.f3047d);
    }
}
