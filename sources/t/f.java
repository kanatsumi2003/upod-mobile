package t;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import q.c;
import t.i;
import u.a;

public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new b1();

    /* renamed from: r  reason: collision with root package name */
    static final Scope[] f2955r = new Scope[0];

    /* renamed from: s  reason: collision with root package name */
    static final c[] f2956s = new c[0];

    /* renamed from: d  reason: collision with root package name */
    final int f2957d;

    /* renamed from: e  reason: collision with root package name */
    final int f2958e;

    /* renamed from: f  reason: collision with root package name */
    int f2959f;

    /* renamed from: g  reason: collision with root package name */
    String f2960g;

    /* renamed from: h  reason: collision with root package name */
    IBinder f2961h;

    /* renamed from: i  reason: collision with root package name */
    Scope[] f2962i;

    /* renamed from: j  reason: collision with root package name */
    Bundle f2963j;

    /* renamed from: k  reason: collision with root package name */
    Account f2964k;

    /* renamed from: l  reason: collision with root package name */
    c[] f2965l;

    /* renamed from: m  reason: collision with root package name */
    c[] f2966m;

    /* renamed from: n  reason: collision with root package name */
    boolean f2967n;

    /* renamed from: o  reason: collision with root package name */
    int f2968o;

    /* renamed from: p  reason: collision with root package name */
    boolean f2969p;

    /* renamed from: q  reason: collision with root package name */
    private String f2970q;

    f(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z3, int i6, boolean z4, String str2) {
        scopeArr = scopeArr == null ? f2955r : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f2956s : cVarArr;
        cVarArr2 = cVarArr2 == null ? f2956s : cVarArr2;
        this.f2957d = i3;
        this.f2958e = i4;
        this.f2959f = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f2960g = "com.google.android.gms";
        } else {
            this.f2960g = str;
        }
        if (i3 < 2) {
            this.f2964k = iBinder != null ? a.c(i.a.b(iBinder)) : null;
        } else {
            this.f2961h = iBinder;
            this.f2964k = account;
        }
        this.f2962i = scopeArr;
        this.f2963j = bundle;
        this.f2965l = cVarArr;
        this.f2966m = cVarArr2;
        this.f2967n = z3;
        this.f2968o = i6;
        this.f2969p = z4;
        this.f2970q = str2;
    }

    public final String b() {
        return this.f2970q;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        b1.a(this, parcel, i3);
    }
}
