package r1;

import android.app.Activity;
import g1.a;
import io.flutter.view.u;
import o1.c;
import r1.a0;

public final class c0 implements a, h1.a {

    /* renamed from: a  reason: collision with root package name */
    private a.b f2692a;

    /* renamed from: b  reason: collision with root package name */
    private q0 f2693b;

    private void e(Activity activity, c cVar, a0.b bVar, u uVar) {
        this.f2693b = new q0(activity, cVar, new a0(), bVar, uVar);
    }

    public void a(h1.c cVar) {
        e(cVar.d(), this.f2692a.b(), new b0(cVar), this.f2692a.c());
    }

    public void b(h1.c cVar) {
        a(cVar);
    }

    public void c() {
        q0 q0Var = this.f2693b;
        if (q0Var != null) {
            q0Var.f();
            this.f2693b = null;
        }
    }

    public void d() {
        c();
    }

    public void f(a.b bVar) {
        this.f2692a = null;
    }

    public void h(a.b bVar) {
        this.f2692a = bVar;
    }
}
