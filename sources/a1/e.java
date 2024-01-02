package a1;

import o1.j;
import o1.k;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    final j f27a;

    /* renamed from: b  reason: collision with root package name */
    final a f28b;

    class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final k.d f29a;

        a(k.d dVar) {
            this.f29a = dVar;
        }

        public void a(Object obj) {
            this.f29a.a(obj);
        }

        public void b(String str, String str2, Object obj) {
            this.f29a.b(str, str2, obj);
        }
    }

    public e(j jVar, k.d dVar) {
        this.f27a = jVar;
        this.f28b = new a(dVar);
    }

    public <T> T c(String str) {
        return this.f27a.a(str);
    }

    public g k() {
        return this.f28b;
    }
}
