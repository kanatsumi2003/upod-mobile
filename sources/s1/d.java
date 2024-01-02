package s1;

import android.app.Activity;
import b2.c;
import c2.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import r1.d0;
import r1.m0;
import t1.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f2883a = new HashMap();

    public static d k(b bVar, d0 d0Var, Activity activity, m0 m0Var, c cVar) {
        d dVar = new d();
        dVar.l(bVar.d(d0Var, false));
        dVar.m(bVar.k(d0Var));
        dVar.n(bVar.i(d0Var));
        b e4 = bVar.e(d0Var, activity, m0Var);
        dVar.u(e4);
        dVar.o(bVar.c(d0Var, e4));
        dVar.p(bVar.a(d0Var));
        dVar.q(bVar.b(d0Var, e4));
        dVar.r(bVar.f(d0Var));
        dVar.s(bVar.g(d0Var));
        dVar.t(bVar.h(d0Var, cVar, d0Var.q()));
        dVar.v(bVar.j(d0Var));
        return dVar;
    }

    public Collection<a> a() {
        return this.f2883a.values();
    }

    public a b() {
        return (a) this.f2883a.get("AUTO_FOCUS");
    }

    public u1.a c() {
        return (u1.a) this.f2883a.get("EXPOSURE_LOCK");
    }

    public v1.a d() {
        return (v1.a) this.f2883a.get("EXPOSURE_OFFSET");
    }

    public w1.a e() {
        return (w1.a) this.f2883a.get("EXPOSURE_POINT");
    }

    public x1.a f() {
        return (x1.a) this.f2883a.get("FLASH");
    }

    public y1.a g() {
        return (y1.a) this.f2883a.get("FOCUS_POINT");
    }

    public b2.b h() {
        return (b2.b) this.f2883a.get("RESOLUTION");
    }

    public b i() {
        return (b) this.f2883a.get("SENSOR_ORIENTATION");
    }

    public d2.a j() {
        return (d2.a) this.f2883a.get("ZOOM_LEVEL");
    }

    public void l(a aVar) {
        this.f2883a.put("AUTO_FOCUS", aVar);
    }

    public void m(u1.a aVar) {
        this.f2883a.put("EXPOSURE_LOCK", aVar);
    }

    public void n(v1.a aVar) {
        this.f2883a.put("EXPOSURE_OFFSET", aVar);
    }

    public void o(w1.a aVar) {
        this.f2883a.put("EXPOSURE_POINT", aVar);
    }

    public void p(x1.a aVar) {
        this.f2883a.put("FLASH", aVar);
    }

    public void q(y1.a aVar) {
        this.f2883a.put("FOCUS_POINT", aVar);
    }

    public void r(z1.a aVar) {
        this.f2883a.put("FPS_RANGE", aVar);
    }

    public void s(a2.a aVar) {
        this.f2883a.put("NOISE_REDUCTION", aVar);
    }

    public void t(b2.b bVar) {
        this.f2883a.put("RESOLUTION", bVar);
    }

    public void u(b bVar) {
        this.f2883a.put("SENSOR_ORIENTATION", bVar);
    }

    public void v(d2.a aVar) {
        this.f2883a.put("ZOOM_LEVEL", aVar);
    }
}
