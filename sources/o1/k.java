package o1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import o1.c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final c f2580a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2581b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f2582c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0041c f2583d;

    private final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f2584a;

        /* renamed from: o1.k$a$a  reason: collision with other inner class name */
        class C0043a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f2586a;

            C0043a(c.b bVar) {
                this.f2586a = bVar;
            }

            public void a(Object obj) {
                this.f2586a.a(k.this.f2582c.a(obj));
            }

            public void b(String str, String str2, Object obj) {
                this.f2586a.a(k.this.f2582c.d(str, str2, obj));
            }

            public void c() {
                this.f2586a.a((ByteBuffer) null);
            }
        }

        a(c cVar) {
            this.f2584a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f2584a.a(k.this.f2582c.e(byteBuffer), new C0043a(bVar));
            } catch (RuntimeException e4) {
                b1.b.c("MethodChannel#" + k.this.f2581b, "Failed to handle method call", e4);
                bVar.a(k.this.f2582c.c("error", e4.getMessage(), (Object) null, b(e4)));
            }
        }
    }

    private final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final d f2588a;

        b(d dVar) {
            this.f2588a = dVar;
        }

        public void a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f2588a.c();
                } catch (RuntimeException e4) {
                    b1.b.c("MethodChannel#" + k.this.f2581b, "Failed to handle method call result", e4);
                }
            } else {
                try {
                    this.f2588a.a(k.this.f2582c.f(byteBuffer));
                } catch (e e5) {
                    this.f2588a.b(e5.f2574d, e5.getMessage(), e5.f2575e);
                }
            }
        }
    }

    public interface c {
        void a(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(c cVar, String str) {
        this(cVar, str, r.f2593b);
    }

    public k(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0041c) null);
    }

    public k(c cVar, String str, l lVar, c.C0041c cVar2) {
        this.f2580a = cVar;
        this.f2581b = str;
        this.f2582c = lVar;
        this.f2583d = cVar2;
    }

    public void c(String str, Object obj) {
        d(str, obj, (d) null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f2580a.f(this.f2581b, this.f2582c.b(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        a aVar = null;
        if (this.f2583d != null) {
            c cVar2 = this.f2580a;
            String str = this.f2581b;
            if (cVar != null) {
                aVar = new a(cVar);
            }
            cVar2.d(str, aVar, this.f2583d);
            return;
        }
        c cVar3 = this.f2580a;
        String str2 = this.f2581b;
        if (cVar != null) {
            aVar = new a(cVar);
        }
        cVar3.c(str2, aVar);
    }
}
