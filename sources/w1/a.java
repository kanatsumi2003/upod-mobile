package w1;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import c2.b;
import n1.i;
import r1.d0;
import r1.h0;
import s1.e;

public class a extends s1.a<e> {

    /* renamed from: b  reason: collision with root package name */
    private Size f3148b;

    /* renamed from: c  reason: collision with root package name */
    private e f3149c;

    /* renamed from: d  reason: collision with root package name */
    private MeteringRectangle f3150d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3151e;

    public a(d0 d0Var, b bVar) {
        super(d0Var);
        this.f3151e = bVar;
    }

    private void c() {
        MeteringRectangle b4;
        if (this.f3148b != null) {
            if (this.f3149c == null) {
                b4 = null;
            } else {
                i.f d4 = this.f3151e.d();
                if (d4 == null) {
                    d4 = this.f3151e.c().c();
                }
                b4 = h0.b(this.f3148b, this.f3149c.f2884a.doubleValue(), this.f3149c.f2885b.doubleValue(), d4);
            }
            this.f3150d = b4;
            return;
        }
        throw new AssertionError("The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point.");
    }

    public String a() {
        return "ExposurePointFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        MeteringRectangle[] meteringRectangleArr;
        if (d()) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
            MeteringRectangle meteringRectangle = this.f3150d;
            if (meteringRectangle == null) {
                meteringRectangleArr = null;
            } else {
                meteringRectangleArr = new MeteringRectangle[]{meteringRectangle};
            }
            builder.set(key, meteringRectangleArr);
        }
    }

    public boolean d() {
        Integer b4 = this.f2882a.b();
        return b4 != null && b4.intValue() > 0;
    }

    public void e(Size size) {
        this.f3148b = size;
        c();
    }

    public void f(e eVar) {
        if (eVar == null || eVar.f2884a == null || eVar.f2885b == null) {
            eVar = null;
        }
        this.f3149c = eVar;
        c();
    }
}
