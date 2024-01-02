package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import r.f;
import r.g;
import r.h;
import r.j;
import r.k;
import s.c0;
import t.o;

@KeepName
public abstract class BasePendingResult<R extends j> extends g<R> {

    /* renamed from: o  reason: collision with root package name */
    static final ThreadLocal<Boolean> f763o = new c0();

    /* renamed from: a  reason: collision with root package name */
    private final Object f764a = new Object();

    /* renamed from: b  reason: collision with root package name */
    protected final a<R> f765b = new a<>(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    protected final WeakReference<f> f766c = new WeakReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f767d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<g.a> f768e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private k<? super R> f769f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<u> f770g = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public R f771h;

    /* renamed from: i  reason: collision with root package name */
    private Status f772i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f773j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f774k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f775l;

    /* renamed from: m  reason: collision with root package name */
    private t.j f776m;
    @KeepName
    private d0 mResultGuardian;

    /* renamed from: n  reason: collision with root package name */
    private boolean f777n = false;

    public static class a<R extends j> extends a0.f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(k<? super R> kVar, R r3) {
            ThreadLocal<Boolean> threadLocal = BasePendingResult.f763o;
            sendMessage(obtainMessage(1, new Pair((k) o.h(kVar), r3)));
        }

        public final void handleMessage(Message message) {
            int i3 = message.what;
            if (i3 == 1) {
                Pair pair = (Pair) message.obj;
                k kVar = (k) pair.first;
                j jVar = (j) pair.second;
                try {
                    kVar.a(jVar);
                } catch (RuntimeException e4) {
                    BasePendingResult.h(jVar);
                    throw e4;
                }
            } else if (i3 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.f754m);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R e() {
        R r3;
        synchronized (this.f764a) {
            o.k(!this.f773j, "Result has already been consumed.");
            o.k(c(), "Result is not ready.");
            r3 = this.f771h;
            this.f771h = null;
            this.f769f = null;
            this.f773j = true;
        }
        if (this.f770g.getAndSet((Object) null) == null) {
            return (j) o.h(r3);
        }
        throw null;
    }

    private final void f(R r3) {
        this.f771h = r3;
        this.f772i = r3.a();
        this.f776m = null;
        this.f767d.countDown();
        if (this.f774k) {
            this.f769f = null;
        } else {
            k<? super R> kVar = this.f769f;
            if (kVar != null) {
                this.f765b.removeMessages(2);
                this.f765b.a(kVar, e());
            } else if (this.f771h instanceof h) {
                this.mResultGuardian = new d0(this, (c0) null);
            }
        }
        ArrayList<g.a> arrayList = this.f768e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.get(i3).a(this.f772i);
        }
        this.f768e.clear();
    }

    public static void h(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException e4) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(jVar)), e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f764a) {
            if (!c()) {
                d(a(status));
                this.f775l = true;
            }
        }
    }

    public final boolean c() {
        return this.f767d.getCount() == 0;
    }

    public final void d(R r3) {
        synchronized (this.f764a) {
            if (this.f775l || this.f774k) {
                h(r3);
                return;
            }
            c();
            o.k(!c(), "Results have already been set");
            o.k(!this.f773j, "Result has already been consumed");
            f(r3);
        }
    }
}
