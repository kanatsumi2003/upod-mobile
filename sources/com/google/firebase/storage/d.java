package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import q0.b;
import t.o;
import u0.i;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final g0.d f911a;

    /* renamed from: b  reason: collision with root package name */
    private final b<k0.a> f912b;

    /* renamed from: c  reason: collision with root package name */
    private final b<i0.b> f913c;

    /* renamed from: d  reason: collision with root package name */
    private final String f914d;

    /* renamed from: e  reason: collision with root package name */
    private long f915e = 600000;

    /* renamed from: f  reason: collision with root package name */
    private long f916f = 60000;

    /* renamed from: g  reason: collision with root package name */
    private long f917g = 600000;

    /* renamed from: h  reason: collision with root package name */
    private long f918h = 120000;

    /* renamed from: i  reason: collision with root package name */
    private n0.a f919i;

    class a implements i0.a {
        a() {
        }
    }

    d(String str, g0.d dVar, b<k0.a> bVar, b<i0.b> bVar2) {
        this.f914d = str;
        this.f911a = dVar;
        this.f912b = bVar;
        this.f913c = bVar2;
        if (bVar2 != null && bVar2.get() != null) {
            bVar2.get().a(new a());
        }
    }

    private String d() {
        return this.f914d;
    }

    public static d f(g0.d dVar) {
        o.b(dVar != null, "Null is not a valid value for the FirebaseApp.");
        String h3 = dVar.q().h();
        if (h3 == null) {
            return h(dVar, (Uri) null);
        }
        try {
            return h(dVar, i.d(dVar, "gs://" + dVar.q().h()));
        } catch (UnsupportedEncodingException e4) {
            Log.e("FirebaseStorage", "Unable to parse bucket:" + h3, e4);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public static d g(g0.d dVar, String str) {
        boolean z3 = true;
        o.b(dVar != null, "Null is not a valid value for the FirebaseApp.");
        if (str == null) {
            z3 = false;
        }
        o.b(z3, "Null is not a valid value for the Firebase Storage URL.");
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return h(dVar, i.d(dVar, str));
            } catch (UnsupportedEncodingException e4) {
                Log.e("FirebaseStorage", "Unable to parse url:" + str, e4);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        } else {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
    }

    private static d h(g0.d dVar, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            o.i(dVar, "Provided FirebaseApp must not be null.");
            e eVar = (e) dVar.j(e.class);
            o.i(eVar, "Firebase Storage component is not present.");
            return eVar.a(host);
        }
        throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
    }

    private l n(Uri uri) {
        o.i(uri, "uri must not be null");
        String d4 = d();
        o.b(TextUtils.isEmpty(d4) || uri.getAuthority().equalsIgnoreCase(d4), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new l(uri, this);
    }

    public g0.d a() {
        return this.f911a;
    }

    /* access modifiers changed from: package-private */
    public i0.b b() {
        b<i0.b> bVar = this.f913c;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public k0.a c() {
        b<k0.a> bVar = this.f912b;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public n0.a e() {
        return this.f919i;
    }

    public long i() {
        return this.f916f;
    }

    public long j() {
        return this.f917g;
    }

    public long k() {
        return this.f918h;
    }

    public long l() {
        return this.f915e;
    }

    public l m() {
        if (!TextUtils.isEmpty(d())) {
            return n(new Uri.Builder().scheme("gs").authority(d()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    public l o(String str) {
        o.b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            return m().b(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    public void p(long j3) {
        this.f917g = j3;
    }

    public void q(long j3) {
        this.f918h = j3;
    }

    public void r(long j3) {
        this.f915e = j3;
    }

    public void s(String str, int i3) {
        this.f919i = new n0.a(str, i3);
    }
}
