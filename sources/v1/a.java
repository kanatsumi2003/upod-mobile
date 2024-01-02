package v1;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import r1.d0;

public class a extends s1.a<Double> {

    /* renamed from: b  reason: collision with root package name */
    private double f3144b = 0.0d;

    public a(d0 d0Var) {
        super(d0Var);
    }

    public String a() {
        return "ExposureOffsetFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        if (c()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf((int) this.f3144b));
        }
    }

    public boolean c() {
        return true;
    }

    public double d() {
        return this.f2882a.e();
    }

    public double e() {
        Range<Integer> d4 = this.f2882a.d();
        return (d4 == null ? 0.0d : (double) d4.getUpper().intValue()) * d();
    }

    public double f() {
        Range<Integer> d4 = this.f2882a.d();
        return (d4 == null ? 0.0d : (double) d4.getLower().intValue()) * d();
    }

    public Double g() {
        return Double.valueOf(this.f3144b);
    }

    public void h(Double d4) {
        this.f3144b = d4.doubleValue() / d();
    }
}
