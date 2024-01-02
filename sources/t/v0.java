package t;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class v0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f3042a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f3043b;

    public v0(c cVar, int i3) {
        this.f3043b = cVar;
        this.f3042a = i3;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f3043b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        synchronized (cVar.f2904n) {
            c cVar2 = this.f3043b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f2905o = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new o0(iBinder) : (l) queryLocalInterface;
        }
        this.f3043b.c0(0, (Bundle) null, this.f3042a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3043b.f2904n) {
            this.f3043b.f2905o = null;
        }
        Handler handler = this.f3043b.f2902l;
        handler.sendMessage(handler.obtainMessage(6, this.f3042a, 1));
    }
}
