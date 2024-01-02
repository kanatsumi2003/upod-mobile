package u0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import t.o;
import t0.k;

public class g {

    /* renamed from: c  reason: collision with root package name */
    static boolean f3099c = false;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f3100a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3101b;

    public g(Executor executor) {
        this.f3101b = executor;
        if (executor != null || f3099c) {
            this.f3100a = null;
        } else {
            this.f3100a = new Handler(Looper.getMainLooper());
        }
    }

    public void a(Runnable runnable) {
        o.h(runnable);
        Handler handler = this.f3100a;
        if (handler == null) {
            Executor executor = this.f3101b;
            if (executor != null) {
                executor.execute(runnable);
            } else {
                k.b().c(runnable);
            }
        } else {
            handler.post(runnable);
        }
    }
}
