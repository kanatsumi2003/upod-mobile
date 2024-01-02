package n1;

import java.util.HashMap;
import o1.j;
import o1.k;
import o1.r;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final k f2379a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f2380b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f2381c;

    class a implements k.c {
        a() {
        }

        public void a(j jVar, k.d dVar) {
            if (g.this.f2380b != null) {
                String str = jVar.f2578a;
                b1.b.e("MouseCursorChannel", "Received '" + str + "' message.");
                char c4 = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c4 = 0;
                        }
                    }
                    if (c4 == 0) {
                        try {
                            g.this.f2380b.a((String) ((HashMap) jVar.f2579b).get("kind"));
                            dVar.a(Boolean.TRUE);
                        } catch (Exception e4) {
                            dVar.b("error", "Error when setting cursors: " + e4.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e5) {
                    dVar.b("error", "Unhandled error: " + e5.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public g(c1.a aVar) {
        a aVar2 = new a();
        this.f2381c = aVar2;
        k kVar = new k(aVar, "flutter/mousecursor", r.f2593b);
        this.f2379a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f2380b = bVar;
    }
}
