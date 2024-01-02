package androidx.core.content;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import i.c;
import java.io.File;
import java.util.concurrent.Executor;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f167a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f168b = new Object();

    static class a {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class b {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return null;
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(context) : c.a(new Handler(context.getMainLooper()));
    }
}
