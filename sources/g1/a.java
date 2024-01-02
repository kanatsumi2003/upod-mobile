package g1;

import android.content.Context;
import io.flutter.plugin.platform.h;
import io.flutter.view.u;
import o1.c;

public interface a {

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    public interface C0023a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1285a;

        /* renamed from: b  reason: collision with root package name */
        private final io.flutter.embedding.engine.a f1286b;

        /* renamed from: c  reason: collision with root package name */
        private final c f1287c;

        /* renamed from: d  reason: collision with root package name */
        private final u f1288d;

        /* renamed from: e  reason: collision with root package name */
        private final h f1289e;

        /* renamed from: f  reason: collision with root package name */
        private final C0023a f1290f;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, u uVar, h hVar, C0023a aVar2) {
            this.f1285a = context;
            this.f1286b = aVar;
            this.f1287c = cVar;
            this.f1288d = uVar;
            this.f1289e = hVar;
            this.f1290f = aVar2;
        }

        public Context a() {
            return this.f1285a;
        }

        public c b() {
            return this.f1287c;
        }

        public u c() {
            return this.f1288d;
        }
    }

    void f(b bVar);

    void h(b bVar);
}
