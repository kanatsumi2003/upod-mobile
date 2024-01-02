package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.d;
import c1.a;
import io.flutter.plugin.platform.e;
import j2.i;
import java.util.Arrays;
import java.util.List;

class e implements c<Activity> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f1473a;

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.engine.a f1474b;

    /* renamed from: c  reason: collision with root package name */
    u f1475c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.plugin.platform.e f1476d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f1477e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1478f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1479g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f1480h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1481i;

    /* renamed from: j  reason: collision with root package name */
    private final m1.b f1482j = new a();

    class a implements m1.b {
        a() {
        }

        public void c() {
            e.this.f1473a.c();
            boolean unused = e.this.f1479g = false;
        }

        public void f() {
            e.this.f1473a.f();
            boolean unused = e.this.f1479g = true;
            boolean unused2 = e.this.f1480h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f1484a;

        b(u uVar) {
            this.f1484a = uVar;
        }

        public boolean onPreDraw() {
            if (e.this.f1479g && e.this.f1477e != null) {
                this.f1484a.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f1477e = null;
            }
            return e.this.f1479g;
        }
    }

    interface c extends e.d {
        i0 A();

        void B(l lVar);

        void C(io.flutter.embedding.engine.a aVar);

        d a();

        void c();

        Activity d();

        void e();

        void f();

        String g();

        Context getContext();

        List<String> j();

        boolean k();

        boolean l();

        boolean m();

        String n();

        boolean o();

        String p();

        void q(io.flutter.embedding.engine.a aVar);

        String r();

        io.flutter.plugin.platform.e s(Activity activity, io.flutter.embedding.engine.a aVar);

        void t(k kVar);

        String u();

        boolean v();

        io.flutter.embedding.engine.e w();

        f0 x();

        h0 y();

        io.flutter.embedding.engine.a z(Context context);
    }

    e(c cVar) {
        this.f1473a = cVar;
        this.f1480h = false;
    }

    private void g(u uVar) {
        if (this.f1473a.x() == f0.surface) {
            if (this.f1477e != null) {
                uVar.getViewTreeObserver().removeOnPreDrawListener(this.f1477e);
            }
            this.f1477e = new b(uVar);
            uVar.getViewTreeObserver().addOnPreDrawListener(this.f1477e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    private void h() {
        String str;
        if (this.f1473a.n() == null && !this.f1474b.h().l()) {
            String g3 = this.f1473a.g();
            if (g3 == null && (g3 = n(this.f1473a.d().getIntent())) == null) {
                g3 = "/";
            }
            String r3 = this.f1473a.r();
            if (("Executing Dart entrypoint: " + this.f1473a.p() + ", library uri: " + r3) == null) {
                str = "\"\"";
            } else {
                str = r3 + ", and sending initial route: " + g3;
            }
            b1.b.e("FlutterActivityAndFragmentDelegate", str);
            this.f1474b.l().c(g3);
            String u3 = this.f1473a.u();
            if (u3 == null || u3.isEmpty()) {
                u3 = b1.a.e().c().f();
            }
            this.f1474b.h().j(r3 == null ? new a.b(u3, this.f1473a.p()) : new a.b(u3, r3, this.f1473a.p()), this.f1473a.j());
        }
    }

    private void i() {
        if (this.f1473a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String n(Intent intent) {
        Uri data;
        String path;
        if (!this.f1473a.v() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* access modifiers changed from: package-private */
    public void A(Bundle bundle) {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        i();
        if (this.f1473a.o()) {
            bundle.putByteArray("framework", this.f1474b.q().h());
        }
        if (this.f1473a.k()) {
            Bundle bundle2 = new Bundle();
            this.f1474b.g().d(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        i();
        h();
        this.f1475c.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public void C() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        i();
        if (this.f1473a.m()) {
            this.f1474b.i().c();
        }
        this.f1475c.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void D(int i3) {
        i();
        io.flutter.embedding.engine.a aVar = this.f1474b;
        if (aVar != null) {
            if (this.f1480h && i3 >= 10) {
                aVar.h().m();
                this.f1474b.t().a();
            }
            this.f1474b.p().n(i3);
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        i();
        if (this.f1474b != null) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f1474b.g().e();
            return;
        }
        b1.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.f1473a = null;
        this.f1474b = null;
        this.f1475c = null;
        this.f1476d = null;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String n3 = this.f1473a.n();
        if (n3 != null) {
            io.flutter.embedding.engine.a a4 = io.flutter.embedding.engine.b.b().a(n3);
            this.f1474b = a4;
            this.f1478f = true;
            if (a4 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + n3 + "'");
            }
            return;
        }
        c cVar = this.f1473a;
        io.flutter.embedding.engine.a z3 = cVar.z(cVar.getContext());
        this.f1474b = z3;
        if (z3 != null) {
            this.f1478f = true;
            return;
        }
        b1.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f1474b = new io.flutter.embedding.engine.a(this.f1473a.getContext(), this.f1473a.w().b(), false, this.f1473a.o());
        this.f1478f = false;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        io.flutter.plugin.platform.e eVar = this.f1476d;
        if (eVar != null) {
            eVar.A();
        }
    }

    public void e() {
        if (!this.f1473a.l()) {
            this.f1473a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f1473a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: j */
    public Activity f() {
        Activity d4 = this.f1473a.d();
        if (d4 != null) {
            return d4;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* access modifiers changed from: package-private */
    public io.flutter.embedding.engine.a k() {
        return this.f1474b;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f1481i;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f1478f;
    }

    /* access modifiers changed from: package-private */
    public void o(int i3, int i4, Intent intent) {
        i();
        if (this.f1474b != null) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i3 + "\nresultCode: " + i4 + "\ndata: " + intent);
            this.f1474b.g().a(i3, i4, intent);
            return;
        }
        b1.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void p(Context context) {
        i();
        if (this.f1474b == null) {
            G();
        }
        if (this.f1473a.k()) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f1474b.g().g(this, this.f1473a.a());
        }
        c cVar = this.f1473a;
        this.f1476d = cVar.s(cVar.d(), this.f1474b);
        this.f1473a.C(this.f1474b);
        this.f1481i = true;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        i();
        if (this.f1474b != null) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f1474b.l().a();
            return;
        }
        b1.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i3, boolean z3) {
        u uVar;
        b1.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        i();
        boolean z4 = true;
        if (this.f1473a.x() == f0.surface) {
            Context context = this.f1473a.getContext();
            if (this.f1473a.A() != i0.transparent) {
                z4 = false;
            }
            k kVar = new k(context, z4);
            this.f1473a.t(kVar);
            uVar = new u(this.f1473a.getContext(), kVar);
        } else {
            l lVar = new l(this.f1473a.getContext());
            if (this.f1473a.A() != i0.opaque) {
                z4 = false;
            }
            lVar.setOpaque(z4);
            this.f1473a.B(lVar);
            uVar = new u(this.f1473a.getContext(), lVar);
        }
        this.f1475c = uVar;
        this.f1475c.l(this.f1482j);
        b1.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f1475c.n(this.f1474b);
        this.f1475c.setId(i3);
        h0 y3 = this.f1473a.y();
        if (y3 != null) {
            b1.b.f("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.f1473a.getContext());
            flutterSplashView.setId(i.d(486947586));
            flutterSplashView.g(this.f1475c, y3);
            return flutterSplashView;
        }
        if (z3) {
            g(this.f1475c);
        }
        return this.f1475c;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        i();
        if (this.f1477e != null) {
            this.f1475c.getViewTreeObserver().removeOnPreDrawListener(this.f1477e);
            this.f1477e = null;
        }
        this.f1475c.s();
        this.f1475c.z(this.f1482j);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        i();
        this.f1473a.q(this.f1474b);
        if (this.f1473a.k()) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f1473a.d().isChangingConfigurations()) {
                this.f1474b.g().h();
            } else {
                this.f1474b.g().i();
            }
        }
        io.flutter.plugin.platform.e eVar = this.f1476d;
        if (eVar != null) {
            eVar.o();
            this.f1476d = null;
        }
        if (this.f1473a.m()) {
            this.f1474b.i().a();
        }
        if (this.f1473a.l()) {
            this.f1474b.e();
            if (this.f1473a.n() != null) {
                io.flutter.embedding.engine.b.b().d(this.f1473a.n());
            }
            this.f1474b = null;
        }
        this.f1481i = false;
    }

    /* access modifiers changed from: package-private */
    public void u(Intent intent) {
        i();
        if (this.f1474b != null) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
            this.f1474b.g().b(intent);
            String n3 = n(intent);
            if (n3 != null && !n3.isEmpty()) {
                this.f1474b.l().b(n3);
                return;
            }
            return;
        }
        b1.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void v() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        i();
        if (this.f1473a.m()) {
            this.f1474b.i().b();
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        i();
        if (this.f1474b != null) {
            H();
        } else {
            b1.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i3, String[] strArr, int[] iArr) {
        i();
        if (this.f1474b != null) {
            b1.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i3 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f1474b.g().onRequestPermissionsResult(i3, strArr, iArr);
            return;
        }
        b1.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void y(Bundle bundle) {
        Bundle bundle2;
        b1.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f1473a.o()) {
            this.f1474b.q().j(bArr);
        }
        if (this.f1473a.k()) {
            this.f1474b.g().c(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        b1.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        i();
        if (this.f1473a.m()) {
            this.f1474b.i().d();
        }
    }
}
