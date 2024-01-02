package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import e.c;

public class ComponentActivity extends c implements t, androidx.savedstate.b, c {

    /* renamed from: c  reason: collision with root package name */
    private final h f136c = new h(this);

    /* renamed from: d  reason: collision with root package name */
    private final androidx.savedstate.a f137d = androidx.savedstate.a.a(this);

    /* renamed from: e  reason: collision with root package name */
    private s f138e;

    /* renamed from: f  reason: collision with root package name */
    private final OnBackPressedDispatcher f139f = new OnBackPressedDispatcher(new a());

    /* renamed from: g  reason: collision with root package name */
    private int f140g;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f144a;

        /* renamed from: b  reason: collision with root package name */
        s f145b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            int i3 = Build.VERSION.SDK_INT;
            a().a(new e() {
                public void d(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            a().a(new e() {
                public void d(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.d().a();
                    }
                }
            });
            if (i3 <= 23) {
                a().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public d a() {
        return this.f136c;
    }

    public s d() {
        if (getApplication() != null) {
            if (this.f138e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f138e = bVar.f145b;
                }
                if (this.f138e == null) {
                    this.f138e = new s();
                }
            }
            return this.f138e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object f() {
        return null;
    }

    public final OnBackPressedDispatcher h() {
        return this.f139f;
    }

    public final SavedStateRegistry i() {
        return this.f137d.b();
    }

    public void onBackPressed() {
        this.f139f.c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f137d.c(bundle);
        p.f(this);
        int i3 = this.f140g;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object f4 = f();
        s sVar = this.f138e;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f145b;
        }
        if (sVar == null && f4 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f144a = f4;
        bVar2.f145b = sVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        d a4 = a();
        if (a4 instanceof h) {
            ((h) a4).p(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f137d.d(bundle);
    }
}
