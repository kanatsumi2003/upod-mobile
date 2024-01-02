package c1;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import j2.f;
import java.nio.ByteBuffer;
import java.util.List;
import o1.c;
import o1.s;

public class a implements o1.c {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f638a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f639b;

    /* renamed from: c  reason: collision with root package name */
    private final c f640c;

    /* renamed from: d  reason: collision with root package name */
    private final o1.c f641d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f642e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f643f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f644g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f645h;

    /* renamed from: c1.a$a  reason: collision with other inner class name */
    class C0011a implements c.a {
        C0011a() {
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            String unused = a.this.f643f = s.f2596b.b(byteBuffer);
            if (a.this.f644g != null) {
                a.this.f644g.a(a.this.f643f);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f647a;

        /* renamed from: b  reason: collision with root package name */
        public final String f648b;

        /* renamed from: c  reason: collision with root package name */
        public final String f649c;

        public b(String str, String str2) {
            this.f647a = str;
            this.f648b = null;
            this.f649c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f647a = str;
            this.f648b = str2;
            this.f649c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f647a.equals(bVar.f647a)) {
                return false;
            }
            return this.f649c.equals(bVar.f649c);
        }

        public int hashCode() {
            return (this.f647a.hashCode() * 31) + this.f649c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f647a + ", function: " + this.f649c + " )";
        }
    }

    private static class c implements o1.c {

        /* renamed from: a  reason: collision with root package name */
        private final c f650a;

        private c(c cVar) {
            this.f650a = cVar;
        }

        /* synthetic */ c(c cVar, C0011a aVar) {
            this(cVar);
        }

        public c.C0041c a(c.d dVar) {
            return this.f650a.a(dVar);
        }

        public /* synthetic */ c.C0041c b() {
            return o1.b.a(this);
        }

        public void c(String str, c.a aVar) {
            this.f650a.c(str, aVar);
        }

        public void d(String str, c.a aVar, c.C0041c cVar) {
            this.f650a.d(str, aVar, cVar);
        }

        public void e(String str, ByteBuffer byteBuffer) {
            this.f650a.f(str, byteBuffer, (c.b) null);
        }

        public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f650a.f(str, byteBuffer, bVar);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C0011a aVar = new C0011a();
        this.f645h = aVar;
        this.f638a = flutterJNI;
        this.f639b = assetManager;
        c cVar = new c(flutterJNI);
        this.f640c = cVar;
        cVar.c("flutter/isolate", aVar);
        this.f641d = new c(cVar, (C0011a) null);
        if (flutterJNI.isAttached()) {
            this.f642e = true;
        }
    }

    @Deprecated
    public c.C0041c a(c.d dVar) {
        return this.f641d.a(dVar);
    }

    public /* synthetic */ c.C0041c b() {
        return o1.b.a(this);
    }

    @Deprecated
    public void c(String str, c.a aVar) {
        this.f641d.c(str, aVar);
    }

    @Deprecated
    public void d(String str, c.a aVar, c.C0041c cVar) {
        this.f641d.d(str, aVar, cVar);
    }

    @Deprecated
    public void e(String str, ByteBuffer byteBuffer) {
        this.f641d.e(str, byteBuffer);
    }

    @Deprecated
    public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f641d.f(str, byteBuffer, bVar);
    }

    public void j(b bVar, List<String> list) {
        if (this.f642e) {
            b1.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        f.a("DartExecutor#executeDartEntrypoint");
        try {
            b1.b.e("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f638a.runBundleAndSnapshotFromLibrary(bVar.f647a, bVar.f649c, bVar.f648b, this.f639b, list);
            this.f642e = true;
        } finally {
            f.b();
        }
    }

    public String k() {
        return this.f643f;
    }

    public boolean l() {
        return this.f642e;
    }

    public void m() {
        if (this.f638a.isAttached()) {
            this.f638a.notifyLowMemoryWarning();
        }
    }

    public void n() {
        b1.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f638a.setPlatformMessageHandler(this.f640c);
    }

    public void o() {
        b1.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f638a.setPlatformMessageHandler((f) null);
    }
}
