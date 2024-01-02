package z1;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import r1.d0;

public class a extends s1.a<Range<Integer>> {

    /* renamed from: c  reason: collision with root package name */
    private static final Range<Integer> f3267c = new Range<>(30, 30);

    /* renamed from: b  reason: collision with root package name */
    private Range<Integer> f3268b;

    public a(d0 d0Var) {
        super(d0Var);
        Range<Integer> range;
        if (d()) {
            this.f3268b = f3267c;
            return;
        }
        Range<Integer>[] n3 = d0Var.n();
        if (n3 != null) {
            for (Range<Integer> range2 : n3) {
                int intValue = range2.getUpper().intValue();
                if (intValue >= 10 && ((range = this.f3268b) == null || intValue > range.getUpper().intValue())) {
                    this.f3268b = range2;
                }
            }
        }
    }

    private boolean d() {
        return Build.BRAND.equals("google") && Build.MODEL.equals("Pixel 4a");
    }

    public String a() {
        return "FpsRangeFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        if (c()) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.f3268b);
        }
    }

    public boolean c() {
        return true;
    }
}
