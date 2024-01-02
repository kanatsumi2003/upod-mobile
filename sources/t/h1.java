package t;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import b0.e;
import java.util.HashMap;
import java.util.concurrent.Executor;
import w.b;

final class h1 extends h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f2980f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f2981g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f2982h;

    /* renamed from: i  reason: collision with root package name */
    private final g1 f2983i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final b f2984j;

    /* renamed from: k  reason: collision with root package name */
    private final long f2985k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f2986l;

    h1(Context context, Looper looper) {
        g1 g1Var = new g1(this, (f1) null);
        this.f2983i = g1Var;
        this.f2981g = context.getApplicationContext();
        this.f2982h = new e(looper, g1Var);
        this.f2984j = b.a();
        this.f2985k = 5000;
        this.f2986l = 300000;
    }

    /* access modifiers changed from: protected */
    public final void d(c1 c1Var, ServiceConnection serviceConnection, String str) {
        o.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2980f) {
            e1 e1Var = (e1) this.f2980f.get(c1Var);
            if (e1Var == null) {
                String obj = c1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (e1Var.h(serviceConnection)) {
                e1Var.f(serviceConnection, str);
                if (e1Var.i()) {
                    this.f2982h.sendMessageDelayed(this.f2982h.obtainMessage(0, c1Var), this.f2985k);
                }
            } else {
                String obj2 = c1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(c1 c1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j3;
        o.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2980f) {
            e1 e1Var = (e1) this.f2980f.get(c1Var);
            if (e1Var == null) {
                e1Var = new e1(this, c1Var);
                e1Var.d(serviceConnection, serviceConnection, str);
                e1Var.e(str, executor);
                this.f2980f.put(c1Var, e1Var);
            } else {
                this.f2982h.removeMessages(0, c1Var);
                if (!e1Var.h(serviceConnection)) {
                    e1Var.d(serviceConnection, serviceConnection, str);
                    int a4 = e1Var.a();
                    if (a4 == 1) {
                        serviceConnection.onServiceConnected(e1Var.b(), e1Var.c());
                    } else if (a4 == 2) {
                        e1Var.e(str, executor);
                    }
                } else {
                    String obj = c1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j3 = e1Var.j();
        }
        return j3;
    }
}
