package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import e1.d;
import io.flutter.plugin.platform.s;
import java.util.HashSet;
import java.util.Set;
import n1.e;
import n1.f;
import n1.g;
import n1.h;
import n1.i;
import n1.l;
import n1.m;
import n1.n;
import n1.o;
import n1.p;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f1582a;

    /* renamed from: b  reason: collision with root package name */
    private final m1.a f1583b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.a f1584c;

    /* renamed from: d  reason: collision with root package name */
    private final c f1585d;

    /* renamed from: e  reason: collision with root package name */
    private final p1.b f1586e;

    /* renamed from: f  reason: collision with root package name */
    private final n1.a f1587f;

    /* renamed from: g  reason: collision with root package name */
    private final n1.b f1588g;

    /* renamed from: h  reason: collision with root package name */
    private final e f1589h;

    /* renamed from: i  reason: collision with root package name */
    private final f f1590i;

    /* renamed from: j  reason: collision with root package name */
    private final g f1591j;

    /* renamed from: k  reason: collision with root package name */
    private final h f1592k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final l f1593l;

    /* renamed from: m  reason: collision with root package name */
    private final i f1594m;

    /* renamed from: n  reason: collision with root package name */
    private final m f1595n;

    /* renamed from: o  reason: collision with root package name */
    private final n f1596o;

    /* renamed from: p  reason: collision with root package name */
    private final o f1597p;

    /* renamed from: q  reason: collision with root package name */
    private final p f1598q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final s f1599r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Set<b> f1600s;

    /* renamed from: t  reason: collision with root package name */
    private final b f1601t;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    class C0025a implements b {
        C0025a() {
        }

        public void a() {
        }

        public void b() {
            b1.b.e("FlutterEngine", "onPreEngineRestart()");
            for (b b4 : a.this.f1600s) {
                b4.b();
            }
            a.this.f1599r.Z();
            a.this.f1593l.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, s sVar, String[] strArr, boolean z3, boolean z4) {
        AssetManager assetManager;
        this.f1600s = new HashSet();
        this.f1601t = new C0025a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        b1.a e4 = b1.a.e();
        flutterJNI = flutterJNI == null ? e4.d().a() : flutterJNI;
        this.f1582a = flutterJNI;
        c1.a aVar = new c1.a(flutterJNI, assetManager);
        this.f1584c = aVar;
        aVar.n();
        d1.a a4 = b1.a.e().a();
        this.f1587f = new n1.a(aVar, flutterJNI);
        n1.b bVar = new n1.b(aVar);
        this.f1588g = bVar;
        this.f1589h = new e(aVar);
        f fVar = new f(aVar);
        this.f1590i = fVar;
        this.f1591j = new g(aVar);
        this.f1592k = new h(aVar);
        this.f1594m = new i(aVar);
        this.f1593l = new l(aVar, z4);
        this.f1595n = new m(aVar);
        this.f1596o = new n(aVar);
        this.f1597p = new o(aVar);
        this.f1598q = new p(aVar);
        if (a4 != null) {
            a4.d(bVar);
        }
        p1.b bVar2 = new p1.b(context, fVar);
        this.f1586e = bVar2;
        dVar = dVar == null ? e4.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.i(context.getApplicationContext());
            dVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f1601t);
        flutterJNI.setPlatformViewsController(sVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        flutterJNI.setDeferredComponentManager(e4.a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.f1583b = new m1.a(flutterJNI);
        this.f1599r = sVar;
        sVar.T();
        this.f1585d = new c(context.getApplicationContext(), this, dVar);
        bVar2.d(context.getResources().getConfiguration());
        if (z3 && dVar.d()) {
            l1.a.a(this);
        }
    }

    public a(Context context, String[] strArr, boolean z3, boolean z4) {
        this(context, (d) null, (FlutterJNI) null, new s(), strArr, z3, z4);
    }

    private void d() {
        b1.b.e("FlutterEngine", "Attaching to JNI.");
        this.f1582a.attachToNative();
        if (!v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean v() {
        return this.f1582a.isAttached();
    }

    public void e() {
        b1.b.e("FlutterEngine", "Destroying.");
        for (b a4 : this.f1600s) {
            a4.a();
        }
        this.f1585d.k();
        this.f1599r.V();
        this.f1584c.o();
        this.f1582a.removeEngineLifecycleListener(this.f1601t);
        this.f1582a.setDeferredComponentManager((d1.a) null);
        this.f1582a.detachFromNativeAndReleaseResources();
        if (b1.a.e().a() != null) {
            b1.a.e().a().e();
            this.f1588g.c((d1.a) null);
        }
    }

    public n1.a f() {
        return this.f1587f;
    }

    public h1.b g() {
        return this.f1585d;
    }

    public c1.a h() {
        return this.f1584c;
    }

    public e i() {
        return this.f1589h;
    }

    public p1.b j() {
        return this.f1586e;
    }

    public g k() {
        return this.f1591j;
    }

    public h l() {
        return this.f1592k;
    }

    public i m() {
        return this.f1594m;
    }

    public s n() {
        return this.f1599r;
    }

    public g1.b o() {
        return this.f1585d;
    }

    public m1.a p() {
        return this.f1583b;
    }

    public l q() {
        return this.f1593l;
    }

    public m r() {
        return this.f1595n;
    }

    public n s() {
        return this.f1596o;
    }

    public o t() {
        return this.f1597p;
    }

    public p u() {
        return this.f1598q;
    }
}
