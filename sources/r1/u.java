package r1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import io.flutter.view.u;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import n1.i;
import o1.d;
import o1.k;
import r1.o0;
import r1.x;

class u implements x.b, ImageReader.OnImageAvailableListener {

    /* renamed from: x  reason: collision with root package name */
    private static final HashMap<String, Integer> f2772x;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final s1.d f2773a;

    /* renamed from: b  reason: collision with root package name */
    private final u.c f2774b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2775c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f2776d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final m0 f2777e;

    /* renamed from: f  reason: collision with root package name */
    private final d0 f2778f;

    /* renamed from: g  reason: collision with root package name */
    private final s1.b f2779g;

    /* renamed from: h  reason: collision with root package name */
    private final Activity f2780h;

    /* renamed from: i  reason: collision with root package name */
    private final x f2781i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Handler f2782j;

    /* renamed from: k  reason: collision with root package name */
    private HandlerThread f2783k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public y f2784l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public CameraCaptureSession f2785m;

    /* renamed from: n  reason: collision with root package name */
    private ImageReader f2786n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public ImageReader f2787o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public CaptureRequest.Builder f2788p;

    /* renamed from: q  reason: collision with root package name */
    private MediaRecorder f2789q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2790r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2791s;

    /* renamed from: t  reason: collision with root package name */
    private File f2792t;

    /* renamed from: u  reason: collision with root package name */
    private f2.b f2793u;

    /* renamed from: v  reason: collision with root package name */
    private f2.a f2794v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public k.d f2795w;

    class a extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2.b f2796a;

        a(b2.b bVar) {
            this.f2796a = bVar;
        }

        public void onClosed(CameraDevice cameraDevice) {
            Log.i("Camera", "open | onClosed");
            y unused = u.this.f2784l = null;
            u.this.J();
            u.this.f2777e.l();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            Log.i("Camera", "open | onDisconnected");
            u.this.I();
            u.this.f2777e.m("The camera was disconnected.");
        }

        public void onError(CameraDevice cameraDevice, int i3) {
            Log.i("Camera", "open | onError");
            u.this.I();
            u.this.f2777e.m(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error." : "The camera device has encountered a fatal error" : "The camera device could not be opened due to a device policy." : "Max cameras in use" : "The camera device is in use already.");
        }

        public void onOpened(CameraDevice cameraDevice) {
            u uVar = u.this;
            y unused = uVar.f2784l = new g(uVar, cameraDevice, (a) null);
            try {
                u.this.J0();
                u.this.f2777e.n(Integer.valueOf(this.f2796a.i().getWidth()), Integer.valueOf(this.f2796a.i().getHeight()), u.this.f2773a.c().d(), u.this.f2773a.b().d(), Boolean.valueOf(u.this.f2773a.e().d()), Boolean.valueOf(u.this.f2773a.g().d()));
            } catch (CameraAccessException e4) {
                u.this.f2777e.m(e4.getMessage());
                u.this.I();
            }
        }
    }

    class b extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f2798a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f2799b;

