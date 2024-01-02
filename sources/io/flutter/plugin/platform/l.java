package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.view.u;
import j2.i;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(23)
class l extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f1735a;

    /* renamed from: b  reason: collision with root package name */
    private int f1736b;

    /* renamed from: c  reason: collision with root package name */
    private int f1737c;

    /* renamed from: d  reason: collision with root package name */
    private int f1738d;

    /* renamed from: e  reason: collision with root package name */
    private int f1739e;

    /* renamed from: f  reason: collision with root package name */
    private int f1740f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceTexture f1741g;

    /* renamed from: h  reason: collision with root package name */
    private Surface f1742h;

    /* renamed from: i  reason: collision with root package name */
    private io.flutter.embedding.android.a f1743i;

    /* renamed from: j  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f1744j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f1745k;

    /* renamed from: l  reason: collision with root package name */
    private final u.a f1746l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f1747m;

    /* renamed from: n  reason: collision with root package name */
    private final u.b f1748n;

    class a implements u.a {
        a() {
        }

        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                l.this.f1745k.decrementAndGet();
            }
        }
    }

    class b implements u.b {
        b() {
        }

        public void onTrimMemory(int i3) {
            if (i3 == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = l.this.f1747m = true;
            }
        }
    }

    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f1751a;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f1751a = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f1751a;
            l lVar = l.this;
            onFocusChangeListener.onFocusChange(lVar, i.c(lVar));
        }
    }

    public l(Context context) {
        super(context);
        this.f1745k = new AtomicLong(0);
        this.f1746l = new a();
        this.f1747m = false;
        this.f1748n = new b();
        setWillNotDraw(false);
    }

    public l(Context context, u.c cVar) {
        this(context);
        cVar.c(this.f1746l);
        cVar.b(this.f1748n);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f1745k.incrementAndGet();
        }
    }

    private void g() {
        if (this.f1747m) {
            Surface surface = this.f1742h;
            if (surface != null) {
                surface.release();
            }
            this.f1742h = c(this.f1741g);
            this.f1747m = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f1745k.get() <= 0;
    }

    /* access modifiers changed from: protected */
    public Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f1740f;
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f1742h;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (!surface.isValid()) {
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture = this.f1741g;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                str = "Invalid texture. The platform view cannot be displayed.";
            } else if (!n()) {
                invalidate();
                return;
            } else {
                g();
                Canvas a4 = this.f1742h.lockHardwareCanvas();
                try {
                    a4.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(a4);
                    f();
                    return;
                } finally {
                    this.f1742h.unlockCanvasAndPost(a4);
                }
            }
        }
        b1.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f1739e;
    }

    public void h() {
        this.f1741g = null;
        Surface surface = this.f1742h;
        if (surface != null) {
            surface.release();
            this.f1742h = null;
        }
    }

    public void i(int i3, int i4) {
        this.f1739e = i3;
        this.f1740f = i4;
        SurfaceTexture surfaceTexture = this.f1741g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i4);
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f1737c = layoutParams.leftMargin;
        this.f1738d = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f1744j == null) {
            c cVar = new c(onFocusChangeListener);
            this.f1744j = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    @SuppressLint({"NewApi"})
    public void l(SurfaceTexture surfaceTexture) {
        int i3;
        if (Build.VERSION.SDK_INT < 23) {
            b1.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f1741g = surfaceTexture;
        int i4 = this.f1739e;
        if (i4 > 0 && (i3 = this.f1740f) > 0) {
            surfaceTexture.setDefaultBufferSize(i4, i3);
        }
        Surface surface = this.f1742h;
        if (surface != null) {
            surface.release();
        }
        Surface c4 = c(surfaceTexture);
        this.f1742h = c4;
        Canvas a4 = c4.lockHardwareCanvas();
        try {
            a4.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f1742h.unlockCanvasAndPost(a4);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f1743i = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f1744j) != null) {
            this.f1744j = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        float f4;
        if (this.f1743i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f1737c;
            this.f1735a = i4;
            i3 = this.f1738d;
            this.f1736b = i3;
            f4 = (float) i4;
        } else if (action != 2) {
            f4 = (float) this.f1737c;
            i3 = this.f1738d;
        } else {
            matrix.postTranslate((float) this.f1735a, (float) this.f1736b);
            this.f1735a = this.f1737c;
            this.f1736b = this.f1738d;
            return this.f1743i.g(motionEvent, matrix);
        }
        matrix.postTranslate(f4, (float) i3);
        return this.f1743i.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
