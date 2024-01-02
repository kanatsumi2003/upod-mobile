package x;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f3163a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3164b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f3165c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f3166d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3166d == null) {
            boolean z3 = false;
            if (g.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z3 = true;
            }
            f3166d = Boolean.valueOf(z3);
        }
        return f3166d.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3163a == null) {
            boolean z3 = false;
            if (g.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z3 = true;
            }
            f3163a = Boolean.valueOf(z3);
        }
        return f3163a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context) && !g.f()) {
            return true;
        }
        if (d(context)) {
            return !g.g() || g.i();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (f3164b == null) {
            boolean z3 = false;
            if (g.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z3 = true;
            }
            f3164b = Boolean.valueOf(z3);
        }
        return f3164b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f3165c == null) {
            boolean z3 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z3 = false;
            }
            f3165c = Boolean.valueOf(z3);
        }
        return f3165c.booleanValue();
    }
}
