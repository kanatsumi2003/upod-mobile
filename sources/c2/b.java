package c2;

import android.app.Activity;
import android.hardware.camera2.CaptureRequest;
import n1.i;
import r1.d0;
import r1.m0;
import s1.a;

public class b extends a<Integer> {

    /* renamed from: b  reason: collision with root package name */
    private Integer f692b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final a f693c;

    /* renamed from: d  reason: collision with root package name */
    private i.f f694d;

    public b(d0 d0Var, Activity activity, m0 m0Var) {
        super(d0Var);
        boolean z3 = false;
        f(Integer.valueOf(d0Var.h()));
        a a4 = a.a(activity, m0Var, d0Var.a() == 0 ? true : z3, this.f692b.intValue());
        this.f693c = a4;
        a4.k();
    }

    public String a() {
        return "SensorOrientationFeature";
    }

    public void b(CaptureRequest.Builder builder) {
    }

    public a c() {
        return this.f693c;
    }

    public i.f d() {
        return this.f694d;
    }

    public void e(i.f fVar) {
        this.f694d = fVar;
    }

    public void f(Integer num) {
        this.f692b = num;
    }

    public void g() {
        this.f694d = null;
    }
}
