package s;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class l implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Handler f2852d;

    public /* synthetic */ l(Handler handler) {
        this.f2852d = handler;
    }

    public final void execute(Runnable runnable) {
        this.f2852d.post(runnable);
    }
}
