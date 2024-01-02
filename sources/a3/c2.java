package a3;

import m2.g;

public final class c2 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final c2 f48e = new c2();

    private c2() {
    }

    public void f(g gVar, Runnable runnable) {
        f2 f2Var = (f2) gVar.get(f2.f58e);
        if (f2Var != null) {
            f2Var.f59d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean g(g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
