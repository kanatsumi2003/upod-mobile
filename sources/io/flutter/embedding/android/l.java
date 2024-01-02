package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import b1.b;
import m1.c;

public class l extends TextureView implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f1521a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f1522b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1523c;

    /* renamed from: d  reason: collision with root package name */
    private m1.a f1524d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Surface f1525e;

    /* renamed from: f  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f1526f;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = l.this.f1521a = true;
            if (l.this.f1522b) {
                l.this.l();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = l.this.f1521a = false;
            if (l.this.f1522b) {
                l.this.m();
            }
            if (l.this.f1525e == null) {
                return true;
            }
            l.this.f1525e.release();
            Surface unused2 = l.this.f1525e = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (l.this.f1522b) {
                l.this.k(i3, i4);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public l(Context context) {
        this(context, (AttributeSet) null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1521a = false;
        this.f1522b = false;
        this.f1523c = false;
        this.f1526f = new a();
        n();
    }

    /* access modifiers changed from: private */
    public void k(int i3, int i4) {
        if (this.f1524d != null) {
            b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
            this.f1524d.w(i3, i4);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void l() {
        if (this.f1524d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1525e;
        if (surface != null) {
            surface.release();
            this.f1525e = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1525e = surface2;
        this.f1524d.u(surface2, this.f1523c);
        this.f1523c = false;
    }

    /* access modifiers changed from: private */
    public void m() {
        m1.a aVar = this.f1524d;
        if (aVar != null) {
            aVar.v();
            Surface surface = this.f1525e;
            if (surface != null) {
                surface.release();
                this.f1525e = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void n() {
        setSurfaceTextureListener(this.f1526f);
    }

    public void a() {
        if (this.f1524d != null) {
            if (getWindowToken() != null) {
                b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                m();
            }
            this.f1524d = null;
            this.f1522b = false;
            return;
        }
        b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public void b(m1.a aVar) {
        b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f1524d != null) {
            b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f1524d.v();
        }
        this.f1524d = aVar;
        this.f1522b = true;
        if (this.f1521a) {
            b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    public void c() {
        if (this.f1524d != null) {
            this.f1524d = null;
            this.f1523c = true;
            this.f1522b = false;
            return;
        }
        b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public m1.a getAttachedRenderer() {
        return this.f1524d;
    }

    public void setRenderSurface(Surface surface) {
        this.f1525e = surface;
    }
}
