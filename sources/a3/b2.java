package a3;

public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    public static final b2 f45a = new b2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<v0> f46b = new ThreadLocal<>();

    private b2() {
    }

    public final v0 a() {
        ThreadLocal<v0> threadLocal = f46b;
        v0 v0Var = threadLocal.get();
        if (v0Var != null) {
            return v0Var;
        }
        v0 a4 = y0.a();
        threadLocal.set(a4);
        return a4;
    }

    public final void b() {
        f46b.set((Object) null);
    }

    public final void c(v0 v0Var) {
        f46b.set(v0Var);
    }
}
