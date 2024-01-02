package o1;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o1.c;

public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f2565a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f2566b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f2567c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0041c f2568d;

    public interface b {
        void a(Object obj);
    }

    private final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0042d f2569a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<b> f2570b = new AtomicReference<>((Object) null);

        private final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final AtomicBoolean f2572a;

            private a() {
                this.f2572a = new AtomicBoolean(false);
            }

            public void a(Object obj) {
                if (!this.f2572a.get() && c.this.f2570b.get() == this) {
                    d.this.f2565a.e(d.this.f2566b, d.this.f2567c.a(obj));
                }
            }
        }

        c(C0042d dVar) {
            this.f2569a = dVar;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer byteBuffer;
            if (this.f2570b.getAndSet((Object) null) != null) {
                try {
                    this.f2569a.b(obj);
                    bVar.a(d.this.f2567c.a((Object) null));
                } catch (RuntimeException e4) {
                    b1.b.c("EventChannel#" + d.this.f2566b, "Failed to close event stream", e4);
                    byteBuffer = d.this.f2567c.d("error", e4.getMessage(), (Object) null);
                }
            } else {
                byteBuffer = d.this.f2567c.d("error", "No active stream to cancel", (Object) null);
                bVar.a(byteBuffer);
            }
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f2570b.getAndSet(aVar) != null) {
                try {
                    this.f2569a.b((Object) null);
                } catch (RuntimeException e4) {
                    b1.b.c("EventChannel#" + d.this.f2566b, "Failed to close existing event stream", e4);
                }
            }
            try {
                this.f2569a.a(obj, aVar);
                bVar.a(d.this.f2567c.a((Object) null));
            } catch (RuntimeException e5) {
                this.f2570b.set((Object) null);
                b1.b.c("EventChannel#" + d.this.f2566b, "Failed to open event stream", e5);
                bVar.a(d.this.f2567c.d("error", e5.getMessage(), (Object) null));
            }
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e4 = d.this.f2567c.e(byteBuffer);
            if (e4.f2578a.equals("listen")) {
                d(e4.f2579b, bVar);
            } else if (e4.f2578a.equals("cancel")) {
                c(e4.f2579b, bVar);
            } else {
                bVar.a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: o1.d$d  reason: collision with other inner class name */
    public interface C0042d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public d(c cVar, String str) {
        this(cVar, str, r.f2593b);
    }

    public d(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0041c) null);
    }

    public d(c cVar, String str, l lVar, c.C0041c cVar2) {
        this.f2565a = cVar;
        this.f2566b = str;
        this.f2567c = lVar;
        this.f2568d = cVar2;
    }

    public void d(C0042d dVar) {
        c cVar = null;
        if (this.f2568d != null) {
            c cVar2 = this.f2565a;
            String str = this.f2566b;
            if (dVar != null) {
                cVar = new c(dVar);
            }
            cVar2.d(str, cVar, this.f2568d);
            return;
        }
        c cVar3 = this.f2565a;
        String str2 = this.f2566b;
        if (dVar != null) {
            cVar = new c(dVar);
        }
        cVar3.c(str2, cVar);
    }
}
