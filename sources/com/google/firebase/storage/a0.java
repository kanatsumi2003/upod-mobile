package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import t.o;
import u0.e;
import u0.f;
import u0.h;
import u0.i;
import v0.g;
import v0.j;
import x.c;
import x.d;

public class a0 extends s<b> {
    private static final Random E = new Random();
    static e F = new f();
    static c G = d.b();
    private volatile String A;
    private volatile long B;
    private int C;
    private final int D;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final l f876l;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f877m;

    /* renamed from: n  reason: collision with root package name */
    private final long f878n;

    /* renamed from: o  reason: collision with root package name */
    private final u0.b f879o;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicLong f880p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final k0.a f881q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final i0.b f882r;

    /* renamed from: s  reason: collision with root package name */
    private int f883s;

    /* renamed from: t  reason: collision with root package name */
    private u0.c f884t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f885u;

    /* renamed from: v  reason: collision with root package name */
    private volatile k f886v;

    /* renamed from: w  reason: collision with root package name */
    private volatile Uri f887w;

    /* renamed from: x  reason: collision with root package name */
    private volatile Exception f888x;

    /* renamed from: y  reason: collision with root package name */
    private volatile Exception f889y;

    /* renamed from: z  reason: collision with root package name */
    private volatile int f890z;

    class a implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0.e f891d;

        a(v0.e eVar) {
            this.f891d = eVar;
        }

