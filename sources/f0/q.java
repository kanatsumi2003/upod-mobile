package f0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class q implements r {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f1212a = new CountDownLatch(1);

    /* synthetic */ q(p pVar) {
    }

    public final void a() {
        this.f1212a.countDown();
    }

    public final void b(Object obj) {
        this.f1212a.countDown();
    }

    public final void c(Exception exc) {
        this.f1212a.countDown();
    }

    public final void d() {
        this.f1212a.await();
    }

    public final boolean e(long j3, TimeUnit timeUnit) {
        return this.f1212a.await(j3, timeUnit);
    }
}
