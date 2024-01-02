package a3;

import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m2.g;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f60a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        f60a = h.e(f.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final void a(g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : f60a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, h0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
