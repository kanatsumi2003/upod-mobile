package v0;

import android.net.Uri;
import g0.d;
import u0.h;

public class g extends f {

    /* renamed from: n  reason: collision with root package name */
    private final Uri f3133n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f3134o;

    /* renamed from: p  reason: collision with root package name */
    private final long f3135p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f3136q;

    /* renamed from: r  reason: collision with root package name */
    private final int f3137r;

    public g(h hVar, d dVar, Uri uri, byte[] bArr, long j3, int i3, boolean z3) {
        super(hVar, dVar);
        if (bArr == null && i3 != -1) {
            this.f3123a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j3 < 0) {
            this.f3123a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f3137r = i3;
        this.f3133n = uri;
        this.f3134o = i3 <= 0 ? null : bArr;
        this.f3135p = j3;
        this.f3136q = z3;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", (!z3 || i3 <= 0) ? z3 ? "finalize" : "upload" : "upload, finalize");
        super.H("X-Goog-Upload-Offset", Long.toString(j3));
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    public byte[] i() {
        return this.f3134o;
    }

    /* access modifiers changed from: protected */
    public int j() {
        int i3 = this.f3137r;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    public Uri v() {
        return this.f3133n;
    }
}
