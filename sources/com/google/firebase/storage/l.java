package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.u;
import f0.g;
import f0.h;
import f0.k;
import f0.n;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import t.o;

public class l implements Comparable<l> {

    /* renamed from: d  reason: collision with root package name */
    private final Uri f963d;

    /* renamed from: e  reason: collision with root package name */
    private final d f964e;

    class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0.l f965a;

        static {
            Class<l> cls = l.class;
        }

        a(f0.l lVar) {
            this.f965a = lVar;
        }

        public void c(Exception exc) {
            this.f965a.b(j.e(exc, 0));
        }
    }

    class b implements h<u.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0.l f967a;

        b(f0.l lVar) {
            this.f967a = lVar;
        }

        /* renamed from: a */
        public void b(u.d dVar) {
            if (!this.f967a.a().m()) {
                Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
                this.f967a.b(j.c(Status.f753l));
            }
        }
    }

    class c implements u.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0.l f970b;

        c(long j3, f0.l lVar) {
            this.f969a = j3;
            this.f970b = lVar;
        }

        public void a(u.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i3 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read != -1) {
                        i3 += read;
                        if (((long) i3) <= this.f969a) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                    } else {
                        byteArrayOutputStream.flush();
                        this.f970b.c(byteArrayOutputStream.toByteArray());
                        return;
                    }
                }
            } finally {
                inputStream.close();
            }
        }
    }

    class d implements f0.c<h, k<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f0.l f975d;

        d(List list, List list2, Executor executor, f0.l lVar) {
            this.f972a = list;
            this.f973b = list2;
            this.f974c = executor;
            this.f975d = lVar;
        }

        /* renamed from: b */
        public k<Void> a(k<h> kVar) {
            if (kVar.n()) {
                h k3 = kVar.k();
                this.f972a.addAll(k3.d());
                this.f973b.addAll(k3.b());
                if (k3.c() != null) {
                    l.this.t((Integer) null, k3.c()).i(this.f974c, this);
                } else {
                    this.f975d.c(new h(this.f972a, this.f973b, (String) null));
                }
            } else {
                this.f975d.b(kVar.j());
            }
            return n.d(null);
        }
    }

    static {
        Class<l> cls = l.class;
    }

    l(Uri uri, d dVar) {
        boolean z3 = true;
        o.b(uri != null, "storageUri cannot be null");
        o.b(dVar == null ? false : z3, "FirebaseApp cannot be null");
        this.f963d = uri;
        this.f964e = dVar;
    }

    /* access modifiers changed from: private */
    public k<h> t(Integer num, String str) {
        f0.l lVar = new f0.l();
        t0.k.b().d(new i(this, num, str, lVar));
        return lVar.a();
    }

    public l b(String str) {
        o.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new l(this.f963d.buildUpon().appendEncodedPath(u0.d.b(u0.d.a(str))).build(), this.f964e);
    }

    /* renamed from: c */
    public int compareTo(l lVar) {
        return this.f963d.compareTo(lVar.f963d);
    }

    public k<Void> d() {
        f0.l lVar = new f0.l();
        t0.k.b().d(new b(this, lVar));
        return lVar.a();
    }

    /* access modifiers changed from: package-private */
    public g0.d e() {
        return o().a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return ((l) obj).toString().equals(toString());
    }

    public String f() {
        return this.f963d.getAuthority();
    }

    public k<byte[]> g(long j3) {
        f0.l lVar = new f0.l();
        u uVar = new u(this);
        uVar.u0(new c(j3, lVar)).g(new b(lVar)).e(new a(lVar));
        uVar.f0();
        return lVar.a();
    }

    public k<Uri> h() {
        f0.l lVar = new f0.l();
        t0.k.b().d(new f(this, lVar));
        return lVar.a();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public c i(Uri uri) {
        c cVar = new c(this, uri);
        cVar.f0();
        return cVar;
    }

    public k<k> j() {
        f0.l lVar = new f0.l();
        t0.k.b().d(new g(this, lVar));
        return lVar.a();
    }

    public String k() {
        String path = this.f963d.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public l l() {
        String path = this.f963d.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        String str = "/";
        if (path.equals(str)) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = path.substring(0, lastIndexOf);
        }
        return new l(this.f963d.buildUpon().path(str).build(), this.f964e);
    }

    public String m() {
        return this.f963d.getPath();
    }

    public l n() {
        return new l(this.f963d.buildUpon().path("").build(), this.f964e);
    }

    public d o() {
        return this.f964e;
    }

    /* access modifiers changed from: package-private */
    public u0.h p() {
        return new u0.h(this.f963d, this.f964e.e());
    }

    public k<h> q(int i3) {
        boolean z3 = true;
        o.b(i3 > 0, "maxResults must be greater than zero");
        if (i3 > 1000) {
            z3 = false;
        }
        o.b(z3, "maxResults must be at most 1000");
        return t(Integer.valueOf(i3), (String) null);
    }

    public k<h> r(int i3, String str) {
        boolean z3 = true;
        o.b(i3 > 0, "maxResults must be greater than zero");
        o.b(i3 <= 1000, "maxResults must be at most 1000");
        if (str == null) {
            z3 = false;
        }
        o.b(z3, "pageToken must be non-null to resume a previous list() operation");
        return t(Integer.valueOf(i3), str);
    }

    public k<h> s() {
        f0.l lVar = new f0.l();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor a4 = t0.k.b().a();
        t((Integer) null, (String) null).i(a4, new d(arrayList, arrayList2, a4, lVar));
        return lVar.a();
    }

    public String toString() {
        return "gs://" + this.f963d.getAuthority() + this.f963d.getEncodedPath();
    }

    public a0 u(byte[] bArr) {
        o.b(bArr != null, "bytes cannot be null");
        a0 a0Var = new a0(this, (k) null, bArr);
        a0Var.f0();
        return a0Var;
    }

    public a0 v(byte[] bArr, k kVar) {
        boolean z3 = true;
        o.b(bArr != null, "bytes cannot be null");
        if (kVar == null) {
            z3 = false;
        }
        o.b(z3, "metadata cannot be null");
        a0 a0Var = new a0(this, kVar, bArr);
        a0Var.f0();
        return a0Var;
    }

    public a0 w(Uri uri) {
        o.b(uri != null, "uri cannot be null");
        a0 a0Var = new a0(this, (k) null, uri, (Uri) null);
        a0Var.f0();
        return a0Var;
    }

    public a0 x(Uri uri, k kVar) {
        boolean z3 = true;
        o.b(uri != null, "uri cannot be null");
        if (kVar == null) {
            z3 = false;
        }
        o.b(z3, "metadata cannot be null");
        a0 a0Var = new a0(this, kVar, uri, (Uri) null);
        a0Var.f0();
        return a0Var;
    }

    public k<k> y(k kVar) {
        o.h(kVar);
        f0.l lVar = new f0.l();
        t0.k.b().d(new z(this, lVar, kVar));
        return lVar.a();
    }
}
