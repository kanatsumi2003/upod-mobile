package androidx.window.java.layout;

import a3.d1;
import a3.j0;
import a3.k0;
import a3.k1;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import d3.b;
import j.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import k2.s;
import kotlin.jvm.internal.i;
import m2.d;
import m2.g;

public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, k1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        i.e(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, a<T> aVar, b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, h.b(j0.a(d1.a(executor)), (g) null, (k0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, (d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            s sVar = s.f2081a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            k1 k1Var = this.consumerToJobMap.get(aVar);
            if (k1Var != null) {
                k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            }
            k1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        i.e(activity, "activity");
        i.e(executor, "executor");
        i.e(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        i.e(aVar, "consumer");
        removeListener(aVar);
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        i.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
