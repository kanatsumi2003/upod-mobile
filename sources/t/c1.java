package t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class c1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f2920f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f2921a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2922b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f2923c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f2924d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2925e;

    public c1(String str, String str2, int i3, boolean z3) {
        o.d(str);
        this.f2921a = str;
        o.d(str2);
        this.f2922b = str2;
        this.f2924d = i3;
        this.f2925e = z3;
    }

    public final int a() {
        return this.f2924d;
    }

    public final ComponentName b() {
        return this.f2923c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f2921a == null) {
            return new Intent().setComponent(this.f2923c);
        }
        Intent intent = null;
        if (this.f2925e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f2921a);
            try {
                bundle = context.getContentResolver().call(f2920f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f2921a)));
            }
        }
        return intent != null ? intent : new Intent(this.f2921a).setPackage(this.f2922b);
    }

    public final String d() {
        return this.f2922b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return n.a(this.f2921a, c1Var.f2921a) && n.a(this.f2922b, c1Var.f2922b) && n.a(this.f2923c, c1Var.f2923c) && this.f2924d == c1Var.f2924d && this.f2925e == c1Var.f2925e;
    }

    public final int hashCode() {
        return n.b(this.f2921a, this.f2922b, this.f2923c, Integer.valueOf(this.f2924d), Boolean.valueOf(this.f2925e));
    }

    public final String toString() {
        String str = this.f2921a;
        if (str != null) {
            return str;
        }
        o.h(this.f2923c);
        return this.f2923c.flattenToString();
    }
}
