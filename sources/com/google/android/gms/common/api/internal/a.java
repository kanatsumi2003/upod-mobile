package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import x.g;

public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    private static final a f779e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f780a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f781b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f782c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f783d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    public interface C0015a {
        void a(boolean z3);
    }

    private a() {
    }

    public static a b() {
        return f779e;
    }

    public static void c(Application application) {
        a aVar = f779e;
        synchronized (aVar) {
            if (!aVar.f783d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f783d = true;
            }
        }
    }

    private final void f(boolean z3) {
        synchronized (f779e) {
            Iterator it = this.f782c.iterator();
            while (it.hasNext()) {
                ((C0015a) it.next()).a(z3);
            }
        }
    }

    public void a(C0015a aVar) {
        synchronized (f779e) {
            this.f782c.add(aVar);
        }
    }

    public boolean d() {
        return this.f780a.get();
    }

    @TargetApi(16)
    public boolean e(boolean z3) {
        if (!this.f781b.get()) {
            if (!g.b()) {
                return z3;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f781b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f780a.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f780a.compareAndSet(true, false);
        this.f781b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f780a.compareAndSet(true, false);
        this.f781b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f780a.compareAndSet(false, true)) {
            this.f781b.set(true);
            f(true);
        }
    }
}
