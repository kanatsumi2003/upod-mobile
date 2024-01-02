package r0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.d;
import o0.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2683a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f2684b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2685c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2686d = c();

    public a(Context context, String str, c cVar) {
        Context a4 = a(context);
        this.f2683a = a4;
        this.f2684b = a4.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f2685c = cVar;
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : d.b(context);
    }

    private boolean c() {
        return this.f2684b.contains("firebase_data_collection_default_enabled") ? this.f2684b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f2683a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f2683a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z3) {
        if (this.f2686d != z3) {
            this.f2686d = z3;
            this.f2685c.a(new o0.a(g0.a.class, new g0.a(z3)));
        }
    }

    public synchronized boolean b() {
        return this.f2686d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f2684b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f2684b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
