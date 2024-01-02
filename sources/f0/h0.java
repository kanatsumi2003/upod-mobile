package f0;

import android.os.Handler;
import android.os.Looper;
import c0.a;
import java.util.concurrent.Executor;

final class h0 implements Executor {

    /* renamed from: d  reason: collision with root package name */
    private final Handler f1199d = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f1199d.post(runnable);
    }
}
