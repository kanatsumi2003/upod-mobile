package o1;

import java.nio.ByteBuffer;
import o1.c;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c f2554a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2555b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i<T> f2556c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0041c f2557d;

    private final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f2558a;

        /* renamed from: o1.a$b$a  reason: collision with other inner class name */
        class C0040a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f2560a;

            C0040a(c.b bVar) {
                this.f2560a = bVar;
            }

            public void a(T t3) {
                this.f2560a.a(a.this.f2556c.a(t3));
            }
        }

        private b(d<T> dVar) {
            this.f2558a = dVar;
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f2558a.a(a.this.f2556c.b(byteBuffer), new C0040a(bVar));
            } catch (RuntimeException e4) {
                b1.b.c("BasicMessageChannel#" + a.this.f2555b, "Failed to handle message", e4);
                bVar.a((ByteBuffer) null);
            }
        }
    }

    private final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f2562a;

        private c(e<T> eVar) {
            this.f2562a = eVar;
        }

        public void a(ByteBuffer byteBuffer) {
            try {
                this.f2562a.a(a.this.f2556c.b(byteBuffer));
            } catch (RuntimeException e4) {
                b1.b.c("BasicMessageChannel#" + a.this.f2555b, "Failed to handle message reply", e4);
            }
        }
    }

    public interface d<T> {
        void a(T t3, e<T> eVar);
    }

    public interface e<T> {
        void a(T t3);
    }

    public a(c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, (c.C0041c) null);
    }

    public a(c cVar, String str, i<T> iVar, c.C0041c cVar2) {
        this.f2554a = cVar;
        this.f2555b = str;
        this.f2556c = iVar;
        this.f2557d = cVar2;
    }

    public void c(T t3) {
        d(t3, (e) null);
    }

    public void d(T t3, e<T> eVar) {
        c cVar = this.f2554a;
        String str = this.f2555b;
        ByteBuffer a4 = this.f2556c.a(t3);
        c cVar2 = null;
        if (eVar != null) {
            cVar2 = new c(eVar);
        }
        cVar.f(str, a4, cVar2);
    }

    public void e(d<T> dVar) {
        b bVar = null;
        if (this.f2557d != null) {
            c cVar = this.f2554a;
            String str = this.f2555b;
            if (dVar != null) {
                bVar = new b(dVar);
            }
            cVar.d(str, bVar, this.f2557d);
            return;
        }
        c cVar2 = this.f2554a;
        String str2 = this.f2555b;
        if (dVar != null) {
            bVar = new b(dVar);
        }
        cVar2.c(str2, bVar);
    }
}
