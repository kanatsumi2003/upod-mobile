package t;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import y.d;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3020a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3021b;

    /* renamed from: c  reason: collision with root package name */
    private static String f3022c;

    /* renamed from: d  reason: collision with root package name */
    private static int f3023d;

    public static int a(Context context) {
        b(context);
        return f3023d;
    }

    private static void b(Context context) {
        synchronized (f3020a) {
            if (!f3021b) {
                f3021b = true;
                try {
                    Bundle bundle = d.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3022c = bundle.getString("com.google.app.id");
                        f3023d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e4);
                }
            }
        }
    }
}
