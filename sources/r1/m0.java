package r1;

import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import n1.i;
import o1.k;

public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f2722a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public k f2723b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public k f2724c;

    class a extends HashMap<String, Object> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i.f f2725d;

        a(i.f fVar) {
            this.f2725d = fVar;
            put("orientation", j0.d(fVar));
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f2727d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f2728e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u1.b f2729f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t1.b f2730g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Boolean f2731h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Boolean f2732i;

        b(Integer num, Integer num2, u1.b bVar, t1.b bVar2, Boolean bool, Boolean bool2) {
            this.f2727d = num;
            this.f2728e = num2;
            this.f2729f = bVar;
            this.f2730g = bVar2;
            this.f2731h = bool;
            this.f2732i = bool2;
            put("previewWidth", Double.valueOf(num.doubleValue()));
            put("previewHeight", Double.valueOf(num2.doubleValue()));
            put("exposureMode", bVar.toString());
            put("focusMode", bVar2.toString());
            put("exposurePointSupported", bool);
            put("focusPointSupported", bool2);
        }
    }

    class c extends HashMap<String, Object> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f2734d;

        c(String str) {
            this.f2734d = str;
            if (!TextUtils.isEmpty(str)) {
                put("description", str);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f2736d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f2737e;

        d(f fVar, Map map) {
            this.f2736d = fVar;
            this.f2737e = map;
        }

        public void run() {
            m0.this.f2723b.c(this.f2736d.f2746d, this.f2737e);
        }
    }

    class e implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f2739d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f2740e;

        e(g gVar, Map map) {
            this.f2739d = gVar;
            this.f2740e = map;
        }

        public void run() {
            m0.this.f2724c.c(this.f2739d.f2749d, this.f2740e);
        }
    }

    enum f {
        ERROR("error"),
        CLOSING("camera_closing"),
        INITIALIZED("initialized");
        
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final String f2746d;

        private f(String str) {
            this.f2746d = str;
        }
    }

    enum g {
        ORIENTATION_CHANGED("orientation_changed");
        
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final String f2749d;

        private g(String str) {
            this.f2749d = str;
        }
    }

    m0(o1.c cVar, long j3, Handler handler) {
        this.f2723b = new k(cVar, "plugins.flutter.io/camera_android/camera" + j3);
        this.f2724c = new k(cVar, "plugins.flutter.io/camera_android/fromPlatform");
        this.f2722a = handler;
    }

    private void i(f fVar) {
        j(fVar, new HashMap());
    }

    private void j(f fVar, Map<String, Object> map) {
        if (this.f2723b != null) {
            this.f2722a.post(new d(fVar, map));
        }
    }

    private void k(g gVar, Map<String, Object> map) {
        if (this.f2724c != null) {
            this.f2722a.post(new e(gVar, map));
        }
    }

    public void e(k.d dVar, String str, String str2, Object obj) {
        this.f2722a.post(new l0(dVar, str, str2, obj));
    }

    public void f(k.d dVar, Object obj) {
        this.f2722a.post(new k0(dVar, obj));
    }

    /* access modifiers changed from: package-private */
    public void l() {
        i(f.CLOSING);
    }

    /* access modifiers changed from: package-private */
    public void m(String str) {
        j(f.ERROR, new c(str));
    }

    /* access modifiers changed from: package-private */
    public void n(Integer num, Integer num2, u1.b bVar, t1.b bVar2, Boolean bool, Boolean bool2) {
        j(f.INITIALIZED, new b(num, num2, bVar, bVar2, bool, bool2));
    }

    public void o(i.f fVar) {
        k(g.ORIENTATION_CHANGED, new a(fVar));
    }
}
