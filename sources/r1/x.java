package r1;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;

class x extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    private final b f2808a;

    /* renamed from: b  reason: collision with root package name */
    private i0 f2809b = i0.STATE_PREVIEW;

    /* renamed from: c  reason: collision with root package name */
    private final f2.b f2810c;

    /* renamed from: d  reason: collision with root package name */
    private final f2.a f2811d;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2812a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                r1.i0[] r0 = r1.i0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2812a = r0
                r1.i0 r1 = r1.i0.STATE_PREVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2812a     // Catch:{ NoSuchFieldError -> 0x001d }
                r1.i0 r1 = r1.i0.STATE_WAITING_FOCUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2812a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r1.i0 r1 = r1.i0.STATE_WAITING_PRECAPTURE_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2812a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r1.i0 r1 = r1.i0.STATE_WAITING_PRECAPTURE_DONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.x.a.<clinit>():void");
        }
    }

    interface b {
        void a();

        void b();
    }

    private x(b bVar, f2.b bVar2, f2.a aVar) {
        this.f2808a = bVar;
        this.f2810c = bVar2;
        this.f2811d = aVar;
    }

    public static x a(b bVar, f2.b bVar2, f2.a aVar) {
        return new x(bVar, bVar2, aVar);
    }

    private void c(Integer num) {
        if (num == null || num.intValue() == 2) {
            this.f2808a.a();
        } else {
            this.f2808a.b();
        }
    }

    private void d(CaptureResult captureResult) {
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (captureResult instanceof TotalCaptureResult) {
            this.f2811d.d((Float) captureResult.get(CaptureResult.LENS_APERTURE));
            this.f2811d.e((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME));
            this.f2811d.f((Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY));
        }
        if (this.f2809b != i0.STATE_PREVIEW) {
            Log.d("CameraCaptureCallback", "CameraCaptureCallback | state: " + this.f2809b + " | afState: " + num2 + " | aeState: " + num);
        }
        int i3 = a.f2812a[this.f2809b.ordinal()];
        if (i3 != 2) {
            if (i3 == 3) {
                if (!(num == null || num.intValue() == 2 || num.intValue() == 5 || num.intValue() == 4)) {
                    if (this.f2810c.b().b()) {
                        Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to start, moving on with capture");
                    } else {
                        return;
                    }
                }
                e(i0.STATE_WAITING_PRECAPTURE_DONE);
            } else if (i3 == 4) {
                if (num != null && num.intValue() == 5) {
                    if (this.f2810c.b().b()) {
                        Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to finish, moving on with capture");
                    } else {
                        return;
                    }
                }
                this.f2808a.a();
            }
        } else if (num2 != null) {
            if (!(num2.intValue() == 4 || num2.intValue() == 5)) {
                if (this.f2810c.a().b()) {
                    Log.w("CameraCaptureCallback", "Focus timeout, moving on with capture");
                } else {
                    return;
                }
            }
            c(num);
        }
    }

    public i0 b() {
        return this.f2809b;
    }

    public void e(i0 i0Var) {
        this.f2809b = i0Var;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        d(totalCaptureResult);
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        d(captureResult);
    }
}
