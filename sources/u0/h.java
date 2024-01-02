package u0;

import android.net.Uri;
import n0.a;
import v0.e;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f3102a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3103b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f3104c;

    public h(Uri uri, a aVar) {
        Uri uri2;
        this.f3104c = uri;
        if (aVar == null) {
            uri2 = e.f3120k;
        } else {
            uri2 = Uri.parse("http://" + aVar.a() + ":" + aVar.b() + "/v0");
        }
        this.f3102a = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String a4 = d.a(uri.getPath());
        if (a4.length() > 0 && !"/".equals(a4)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(a4);
        }
        this.f3103b = appendEncodedPath.build();
    }

    public Uri a() {
        return this.f3104c;
    }

    public Uri b() {
        return this.f3102a;
    }

    public Uri c() {
        return this.f3103b;
    }
}
