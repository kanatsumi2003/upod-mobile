package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.window.R;
import com.google.android.gms.common.api.Status;
import f0.k;
import f0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import q.a;
import q.f;
import r.a;
import s.a0;
import s.j;
import t.g0;
import t.h;
import t.m;
import t.p;
import t.q;
import t.s;
import t.t;
import t.u;
import x.e;

public class b implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f786r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Status f787s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final Object f788t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static b f789u;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f790a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f791b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f792c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f793d = false;

    /* renamed from: e  reason: collision with root package name */
    private s f794e;

    /* renamed from: f  reason: collision with root package name */
    private u f795f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f796g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final f f797h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g0 f798i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f799j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f800k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map<s.b<?>, m<?>> f801l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public f f802m = null;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set<s.b<?>> f803n = new c.b();

    /* renamed from: o  reason: collision with root package name */
    private final Set<s.b<?>> f804o = new c.b();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: p  reason: collision with root package name */
    public final Handler f805p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f806q = true;

    private b(Context context, Looper looper, f fVar) {
        this.f796g = context;
        a0.f fVar2 = new a0.f(looper, this);
        this.f805p = fVar2;
        this.f797h = fVar;
        this.f798i = new g0(fVar);
        if (e.a(context)) {
            this.f806q = false;
        }
        fVar2.sendMessage(fVar2.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    public static Status h(s.b<?> bVar, a aVar) {
        String b4 = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b4).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b4);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    private final m<?> i(r.e<?> eVar) {
        s.b<?> d4 = eVar.d();
        m<?> mVar = this.f801l.get(d4);
        if (mVar == null) {
            mVar = new m<>(this, eVar);
            this.f801l.put(d4, mVar);
        }
        if (mVar.P()) {
            this.f804o.add(d4);
        }
        mVar.E();
        return mVar;
    }

    private final u j() {
        if (this.f795f == null) {
            this.f795f = t.a(this.f796g);
        }
        return this.f795f;
    }

    private final void k() {
        s sVar = this.f794e;
        if (sVar != null) {
            if (sVar.b() > 0 || f()) {
                j().a(sVar);
            }
            this.f794e = null;
        }
    }

    private final <T> void l(l<T> lVar, int i3, r.e eVar) {
        q b4;
        if (i3 != 0 && (b4 = q.b(this, i3, eVar.d())) != null) {
            k<T> a4 = lVar.a();
            Handler handler = this.f805p;
            handler.getClass();
            a4.d(new s.l(handler), b4);
        }
    }

    public static b x(Context context) {
        b bVar;
        synchronized (f788t) {
            if (f789u == null) {
                f789u = new b(context.getApplicationContext(), h.c().getLooper(), f.k());
            }
            bVar = f789u;
        }
        return bVar;
    }

    public final <O extends a.d, ResultT> void D(r.e<O> eVar, int i3, c<a.b, ResultT> cVar, l<ResultT> lVar, j jVar) {
        l(lVar, cVar.d(), eVar);
        v vVar = new v(i3, cVar, lVar, jVar);
        Handler handler = this.f805p;
        handler.sendMessage(handler.obtainMessage(4, new s.t(vVar, this.f800k.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final void E(m mVar, int i3, long j3, int i4) {
        Handler handler = this.f805p;
        handler.sendMessage(handler.obtainMessage(18, new r(mVar, i3, j3, i4)));
    }

    public final void F(q.a aVar, int i3) {
        if (!g(aVar, i3)) {
            Handler handler = this.f805p;
            handler.sendMessage(handler.obtainMessage(5, i3, 0, aVar));
        }
    }

    public final void a() {
        Handler handler = this.f805p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(r.e<?> eVar) {
        Handler handler = this.f805p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(f fVar) {
        synchronized (f788t) {
            if (this.f802m != fVar) {
                this.f802m = fVar;
                this.f803n.clear();
            }
            this.f803n.addAll(fVar.t());
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(f fVar) {
        synchronized (f788t) {
            if (this.f802m == fVar) {
                this.f802m = null;
                this.f803n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f793d) {
            return false;
        }
        q a4 = p.b().a();
        if (a4 != null && !a4.d()) {
            return false;
        }
        int a5 = this.f798i.a(this.f796g, 203400000);
        return a5 == -1 || a5 == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(q.a aVar, int i3) {
        return this.f797h.u(this.f796g, aVar, i3);
    }

    public final boolean handleMessage(Message message) {
        l<Boolean> lVar;
        Boolean bool;
        int i3 = message.what;
        long j3 = 300000;
        m mVar = null;
        switch (i3) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j3 = 10000;
                }
                this.f792c = j3;
                this.f805p.removeMessages(12);
                for (s.b<?> obtainMessage : this.f801l.keySet()) {
                    Handler handler = this.f805p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f792c);
                }
                break;
            case 2:
                a0 a0Var = (a0) message.obj;
                Iterator<s.b<?>> it = a0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        s.b next = it.next();
                        m mVar2 = this.f801l.get(next);
                        if (mVar2 == null) {
                            a0Var.b(next, new q.a(13), (String) null);
                            break;
                        } else if (mVar2.O()) {
                            a0Var.b(next, q.a.f2617h, mVar2.v().i());
                        } else {
                            q.a t3 = mVar2.t();
                            if (t3 != null) {
                                a0Var.b(next, t3, (String) null);
                            } else {
                                mVar2.J(a0Var);
                                mVar2.E();
                            }
                        }
                    }
                }
            case 3:
                for (m next2 : this.f801l.values()) {
                    next2.D();
                    next2.E();
                }
                break;
            case 4:
            case 8:
            case 13:
                s.t tVar = (s.t) message.obj;
                m<?> mVar3 = this.f801l.get(tVar.f2861c.d());
                if (mVar3 == null) {
                    mVar3 = i(tVar.f2861c);
                }
                if (mVar3.P() && this.f800k.get() != tVar.f2860b) {
                    tVar.f2859a.a(f786r);
                    mVar3.L();
                    break;
                } else {
                    mVar3.F(tVar.f2859a);
                    break;
                }
            case R.styleable.SplitPairRule_splitMinWidth:
                int i4 = message.arg1;
                q.a aVar = (q.a) message.obj;
                Iterator<m<?>> it2 = this.f801l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        m next3 = it2.next();
                        if (next3.r() == i4) {
                            mVar = next3;
                        }
                    }
                }
                if (mVar != null) {
                    if (aVar.b() != 13) {
                        mVar.g(h(mVar.f835c, aVar));
                        break;
                    } else {
                        String d4 = this.f797h.d(aVar.b());
                        String c4 = aVar.c();
                        StringBuilder sb = new StringBuilder(String.valueOf(d4).length() + 69 + String.valueOf(c4).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(d4);
                        sb.append(": ");
                        sb.append(c4);
                        mVar.g(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i4);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case R.styleable.SplitPairRule_splitRatio:
                if (this.f796g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f796g.getApplicationContext());
                    a.b().a(new h(this));
                    if (!a.b().e(true)) {
                        this.f792c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((r.e) message.obj);
                break;
            case 9:
                if (this.f801l.containsKey(message.obj)) {
                    this.f801l.get(message.obj).K();
                    break;
                }
                break;
            case 10:
                for (s.b<?> remove : this.f804o) {
                    m remove2 = this.f801l.remove(remove);
                    if (remove2 != null) {
                        remove2.L();
                    }
                }
                this.f804o.clear();
                break;
            case 11:
                if (this.f801l.containsKey(message.obj)) {
                    this.f801l.get(message.obj).M();
                    break;
                }
                break;
            case 12:
                if (this.f801l.containsKey(message.obj)) {
                    this.f801l.get(message.obj).d();
                    break;
                }
                break;
            case 14:
                g gVar = (g) message.obj;
                s.b<?> a4 = gVar.a();
                if (!this.f801l.containsKey(a4)) {
                    lVar = gVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean N = this.f801l.get(a4).q(false);
                    lVar = gVar.b();
                    bool = Boolean.valueOf(N);
                }
                lVar.c(bool);
                break;
            case 15:
                n nVar = (n) message.obj;
                if (this.f801l.containsKey(nVar.f846a)) {
                    m.B(this.f801l.get(nVar.f846a), nVar);
                    break;
                }
                break;
            case 16:
                n nVar2 = (n) message.obj;
                if (this.f801l.containsKey(nVar2.f846a)) {
                    m.C(this.f801l.get(nVar2.f846a), nVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                r rVar = (r) message.obj;
                if (rVar.f863c != 0) {
                    s sVar = this.f794e;
                    if (sVar != null) {
                        List<m> c5 = sVar.c();
                        if (sVar.b() != rVar.f862b || (c5 != null && c5.size() >= rVar.f864d)) {
                            this.f805p.removeMessages(17);
                            k();
                        } else {
                            this.f794e.d(rVar.f861a);
                        }
                    }
                    if (this.f794e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(rVar.f861a);
                        this.f794e = new s(rVar.f862b, arrayList);
                        Handler handler2 = this.f805p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), rVar.f863c);
                        break;
                    }
                } else {
                    j().a(new s(rVar.f862b, Arrays.asList(new m[]{rVar.f861a})));
                    break;
                }
                break;
            case 19:
                this.f793d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f799j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final m w(s.b<?> bVar) {
        return this.f801l.get(bVar);
    }
}
