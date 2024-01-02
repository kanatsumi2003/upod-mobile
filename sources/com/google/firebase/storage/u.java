package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import t.o;
import t0.k;
import v0.e;

public class u extends s<d> {

    /* renamed from: l  reason: collision with root package name */
    private l f997l;

    /* renamed from: m  reason: collision with root package name */
    private u0.c f998m;

    /* renamed from: n  reason: collision with root package name */
    private volatile Exception f999n = null;

    /* renamed from: o  reason: collision with root package name */
    private volatile int f1000o = 0;

    /* renamed from: p  reason: collision with root package name */
    private b f1001p;

    /* renamed from: q  reason: collision with root package name */
    private long f1002q = -1;

    /* renamed from: r  reason: collision with root package name */
    private long f1003r;

    /* renamed from: s  reason: collision with root package name */
    private long f1004s;

    /* renamed from: t  reason: collision with root package name */
    private InputStream f1005t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public e f1006u;

    /* renamed from: v  reason: collision with root package name */
    private String f1007v;

    class a implements Callable<InputStream> {
        a() {
        }

        /* renamed from: a */
        public InputStream call() {
            return u.this.r0();
        }
    }

    public interface b {
        void a(d dVar, InputStream inputStream);
    }

    static class c extends InputStream {

        /* renamed from: d  reason: collision with root package name */
        private u f1009d;

        /* renamed from: e  reason: collision with root package name */
        private InputStream f1010e;

        /* renamed from: f  reason: collision with root package name */
        private Callable<InputStream> f1011f;

        /* renamed from: g  reason: collision with root package name */
        private IOException f1012g;

        /* renamed from: h  reason: collision with root package name */
        private long f1013h;

        /* renamed from: i  reason: collision with root package name */
        private long f1014i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1015j;

        c(Callable<InputStream> callable, u uVar) {
            this.f1009d = uVar;
            this.f1011f = callable;
        }

        private void b() {
            u uVar = this.f1009d;
            if (uVar != null && uVar.I() == 32) {
                throw new a();
            }
        }

        /* access modifiers changed from: private */
        public boolean c() {
            b();
            if (this.f1012g != null) {
                try {
                    InputStream inputStream = this.f1010e;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f1010e = null;
                if (this.f1014i == this.f1013h) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f1012g);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f1013h, this.f1012g);
                this.f1014i = this.f1013h;
                this.f1012g = null;
            }
            if (this.f1015j) {
                throw new IOException("Can't perform operation on closed stream");
            } else if (this.f1010e != null) {
                return true;
            } else {
                try {
                    this.f1010e = this.f1011f.call();
                    return true;
                } catch (Exception e4) {
                    if (e4 instanceof IOException) {
                        throw ((IOException) e4);
                    }
                    throw new IOException("Unable to open stream", e4);
                }
            }
        }

        private void d(long j3) {
            u uVar = this.f1009d;
            if (uVar != null) {
                uVar.t0(j3);
            }
            this.f1013h += j3;
        }

        public int available() {
            while (c()) {
                try {
                    return this.f1010e.available();
                } catch (IOException e4) {
                    this.f1012g = e4;
                }
            }
            throw this.f1012g;
        }

        public void close() {
            InputStream inputStream = this.f1010e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f1015j = true;
            u uVar = this.f1009d;
            if (!(uVar == null || uVar.f1006u == null)) {
                this.f1009d.f1006u.D();
                e unused = this.f1009d.f1006u = null;
            }
            b();
        }

        public void mark(int i3) {
        }

        public boolean markSupported() {
            return false;
        }

        public int read() {
            while (c()) {
                try {
                    int read = this.f1010e.read();
                    if (read != -1) {
                        d(1);
                    }
                    return read;
                } catch (IOException e4) {
                    this.f1012g = e4;
                }
            }
            throw this.f1012g;
        }

        public int read(byte[] bArr, int i3, int i4) {
            int i5 = 0;
            while (c()) {
                while (((long) i4) > 262144) {
                    try {
                        int read = this.f1010e.read(bArr, i3, 262144);
                        if (read != -1) {
                            i5 += read;
                            i3 += read;
                            i4 -= read;
                            d((long) read);
                            b();
                        } else if (i5 == 0) {
                            return -1;
                        } else {
                            return i5;
                        }
                    } catch (IOException e4) {
                        this.f1012g = e4;
                    }
                }
                if (i4 > 0) {
                    int read2 = this.f1010e.read(bArr, i3, i4);
                    if (read2 != -1) {
                        i3 += read2;
                        i5 += read2;
                        i4 -= read2;
                        d((long) read2);
                    } else if (i5 == 0) {
                        return -1;
                    } else {
                        return i5;
                    }
                }
                if (i4 == 0) {
                    return i5;
                }
            }
            throw this.f1012g;
        }

