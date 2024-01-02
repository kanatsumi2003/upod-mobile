package y;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f3187a;

    public c(Context context) {
        this.f3187a = context;
    }

    public ApplicationInfo a(String str, int i3) {
        return this.f3187a.getPackageManager().getApplicationInfo(str, i3);
    }

    public CharSequence b(String str) {
        return this.f3187a.getPackageManager().getApplicationLabel(this.f3187a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int i3) {
        return this.f3187a.getPackageManager().getPackageInfo(str, i3);
    }
}
