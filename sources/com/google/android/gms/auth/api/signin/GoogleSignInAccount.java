package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import t.o;
import u.a;
import x.c;
import x.d;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: q  reason: collision with root package name */
    public static c f732q = d.b();

    /* renamed from: d  reason: collision with root package name */
    final int f733d;

    /* renamed from: e  reason: collision with root package name */
    private String f734e;

    /* renamed from: f  reason: collision with root package name */
    private String f735f;

    /* renamed from: g  reason: collision with root package name */
    private String f736g;

    /* renamed from: h  reason: collision with root package name */
    private String f737h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f738i;

    /* renamed from: j  reason: collision with root package name */
    private String f739j;

    /* renamed from: k  reason: collision with root package name */
    private long f740k;

    /* renamed from: l  reason: collision with root package name */
    private String f741l;

    /* renamed from: m  reason: collision with root package name */
    List<Scope> f742m;

    /* renamed from: n  reason: collision with root package name */
    private String f743n;

    /* renamed from: o  reason: collision with root package name */
    private String f744o;

    /* renamed from: p  reason: collision with root package name */
    private Set<Scope> f745p = new HashSet();

    GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, List<Scope> list, String str7, String str8) {
        this.f733d = i3;
        this.f734e = str;
        this.f735f = str2;
        this.f736g = str3;
        this.f737h = str4;
        this.f738i = uri;
        this.f739j = str5;
        this.f740k = j3;
        this.f741l = str6;
        this.f742m = list;
        this.f743n = str7;
        this.f744o = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l3, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l3.longValue(), o.d(str7), new ArrayList((Collection) o.h(set)), str5, str6);
    }

    public static GoogleSignInAccount m(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3)));
        }
        GoogleSignInAccount l3 = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        l3.f739j = str2;
        return l3;
    }

    public Account b() {
        String str = this.f736g;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String c() {
        return this.f737h;
    }

    public String d() {
        return this.f736g;
    }

    public String e() {
        return this.f744o;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f741l.equals(this.f741l) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.f743n;
    }

    public String g() {
        return this.f734e;
    }

    public String h() {
        return this.f735f;
    }

    public int hashCode() {
        return ((this.f741l.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.f738i;
    }

    public Set<Scope> j() {
        HashSet hashSet = new HashSet(this.f742m);
        hashSet.addAll(this.f745p);
        return hashSet;
    }

    public String k() {
        return this.f739j;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        int a4 = u.c.a(parcel);
        u.c.f(parcel, 1, this.f733d);
        u.c.j(parcel, 2, g(), false);
        u.c.j(parcel, 3, h(), false);
        u.c.j(parcel, 4, d(), false);
        u.c.j(parcel, 5, c(), false);
        u.c.i(parcel, 6, i(), i3, false);
        u.c.j(parcel, 7, k(), false);
        u.c.h(parcel, 8, this.f740k);
        u.c.j(parcel, 9, this.f741l, false);
        u.c.m(parcel, 10, this.f742m, false);
        u.c.j(parcel, 11, f(), false);
        u.c.j(parcel, 12, e(), false);
        u.c.b(parcel, a4);
    }
}
