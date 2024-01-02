package q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import t.j1;
import x.e;
import y.d;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2632a = i.f2635a;

    /* renamed from: b  reason: collision with root package name */
    private static final g f2633b = new g();

    g() {
    }

    public Intent a(Context context, int i3, String str) {
        if (i3 == 1 || i3 == 2) {
            if (context != null && e.c(context)) {
                return j1.a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f2632a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(d.a(context).c(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return j1.b("com.google.android.gms", sb.toString());
        } else if (i3 != 3) {
            return null;
        } else {
            return j1.c("com.google.android.gms");
        }
    }

    public PendingIntent b(Context context, int i3, int i4) {
        return c(context, i3, i4, (String) null);
    }

    public PendingIntent c(Context context, int i3, int i4, String str) {
        Intent a4 = a(context, i3, str);
        if (a4 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i4, a4, b0.d.f563a | 134217728);
    }

    public String d(int i3) {
        return i.a(i3);
    }

    public int e(Context context) {
        return f(context, f2632a);
    }

    public int f(Context context, int i3) {
        int c4 = i.c(context, i3);
        if (i.d(context, c4)) {
            return 18;
        }
        return c4;
    }

    public boolean g(Context context, String str) {
        return i.g(context, str);
    }

    public boolean h(int i3) {
        return i.f(i3);
    }
}
