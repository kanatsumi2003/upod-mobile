package s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f2854a;

    /* renamed from: b  reason: collision with root package name */
    private final o f2855b;

    public p(o oVar) {
        this.f2855b = oVar;
    }

    public final void a(Context context) {
        this.f2854a = context;
    }

    public final synchronized void b() {
        Context context = this.f2854a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f2854a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2855b.a();
            b();
        }
    }
}
