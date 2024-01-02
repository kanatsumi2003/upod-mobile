package n1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.j;
import o1.k;
import o1.r;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final k f2365a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public d1.a f2366b = b1.a.e().a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<k.d>> f2367c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final k.c f2368d;

    class a implements k.c {
        a() {
        }

        public void a(j jVar, k.d dVar) {
            String str;
            if (b.this.f2366b != null) {
                String str2 = jVar.f2578a;
                Map map = (Map) jVar.b();
                b1.b.e("DeferredComponentChannel", "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c4 = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c4 = 2;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        b.this.f2366b.b(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = b.this.f2366b.a(intValue, str3);
                        break;
                    case 2:
                        b.this.f2366b.f(intValue, str3);
                        if (!b.this.f2367c.containsKey(str3)) {
                            b.this.f2367c.put(str3, new ArrayList());
                        }
                        ((List) b.this.f2367c.get(str3)).add(dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
                dVar.a(str);
            }
        }
    }

    public b(c1.a aVar) {
        a aVar2 = new a();
        this.f2368d = aVar2;
        k kVar = new k(aVar, "flutter/deferredcomponent", r.f2593b);
        this.f2365a = kVar;
        kVar.e(aVar2);
    }

    public void c(d1.a aVar) {
        this.f2366b = aVar;
    }
}
