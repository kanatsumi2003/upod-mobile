package e;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

public class b extends androidx.core.content.d {

    /* renamed from: c  reason: collision with root package name */
    private static c f1063c;

    class a implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String[] f1064d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Activity f1065e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f1066f;

        a(String[] strArr, Activity activity, int i3) {
            this.f1064d = strArr;
            this.f1065e = activity;
            this.f1066f = i3;
        }

        public void run() {
            int[] iArr = new int[this.f1064d.length];
            PackageManager packageManager = this.f1065e.getPackageManager();
            String packageName = this.f1065e.getPackageName();
            int length = this.f1064d.length;
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = packageManager.checkPermission(this.f1064d[i3], packageName);
            }
            ((C0017b) this.f1065e).onRequestPermissionsResult(this.f1066f, this.f1064d, iArr);
        }
    }

    /* renamed from: e.b$b  reason: collision with other inner class name */
    public interface C0017b {
        void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, int i3, int i4, Intent intent);

        boolean b(Activity activity, String[] strArr, int i3);
    }

    public interface d {
        void b(int i3);
    }

    public static c d() {
        return f1063c;
    }

    public static void e(Activity activity, String[] strArr, int i3) {
        c cVar = f1063c;
        if (cVar == null || !cVar.b(activity, strArr, i3)) {
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                if (!TextUtils.isEmpty(strArr[i4])) {
                    i4++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).b(i3);
                }
                activity.requestPermissions(strArr, i3);
            } else if (activity instanceof C0017b) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i3));
            }
        }
    }

    public static void f(Activity activity, Intent intent, int i3, Bundle bundle) {
        activity.startActivityForResult(intent, i3, bundle);
    }
}
