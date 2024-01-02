package i;

import android.os.Handler;
import j.d;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class c {

    private static class a implements Executor {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f1385d;

        a(Handler handler) {
            this.f1385d = (Handler) d.a(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f1385d.post((Runnable) d.a(runnable))) {
                throw new RejectedExecutionException(this.f1385d + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
