package y1;

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
    private Size f3253b;

    /* renamed from: c  reason: collision with root package name */
    private e f3254c;

    /* renamed from: d  reason: collision with root package name */
    private MeteringRectangle f3255d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3256e;

    public a(d0 d0Var, b bVar) {
        super(d0Var);
        this.f3256e = bVar;
    }

    private void c() {
        MeteringRectangle b4;
        if (this.f3253b != null) {
            if (this.f3254c == null) {
                b4 = null;
            } else {
                i.f d4 = this.f3256e.d();
                if (d4 == null) {
                    d4 = this.f3256e.c().c();
                }
                b4 = h0.b(this.f3253b, this.f3254c.f2884a.doubleValue(), this.f3254c.f2885b.doubleValue(), d4);
            }
            this.f3255d = b4;
            return;
        }
        throw new AssertionError("The cameraBoundaries should be set (using `FocusPointFeature.setCameraBoundaries(Size)`) before updating the focus point.");
    }

    public String a() {
        return "FocusPointFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        MeteringRectangle[] meteringRectangleArr;
        if (d()) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
            MeteringRectangle meteringRectangle = this.f3255d;
            if (meteringRectangle == null) {
                meteringRectangleArr = null;
            } else {
                meteringRectangleArr = new MeteringRectangle[]{meteringRectangle};
            }
            builder.set(key, meteringRectangleArr);
        }
    }

    public boolean d() {
        Integer p3 = this.f2882a.p();
        return p3 != null && p3.intValue() > 0;
    }

    public void e(Size size) {
        this.f3253b = size;
        c();
    }

    public void f(e eVar) {
        if (eVar == null || eVar.f2884a == null || eVar.f2885b == null) {
            eVar = null;
        }
        this.f3254c = eVar;
        c();
    }
}
