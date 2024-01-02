package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.c0;
import io.flutter.embedding.android.j;
import io.flutter.plugin.editing.m;
import io.flutter.view.h;
import j2.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m1.a;
import q1.b;

public class u extends FrameLayout implements b.c, c0.e {

    /* renamed from: a  reason: collision with root package name */
    private k f1528a;

    /* renamed from: b  reason: collision with root package name */
    private l f1529b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public j f1530c;

    /* renamed from: d  reason: collision with root package name */
    m1.c f1531d;

    /* renamed from: e  reason: collision with root package name */
    private m1.c f1532e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Set<m1.b> f1533f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1534g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public io.flutter.embedding.engine.a f1535h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<f> f1536i;

    /* renamed from: j  reason: collision with root package name */
    private q1.b f1537j;

    /* renamed from: k  reason: collision with root package name */
    private m f1538k;

    /* renamed from: l  reason: collision with root package name */
    private io.flutter.plugin.editing.f f1539l;

    /* renamed from: m  reason: collision with root package name */
    private p1.b f1540m;

    /* renamed from: n  reason: collision with root package name */
    private c0 f1541n;

    /* renamed from: o  reason: collision with root package name */
    private a f1542o;

    /* renamed from: p  reason: collision with root package name */
    private h f1543p;

    /* renamed from: q  reason: collision with root package name */
    private TextServicesManager f1544q;

    /* renamed from: r  reason: collision with root package name */
    private j0 f1545r;

    /* renamed from: s  reason: collision with root package name */
    private final a.g f1546s;

    /* renamed from: t  reason: collision with root package name */
    private final h.k f1547t;

    /* renamed from: u  reason: collision with root package name */
    private final ContentObserver f1548u;

    /* renamed from: v  reason: collision with root package name */
    private final m1.b f1549v;

    /* renamed from: w  reason: collision with root package name */
    private final j.a<WindowLayoutInfo> f1550w;

    class a implements h.k {
        a() {
        }

        public void a(boolean z3, boolean z4) {
            u.this.A(z3, z4);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z3) {
            super.onChange(z3);
            if (u.this.f1535h != null) {
                b1.b.e("FlutterView", "System settings changed. Sending user settings to Flutter.");
                u.this.C();
            }
        }
    }

    class c implements m1.b {
        c() {
        }

        public void c() {
            boolean unused = u.this.f1534g = false;
            for (m1.b c4 : u.this.f1533f) {
                c4.c();
            }
        }

        public void f() {
            boolean unused = u.this.f1534g = true;
            for (m1.b f4 : u.this.f1533f) {
                f4.f();
            }
        }
    }

    class d implements j.a<WindowLayoutInfo> {
        d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            u.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m1.a f1555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f1556b;

        e(m1.a aVar, Runnable runnable) {
            this.f1555a = aVar;
            this.f1556b = runnable;
        }

        public void c() {
        }

