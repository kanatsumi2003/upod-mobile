package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import m1.c;

public class k extends SurfaceView implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1512a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f1513b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1514c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f1515d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public m1.a f1516e;

    /* renamed from: f  reason: collision with root package name */
    private final SurfaceHolder.Callback f1517f;

    /* renamed from: g  reason: collision with root package name */
    private final m1.b f1518g;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
            b1.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (k.this.f1515d) {
                k.this.j(i4, i5);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            b1.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = k.this.f1513b = true;
            if (k.this.f1515d) {
                k.this.k();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            b1.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = k.this.f1513b = false;
            if (k.this.f1515d) {
                k.this.l();
            }
        }
    }

    class b implements m1.b {
        b() {
        }

        public void c() {
        }

        public void f() {
            b1.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            k.this.setAlpha(1.0f);
            if (k.this.f1516e != null) {
                k.this.f1516e.q(this);
            }
        }
    }

    private k(Context context, AttributeSet attributeSet, boolean z3) {
        super(context, attributeSet);
        this.f1513b = false;
        this.f1514c = false;
        this.f1515d = false;
        this.f1517f = new a();
        this.f1518g = new b();
        this.f1512a = z3;
        m();
    }

    public k(Context context, boolean z3) {
        this(context, (AttributeSet) null, z3);
    }

    /* access modifiers changed from: private */
    public void j(int i3, int i4) {
        if (this.f1516e != null) {
            b1.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
            this.f1516e.w(i3, i4);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f1516e == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f1516e.u(getHolder().getSurface(), this.f1514c);
    }

    /* access modifiers changed from: private */
    public void l() {
        m1.a aVar = this.f1516e;
        if (aVar != null) {
            aVar.v();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        if (this.f1512a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f1517f);
        setAlpha(0.0f);
    }

    public void a() {
        if (this.f1516e != null) {
            if (getWindowToken() != null) {
                b1.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                l();
            }
            setAlpha(0.0f);
            this.f1516e.q(this.f1518g);
            this.f1516e = null;
            this.f1515d = false;
            return;
        }
        b1.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public void b(m1.a aVar) {
        b1.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f1516e != null) {
            b1.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f1516e.v();
            this.f1516e.q(this.f1518g);
        }
        this.f1516e = aVar;
        this.f1515d = true;
        aVar.g(this.f1518g);
        if (this.f1513b) {
            b1.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f1514c = false;
    }

    public void c() {
        if (this.f1516e != null) {
            this.f1516e = null;
            this.f1514c = true;
            this.f1515d = false;
            return;
        }
        b1.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public m1.a getAttachedRenderer() {
        return this.f1516e;
    }
}
