package t;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static int f2975a = 4225;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2976b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static h1 f2977c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f2978d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2979e = false;

    public static int a() {
        return f2975a;
    }

    public static h b(Context context) {
        synchronized (f2976b) {
            if (f2977c == null) {
                f2977c = new h1(context.getApplicationContext(), f2979e ? c().getLooper() : context.getMainLooper());
            }
        }
        return f2977c;
    }

    public static HandlerThread c() {
        synchronized (f2976b) {
            HandlerThread handlerThread = f2978d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f2978d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f2978d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(c1 c1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i3, ServiceConnection serviceConnection, String str3, boolean z3) {
        d(new c1(str, str2, i3, z3), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(c1 c1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
