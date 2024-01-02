package kotlinx.coroutines.scheduling;

import a3.m0;

public final class k extends i {

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f2210f;

    public k(Runnable runnable, long j3, j jVar) {
        super(j3, jVar);
        this.f2210f = runnable;
    }

    public void run() {
        try {
            this.f2210f.run();
        } finally {
            this.f2209e.a();
        }
    }

    public String toString() {
        return "Task[" + m0.a(this.f2210f) + '@' + m0.b(this.f2210f) + ", " + this.f2208d + ", " + this.f2209e + ']';
    }
}
