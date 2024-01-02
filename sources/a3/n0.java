package a3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class n0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j  reason: collision with root package name */
    public static final n0 f81j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f82k;

    static {
        Long l3;
        n0 n0Var = new n0();
        f81j = n0Var;
        v0.u(n0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f82k = timeUnit.toNanos(l3.longValue());
    }

    private n0() {
    }

    private final synchronized void P() {
        if (R()) {
            debugStatus = 3;
            K();
            notifyAll();
        }
    }

    private final synchronized Thread Q() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean R() {
        int i3 = debugStatus;
        return i3 == 2 || i3 == 3;
    }

    private final synchronized boolean S() {
        if (R()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public void run() {
        b2.f45a.c(this);
        c.a();
        try {
            if (S()) {
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long I = I();
                    if (I == Long.MAX_VALUE) {
                        c.a();
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f82k + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            P();
                            c.a();
                            if (!H()) {
                                y();
                                return;
                            }
                            return;
                        }
                        I = f.d(I, j4);
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (I > 0) {
                        if (R()) {
                            _thread = null;
                            P();
                            c.a();
                            if (!H()) {
                                y();
                                return;
                            }
                            return;
                        }
                        c.a();
                        LockSupport.parkNanos(this, I);
                    }
                }
            }
        } finally {
            _thread = null;
            P();
            c.a();
            if (!H()) {
                y();
            }
        }
    }

    /* access modifiers changed from: protected */
    public Thread y() {
        Thread thread = _thread;
        return thread == null ? Q() : thread;
    }
}
