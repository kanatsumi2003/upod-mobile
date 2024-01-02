package c1;

import android.os.Handler;
import android.os.Looper;
import c1.c;
import j2.b;

public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f682a = b.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f682a.post(runnable);
    }
}
