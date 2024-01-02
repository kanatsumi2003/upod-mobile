package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import b1.b;
import f.a;
import io.flutter.embedding.android.e;
import j2.i;
import java.util.List;

public class d extends Activity implements e.c, g {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1459c = i.d(61938);

    /* renamed from: a  reason: collision with root package name */
    protected e f1460a;

    /* renamed from: b  reason: collision with root package name */
    private h f1461b = new h(this);

    private void D() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void E() {
        if (G() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View F() {
        return this.f1460a.r((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f1459c, x() == f0.surface);
    }

    private Drawable J() {
        try {
            Bundle I = I();
            int i3 = I != null ? I.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i3 != 0) {
                return a.a(getResources(), i3, getTheme());
            }
            return null;
        } catch (Resources.NotFoundException e4) {
            b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e4;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean K() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void L() {
        e eVar = this.f1460a;
        if (eVar != null) {
            eVar.F();
            this.f1460a = null;
        }
    }

    private boolean M(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f1460a;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (eVar.l()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        b.f("FlutterActivity", sb.toString());
        return false;
    }

    private void N() {
        try {
            Bundle I = I();
            if (I != null) {
                int i3 = I.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i3 != -1) {
                    setTheme(i3);
                    return;
                }
                return;
            }
            b.e("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public i0 A() {
        return G() == f.opaque ? i0.opaque : i0.transparent;
    }

    public void B(l lVar) {
    }

    public void C(io.flutter.embedding.engine.a aVar) {
        if (!this.f1460a.m()) {
            l1.a.a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public f G() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    /* access modifiers changed from: protected */
    public io.flutter.embedding.engine.a H() {
        return this.f1460a.k();
    }

    /* access modifiers changed from: protected */
    public Bundle I() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public androidx.lifecycle.d a() {
        return this.f1461b;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public Activity d() {
        return this;
    }

    public void e() {
        b.f("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + H() + " evicted by another attaching activity");
        e eVar = this.f1460a;
        if (eVar != null) {
            eVar.s();
            this.f1460a.t();
        }
    }

    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    public String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public Context getContext() {
        return this;
    }

    public List<String> j() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (n() != null || this.f1460a.m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public boolean m() {
        return true;
    }

    public String n() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public boolean o() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : n() == null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (M("onActivityResult")) {
            this.f1460a.o(i3, i4, intent);
        }
    }

    public void onBackPressed() {
        if (M("onBackPressed")) {
            this.f1460a.q();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        N();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f1460a = eVar;
        eVar.p(this);
        this.f1460a.y(bundle);
        this.f1461b.i(d.a.ON_CREATE);
        E();
        setContentView(F());
        D();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (M("onDestroy")) {
            this.f1460a.s();
            this.f1460a.t();
        }
        L();
        this.f1461b.i(d.a.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (M("onNewIntent")) {
            this.f1460a.u(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (M("onPause")) {
            this.f1460a.v();
        }
        this.f1461b.i(d.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (M("onPostResume")) {
            this.f1460a.w();
        }
    }

    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (M("onRequestPermissionsResult")) {
            this.f1460a.x(i3, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1461b.i(d.a.ON_RESUME);
        if (M("onResume")) {
            this.f1460a.z();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (M("onSaveInstanceState")) {
            this.f1460a.A(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1461b.i(d.a.ON_START);
        if (M("onStart")) {
            this.f1460a.B();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (M("onStop")) {
            this.f1460a.C();
        }
        this.f1461b.i(d.a.ON_STOP);
    }

    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (M("onTrimMemory")) {
            this.f1460a.D(i3);
        }
    }

    public void onUserLeaveHint() {
        if (M("onUserLeaveHint")) {
            this.f1460a.E();
        }
    }

    public String p() {
        try {
            Bundle I = I();
            String string = I != null ? I.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public void q(io.flutter.embedding.engine.a aVar) {
    }

    public String r() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public io.flutter.plugin.platform.e s(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.e(d(), aVar.m(), this);
    }

    public void t(k kVar) {
    }

    public String u() {
        String dataString;
        if (!K() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public boolean v() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public io.flutter.embedding.engine.e w() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    public f0 x() {
        return G() == f.opaque ? f0.surface : f0.texture;
    }

    public h0 y() {
        Drawable J = J();
        if (J != null) {
            return new b(J);
        }
        return null;
    }

    public io.flutter.embedding.engine.a z(Context context) {
        return null;
    }
}
