package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import t.i1;
import t.o;
import x.g;
import y.d;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3145b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f3146c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f3147a = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f3146c == null) {
            synchronized (f3145b) {
                if (f3146c == null) {
                    f3146c = new b();
                }
            }
        }
        b bVar = f3146c;
        o.h(bVar);
        return bVar;
    }

    private static void d(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, boolean z3, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return g(context, intent, serviceConnection, i3, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f3147a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean g3 = g(context, intent, serviceConnection, i3, executor);
            if (g3) {
                return g3;
            }
            return false;
        } finally {
            this.f3147a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof i1);
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        return (!g.h() || executor == null) ? context.bindService(intent, serviceConnection, i3) : context.bindService(intent, i3, executor, serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f3147a.containsKey(serviceConnection)) {
            d(context, serviceConnection);
            return;
        }
        try {
            d(context, (ServiceConnection) this.f3147a.get(serviceConnection));
        } finally {
            this.f3147a.remove(serviceConnection);
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i3, Executor executor) {
        return e(context, str, intent, serviceConnection, i3, true, executor);
    }
}
