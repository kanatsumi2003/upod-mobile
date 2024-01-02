package a3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import m2.g;

public final class w extends b1 {

    /* renamed from: f  reason: collision with root package name */
    public static final w f117f = new w();

    /* renamed from: g  reason: collision with root package name */
    private static final int f118g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f119h;
    private static volatile Executor pool;

    static {
        String str;
        int i3;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i3 = -1;
        } else {
            Integer f4 = l.f(str);
            if (f4 == null || f4.intValue() < 1) {
                throw new IllegalStateException(i.j("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i3 = f4.intValue();
        }
        f118g = i3;
    }

    private w() {
    }

    private final ExecutorService q() {
        return Executors.newFixedThreadPool(v(), new u(new AtomicInteger()));
    }

    /* access modifiers changed from: private */
    public static final Thread s(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, i.j("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService t() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r6.q()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            r1 = r0
        L_0x0015:
            if (r1 != 0) goto L_0x001c
            java.util.concurrent.ExecutorService r0 = r6.q()
            return r0
        L_0x001c:
            boolean r2 = f119h
            r3 = 0
            if (r2 != 0) goto L_0x004d
            int r2 = f118g
            if (r2 >= 0) goto L_0x004d
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x003a }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x003a }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x003a }
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch:{ all -> 0x003a }
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x003b
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r2 != 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            a3.w r4 = f117f
            boolean r4 = r4.w(r1, r2)
            if (r4 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            if (r2 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            return r2
        L_0x004d:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0072 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0072 }
            r4[r3] = r5     // Catch:{ all -> 0x0072 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0072 }
            a3.w r4 = f117f     // Catch:{ all -> 0x0072 }
            int r4 = r4.v()     // Catch:{ all -> 0x0072 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0072 }
            r2[r3] = r4     // Catch:{ all -> 0x0072 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0072 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0073
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0072 }
            r0 = r1
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            if (r0 != 0) goto L_0x0079
            java.util.concurrent.ExecutorService r0 = r6.q()
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.t():java.util.concurrent.ExecutorService");
    }

    private final synchronized Executor u() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = t();
            pool = executor;
        }
        return executor;
    }

    private final int v() {
        Integer valueOf = Integer.valueOf(f118g);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf == null ? f.a(Runtime.getRuntime().availableProcessors() - 1, 1) : valueOf.intValue();
    }

    /* access modifiers changed from: private */
    public static final void x() {
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public void f(g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = u();
            }
            c.a();
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            c.a();
            n0.f81j.E(runnable);
        }
    }

    public String toString() {
        return "CommonPool";
    }

    public final boolean w(Class<?> cls, ExecutorService executorService) {
        executorService.submit(new v());
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }
}