        b(Runnable runnable) {
            this.f2799b = runnable;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, String str2) {
            u.this.f2777e.m(str2);
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onClosed");
            this.f2798a = true;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onConfigureFailed");
            u.this.f2777e.m("Failed to configure camera session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onConfigured");
            if (u.this.f2784l == null || this.f2798a) {
                u.this.f2777e.m("The camera was closed during configuration.");
                return;
            }
            CameraCaptureSession unused = u.this.f2785m = cameraCaptureSession;
            Log.i("Camera", "Updating builder settings");
            u uVar = u.this;
            uVar.S0(uVar.f2788p);
            u.this.v0(this.f2799b, new v(this));
        }
    }

    class c extends CameraCaptureSession.CaptureCallback {
        c() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            u.this.Q0();
        }
    }

    class d implements d.C0042d {
        d() {
        }

        public void a(Object obj, d.b bVar) {
            u.this.G0(bVar);
        }

        public void b(Object obj) {
            u.this.f2787o.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, u.this.f2782j);
        }
    }

    class e implements o0.a {
        e() {
        }

        public void a(String str, String str2) {
            u.this.f2777e.e(u.this.f2795w, str, str2, (Object) null);
        }

        public void b(String str) {
            u.this.f2777e.f(u.this.f2795w, str);
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2804a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                t1.b[] r0 = t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2804a = r0
                t1.b r1 = t1.b.locked     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2804a     // Catch:{ NoSuchFieldError -> 0x001d }
                t1.b r1 = t1.b.auto     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.u.f.<clinit>():void");
        }
    }

    private class g implements y {

        /* renamed from: a  reason: collision with root package name */
        private final CameraDevice f2805a;

        private g(CameraDevice cameraDevice) {
            this.f2805a = cameraDevice;
        }

        /* synthetic */ g(u uVar, CameraDevice cameraDevice, a aVar) {
            this(cameraDevice);
        }

        @TargetApi(21)
        public void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
            this.f2805a.createCaptureSession(list, stateCallback, u.this.f2782j);
        }

        @TargetApi(28)
        public void b(SessionConfiguration sessionConfiguration) {
            this.f2805a.createCaptureSession(sessionConfiguration);
        }

        public CaptureRequest.Builder c(int i3) {
            return this.f2805a.createCaptureRequest(i3);
        }

        public void close() {
            this.f2805a.close();
        }
    }

    static class h {
        public static Handler a(Looper looper) {
            return new Handler(looper);
        }
    }

    static class i {
        public static HandlerThread a(String str) {
            return new HandlerThread(str);
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f2772x = hashMap;
        hashMap.put("yuv420", 35);
        hashMap.put("jpeg", 256);
    }

    public u(Activity activity, u.c cVar, s1.b bVar, m0 m0Var, d0 d0Var, b2.c cVar2, boolean z3) {
        if (activity != null) {
            this.f2780h = activity;
            this.f2775c = z3;
            this.f2774b = cVar;
            this.f2777e = m0Var;
            this.f2776d = activity.getApplicationContext();
            this.f2778f = d0Var;
            this.f2779g = bVar;
            this.f2773a = s1.d.k(bVar, d0Var, activity, m0Var, cVar2);
            this.f2793u = new f2.b(3000, 3000);
            f2.a aVar = new f2.a();
            this.f2794v = aVar;
            this.f2781i = x.a(this, this.f2793u, aVar);
            I0();
            return;
        }
        throw new IllegalStateException("No activity available!");
    }

    /* access modifiers changed from: private */
    public void G0(d.b bVar) {
        this.f2787o.setOnImageAvailableListener(new j(this, bVar), this.f2782j);
    }

    /* access modifiers changed from: private */
    public void J() {
        if (this.f2785m != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f2785m.close();
            this.f2785m = null;
        }
    }

    private void K(int i3, Runnable runnable, Surface... surfaceArr) {
        this.f2785m = null;
        this.f2788p = this.f2784l.c(i3);
        b2.b h3 = this.f2773a.h();
        SurfaceTexture d4 = this.f2774b.d();
        d4.setDefaultBufferSize(h3.i().getWidth(), h3.i().getHeight());
        Surface surface = new Surface(d4);
        this.f2788p.addTarget(surface);
        List<Surface> asList = Arrays.asList(surfaceArr);
        if (i3 != 1) {
            for (Surface addTarget : asList) {
                this.f2788p.addTarget(addTarget);
            }
        }
        Size c4 = h0.c(this.f2778f, this.f2788p);
        this.f2773a.e().e(c4);
        this.f2773a.g().e(c4);
        b bVar = new b(runnable);
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OutputConfiguration(surface));
            for (Surface outputConfiguration : asList) {
                arrayList.add(new OutputConfiguration(outputConfiguration));
            }
            N(arrayList, bVar);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(surface);
        arrayList2.addAll(asList);
        M(arrayList2, bVar);
    }

    @TargetApi(21)
    private void M(List<Surface> list, CameraCaptureSession.StateCallback stateCallback) {
        this.f2784l.a(list, stateCallback, this.f2782j);
    }

    @TargetApi(28)
    private void N(List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback) {
        this.f2784l.b(new SessionConfiguration(0, list, Executors.newSingleThreadExecutor(), stateCallback));
    }

    private void P0() {
        Log.i("Camera", "captureStillPicture");
        this.f2781i.e(i0.STATE_CAPTURING);
        y yVar = this.f2784l;
        if (yVar != null) {
            try {
                CaptureRequest.Builder c4 = yVar.c(2);
                c4.addTarget(this.f2786n.getSurface());
                CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
                c4.set(key, (Rect) this.f2788p.get(key));
                S0(c4);
                i.f d4 = this.f2773a.i().d();
                c4.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(d4 == null ? P().d() : P().e(d4)));
                c cVar = new c();
                try {
                    this.f2785m.stopRepeating();
                    Log.i("Camera", "sending capture request");
                    this.f2785m.capture(c4.build(), cVar, this.f2782j);
                } catch (CameraAccessException e4) {
                    this.f2777e.e(this.f2795w, "cameraAccess", e4.getMessage(), (Object) null);
                }
            } catch (CameraAccessException e5) {
                this.f2777e.e(this.f2795w, "cameraAccess", e5.getMessage(), (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public void Q0() {
        Log.i("Camera", "unlockAutoFocus");
        if (this.f2785m == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        try {
            this.f2788p.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.f2785m.capture(this.f2788p.build(), (CameraCaptureSession.CaptureCallback) null, this.f2782j);
            this.f2788p.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f2785m.capture(this.f2788p.build(), (CameraCaptureSession.CaptureCallback) null, this.f2782j);
            v0((Runnable) null, new k(this));
        } catch (CameraAccessException e4) {
            this.f2777e.m(e4.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void S0(CaptureRequest.Builder builder) {
        for (s1.a next : this.f2773a.a()) {
            Log.d("Camera", "Updating builder with feature: " + next.a());
            next.b(builder);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X(String str, String str2) {
        this.f2777e.m(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y(String str, String str2) {
        this.f2777e.e(this.f2795w, "cameraAccess", str2, (Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0(d.b bVar, ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            ArrayList arrayList = new ArrayList();
            for (Image.Plane plane : acquireNextImage.getPlanes()) {
                ByteBuffer buffer = plane.getBuffer();
                int remaining = buffer.remaining();
                byte[] bArr = new byte[remaining];
                buffer.get(bArr, 0, remaining);
                HashMap hashMap = new HashMap();
                hashMap.put("bytesPerRow", Integer.valueOf(plane.getRowStride()));
                hashMap.put("bytesPerPixel", Integer.valueOf(plane.getPixelStride()));
                hashMap.put("bytes", bArr);
                arrayList.add(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("width", Integer.valueOf(acquireNextImage.getWidth()));
            hashMap2.put("height", Integer.valueOf(acquireNextImage.getHeight()));
            hashMap2.put("format", Integer.valueOf(acquireNextImage.getFormat()));
            hashMap2.put("planes", arrayList);
            hashMap2.put("lensAperture", this.f2794v.a());
            hashMap2.put("sensorExposureTime", this.f2794v.b());
            Integer c4 = this.f2794v.c();
            hashMap2.put("sensorSensitivity", c4 == null ? null : Double.valueOf((double) c4.intValue()));
            new Handler(Looper.getMainLooper()).post(new l(bVar, hashMap2));
            acquireNextImage.close();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n0() {
        this.f2789q.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o0(String str, String str2) {
        this.f2777e.e(this.f2795w, str, str2, (Object) null);
    }

    private void p0() {
        Log.i("Camera", "lockAutoFocus");
        if (this.f2785m == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        this.f2788p.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f2785m.capture(this.f2788p.build(), (CameraCaptureSession.CaptureCallback) null, this.f2782j);
        } catch (CameraAccessException e4) {
            this.f2777e.m(e4.getMessage());
        }
    }

    private void u0(String str) {
        Log.i("Camera", "prepareMediaRecorder");
        MediaRecorder mediaRecorder = this.f2789q;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        i.f d4 = this.f2773a.i().d();
        this.f2789q = (Build.VERSION.SDK_INT >= 31 ? new e2.a(V(), str) : new e2.a(W(), str)).b(this.f2775c).c(d4 == null ? P().g() : P().h(d4)).a();
    }

    /* access modifiers changed from: private */
    public void v0(Runnable runnable, n0 n0Var) {
        String str;
        Log.i("Camera", "refreshPreviewCaptureSession");
        CameraCaptureSession cameraCaptureSession = this.f2785m;
        if (cameraCaptureSession == null) {
            Log.i("Camera", "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh.");
            return;
        }
        try {
            if (!this.f2791s) {
                cameraCaptureSession.setRepeatingRequest(this.f2788p.build(), this.f2781i, this.f2782j);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (IllegalStateException e4) {
            str = "Camera is closed: " + e4.getMessage();
            n0Var.a("cameraAccess", str);
        } catch (CameraAccessException e5) {
            str = e5.getMessage();
            n0Var.a("cameraAccess", str);
        }
    }

    private void y0() {
        Log.i("Camera", "runPictureAutoFocus");
        this.f2781i.e(i0.STATE_WAITING_FOCUS);
        p0();
    }

    private void z0() {
        Log.i("Camera", "runPrecaptureSequence");
        try {
            this.f2788p.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            this.f2785m.capture(this.f2788p.build(), this.f2781i, this.f2782j);
            v0((Runnable) null, new d(this));
            this.f2781i.e(i0.STATE_WAITING_PRECAPTURE_START);
            this.f2788p.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f2785m.capture(this.f2788p.build(), this.f2781i, this.f2782j);
        } catch (CameraAccessException e4) {
            e4.printStackTrace();
        }
    }

    public void A0(k.d dVar, u1.b bVar) {
        u1.a c4 = this.f2773a.c();
        c4.e(bVar);
        c4.b(this.f2788p);
        v0(new t(dVar), new c(dVar));
    }

    public void B0(k.d dVar, double d4) {
        v1.a d5 = this.f2773a.d();
        d5.h(Double.valueOf(d4));
        d5.b(this.f2788p);
        v0(new o(dVar, d5), new p(dVar));
    }

    public void C0(k.d dVar, s1.e eVar) {
        w1.a e4 = this.f2773a.e();
        e4.f(eVar);
        e4.b(this.f2788p);
        v0(new e(dVar), new f(dVar));
    }

    public void D0(k.d dVar, x1.b bVar) {
        x1.a f4 = this.f2773a.f();
        f4.d(bVar);
        f4.b(this.f2788p);
        v0(new m(dVar), new n(dVar));
    }

    public void E0(k.d dVar, t1.b bVar) {
        t1.a b4 = this.f2773a.b();
        b4.e(bVar);
        b4.b(this.f2788p);
        if (!this.f2791s) {
            int i3 = f.f2804a[bVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    Q0();
                }
            } else if (this.f2785m == null) {
                Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
                return;
            } else {
                p0();
                this.f2788p.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                try {
                    this.f2785m.setRepeatingRequest(this.f2788p.build(), (CameraCaptureSession.CaptureCallback) null, this.f2782j);
                } catch (CameraAccessException e4) {
                    if (dVar != null) {
                        dVar.b("setFocusModeFailed", "Error setting focus mode: " + e4.getMessage(), (Object) null);
                        return;
                    }
                    return;
                }
            }
        }
        if (dVar != null) {
            dVar.a((Object) null);
        }
    }

    public void F0(k.d dVar, s1.e eVar) {
        y1.a g3 = this.f2773a.g();
        g3.f(eVar);
        g3.b(this.f2788p);
        v0(new g(dVar), new h(dVar));
        E0((k.d) null, this.f2773a.b().d());
    }

    public void H0(k.d dVar, float f4) {
        d2.a j3 = this.f2773a.j();
        float d4 = j3.d();
        float e4 = j3.e();
        if (f4 > d4 || f4 < e4) {
            dVar.b("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", new Object[]{Float.valueOf(e4), Float.valueOf(d4)}), (Object) null);
            return;
        }
        j3.f(Float.valueOf(f4));
        j3.b(this.f2788p);
        v0(new r(dVar), new s(dVar));
    }

    public void I() {
        Log.i("Camera", "close");
        y yVar = this.f2784l;
        if (yVar != null) {
            yVar.close();
            this.f2784l = null;
            this.f2785m = null;
        } else {
            J();
        }
        ImageReader imageReader = this.f2786n;
        if (imageReader != null) {
            imageReader.close();
            this.f2786n = null;
        }
        ImageReader imageReader2 = this.f2787o;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f2787o = null;
        }
        MediaRecorder mediaRecorder = this.f2789q;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f2789q.release();
            this.f2789q = null;
        }
        M0();
    }

    public void I0() {
        if (this.f2783k == null) {
            HandlerThread a4 = i.a("CameraBackground");
            this.f2783k = a4;
            try {
                a4.start();
            } catch (IllegalThreadStateException unused) {
            }
            this.f2782j = h.a(this.f2783k.getLooper());
        }
    }

    public void J0() {
        ImageReader imageReader = this.f2786n;
        if (imageReader != null && imageReader.getSurface() != null) {
            Log.i("Camera", "startPreview");
            L(1, this.f2786n.getSurface());
        }
    }

    public void K0(o1.d dVar) {
        L(3, this.f2787o.getSurface());
        Log.i("Camera", "startPreviewWithImageStream");
        dVar.d(new d());
    }

    /* access modifiers changed from: package-private */
    public void L(int i3, Surface... surfaceArr) {
        K(i3, (Runnable) null, surfaceArr);
    }

    public void L0(k.d dVar) {
        try {
            File createTempFile = File.createTempFile("REC", ".mp4", this.f2776d.getCacheDir());
            this.f2792t = createTempFile;
            try {
                u0(createTempFile.getAbsolutePath());
                this.f2773a.l(this.f2779g.d(this.f2778f, true));
                this.f2790r = true;
                try {
                    K(3, new q(this), this.f2789q.getSurface());
                    dVar.a((Object) null);
                } catch (CameraAccessException e4) {
                    this.f2790r = false;
                    this.f2792t = null;
                    dVar.b("videoRecordingFailed", e4.getMessage(), (Object) null);
                }
            } catch (IOException e5) {
                this.f2790r = false;
                this.f2792t = null;
                dVar.b("videoRecordingFailed", e5.getMessage(), (Object) null);
            }
        } catch (IOException | SecurityException e6) {
            dVar.b("cannotCreateFile", e6.getMessage(), (Object) null);
        }
    }

    public void M0() {
        HandlerThread handlerThread = this.f2783k;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f2783k = null;
        this.f2782j = null;
    }

    public void N0(k.d dVar) {
        if (!this.f2790r) {
            dVar.a((Object) null);
            return;
        }
        this.f2773a.l(this.f2779g.d(this.f2778f, false));
        this.f2790r = false;
        try {
            this.f2785m.abortCaptures();
            this.f2789q.stop();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.f2789q.reset();
        try {
            J0();
            dVar.a(this.f2792t.getAbsolutePath());
            this.f2792t = null;
        } catch (CameraAccessException | IllegalStateException e4) {
            dVar.b("videoRecordingFailed", e4.getMessage(), (Object) null);
        }
    }

    public void O() {
        Log.i("Camera", "dispose");
        I();
        this.f2774b.a();
        P().l();
    }

    public void O0(k.d dVar) {
        if (this.f2781i.b() != i0.STATE_PREVIEW) {
            dVar.b("captureAlreadyActive", "Picture is currently already being captured", (Object) null);
            return;
        }
        this.f2795w = dVar;
        try {
            this.f2792t = File.createTempFile("CAP", ".jpg", this.f2776d.getCacheDir());
            this.f2793u.c();
            this.f2786n.setOnImageAvailableListener(this, this.f2782j);
            t1.a b4 = this.f2773a.b();
            if (!b4.c() || b4.d() != t1.b.auto) {
                z0();
            } else {
                y0();
            }
        } catch (IOException | SecurityException e4) {
            this.f2777e.e(this.f2795w, "cannotCreateFile", e4.getMessage(), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public c2.a P() {
        return this.f2773a.i().c();
    }

    public double Q() {
        return this.f2773a.d().d();
    }

    public double R() {
        return this.f2773a.d().e();
    }

    public void R0() {
        this.f2773a.i().g();
    }

    public float S() {
        return this.f2773a.j().d();
    }

    public double T() {
        return this.f2773a.d().f();
    }

    public float U() {
        return this.f2773a.j().e();
    }

    /* access modifiers changed from: package-private */
    public EncoderProfiles V() {
        return this.f2773a.h().j();
    }

    /* access modifiers changed from: package-private */
    public CamcorderProfile W() {
        return this.f2773a.h().k();
    }

    public void a() {
        P0();
    }

    public void b() {
        z0();
    }

    public void onImageAvailable(ImageReader imageReader) {
        Log.i("Camera", "onImageAvailable");
        this.f2782j.post(new o0(imageReader.acquireNextImage(), this.f2792t, new e()));
        this.f2781i.e(i0.STATE_PREVIEW);
    }

    public void q0(i.f fVar) {
        this.f2773a.i().e(fVar);
    }

    @SuppressLint({"MissingPermission"})
    public void r0(String str) {
        b2.b h3 = this.f2773a.h();
        if (!h3.c()) {
            m0 m0Var = this.f2777e;
            m0Var.m("Camera with name \"" + this.f2778f.q() + "\" is not supported by this plugin.");
            return;
        }
        this.f2786n = ImageReader.newInstance(h3.h().getWidth(), h3.h().getHeight(), 256, 1);
        Integer num = f2772x.get(str);
        if (num == null) {
            Log.w("Camera", "The selected imageFormatGroup is not supported by Android. Defaulting to yuv420");
            num = 35;
        }
        this.f2787o = ImageReader.newInstance(h3.i().getWidth(), h3.i().getHeight(), num.intValue(), 1);
        j0.c(this.f2780h).openCamera(this.f2778f.q(), new a(h3), this.f2782j);
    }

    public void s0() {
        this.f2791s = true;
        this.f2785m.stopRepeating();
    }

    public void t0(k.d dVar) {
        if (!this.f2790r) {
            dVar.a((Object) null);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f2789q.pause();
                dVar.a((Object) null);
                return;
            }
            dVar.b("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", (Object) null);
        } catch (IllegalStateException e4) {
            dVar.b("videoRecordingFailed", e4.getMessage(), (Object) null);
        }
    }

    public void w0() {
        this.f2791s = false;
        v0((Runnable) null, new i(this));
    }

    public void x0(k.d dVar) {
        if (!this.f2790r) {
            dVar.a((Object) null);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f2789q.resume();
                dVar.a((Object) null);
                return;
            }
            dVar.b("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", (Object) null);
        } catch (IllegalStateException e4) {
            dVar.b("videoRecordingFailed", e4.getMessage(), (Object) null);
        }
    }
}
