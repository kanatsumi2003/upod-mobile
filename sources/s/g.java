package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import q.c;
import r.a;
import t.c;
import t.h;
import t.i;
import t.o;

public final class g implements a.f, ServiceConnection {

    /* renamed from: l  reason: collision with root package name */
    private static final String f2837l = g.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f2838a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2839b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f2840c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f2841d;

    /* renamed from: e  reason: collision with root package name */
    private final c f2842e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f2843f;

    /* renamed from: g  reason: collision with root package name */
    private final h f2844g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f2845h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2846i;

    /* renamed from: j  reason: collision with root package name */
    private String f2847j;

    /* renamed from: k  reason: collision with root package name */
    private String f2848k;

    private final void s() {
        if (Thread.currentThread() != this.f2843f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(this.f2845h);
    }

    public final boolean a() {
        s();
        return this.f2845h != null;
    }

    public final Set<Scope> b() {
        return Collections.emptySet();
    }

    public final void c(String str) {
        s();
        this.f2847j = str;
        n();
    }

    public final void d(i iVar, Set<Scope> set) {
    }

    public final boolean e() {
        return false;
    }

    public final int f() {
        return 0;
    }

    public final boolean g() {
        s();
        return this.f2846i;
    }

    public final c[] h() {
        return new c[0];
    }

    public final String i() {
        String str = this.f2838a;
        if (str != null) {
            return str;
        }
        o.h(this.f2840c);
        return this.f2840c.getPackageName();
    }

    public final void j(c.C0050c cVar) {
        s();
        t("Connect started.");
        if (a()) {
            try {
                c("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f2840c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f2838a).setAction(this.f2839b);
            }
            boolean bindService = this.f2841d.bindService(intent, this, h.a());
            this.f2846i = bindService;
            if (!bindService) {
                this.f2845h = null;
                this.f2844g.b(new q.a(16));
            }
            t("Finished connect.");
        } catch (SecurityException e4) {
            this.f2846i = false;
            this.f2845h = null;
            throw e4;
        }
    }

    public final String l() {
        return this.f2847j;
    }

    public final void m(c.e eVar) {
    }

    public final void n() {
        s();
        t("Disconnect called.");
        try {
            this.f2841d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f2846i = false;
        this.f2845h = null;
    }

    public final boolean o() {
        return false;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2843f.post(new s(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2843f.post(new r(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.f2846i = false;
        this.f2845h = null;
        t("Disconnected.");
        this.f2842e.a(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f2846i = false;
        this.f2845h = iBinder;
        t("Connected.");
        this.f2842e.c(new Bundle());
    }

    public final void r(String str) {
        this.f2848k = str;
    }
}