        public void f() {
            this.f1555a.q(this);
            this.f1556b.run();
            u uVar = u.this;
            if (!(uVar.f1531d instanceof j) && uVar.f1530c != null) {
                u.this.f1530c.a();
            }
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private u(Context context, AttributeSet attributeSet, k kVar) {
        super(context, attributeSet);
        this.f1533f = new HashSet();
        this.f1536i = new HashSet();
        this.f1546s = new a.g();
        this.f1547t = new a();
        this.f1548u = new b(new Handler(Looper.getMainLooper()));
        this.f1549v = new c();
        this.f1550w = new d();
        this.f1528a = kVar;
        this.f1531d = kVar;
        v();
    }

    private u(Context context, AttributeSet attributeSet, l lVar) {
        super(context, attributeSet);
        this.f1533f = new HashSet();
        this.f1536i = new HashSet();
        this.f1546s = new a.g();
        this.f1547t = new a();
        this.f1548u = new b(new Handler(Looper.getMainLooper()));
        this.f1549v = new c();
        this.f1550w = new d();
        this.f1529b = lVar;
        this.f1531d = lVar;
        v();
    }

    public u(Context context, k kVar) {
        this(context, (AttributeSet) null, kVar);
    }

    public u(Context context, l lVar) {
        this(context, (AttributeSet) null, lVar);
    }

    /* access modifiers changed from: private */
    public void A(boolean z3, boolean z4) {
        boolean z5 = false;
        if (!this.f1535h.p().l() && !z3 && !z4) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    private void D() {
        if (!w()) {
            b1.b.f("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f1546s.f2332a = getResources().getDisplayMetrics().density;
        this.f1546s.f2347p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f1535h.p().t(this.f1546s);
    }

    private g o() {
        Context context = getContext();
        int i3 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i3 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int t(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void v() {
        View view;
        b1.b.e("FlutterView", "Initializing FlutterView");
        if (this.f1528a != null) {
            b1.b.e("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f1528a;
        } else if (this.f1529b != null) {
            b1.b.e("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f1529b;
        } else {
            b1.b.e("FlutterView", "Internally using a FlutterImageView.");
            view = this.f1530c;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    public void B(Runnable runnable) {
        j jVar = this.f1530c;
        if (jVar == null) {
            b1.b.e("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        m1.c cVar = this.f1532e;
        if (cVar == null) {
            b1.b.e("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f1531d = cVar;
        this.f1532e = null;
        io.flutter.embedding.engine.a aVar = this.f1535h;
        if (aVar == null) {
            jVar.a();
            runnable.run();
            return;
        }
        m1.a p3 = aVar.p();
        if (p3 == null) {
            this.f1530c.a();
            runnable.run();
            return;
        }
        this.f1531d.b(p3);
        p3.g(new e(p3, runnable));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r3 != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            n1.m$b r0 = n1.m.b.dark
            goto L_0x001c
        L_0x001a:
            n1.m$b r0 = n1.m.b.light
        L_0x001c:
            android.view.textservice.TextServicesManager r3 = r6.f1544q
            if (r3 == 0) goto L_0x0043
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x0041
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.t r4 = new io.flutter.embedding.android.t
            r4.<init>()
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f1544q
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            io.flutter.embedding.engine.a r4 = r6.f1535h
            n1.m r4 = r4.r()
            n1.m$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            n1.m$a r4 = r4.e(r5)
            n1.m$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L_0x0071
            r1 = 1
        L_0x0071:
            n1.m$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            n1.m$a r1 = r1.f(r2)
            n1.m$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.u.C():void");
    }

    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f1538k.j(sparseArray);
    }

    @TargetApi(24)
    public PointerIcon b(int i3) {
        return PointerIcon.getSystemIcon(getContext(), i3);
    }

    public boolean c(KeyEvent keyEvent) {
        return this.f1538k.r(keyEvent);
    }

    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f1535h;
        return aVar != null ? aVar.n().D(view) : super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (w() && this.f1541n.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        h hVar = this.f1543p;
        if (hVar == null || !hVar.C()) {
            return null;
        }
        return this.f1543p;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f1535h;
    }

    public o1.c getBinaryMessenger() {
        return this.f1535h.h();
    }

    public j getCurrentImageSurface() {
        return this.f1530c;
    }

    public boolean j() {
        j jVar = this.f1530c;
        if (jVar != null) {
            return jVar.d();
        }
        return false;
    }

    public void k(f fVar) {
        this.f1536i.add(fVar);
    }

    public void l(m1.b bVar) {
        this.f1533f.add(bVar);
    }

    public void m(j jVar) {
        io.flutter.embedding.engine.a aVar = this.f1535h;
        if (aVar != null) {
            jVar.b(aVar.p());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        b1.b.e("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (w()) {
            if (aVar == this.f1535h) {
                b1.b.e("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                b1.b.e("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f1535h = aVar;
        m1.a p3 = aVar.p();
        this.f1534g = p3.k();
        this.f1531d.b(p3);
        p3.g(this.f1549v);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1537j = new q1.b(this, this.f1535h.k());
        }
        this.f1538k = new m(this, this.f1535h.u(), this.f1535h.n());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f1544q = textServicesManager;
            this.f1539l = new io.flutter.plugin.editing.f(textServicesManager, this.f1535h.s());
        } catch (Exception unused) {
            b1.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f1540m = this.f1535h.j();
        this.f1541n = new c0(this);
        this.f1542o = new a(this.f1535h.p(), false);
        h hVar = new h(this, aVar.f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f1535h.n());
        this.f1543p = hVar;
        hVar.U(this.f1547t);
        A(this.f1543p.C(), this.f1543p.D());
        this.f1535h.n().a(this.f1543p);
        this.f1535h.n().B(this.f1535h.p());
        this.f1538k.q().restartInput(this);
        C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f1548u);
        D();
        aVar.n().C(this);
        for (f b4 : this.f1536i) {
            b4.b(aVar);
        }
        if (this.f1534g) {
            this.f1549v.f();
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 29) {
            Insets a4 = windowInsets.getSystemGestureInsets();
            a.g gVar = this.f1546s;
            gVar.f2343l = a4.top;
            gVar.f2344m = a4.right;
            gVar.f2345n = a4.bottom;
            gVar.f2346o = a4.left;
        }
        boolean z3 = true;
        int i4 = 0;
        boolean z4 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z3 = false;
        }
        if (i3 >= 30) {
            if (z3) {
                i4 = 0 | WindowInsets$Type.navigationBars();
            }
            if (z4) {
                i4 |= WindowInsets$Type.statusBars();
            }
            Insets a5 = windowInsets.getInsets(i4);
            a.g gVar2 = this.f1546s;
            gVar2.f2335d = a5.top;
            gVar2.f2336e = a5.right;
            gVar2.f2337f = a5.bottom;
            gVar2.f2338g = a5.left;
            Insets a6 = windowInsets.getInsets(WindowInsets$Type.ime());
            a.g gVar3 = this.f1546s;
            gVar3.f2339h = a6.top;
            gVar3.f2340i = a6.right;
            gVar3.f2341j = a6.bottom;
            gVar3.f2342k = a6.left;
            Insets a7 = windowInsets.getInsets(WindowInsets$Type.systemGestures());
            a.g gVar4 = this.f1546s;
            gVar4.f2343l = a7.top;
            gVar4.f2344m = a7.right;
            gVar4.f2345n = a7.bottom;
            gVar4.f2346o = a7.left;
            DisplayCutout a8 = windowInsets.getDisplayCutout();
            if (a8 != null) {
                Insets a9 = a8.getWaterfallInsets();
                a.g gVar5 = this.f1546s;
                gVar5.f2335d = Math.max(Math.max(gVar5.f2335d, a9.top), a8.getSafeInsetTop());
                a.g gVar6 = this.f1546s;
                gVar6.f2336e = Math.max(Math.max(gVar6.f2336e, a9.right), a8.getSafeInsetRight());
                a.g gVar7 = this.f1546s;
                gVar7.f2337f = Math.max(Math.max(gVar7.f2337f, a9.bottom), a8.getSafeInsetBottom());
                a.g gVar8 = this.f1546s;
                gVar8.f2338g = Math.max(Math.max(gVar8.f2338g, a9.left), a8.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z3) {
                gVar9 = o();
            }
            this.f1546s.f2335d = z4 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f1546s.f2336e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f1546s.f2337f = (!z3 || t(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f1546s.f2338g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.f1546s;
            gVar10.f2339h = 0;
            gVar10.f2340i = 0;
            gVar10.f2341j = t(windowInsets);
            this.f1546s.f2342k = 0;
        }
        b1.b.e("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f1546s.f2335d + ", Left: " + this.f1546s.f2338g + ", Right: " + this.f1546s.f2336e + "\nKeyboard insets: Bottom: " + this.f1546s.f2341j + ", Left: " + this.f1546s.f2342k + ", Right: " + this.f1546s.f2340i + "System Gesture Insets - Left: " + this.f1546s.f2346o + ", Top: " + this.f1546s.f2343l + ", Right: " + this.f1546s.f2344m + ", Bottom: " + this.f1546s.f2341j);
        D();
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1545r = r();
        Activity e4 = i.e(getContext());
        j0 j0Var = this.f1545r;
        if (j0Var != null && e4 != null) {
            j0Var.a(e4, androidx.core.content.d.c(getContext()), this.f1550w);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1535h != null) {
            b1.b.e("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f1540m.d(configuration);
            C();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !w() ? super.onCreateInputConnection(editorInfo) : this.f1538k.o(this, this.f1541n, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        j0 j0Var = this.f1545r;
        if (j0Var != null) {
            j0Var.b(this.f1550w);
        }
        this.f1545r = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (w() && this.f1542o.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !w() ? super.onHoverEvent(motionEvent) : this.f1543p.I(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        this.f1538k.z(viewStructure, i3);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        b1.b.e("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i5 + " x " + i6 + ", it is now " + i3 + " x " + i4);
        a.g gVar = this.f1546s;
        gVar.f2333b = i3;
        gVar.f2334c = i4;
        D();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!w()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f1542o.f(motionEvent);
    }

    public void p() {
        this.f1531d.c();
        j jVar = this.f1530c;
        if (jVar == null) {
            j q3 = q();
            this.f1530c = q3;
            addView(q3);
        } else {
            jVar.j(getWidth(), getHeight());
        }
        this.f1532e = this.f1531d;
        j jVar2 = this.f1530c;
        this.f1531d = jVar2;
        io.flutter.embedding.engine.a aVar = this.f1535h;
        if (aVar != null) {
            jVar2.b(aVar.p());
        }
    }

    public j q() {
        return new j(getContext(), getWidth(), getHeight(), j.b.background);
    }

    /* access modifiers changed from: protected */
    public j0 r() {
        try {
            return new j0(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        b1.b.e("FlutterView", "Detaching from a FlutterEngine: " + this.f1535h);
        if (!w()) {
            b1.b.e("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f a4 : this.f1536i) {
            a4.a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f1548u);
        this.f1535h.n().I();
        this.f1535h.n().d();
        this.f1543p.O();
        this.f1543p = null;
        this.f1538k.q().restartInput(this);
        this.f1538k.p();
        this.f1541n.c();
        io.flutter.plugin.editing.f fVar = this.f1539l;
        if (fVar != null) {
            fVar.b();
        }
        q1.b bVar = this.f1537j;
        if (bVar != null) {
            bVar.c();
        }
        m1.a p3 = this.f1535h.p();
        this.f1534g = false;
        p3.q(this.f1549v);
        p3.v();
        p3.s(false);
        m1.c cVar = this.f1532e;
        if (cVar != null && this.f1531d == this.f1530c) {
            this.f1531d = cVar;
        }
        this.f1531d.a();
        j jVar = this.f1530c;
        if (jVar != null) {
            jVar.f();
            removeView(this.f1530c);
            this.f1530c = null;
        }
        this.f1532e = null;
        this.f1535h = null;
    }

    /* access modifiers changed from: protected */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout a4;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            b1.b.e("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                arrayList.add(new a.b(next.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(next.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (a4 = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : a4.getBoundingRects()) {
                b1.b.e("FlutterView", "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new a.b(next2, a.d.CUTOUT));
            }
        }
        this.f1546s.f2348q = arrayList;
        D();
    }

    public boolean u() {
        return this.f1534g;
    }

    public boolean w() {
        io.flutter.embedding.engine.a aVar = this.f1535h;
        return aVar != null && aVar.p() == this.f1531d.getAttachedRenderer();
    }

    public void y(f fVar) {
        this.f1536i.remove(fVar);
    }

    public void z(m1.b bVar) {
        this.f1533f.remove(bVar);
    }
}
