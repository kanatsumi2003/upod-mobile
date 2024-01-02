package q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import t.o;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static j f2638b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2639a;

    public j(Context context) {
        this.f2639a = context.getApplicationContext();
    }

    public static j a(Context context) {
        o.h(context);
        synchronized (j.class) {
            if (f2638b == null) {
                x.a(context);
                f2638b = new j(context);
            }
        }
        return f2638b;
    }

    static final t b(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i3 = 0; i3 < tVarArr.length; i3++) {
            if (tVarArr[i3].equals(uVar)) {
                return tVarArr[i3];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z3) {
        if (z3 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z3 ? b(packageInfo, w.f2649a) : b(packageInfo, w.f2649a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
