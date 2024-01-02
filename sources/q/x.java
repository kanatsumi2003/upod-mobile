package q;

import android.content.Context;
import android.util.Log;

final class x {

    /* renamed from: a  reason: collision with root package name */
    static final v f2650a = new p(t.b("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final v f2651b = new q(t.b("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final v f2652c = new r(t.b("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final v f2653d = new s(t.b("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2654e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static Context f2655f;

    static synchronized void a(Context context) {
        synchronized (x.class) {
            if (f2655f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f2655f = context.getApplicationContext();
            }
        }
    }
}
