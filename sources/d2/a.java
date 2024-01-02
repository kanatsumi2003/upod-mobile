package d2;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import r1.d0;

public class a extends s1.a<Float> {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1054b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f1055c;

    /* renamed from: d  reason: collision with root package name */
    private Float f1056d;

    /* renamed from: e  reason: collision with root package name */
    private Float f1057e;

    public a(d0 d0Var) {
        super(d0Var);
        Float valueOf = Float.valueOf(1.0f);
        this.f1056d = valueOf;
        this.f1057e = valueOf;
        Rect g3 = d0Var.g();
        this.f1055c = g3;
        boolean z3 = false;
        if (g3 == null) {
            this.f1057e = valueOf;
            this.f1054b = false;
            return;
        }
        Float o3 = d0Var.o();
        Float valueOf2 = Float.valueOf((o3 == null || o3.floatValue() < 1.0f) ? 1.0f : o3.floatValue());
        this.f1057e = valueOf2;
        this.f1054b = Float.compare(valueOf2.floatValue(), 1.0f) > 0 ? true : z3;
    }

    public String a() {
        return "ZoomLevelFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        if (c()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, b.a(this.f1056d.floatValue(), this.f1055c, 1.0f, this.f1057e.floatValue()));
        }
    }

    public boolean c() {
        return this.f1054b;
    }

    public float d() {
        return this.f1057e.floatValue();
    }

    public float e() {
        return 1.0f;
    }

    public void f(Float f4) {
        this.f1056d = f4;
    }
}
