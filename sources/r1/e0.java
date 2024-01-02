package r1;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Range;
import android.util.Rational;
import android.util.Size;

class e0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final CameraCharacteristics f2696a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2697b;

    public e0(String str, CameraManager cameraManager) {
        this.f2697b = str;
        this.f2696a = cameraManager.getCameraCharacteristics(str);
    }

    public int a() {
        return ((Integer) this.f2696a.get(CameraCharacteristics.LENS_FACING)).intValue();
    }

    public Integer b() {
        return (Integer) this.f2696a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
    }

    public int[] c() {
        return (int[]) this.f2696a.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
    }

    public Range<Integer> d() {
        return (Range) this.f2696a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public double e() {
        Rational rational = (Rational) this.f2696a.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (rational == null) {
            return 0.0d;
        }
        return rational.doubleValue();
    }

    public Boolean f() {
        return (Boolean) this.f2696a.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    public Rect g() {
        return (Rect) this.f2696a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public int h() {
        return ((Integer) this.f2696a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    public int[] i() {
        return (int[]) this.f2696a.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
    }

    public int[] j() {
        return (int[]) this.f2696a.get(CameraCharacteristics.DISTORTION_CORRECTION_AVAILABLE_MODES);
    }

    public Float k() {
        return (Float) this.f2696a.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
    }

    public Rect l() {
        return (Rect) this.f2696a.get(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
    }

    public Size m() {
        return (Size) this.f2696a.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
    }

    public Range<Integer>[] n() {
        return (Range[]) this.f2696a.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
    }

    public Float o() {
        return (Float) this.f2696a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
    }

    public Integer p() {
        return (Integer) this.f2696a.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
    }

    public String q() {
        return this.f2697b;
    }
}
