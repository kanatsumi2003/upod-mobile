package t;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import x.g;

final class e1 implements ServiceConnection, i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f2948a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f2949b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2950c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f2951d;

    /* renamed from: e  reason: collision with root package name */
    private final c1 f2952e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f2953f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ h1 f2954g;

    public e1(h1 h1Var, c1 c1Var) {
        this.f2954g = h1Var;
        this.f2952e = c1Var;
    }

    public final int a() {
        return this.f2949b;
    }

    public final ComponentName b() {
        return this.f2953f;
    }

    public final IBinder c() {
        return this.f2951d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f2948a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f2949b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (g.j()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            h1 h1Var = this.f2954g;
            boolean c4 = h1Var.f2984j.c(h1Var.f2981g, str, this.f2952e.c(h1Var.f2981g), this, this.f2952e.a(), executor);
            this.f2950c = c4;
            if (c4) {
                this.f2954g.f2982h.sendMessageDelayed(this.f2954g.f2982h.obtainMessage(1, this.f2952e), this.f2954g.f2986l);
            } else {
                this.f2949b = 2;
                try {
                    h1 h1Var2 = this.f2954g;
                    h1Var2.f2984j.b(h1Var2.f2981g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f2948a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f2954g.f2982h.removeMessages(1, this.f2952e);
        h1 h1Var = this.f2954g;
        h1Var.f2984j.b(h1Var.f2981g, this);
        this.f2950c = false;
        this.f2949b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f2948a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f2948a.isEmpty();
    }

    public final boolean j() {
        return this.f2950c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2954g.f2980f) {
            this.f2954g.f2982h.removeMessages(1, this.f2952e);
            this.f2951d = iBinder;
            this.f2953f = componentName;
            for (ServiceConnection onServiceConnected : this.f2948a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f2949b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2954g.f2980f) {
            this.f2954g.f2982h.removeMessages(1, this.f2952e);
            this.f2951d = null;
            this.f2953f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f2948a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f2949b = 2;
        }
    }
}
