package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.y;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2211a = a0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f2212b = a0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f2213c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2214d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f2215e = TimeUnit.SECONDS.toNanos(a0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: f  reason: collision with root package name */
    public static h f2216f = f.f2205a;

    static {
        int f4 = a0.d("kotlinx.coroutines.scheduler.core.pool.size", f.a(y.a(), 2), 1, 0, 8, (Object) null);
        f2213c = f4;
        f2214d = a0.d("kotlinx.coroutines.scheduler.max.pool.size", f.e(y.a() * 128, f4, 2097150), 0, 2097150, 4, (Object) null);
    }
}
