package v0;

import android.net.Uri;
import g0.d;

public class h extends f {

    /* renamed from: o  reason: collision with root package name */
    public static boolean f3138o = false;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f3139n;

    public h(u0.h hVar, d dVar, Uri uri) {
        super(hVar, dVar);
        f3138o = true;
        this.f3139n = uri;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "cancel");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    public Uri v() {
        return this.f3139n;
    }
}
