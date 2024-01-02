package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import c.f;
import e.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d extends ComponentActivity implements b.C0017b, b.d {

    /* renamed from: h  reason: collision with root package name */
    final f f255h = f.b(new a());

    /* renamed from: i  reason: collision with root package name */
    final h f256i = new h(this);

    /* renamed from: j  reason: collision with root package name */
    boolean f257j;

    /* renamed from: k  reason: collision with root package name */
    boolean f258k;

    /* renamed from: l  reason: collision with root package name */
    boolean f259l = true;

    /* renamed from: m  reason: collision with root package name */
    boolean f260m;

    /* renamed from: n  reason: collision with root package name */
    boolean f261n;

    /* renamed from: o  reason: collision with root package name */
    boolean f262o;

    /* renamed from: p  reason: collision with root package name */
    int f263p;

    /* renamed from: q  reason: collision with root package name */
    f<String> f264q;

    class a extends h<d> implements t, c {
        public a() {
            super(d.this);
        }

        public androidx.lifecycle.d a() {
            return d.this.f256i;
        }

        public View c(int i3) {
            return d.this.findViewById(i3);
        }

        public s d() {
            return d.this.d();
        }

        public boolean e() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public OnBackPressedDispatcher h() {
            return d.this.h();
        }

        public void k(Fragment fragment) {
            d.this.o(fragment);
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public boolean p() {
            return d.this.getWindow() != null;
        }

        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        public void r(Fragment fragment, Intent intent, int i3, Bundle bundle) {
            d.this.r(fragment, intent, i3, bundle);
        }

        public void s() {
            d.this.s();
        }

        /* renamed from: t */
        public d m() {
            return d.this;
        }
    }

    private int g(Fragment fragment) {
        if (this.f264q.j() < 65534) {
            while (this.f264q.f(this.f263p) >= 0) {
                this.f263p = (this.f263p + 1) % 65534;
            }
            int i3 = this.f263p;
            this.f264q.h(i3, fragment.f184e);
            this.f263p = (this.f263p + 1) % 65534;
            return i3;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void j(int i3) {
        if ((i3 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void m() {
        do {
        } while (n(l(), d.b.CREATED));
    }

    private static boolean n(i iVar, d.b bVar) {
        boolean z3 = false;
        for (Fragment next : iVar.e()) {
            if (next != null) {
                if (next.a().b().a(d.b.STARTED)) {
                    next.S.p(bVar);
                    z3 = true;
                }
                if (next.x() != null) {
                    z3 |= n(next.q(), bVar);
                }
            }
        }
        return z3;
    }

    public final void b(int i3) {
        if (!this.f260m && i3 != -1) {
            j(i3);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f257j);
        printWriter.print(" mResumed=");
        printWriter.print(this.f258k);
        printWriter.print(" mStopped=");
        printWriter.print(this.f259l);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f255h.u().b(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public final View k(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f255h.w(view, str, context, attributeSet);
    }

    public i l() {
        return this.f255h.u();
    }

    public void o(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i3, int i4, Intent intent) {
        this.f255h.v();
        int i5 = i3 >> 16;
        if (i5 != 0) {
            int i6 = i5 - 1;
            String d4 = this.f264q.d(i6);
            this.f264q.i(i6);
            if (d4 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t3 = this.f255h.t(d4);
            if (t3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d4);
                return;
            }
            t3.W(i3 & 65535, i4, intent);
            return;
        }
        b.c d5 = b.d();
        if (d5 == null || !d5.a(this, i3, i4, intent)) {
            super.onActivityResult(i3, i4, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f255h.v();
        this.f255h.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f255h.a((Fragment) null);
        if (bundle != null) {
            this.f255h.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f263p = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f264q = new f<>(intArray.length);
                    for (int i3 = 0; i3 < intArray.length; i3++) {
                        this.f264q.h(intArray[i3], stringArray[i3]);
                    }
                }
            }
        }
        if (this.f264q == null) {
            this.f264q = new f<>();
            this.f263p = 0;
        }
        super.onCreate(bundle);
        this.f256i.i(d.a.ON_CREATE);
        this.f255h.f();
    }

    public boolean onCreatePanelMenu(int i3, Menu menu) {
        return i3 == 0 ? super.onCreatePanelMenu(i3, menu) | this.f255h.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i3, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View k3 = k(view, str, context, attributeSet);
        return k3 == null ? super.onCreateView(view, str, context, attributeSet) : k3;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View k3 = k((View) null, str, context, attributeSet);
        return k3 == null ? super.onCreateView(str, context, attributeSet) : k3;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f255h.h();
        this.f256i.i(d.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f255h.i();
    }

    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            return this.f255h.k(menuItem);
        }
        if (i3 != 6) {
            return false;
        }
        return this.f255h.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z3) {
        this.f255h.j(z3);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f255h.v();
    }

    public void onPanelClosed(int i3, Menu menu) {
        if (i3 == 0) {
            this.f255h.l(menu);
        }
        super.onPanelClosed(i3, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f258k = false;
        this.f255h.m();
        this.f256i.i(d.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z3) {
        this.f255h.n(z3);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        q();
    }

    public boolean onPreparePanel(int i3, View view, Menu menu) {
        return i3 == 0 ? p(view, menu) | this.f255h.o(menu) : super.onPreparePanel(i3, view, menu);
    }

    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f255h.v();
        int i4 = (i3 >> 16) & 65535;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String d4 = this.f264q.d(i5);
            this.f264q.i(i5);
            if (d4 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t3 = this.f255h.t(d4);
            if (t3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d4);
                return;
            }
            t3.v0(i3 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f258k = true;
        this.f255h.v();
        this.f255h.s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m();
        this.f256i.i(d.a.ON_STOP);
        Parcelable y3 = this.f255h.y();
        if (y3 != null) {
            bundle.putParcelable("android:support:fragments", y3);
        }
        if (this.f264q.j() > 0) {
            bundle.putInt("android:support:next_request_index", this.f263p);
            int[] iArr = new int[this.f264q.j()];
            String[] strArr = new String[this.f264q.j()];
            for (int i3 = 0; i3 < this.f264q.j(); i3++) {
                iArr[i3] = this.f264q.g(i3);
                strArr[i3] = this.f264q.k(i3);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f259l = false;
        if (!this.f257j) {
            this.f257j = true;
            this.f255h.c();
        }
        this.f255h.v();
        this.f255h.s();
        this.f256i.i(d.a.ON_START);
        this.f255h.q();
    }

    public void onStateNotSaved() {
        this.f255h.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f259l = true;
        m();
        this.f255h.r();
        this.f256i.i(d.a.ON_STOP);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean p(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void q() {
        this.f256i.i(d.a.ON_RESUME);
        this.f255h.p();
    }

    public void r(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i3, Bundle bundle) {
        this.f262o = true;
        if (i3 == -1) {
            try {
                b.f(this, intent, -1, bundle);
            } finally {
                this.f262o = false;
            }
        } else {
            j(i3);
            b.f(this, intent, ((g(fragment) + 1) << 16) + (i3 & 65535), bundle);
            this.f262o = false;
        }
    }

    @Deprecated
    public void s() {
        invalidateOptionsMenu();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i3) {
        if (!this.f262o && i3 != -1) {
            j(i3);
        }
        super.startActivityForResult(intent, i3);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i3, Bundle bundle) {
        if (!this.f262o && i3 != -1) {
            j(i3);
        }
        super.startActivityForResult(intent, i3, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        if (!this.f261n && i3 != -1) {
            j(i3);
        }
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        if (!this.f261n && i3 != -1) {
            j(i3);
        }
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