        public long skip(long j3) {
            long j4 = 0;
            while (c()) {
                while (j3 > 262144) {
                    try {
                        long skip = this.f1010e.skip(262144);
                        if (skip >= 0) {
                            j4 += skip;
                            j3 -= skip;
                            d(skip);
                            b();
                        } else if (j4 == 0) {
                            return -1;
                        } else {
                            return j4;
                        }
                    } catch (IOException e4) {
                        this.f1012g = e4;
                    }
                }
                if (j3 > 0) {
                    long skip2 = this.f1010e.skip(j3);
                    if (skip2 >= 0) {
                        j4 += skip2;
                        j3 -= skip2;
                        d(skip2);
                    } else if (j4 == 0) {
                        return -1;
                    } else {
                        return j4;
                    }
                }
                if (j3 == 0) {
                    return j4;
                }
            }
            throw this.f1012g;
        }
    }

    public class d extends s<d>.b {

        /* renamed from: c  reason: collision with root package name */
        private final long f1016c;

        d(Exception exc, long j3) {
            super(exc);
            this.f1016c = j3;
        }
    }

    u(l lVar) {
        this.f997l = lVar;
        d o3 = lVar.o();
        this.f998m = new u0.c(o3.a().l(), o3.c(), o3.b(), o3.j());
    }

    /* access modifiers changed from: private */
    public InputStream r0() {
        String str;
        this.f998m.c();
        e eVar = this.f1006u;
        if (eVar != null) {
            eVar.D();
        }
        v0.c cVar = new v0.c(this.f997l.p(), this.f997l.e(), this.f1003r);
        this.f1006u = cVar;
        boolean z3 = false;
        this.f998m.e(cVar, false);
        this.f1000o = this.f1006u.p();
        this.f999n = this.f1006u.f() != null ? this.f1006u.f() : this.f999n;
        if (s0(this.f1000o) && this.f999n == null && I() == 4) {
            z3 = true;
        }
        if (z3) {
            String r3 = this.f1006u.r("ETag");
            if (TextUtils.isEmpty(r3) || (str = this.f1007v) == null || str.equals(r3)) {
                this.f1007v = r3;
                this.f1002q = ((long) this.f1006u.s()) + this.f1003r;
                return this.f1006u.u();
            }
            this.f1000o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        throw new IOException("Could not open resulting stream.");
    }

    private boolean s0(int i3) {
        return i3 == 308 || (i3 >= 200 && i3 < 300);
    }

    /* access modifiers changed from: package-private */
    public l O() {
        return this.f997l;
    }

    /* access modifiers changed from: protected */
    public void Y() {
        this.f998m.a();
        this.f999n = j.c(Status.f755n);
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f1004s = this.f1003r;
    }

    public boolean e0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    public boolean h0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        int i3 = 64;
        if (this.f999n != null) {
            m0(64, false);
        } else if (m0(4, false)) {
            c cVar = new c(new a(), this);
            this.f1005t = new BufferedInputStream(cVar);
            try {
                boolean unused = cVar.c();
                b bVar = this.f1001p;
                if (bVar != null) {
                    try {
                        bVar.a((d) k0(), this.f1005t);
                    } catch (Exception e4) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e4);
                        this.f999n = e4;
                    }
                }
            } catch (IOException e5) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e5);
                this.f999n = e5;
            }
            if (this.f1005t == null) {
                this.f1006u.D();
                this.f1006u = null;
            }
            if (this.f999n == null && I() == 4) {
                m0(4, false);
                m0(128, false);
                return;
            }
            if (I() == 32) {
                i3 = 256;
            }
            if (!m0(i3, false)) {
                Log.w("StreamDownloadTask", "Unable to change download task to final state from " + I());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void j0() {
        k.b().e(K());
    }

    /* access modifiers changed from: package-private */
    public void t0(long j3) {
        long j4 = this.f1003r + j3;
        this.f1003r = j4;
        if (this.f1004s + 262144 > j4) {
            return;
        }
        if (I() == 4) {
            m0(4, false);
        } else {
            this.f1004s = this.f1003r;
        }
    }

    /* access modifiers changed from: package-private */
    public u u0(b bVar) {
        o.h(bVar);
        o.j(this.f1001p == null);
        this.f1001p = bVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public d l0() {
        return new d(j.e(this.f999n, this.f1000o), this.f1004s);
    }
}
