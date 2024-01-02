package a3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class u implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f112a;

    public /* synthetic */ u(AtomicInteger atomicInteger) {
        this.f112a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return w.s(this.f112a, runnable);
    }
}
