package t0;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static k f3060a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static BlockingQueue<Runnable> f3061b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadPoolExecutor f3062c;

    /* renamed from: d  reason: collision with root package name */
    private static BlockingQueue<Runnable> f3063d = new LinkedBlockingQueue();

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadPoolExecutor f3064e;

    /* renamed from: f  reason: collision with root package name */
    private static BlockingQueue<Runnable> f3065f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadPoolExecutor f3066g;

    /* renamed from: h  reason: collision with root package name */
    private static BlockingQueue<Runnable> f3067h = new LinkedBlockingQueue();

    /* renamed from: i  reason: collision with root package name */
    private static final ThreadPoolExecutor f3068i;

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f3069a = new AtomicInteger(1);

        /* renamed from: b  reason: collision with root package name */
        private final String f3070b;

        a(String str) {
            this.f3070b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "FirebaseStorage-" + this.f3070b + this.f3069a.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, timeUnit, f3061b, new a("Command-"));
        f3062c = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5, timeUnit, f3063d, new a("Upload-"));
        f3064e = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5, timeUnit, f3065f, new a("Download-"));
        f3066g = threadPoolExecutor3;
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5, timeUnit, f3067h, new a("Callbacks-"));
        f3068i = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
    }

    public static k b() {
        return f3060a;
    }

    public Executor a() {
        return f3062c;
    }

    public void c(Runnable runnable) {
        f3068i.execute(runnable);
    }

    public void d(Runnable runnable) {
        f3062c.execute(runnable);
    }

    public void e(Runnable runnable) {
        f3066g.execute(runnable);
    }

    public void f(Runnable runnable) {
        f3064e.execute(runnable);
    }
}
