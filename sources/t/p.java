package t;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static p f3017b;

    /* renamed from: c  reason: collision with root package name */
    private static final q f3018c = new q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private q f3019a;

    private p() {
    }

    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            if (f3017b == null) {
                f3017b = new p();
            }
            pVar = f3017b;
        }
        return pVar;
    }

    public q a() {
        return this.f3019a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f3019a = f3018c;
            return;
        }
        q qVar2 = this.f3019a;
        if (qVar2 == null || qVar2.f() < qVar.f()) {
            this.f3019a = qVar;
        }
    }
}
