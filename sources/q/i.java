package q;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;
import t.o;
import x.g;

public class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f2635a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f2636b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f2637c = new AtomicBoolean();

    @Deprecated
    public static String a(int i3) {
        return a.g(i3);
    }

    public static Resources b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = q.k.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f2637c
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = t.p0.a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f2635a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = x.e.c(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = x.e.e(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            t.o.a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
        L_0x0071:
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            r3 = 9
            goto L_0x011e
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0111 }
            q.j.a(r10)
            boolean r10 = q.j.c(r9, r3)
            if (r10 != 0) goto L_0x0093
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            goto L_0x0071
        L_0x0093:
            if (r1 == 0) goto L_0x00a5
            t.o.h(r8)
            boolean r10 = q.j.c(r8, r3)
            if (r10 != 0) goto L_0x00a5
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0071
        L_0x00a5:
            if (r1 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00be
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00be
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x0071
        L_0x00be:
            int r10 = r9.versionCode
            int r10 = x.j.a(r10)
            int r1 = x.j.a(r11)
            if (r10 >= r1) goto L_0x00f2
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x011e
        L_0x00f2:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x010a
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x00fb }
            goto L_0x010a
        L_0x00fb:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x011e
        L_0x010a:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0110
            r3 = 3
            goto L_0x011e
        L_0x0110:
            return r4
        L_0x0111:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x011e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.c(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean d(Context context, int i3) {
        if (i3 == 18) {
            return true;
        }
        if (i3 == 1) {
            return g(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean e(Context context) {
        if (!g.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        o.h(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean f(int i3) {
        return i3 == 1 || i3 == 2 || i3 == 3 || i3 == 9;
    }

    @TargetApi(21)
    static boolean g(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (g.e()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !e(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
