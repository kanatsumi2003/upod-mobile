package v0;

import android.net.Uri;
import g0.d;
import u0.h;

public class i extends f {

    /* renamed from: n  reason: collision with root package name */
    private final Uri f3140n;

    public i(h hVar, d dVar, Uri uri) {
        super(hVar, dVar);
        this.f3140n = uri;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "query");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    public Uri v() {
        return this.f3140n;
    }
}
