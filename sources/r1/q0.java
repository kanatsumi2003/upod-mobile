package r1;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.os.Looper;
import io.flutter.view.u;
import java.util.HashMap;
import o1.c;
import o1.d;
import o1.j;
import o1.k;
import r1.a0;

final class q0 implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f2761a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2762b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f2763c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.b f2764d;

    /* renamed from: e  reason: collision with root package name */
    private final u f2765e;

    /* renamed from: f  reason: collision with root package name */
    private final k f2766f;

    /* renamed from: g  reason: collision with root package name */
    private final d f2767g;

    /* renamed from: h  reason: collision with root package name */
    private u f2768h;

    q0(Activity activity, c cVar, a0 a0Var, a0.b bVar, u uVar) {
        this.f2761a = activity;
        this.f2762b = cVar;
        this.f2763c = a0Var;
        this.f2764d = bVar;
        this.f2765e = uVar;
        k kVar = new k(cVar, "plugins.flutter.io/camera_android");
        this.f2766f = kVar;
        this.f2767g = new d(cVar, "plugins.flutter.io/camera_android/imageStream");
        kVar.e(this);
    }

    private void c(Exception exc, k.d dVar) {
        if (exc instanceof CameraAccessException) {
            dVar.b("CameraAccess", exc.getMessage(), (Object) null);
            return;
        }
        throw ((RuntimeException) exc);
    }

    private void d(j jVar, k.d dVar) {
        boolean booleanValue = ((Boolean) jVar.a("enableAudio")).booleanValue();
        u.c a4 = this.f2765e.a();
        u.c cVar = a4;
        this.f2768h = new u(this.f2761a, cVar, new s1.c(), new m0(this.f2762b, a4.e(), new Handler(Looper.getMainLooper())), new e0((String) jVar.a("cameraName"), j0.c(this.f2761a)), b2.c.valueOf((String) jVar.a("resolutionPreset")), booleanValue);
        HashMap hashMap = new HashMap();
        hashMap.put("cameraId", Long.valueOf(a4.e()));
        dVar.a(hashMap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(j jVar, k.d dVar, String str, String str2) {
        if (str == null) {
            try {
                d(jVar, dVar);
            } catch (Exception e4) {
                c(e4, dVar);
            }
        } else {
            dVar.b(str, str2, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Double} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:138:0x02b9=Splitter:B:138:0x02b9, B:97:0x01bc=Splitter:B:97:0x01bc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(o1.j r7, o1.k.d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f2578a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2037208347: goto L_0x0174;
                case -1982465099: goto L_0x0169;
                case -1849130371: goto L_0x015e;
                case -1783353674: goto L_0x0153;
                case -1352294148: goto L_0x0148;
                case -1313121483: goto L_0x013d;
                case -1157944680: goto L_0x0132;
                case -1151868548: goto L_0x0127;
                case -1127151527: goto L_0x0119;
                case -1120721617: goto L_0x010b;
                case -1077837554: goto L_0x00fd;
                case -579183206: goto L_0x00ef;
                case 109225283: goto L_0x00e1;
                case 186649688: goto L_0x00d3;
                case 196568648: goto L_0x00c5;
                case 391927665: goto L_0x00b7;
                case 770486092: goto L_0x00a9;
                case 871091088: goto L_0x009b;
                case 888134860: goto L_0x008d;
                case 888641243: goto L_0x007f;
                case 954656505: goto L_0x0071;
                case 1018096247: goto L_0x0063;
                case 1120116920: goto L_0x0055;
                case 1422316786: goto L_0x0047;
                case 1671767583: goto L_0x0039;
                case 1672159065: goto L_0x002b;
                case 1765152647: goto L_0x001d;
                case 1838076131: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x017e
        L_0x000f:
            java.lang.String r1 = "getMaxZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0019
            goto L_0x017e
        L_0x0019:
            r2 = 27
            goto L_0x017e
        L_0x001d:
            java.lang.String r1 = "setExposurePoint"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x017e
        L_0x0027:
            r2 = 26
            goto L_0x017e
        L_0x002b:
            java.lang.String r1 = "stopImageStream"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x017e
        L_0x0035:
            r2 = 25
            goto L_0x017e
        L_0x0039:
            java.lang.String r1 = "dispose"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            goto L_0x017e
        L_0x0043:
            r2 = 24
            goto L_0x017e
        L_0x0047:
            java.lang.String r1 = "pausePreview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
            goto L_0x017e
        L_0x0051:
            r2 = 23
            goto L_0x017e
        L_0x0055:
            java.lang.String r1 = "startVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x017e
        L_0x005f:
            r2 = 22
            goto L_0x017e
        L_0x0063:
            java.lang.String r1 = "takePicture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006d
            goto L_0x017e
        L_0x006d:
            r2 = 21
            goto L_0x017e
        L_0x0071:
            java.lang.String r1 = "startImageStream"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            goto L_0x017e
        L_0x007b:
            r2 = 20
            goto L_0x017e
        L_0x007f:
            java.lang.String r1 = "resumePreview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
            goto L_0x017e
        L_0x0089:
            r2 = 19
            goto L_0x017e
        L_0x008d:
            java.lang.String r1 = "setExposureMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0097
            goto L_0x017e
        L_0x0097:
            r2 = 18
            goto L_0x017e
        L_0x009b:
            java.lang.String r1 = "initialize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x017e
        L_0x00a5:
            r2 = 17
            goto L_0x017e
        L_0x00a9:
            java.lang.String r1 = "pauseVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            goto L_0x017e
        L_0x00b3:
            r2 = 16
            goto L_0x017e
        L_0x00b7:
            java.lang.String r1 = "setFlashMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            goto L_0x017e
        L_0x00c1:
            r2 = 15
            goto L_0x017e
        L_0x00c5:
            java.lang.String r1 = "getMaxExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cf
            goto L_0x017e
        L_0x00cf:
            r2 = 14
            goto L_0x017e
        L_0x00d3:
            java.lang.String r1 = "stopVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00dd
            goto L_0x017e
        L_0x00dd:
            r2 = 13
            goto L_0x017e
        L_0x00e1:
            java.lang.String r1 = "resumeVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00eb
            goto L_0x017e
        L_0x00eb:
            r2 = 12
            goto L_0x017e
        L_0x00ef:
            java.lang.String r1 = "setFocusPoint"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f9
            goto L_0x017e
        L_0x00f9:
            r2 = 11
            goto L_0x017e
        L_0x00fd:
            java.lang.String r1 = "unlockCaptureOrientation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0107
            goto L_0x017e
        L_0x0107:
            r2 = 10
            goto L_0x017e
        L_0x010b:
            java.lang.String r1 = "setZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0115
            goto L_0x017e
        L_0x0115:
            r2 = 9
            goto L_0x017e
        L_0x0119:
            java.lang.String r1 = "setFocusMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0123
            goto L_0x017e
        L_0x0123:
            r2 = 8
            goto L_0x017e
        L_0x0127:
            java.lang.String r1 = "setExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0130
            goto L_0x017e
        L_0x0130:
            r2 = 7
            goto L_0x017e
        L_0x0132:
            java.lang.String r1 = "prepareForVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x013b
            goto L_0x017e
        L_0x013b:
            r2 = 6
            goto L_0x017e
        L_0x013d:
            java.lang.String r1 = "lockCaptureOrientation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x017e
        L_0x0146:
            r2 = 5
            goto L_0x017e
        L_0x0148:
            java.lang.String r1 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0151
            goto L_0x017e
        L_0x0151:
            r2 = 4
            goto L_0x017e
        L_0x0153:
            java.lang.String r1 = "getMinExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015c
            goto L_0x017e
        L_0x015c:
            r2 = 3
            goto L_0x017e
        L_0x015e:
            java.lang.String r1 = "getExposureOffsetStepSize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0167
            goto L_0x017e
        L_0x0167:
            r2 = 2
            goto L_0x017e
        L_0x0169:
            java.lang.String r1 = "getMinZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0172
            goto L_0x017e
        L_0x0172:
            r2 = 1
            goto L_0x017e
        L_0x0174:
            java.lang.String r1 = "availableCameras"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r2 = 0
        L_0x017e:
            java.lang.String r0 = "y"
            java.lang.String r1 = "x"
            java.lang.String r3 = "reset"
            java.lang.String r4 = "mode"
            r5 = 0
            switch(r2) {
                case 0: goto L_0x038e;
                case 1: goto L_0x0380;
                case 2: goto L_0x0372;
                case 3: goto L_0x0364;
                case 4: goto L_0x0342;
                case 5: goto L_0x032d;
                case 6: goto L_0x0329;
                case 7: goto L_0x0316;
                case 8: goto L_0x02ec;
                case 9: goto L_0x02cf;
                case 10: goto L_0x02c5;
                case 11: goto L_0x029b;
                case 12: goto L_0x0294;
                case 13: goto L_0x028d;
                case 14: goto L_0x027e;
                case 15: goto L_0x0254;
                case 16: goto L_0x024d;
                case 17: goto L_0x0230;
                case 18: goto L_0x0206;
                case 19: goto L_0x01ff;
                case 20: goto L_0x01f3;
                case 21: goto L_0x01ec;
                case 22: goto L_0x01e5;
                case 23: goto L_0x01db;
                case 24: goto L_0x01d2;
                case 25: goto L_0x01c8;
                case 26: goto L_0x019e;
                case 27: goto L_0x018f;
                default: goto L_0x018a;
            }
        L_0x018a:
            r8.c()
            goto L_0x039c
        L_0x018f:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            float r7 = r7.S()     // Catch:{ Exception -> 0x0398 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x019e:
            java.lang.Object r2 = r7.a(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x01af
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            r7 = r5
            goto L_0x01bc
        L_0x01af:
            java.lang.Object r1 = r7.a(r1)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
        L_0x01bc:
            r1.u r0 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            s1.e r1 = new s1.e     // Catch:{ Exception -> 0x0398 }
            r1.<init>(r5, r7)     // Catch:{ Exception -> 0x0398 }
            r0.C0(r8, r1)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x01c8:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.J0()     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x01d2:
            r1.u r7 = r6.f2768h
            if (r7 == 0) goto L_0x0329
            r7.O()
            goto L_0x0329
        L_0x01db:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.s0()     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x01e5:
            r1.u r7 = r6.f2768h
            r7.L0(r8)
            goto L_0x039c
        L_0x01ec:
            r1.u r7 = r6.f2768h
            r7.O0(r8)
            goto L_0x039c
        L_0x01f3:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            o1.d r0 = r6.f2767g     // Catch:{ Exception -> 0x0398 }
            r7.K0(r0)     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x01ff:
            r1.u r7 = r6.f2768h
            r7.w0()
            goto L_0x0329
        L_0x0206:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            u1.b r0 = u1.b.a(r7)
            if (r0 != 0) goto L_0x0229
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown exposure mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setExposureModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x0229:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.A0(r8, r0)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0230:
            r1.u r0 = r6.f2768h
            if (r0 == 0) goto L_0x0244
            java.lang.String r1 = "imageFormatGroup"
            java.lang.Object r7 = r7.a(r1)     // Catch:{ Exception -> 0x0398 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0398 }
            r0.r0(r7)     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0244:
            java.lang.String r7 = "cameraNotFound"
            java.lang.String r0 = "Camera not found. Please call the 'create' method before calling 'initialize'."
            r8.b(r7, r0, r5)
            goto L_0x039c
        L_0x024d:
            r1.u r7 = r6.f2768h
            r7.t0(r8)
            goto L_0x039c
        L_0x0254:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            x1.b r0 = x1.b.a(r7)
            if (r0 != 0) goto L_0x0277
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown flash mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setFlashModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x0277:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.D0(r8, r0)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x027e:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            double r0 = r7.R()     // Catch:{ Exception -> 0x0398 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x028d:
            r1.u r7 = r6.f2768h
            r7.N0(r8)
            goto L_0x039c
        L_0x0294:
            r1.u r7 = r6.f2768h
            r7.x0(r8)
            goto L_0x039c
        L_0x029b:
            java.lang.Object r2 = r7.a(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x02ac
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x02aa
            goto L_0x02ac
        L_0x02aa:
            r7 = r5
            goto L_0x02b9
        L_0x02ac:
            java.lang.Object r1 = r7.a(r1)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
        L_0x02b9:
            r1.u r0 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            s1.e r1 = new s1.e     // Catch:{ Exception -> 0x0398 }
            r1.<init>(r5, r7)     // Catch:{ Exception -> 0x0398 }
            r0.F0(r8, r1)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x02c5:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.R0()     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x02cf:
            java.lang.String r0 = "zoom"
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
            if (r7 != 0) goto L_0x02e1
            java.lang.String r7 = "ZOOM_ERROR"
            java.lang.String r0 = "setZoomLevel is called without specifying a zoom level."
            r8.b(r7, r0, r5)
            return
        L_0x02e1:
            r1.u r0 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            float r7 = r7.floatValue()     // Catch:{ Exception -> 0x0398 }
            r0.H0(r8, r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x02ec:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            t1.b r0 = t1.b.a(r7)
            if (r0 != 0) goto L_0x030f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown focus mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setFocusModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x030f:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r7.E0(r8, r0)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0316:
            r1.u r0 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            java.lang.String r1 = "offset"
            java.lang.Object r7 = r7.a(r1)     // Catch:{ Exception -> 0x0398 }
            java.lang.Double r7 = (java.lang.Double) r7     // Catch:{ Exception -> 0x0398 }
            double r1 = r7.doubleValue()     // Catch:{ Exception -> 0x0398 }
            r0.B0(r8, r1)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0329:
            r8.a(r5)
            goto L_0x039c
        L_0x032d:
            java.lang.String r0 = "orientation"
            java.lang.Object r7 = r7.a(r0)
            java.lang.String r7 = (java.lang.String) r7
            n1.i$f r7 = r1.j0.a(r7)
            r1.u r0 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            r0.q0(r7)     // Catch:{ Exception -> 0x0398 }
            r8.a(r5)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0342:
            r1.u r0 = r6.f2768h
            if (r0 == 0) goto L_0x0349
            r0.I()
        L_0x0349:
            r1.a0 r0 = r6.f2763c
            android.app.Activity r1 = r6.f2761a
            r1.a0$b r2 = r6.f2764d
            java.lang.String r3 = "enableAudio"
            java.lang.Object r3 = r7.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1.p0 r4 = new r1.p0
            r4.<init>(r6, r7, r8)
            r0.e(r1, r2, r3, r4)
            goto L_0x039c
        L_0x0364:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            double r0 = r7.T()     // Catch:{ Exception -> 0x0398 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0372:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            double r0 = r7.Q()     // Catch:{ Exception -> 0x0398 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0380:
            r1.u r7 = r6.f2768h     // Catch:{ Exception -> 0x0398 }
            float r7 = r7.U()     // Catch:{ Exception -> 0x0398 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x038e:
            android.app.Activity r7 = r6.f2761a     // Catch:{ Exception -> 0x0398 }
            java.util.List r7 = r1.j0.b(r7)     // Catch:{ Exception -> 0x0398 }
            r8.a(r7)     // Catch:{ Exception -> 0x0398 }
            goto L_0x039c
        L_0x0398:
            r7 = move-exception
            r6.c(r7, r8)
        L_0x039c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.q0.a(o1.j, o1.k$d):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f2766f.e((k.c) null);
    }
}