        public void run() {
            this.f891d.C(i.c(a0.this.f881q), i.b(a0.this.f882r), a0.this.f876l.e().l());
        }
    }

    public class b extends s<b>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f893c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f894d;

        /* renamed from: e  reason: collision with root package name */
        private final k f895e;

        b(Exception exc, long j3, Uri uri, k kVar) {
            super(exc);
            this.f893c = j3;
            this.f894d = uri;
            this.f895e = kVar;
        }

        public long d() {
            return this.f893c;
        }

        public k e() {
            return this.f895e;
        }

        public long f() {
            return a0.this.t0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: long} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a0(com.google.firebase.storage.l r11, com.google.firebase.storage.k r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            r10 = this;
            java.lang.String r0 = "UploadTask"
            r10.<init>()
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = 0
            r1.<init>(r2)
            r10.f880p = r1
            r1 = 262144(0x40000, float:3.67342E-40)
            r10.f883s = r1
            r2 = 0
            r10.f887w = r2
            r10.f888x = r2
            r10.f889y = r2
            r3 = 0
            r10.f890z = r3
            r10.C = r3
            r3 = 1000(0x3e8, float:1.401E-42)
            r10.D = r3
            t.o.h(r11)
            t.o.h(r13)
            com.google.firebase.storage.d r3 = r11.o()
            r10.f876l = r11
            r10.f886v = r12
            k0.a r6 = r3.c()
            r10.f881q = r6
            i0.b r7 = r3.b()
            r10.f882r = r7
            r10.f877m = r13
            long r4 = r3.i()
            r10.B = r4
            u0.c r12 = new u0.c
            g0.d r4 = r11.e()
            android.content.Context r5 = r4.l()
            long r8 = r3.l()
            r4 = r12
            r4.<init>(r5, r6, r7, r8)
            r10.f884t = r12
            r3 = -1
            com.google.firebase.storage.d r11 = r11.o()     // Catch:{ FileNotFoundException -> 0x00c1 }
            g0.d r11 = r11.a()     // Catch:{ FileNotFoundException -> 0x00c1 }
            android.content.Context r11 = r11.l()     // Catch:{ FileNotFoundException -> 0x00c1 }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00c1 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r12 = r11.openFileDescriptor(r13, r12)     // Catch:{ NullPointerException -> 0x009b, IOException -> 0x007e }
            if (r12 == 0) goto L_0x00a2
            long r5 = r12.getStatSize()     // Catch:{ NullPointerException -> 0x009b, IOException -> 0x007e }
            r12.close()     // Catch:{ NullPointerException -> 0x007c, IOException -> 0x007a }
            goto L_0x00a3
        L_0x007a:
            r12 = move-exception
            goto L_0x0080
        L_0x007c:
            r12 = move-exception
            goto L_0x009d
        L_0x007e:
            r12 = move-exception
            r5 = r3
        L_0x0080:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00be }
            r13.<init>()     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r7 = "could not retrieve file size for upload "
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x00be }
            android.net.Uri r7 = r10.f877m     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r7 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00be }
            r13.append(r7)     // Catch:{ FileNotFoundException -> 0x00be }
            java.lang.String r13 = r13.toString()     // Catch:{ FileNotFoundException -> 0x00be }
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x00be }
            goto L_0x00a3
        L_0x009b:
            r12 = move-exception
            r5 = r3
        L_0x009d:
            java.lang.String r13 = "NullPointerException during file size calculation."
            android.util.Log.w(r0, r13, r12)     // Catch:{ FileNotFoundException -> 0x00be }
        L_0x00a2:
            r5 = r3
        L_0x00a3:
            android.net.Uri r12 = r10.f877m     // Catch:{ FileNotFoundException -> 0x00be }
            java.io.InputStream r2 = r11.openInputStream(r12)     // Catch:{ FileNotFoundException -> 0x00be }
            if (r2 == 0) goto L_0x00df
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x00b6
            int r11 = r2.available()     // Catch:{ IOException -> 0x00b6 }
            if (r11 < 0) goto L_0x00b6
            long r5 = (long) r11
        L_0x00b6:
            r3 = r5
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00c1 }
            r11.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00c1 }
            r2 = r11
            goto L_0x00de
        L_0x00be:
            r11 = move-exception
            r3 = r5
            goto L_0x00c2
        L_0x00c1:
            r11 = move-exception
        L_0x00c2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "could not locate file for uploading:"
            r12.append(r13)
            android.net.Uri r13 = r10.f877m
            java.lang.String r13 = r13.toString()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r0, r12)
            r10.f888x = r11
        L_0x00de:
            r5 = r3
        L_0x00df:
            r10.f878n = r5
            u0.b r11 = new u0.b
            r11.<init>(r2, r1)
            r10.f879o = r11
            r11 = 1
            r10.f885u = r11
            r10.f887w = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.a0.<init>(com.google.firebase.storage.l, com.google.firebase.storage.k, android.net.Uri, android.net.Uri):void");
    }

    a0(l lVar, k kVar, byte[] bArr) {
        this.f880p = new AtomicLong(0);
        this.f883s = 262144;
        this.f887w = null;
        this.f888x = null;
        this.f889y = null;
        this.f890z = 0;
        this.C = 0;
        this.D = 1000;
        o.h(lVar);
        o.h(bArr);
        d o3 = lVar.o();
        this.f878n = (long) bArr.length;
        this.f876l = lVar;
        this.f886v = kVar;
        k0.a c4 = o3.c();
        this.f881q = c4;
        i0.b b4 = o3.b();
        this.f882r = b4;
        this.f877m = null;
        this.f879o = new u0.b(new ByteArrayInputStream(bArr), 262144);
        this.f885u = true;
        this.B = o3.i();
        this.f884t = new u0.c(o3.a().l(), c4, b4, o3.j());
    }

    private boolean A0() {
        if (I() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f888x = new InterruptedException();
            m0(64, false);
            return false;
        } else if (I() == 32) {
            m0(256, false);
            return false;
        } else if (I() == 8) {
            m0(16, false);
            return false;
        } else if (!z0()) {
            return false;
        } else {
            if (this.f887w == null) {
                if (this.f888x == null) {
                    this.f888x = new IllegalStateException("Unable to obtain an upload URL.");
                }
                m0(64, false);
                return false;
            } else if (this.f888x != null) {
                m0(64, false);
                return false;
            } else {
                boolean z3 = this.f889y != null || this.f890z < 200 || this.f890z >= 300;
                long a4 = G.a() + this.B;
                long a5 = G.a() + ((long) this.C);
                if (z3) {
                    if (a5 > a4 || !w0(true)) {
                        if (z0()) {
                            m0(64, false);
                        }
                        return false;
                    }
                    this.C = Math.max(this.C * 2, 1000);
                }
                return true;
            }
        }
    }

    private void C0() {
        try {
            this.f879o.d(this.f883s);
            int min = Math.min(this.f883s, this.f879o.b());
            g gVar = new g(this.f876l.p(), this.f876l.e(), this.f887w, this.f879o.e(), this.f880p.get(), min, this.f879o.f());
            if (!s0(gVar)) {
                this.f883s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f883s);
                return;
            }
            this.f880p.getAndAdd((long) min);
            if (!this.f879o.f()) {
                this.f879o.a(min);
                int i3 = this.f883s;
                if (i3 < 33554432) {
                    this.f883s = i3 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f883s);
                    return;
                }
                return;
            }
            try {
                this.f886v = new k.b(gVar.o(), this.f876l).a();
                m0(4, false);
                m0(128, false);
            } catch (JSONException e4) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + gVar.n(), e4);
                this.f888x = e4;
            }
        } catch (IOException e5) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e5);
            this.f888x = e5;
        }
    }

    private void r0() {
        JSONObject jSONObject = null;
        String w3 = this.f886v != null ? this.f886v.w() : null;
        if (this.f877m != null && TextUtils.isEmpty(w3)) {
            w3 = this.f876l.o().a().l().getContentResolver().getType(this.f877m);
        }
        if (TextUtils.isEmpty(w3)) {
            w3 = "application/octet-stream";
        }
        h p3 = this.f876l.p();
        g0.d e4 = this.f876l.e();
        if (this.f886v != null) {
            jSONObject = this.f886v.q();
        }
        j jVar = new j(p3, e4, jSONObject, w3);
        if (y0(jVar)) {
            String r3 = jVar.r("X-Goog-Upload-URL");
            if (!TextUtils.isEmpty(r3)) {
                this.f887w = Uri.parse(r3);
            }
        }
    }

    private boolean s0(v0.e eVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.C + " milliseconds");
            F.a(this.C + E.nextInt(250));
            boolean x02 = x0(eVar);
            if (x02) {
                this.C = 0;
            }
            return x02;
        } catch (InterruptedException e4) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f889y = e4;
            return false;
        }
    }

    private boolean u0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    private boolean v0(v0.e eVar) {
        int p3 = eVar.p();
        if (this.f884t.b(p3)) {
            p3 = -2;
        }
        this.f890z = p3;
        this.f889y = eVar.f();
        this.A = eVar.r("X-Goog-Upload-Status");
        return u0(this.f890z) && this.f889y == null;
    }

    private boolean w0(boolean z3) {
        v0.i iVar = new v0.i(this.f876l.p(), this.f876l.e(), this.f887w);
        if ("final".equals(this.A)) {
            return false;
        }
        if (z3) {
            if (!y0(iVar)) {
                return false;
            }
        } else if (!x0(iVar)) {
            return false;
        }
        if ("final".equals(iVar.r("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String r3 = iVar.r("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(r3) ? Long.parseLong(r3) : 0;
            long j3 = this.f880p.get();
            int i3 = (j3 > parseLong ? 1 : (j3 == parseLong ? 0 : -1));
            if (i3 > 0) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else if (i3 >= 0) {
                return true;
            } else {
                try {
                    long j4 = parseLong - j3;
                    if (((long) this.f879o.a((int) j4)) != j4) {
                        this.f888x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    } else if (this.f880p.compareAndSet(j3, parseLong)) {
                        return true;
                    } else {
                        Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                        this.f888x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                        return false;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f888x = e;
        return false;
    }

    private boolean x0(v0.e eVar) {
        eVar.C(i.c(this.f881q), i.b(this.f882r), this.f876l.e().l());
        return v0(eVar);
    }

    private boolean y0(v0.e eVar) {
        this.f884t.d(eVar);
        return v0(eVar);
    }

    private boolean z0() {
        if (!"final".equals(this.A)) {
            return true;
        }
        if (this.f888x == null) {
            this.f888x = new IOException("The server has terminated the upload session", this.f889y);
        }
        m0(64, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public b l0() {
        return new b(j.e(this.f888x != null ? this.f888x : this.f889y, this.f890z), this.f880p.get(), this.f887w, this.f886v);
    }

    /* access modifiers changed from: package-private */
    public l O() {
        return this.f876l;
    }

    /* access modifiers changed from: protected */
    public void Y() {
        this.f884t.a();
        v0.h hVar = this.f887w != null ? new v0.h(this.f876l.p(), this.f876l.e(), this.f887w) : null;
        if (hVar != null) {
            t0.k.b().d(new a(hVar));
        }
        this.f888x = j.c(Status.f755n);
        super.Y();
    }

    /* access modifiers changed from: protected */
    public void g0() {
        this.f888x = null;
        this.f889y = null;
        this.f890z = 0;
        this.A = null;
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        this.f884t.c();
        if (!m0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f876l.l() == null) {
            this.f888x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f888x == null) {
            if (this.f887w == null) {
                r0();
            } else {
                w0(false);
            }
            boolean A0 = A0();
            while (A0) {
                C0();
                A0 = A0();
                if (A0) {
                    m0(4, false);
                }
            }
            if (this.f885u && I() != 16) {
                try {
                    this.f879o.c();
                } catch (IOException e4) {
                    Log.e("UploadTask", "Unable to close stream.", e4);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void j0() {
        t0.k.b().f(K());
    }

    /* access modifiers changed from: package-private */
    public long t0() {
        return this.f878n;
    }
}
