package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import t0.k;
import v0.e;

public class c extends s<a> {

    /* renamed from: l  reason: collision with root package name */
    private final Uri f900l;

    /* renamed from: m  reason: collision with root package name */
    private long f901m;

    /* renamed from: n  reason: collision with root package name */
    private l f902n;

    /* renamed from: o  reason: collision with root package name */
    private u0.c f903o;

    /* renamed from: p  reason: collision with root package name */
    private long f904p = -1;

    /* renamed from: q  reason: collision with root package name */
    private String f905q = null;

    /* renamed from: r  reason: collision with root package name */
    private volatile Exception f906r = null;

    /* renamed from: s  reason: collision with root package name */
    private long f907s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f908t;

    public class a extends s<a>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f909c;

        a(Exception exc, long j3) {
            super(exc);
            this.f909c = j3;
        }

        public long d() {
            return this.f909c;
        }

        public long e() {
            return c.this.p0();
        }
    }

    c(l lVar, Uri uri) {
        this.f902n = lVar;
        this.f900l = uri;
        d o3 = lVar.o();
        this.f903o = new u0.c(o3.a().l(), o3.c(), o3.b(), o3.j());
    }

    private int o0(InputStream inputStream, byte[] bArr) {
        int read;
        int i3 = 0;
        boolean z3 = false;
        while (i3 != bArr.length && (read = inputStream.read(bArr, i3, bArr.length - i3)) != -1) {
            try {
                z3 = true;
                i3 += read;
            } catch (IOException e4) {
                this.f906r = e4;
            }
        }
        if (z3) {
            return i3;
        }
        return -1;
    }

    private boolean q0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    /* JADX INFO: finally extract failed */
    private boolean r0(e eVar) {
        FileOutputStream fileOutputStream;
        InputStream u3 = eVar.u();
        if (u3 != null) {
            File file = new File(this.f900l.getPath());
            if (!file.exists()) {
                if (this.f907s > 0) {
                    throw new IOException("The file to download to has been deleted.");
                } else if (!file.createNewFile()) {
                    Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
                }
            }
            boolean z3 = true;
            if (this.f907s > 0) {
                Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f907s);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[262144];
                while (z3) {
                    int o02 = o0(u3, bArr);
                    if (o02 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, o02);
                    this.f901m += (long) o02;
                    if (this.f906r != null) {
                        Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f906r);
                        this.f906r = null;
                        z3 = false;
                    }
                    if (!m0(4, false)) {
                        z3 = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                u3.close();
                return z3;
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                u3.close();
                throw th;
            }
        } else {
            this.f906r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public l O() {
        return this.f902n;
    }

    /* access modifiers changed from: protected */
    public void Y() {
        this.f903o.a();
        this.f906r = j.c(Status.f755n);
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        String str;
        if (this.f906r != null) {
            m0(64, false);
        } else if (m0(4, false)) {
            do {
                this.f901m = 0;
                this.f906r = null;
                this.f903o.c();
                v0.c cVar = new v0.c(this.f902n.p(), this.f902n.e(), this.f907s);
                this.f903o.e(cVar, false);
                this.f908t = cVar.p();
                this.f906r = cVar.f() != null ? cVar.f() : this.f906r;
                boolean z3 = true;
                boolean z4 = q0(this.f908t) && this.f906r == null && I() == 4;
                if (z4) {
                    this.f904p = ((long) cVar.s()) + this.f907s;
                    String r3 = cVar.r("ETag");
                    if (TextUtils.isEmpty(r3) || (str = this.f905q) == null || str.equals(r3)) {
                        this.f905q = r3;
                        try {
                            z4 = r0(cVar);
                        } catch (IOException e4) {
                            Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e4);
                            this.f906r = e4;
                        }
                    } else {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f907s = 0;
                        this.f905q = null;
                        cVar.D();
                        j0();
                        return;
                    }
                }
                cVar.D();
                if (!(z4 && this.f906r == null && I() == 4)) {
                    z3 = false;
                }
                if (z3) {
                    m0(128, false);
                    return;
                }
                File file = new File(this.f900l.getPath());
                if (file.exists()) {
                    this.f907s = file.length();
                } else {
                    this.f907s = 0;
                }
                if (I() == 8) {
                    m0(16, false);
                    return;
                } else if (I() == 32) {
                    if (!m0(256, false)) {
                        Log.w("FileDownloadTask", "Unable to change download task to final state from " + I());
                        return;
                    }
                    return;
                }
            } while (this.f901m > 0);
            m0(64, false);
        }
    }

    /* access modifiers changed from: protected */
    public void j0() {
        k.b().e(K());
    }

    /* access modifiers changed from: package-private */
    public long p0() {
        return this.f904p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public a l0() {
        return new a(j.e(this.f906r, this.f908t), this.f901m + this.f907s);
    }
}
