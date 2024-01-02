package m1;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.u;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class a implements u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f2298a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f2299b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    private Surface f2300c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f2301d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f2302e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final Set<WeakReference<u.b>> f2303f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final b f2304g;

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    class C0034a implements b {
        C0034a() {
        }

        public void c() {
            boolean unused = a.this.f2301d = false;
        }

        public void f() {
            boolean unused = a.this.f2301d = true;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2306a;

        /* renamed from: b  reason: collision with root package name */
        public final d f2307b;

        /* renamed from: c  reason: collision with root package name */
        public final c f2308c;

        public b(Rect rect, d dVar) {
            this.f2306a = rect;
            this.f2307b = dVar;
            this.f2308c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f2306a = rect;
            this.f2307b = dVar;
            this.f2308c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: d  reason: collision with root package name */
        public final int f2313d;

        private c(int i3) {
            this.f2313d = i3;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: d  reason: collision with root package name */
        public final int f2319d;

        private d(int i3) {
            this.f2319d = i3;
        }
    }

    static final class e implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        private final long f2320d;

        /* renamed from: e  reason: collision with root package name */
        private final FlutterJNI f2321e;

        e(long j3, FlutterJNI flutterJNI) {
            this.f2320d = j3;
            this.f2321e = flutterJNI;
        }

        public void run() {
            if (this.f2321e.isAttached()) {
                b1.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f2320d + ").");
                this.f2321e.unregisterTexture(this.f2320d);
            }
        }
    }

    final class f implements u.c, u.b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f2322a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f2323b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f2324c;

        /* renamed from: d  reason: collision with root package name */
        private u.b f2325d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public u.a f2326e;

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f2327f;

        /* renamed from: g  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f2328g = new b();

        /* renamed from: m1.a$f$a  reason: collision with other inner class name */
        class C0035a implements Runnable {
            C0035a() {
            }

            public void run() {
                if (f.this.f2326e != null) {
                    f.this.f2326e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!f.this.f2324c && a.this.f2298a.isAttached()) {
                    f fVar = f.this;
                    a.this.m(fVar.f2322a);
                }
            }
        }

        f(long j3, SurfaceTexture surfaceTexture) {
            C0035a aVar = new C0035a();
            this.f2327f = aVar;
            this.f2322a = j3;
            this.f2323b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            d().setOnFrameAvailableListener(this.f2328g, new Handler());
        }

        private void i() {
            a.this.r(this);
        }

        public void a() {
            if (!this.f2324c) {
                b1.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f2322a + ").");
                this.f2323b.release();
                a.this.y(this.f2322a);
                i();
                this.f2324c = true;
            }
        }

        public void b(u.b bVar) {
            this.f2325d = bVar;
        }

        public void c(u.a aVar) {
            this.f2326e = aVar;
        }

        public SurfaceTexture d() {
            return this.f2323b.surfaceTexture();
        }

        public long e() {
            return this.f2322a;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                if (!this.f2324c) {
                    a.this.f2302e.post(new e(this.f2322a, a.this.f2298a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper j() {
            return this.f2323b;
        }

        public void onTrimMemory(int i3) {
            u.b bVar = this.f2325d;
            if (bVar != null) {
                bVar.onTrimMemory(i3);
            }
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public float f2332a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f2333b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2334c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2335d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f2336e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f2337f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f2338g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2339h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2340i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2341j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f2342k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f2343l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f2344m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f2345n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f2346o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f2347p = -1;

        /* renamed from: q  reason: collision with root package name */
        public List<b> f2348q = new ArrayList();

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f2333b > 0 && this.f2334c > 0 && this.f2332a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0034a aVar = new C0034a();
        this.f2304g = aVar;
        this.f2298a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    private void i() {
        Iterator<WeakReference<u.b>> it = this.f2303f.iterator();
        while (it.hasNext()) {
            if (((u.b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public void m(long j3) {
        this.f2298a.markTextureFrameAvailable(j3);
    }

    private void p(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f2298a.registerTexture(j3, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    public void y(long j3) {
        this.f2298a.unregisterTexture(j3);
    }

    public u.c a() {
        b1.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void g(b bVar) {
        this.f2298a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f2301d) {
            bVar.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(u.b bVar) {
        i();
        this.f2303f.add(new WeakReference(bVar));
    }

    public void j(ByteBuffer byteBuffer, int i3) {
        this.f2298a.dispatchPointerDataPacket(byteBuffer, i3);
    }

    public boolean k() {
        return this.f2301d;
    }

    public boolean l() {
        return this.f2298a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i3) {
        Iterator<WeakReference<u.b>> it = this.f2303f.iterator();
        while (it.hasNext()) {
            u.b bVar = (u.b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public u.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f2299b.getAndIncrement(), surfaceTexture);
        b1.b.e("FlutterRenderer", "New SurfaceTexture ID: " + fVar.e());
        p(fVar.e(), fVar.j());
        h(fVar);
        return fVar;
    }

    public void q(b bVar) {
        this.f2298a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* access modifiers changed from: package-private */
    public void r(u.b bVar) {
        for (WeakReference next : this.f2303f) {
            if (next.get() == bVar) {
                this.f2303f.remove(next);
                return;
            }
        }
    }

    public void s(boolean z3) {
        this.f2298a.setSemanticsEnabled(z3);
    }

    public void t(g gVar) {
        g gVar2 = gVar;
        if (gVar.a()) {
            b1.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f2333b + " x " + gVar2.f2334c + "\nPadding - L: " + gVar2.f2338g + ", T: " + gVar2.f2335d + ", R: " + gVar2.f2336e + ", B: " + gVar2.f2337f + "\nInsets - L: " + gVar2.f2342k + ", T: " + gVar2.f2339h + ", R: " + gVar2.f2340i + ", B: " + gVar2.f2341j + "\nSystem Gesture Insets - L: " + gVar2.f2346o + ", T: " + gVar2.f2343l + ", R: " + gVar2.f2344m + ", B: " + gVar2.f2344m + "\nDisplay Features: " + gVar2.f2348q.size());
            int[] iArr = new int[(gVar2.f2348q.size() * 4)];
            int[] iArr2 = new int[gVar2.f2348q.size()];
            int[] iArr3 = new int[gVar2.f2348q.size()];
            for (int i3 = 0; i3 < gVar2.f2348q.size(); i3++) {
                b bVar = gVar2.f2348q.get(i3);
                int i4 = i3 * 4;
                Rect rect = bVar.f2306a;
                iArr[i4] = rect.left;
                iArr[i4 + 1] = rect.top;
                iArr[i4 + 2] = rect.right;
                iArr[i4 + 3] = rect.bottom;
                iArr2[i3] = bVar.f2307b.f2319d;
                iArr3[i3] = bVar.f2308c.f2313d;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f2298a;
            flutterJNI.setViewportMetrics(gVar2.f2332a, gVar2.f2333b, gVar2.f2334c, gVar2.f2335d, gVar2.f2336e, gVar2.f2337f, gVar2.f2338g, gVar2.f2339h, gVar2.f2340i, gVar2.f2341j, gVar2.f2342k, gVar2.f2343l, gVar2.f2344m, gVar2.f2345n, gVar2.f2346o, gVar2.f2347p, iArr, iArr2, iArr4);
        }
    }

    public void u(Surface surface, boolean z3) {
        if (this.f2300c != null && !z3) {
            v();
        }
        this.f2300c = surface;
        this.f2298a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f2298a.onSurfaceDestroyed();
        this.f2300c = null;
        if (this.f2301d) {
            this.f2304g.c();
        }
        this.f2301d = false;
    }

    public void w(int i3, int i4) {
        this.f2298a.onSurfaceChanged(i3, i4);
    }

    public void x(Surface surface) {
        this.f2300c = surface;
        this.f2298a.onSurfaceWindowChanged(surface);
    }
}
