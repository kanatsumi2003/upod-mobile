package io.flutter.plugins.firebase.core;

import android.content.Context;
import f0.k;
import f0.n;
import g0.d;
import g1.a;
import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class i implements a, l.d, l.b {

    /* renamed from: a  reason: collision with root package name */
    private Context f1824a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1825b = false;

    private <T> void A(f0.l<T> lVar, l.h<T> hVar) {
        lVar.a().c(new g(hVar));
    }

    private k<l.g> q(d dVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, dVar, lVar));
        return lVar.a();
    }

    private l.f r(g0.k kVar) {
        l.f.a aVar = new l.f.a();
        aVar.b(kVar.b());
        aVar.c(kVar.c());
        if (kVar.f() != null) {
            aVar.e(kVar.f());
        }
        if (kVar.g() != null) {
            aVar.f(kVar.g());
        }
        aVar.d(kVar.d());
        aVar.g(kVar.h());
        aVar.h(kVar.e());
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(String str, f0.l lVar) {
        try {
            try {
                d.o(str).i();
            } catch (IllegalStateException unused) {
            }
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(d dVar, f0.l lVar) {
        try {
            l.g.a aVar = new l.g.a();
            aVar.c(dVar.p());
            aVar.d(r(dVar.q()));
            aVar.b(Boolean.valueOf(dVar.w()));
            aVar.e((Map) n.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(dVar)));
            lVar.c(aVar.a());
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void u(io.flutter.plugins.firebase.core.l.f r3, java.lang.String r4, f0.l r5) {
        /*
            r2 = this;
            g0.k$b r0 = new g0.k$b     // Catch:{ Exception -> 0x0058 }
            r0.<init>()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.b()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.b(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.c()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.c(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.d()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.d(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.e()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.f(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.f()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.g(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r3.g()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r0 = r0.h(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = r3.h()     // Catch:{ Exception -> 0x0058 }
            g0.k$b r3 = r0.e(r3)     // Catch:{ Exception -> 0x0058 }
            g0.k r3 = r3.a()     // Catch:{ Exception -> 0x0058 }
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            android.content.Context r0 = r2.f1824a     // Catch:{ Exception -> 0x0058 }
            g0.d r3 = g0.d.v(r0, r3, r4)     // Catch:{ Exception -> 0x0058 }
            f0.k r3 = r2.q(r3)     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r3 = f0.n.a(r3)     // Catch:{ Exception -> 0x0058 }
            io.flutter.plugins.firebase.core.l$g r3 = (io.flutter.plugins.firebase.core.l.g) r3     // Catch:{ Exception -> 0x0058 }
            r5.c(r3)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r3 = move-exception
            r5.b(r3)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.core.i.u(io.flutter.plugins.firebase.core.l$f, java.lang.String, f0.l):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(f0.l lVar) {
        try {
            if (!this.f1825b) {
                this.f1825b = true;
            } else {
                n.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<d> m3 = d.m(this.f1824a);
            ArrayList arrayList = new ArrayList(m3.size());
            for (d q3 : m3) {
                arrayList.add((l.g) n.a(q(q3)));
            }
            lVar.c(arrayList);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(l.h hVar, k kVar) {
        if (kVar.n()) {
            hVar.a(kVar.k());
        } else {
            hVar.b(kVar.j());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(f0.l lVar) {
        try {
            g0.k a4 = g0.k.a(this.f1824a);
            if (a4 == null) {
                lVar.c(null);
            } else {
                lVar.c(r(a4));
            }
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y(String str, Boolean bool, f0.l lVar) {
        try {
            d.o(str).E(bool);
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z(String str, Boolean bool, f0.l lVar) {
        try {
            d.o(str).D(bool.booleanValue());
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    public void a(String str, l.f fVar, l.h<l.g> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, fVar, str, lVar));
        A(lVar, hVar);
    }

    public void b(l.h<List<l.g>> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, lVar));
        A(lVar, hVar);
    }

    public void c(l.h<l.f> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, lVar));
        A(lVar, hVar);
    }

    public void d(String str, Boolean bool, l.h<Void> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(str, bool, lVar));
        A(lVar, hVar);
    }

    public void e(String str, Boolean bool, l.h<Void> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(str, bool, lVar));
        A(lVar, hVar);
    }

    public void f(a.b bVar) {
        this.f1824a = null;
        t.e(bVar.b(), (l.d) null);
        p.e(bVar.b(), (l.b) null);
    }

    public void g(String str, l.h<Void> hVar) {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(str, lVar));
        A(lVar, hVar);
    }

    public void h(a.b bVar) {
        t.e(bVar.b(), this);
        p.e(bVar.b(), this);
        this.f1824a = bVar.a();
    }
}
