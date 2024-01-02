package t;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q.g;

public abstract class c<T extends IInterface> {
    public static final String[] D = {"service_esmobile", "service_googleme"};
    private static final q.c[] E = new q.c[0];
    /* access modifiers changed from: private */
    public boolean A = false;
    private volatile y0 B = null;
    protected AtomicInteger C = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private int f2891a;

    /* renamed from: b  reason: collision with root package name */
    private long f2892b;

    /* renamed from: c  reason: collision with root package name */
    private long f2893c;

    /* renamed from: d  reason: collision with root package name */
    private int f2894d;

    /* renamed from: e  reason: collision with root package name */
    private long f2895e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f2896f = null;

    /* renamed from: g  reason: collision with root package name */
    k1 f2897g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f2898h;

    /* renamed from: i  reason: collision with root package name */
    private final Looper f2899i;

    /* renamed from: j  reason: collision with root package name */
    private final h f2900j;

    /* renamed from: k  reason: collision with root package name */
    private final g f2901k;

    /* renamed from: l  reason: collision with root package name */
    final Handler f2902l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f2903m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Object f2904n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public l f2905o;

    /* renamed from: p  reason: collision with root package name */
    protected C0050c f2906p;

    /* renamed from: q  reason: collision with root package name */
    private IInterface f2907q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f2908r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private v0 f2909s;

    /* renamed from: t  reason: collision with root package name */
    private int f2910t = 1;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final a f2911u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final b f2912v;

    /* renamed from: w  reason: collision with root package name */
    private final int f2913w;

    /* renamed from: x  reason: collision with root package name */
    private final String f2914x;

    /* renamed from: y  reason: collision with root package name */
    private volatile String f2915y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public q.a f2916z = null;

    public interface a {
        void a(int i3);

        void c(Bundle bundle);
    }

    public interface b {
        void b(q.a aVar);
    }

    /* renamed from: t.c$c  reason: collision with other inner class name */
    public interface C0050c {
        void a(q.a aVar);
    }

    protected class d implements C0050c {
        public d() {
        }

        public final void a(q.a aVar) {
            if (aVar.f()) {
                c cVar = c.this;
                cVar.d((i) null, cVar.B());
            } else if (c.this.f2912v != null) {
                c.this.f2912v.b(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, h hVar, g gVar, int i3, a aVar, b bVar, String str) {
        o.i(context, "Context must not be null");
        this.f2898h = context;
        o.i(looper, "Looper must not be null");
        this.f2899i = looper;
        o.i(hVar, "Supervisor must not be null");
        this.f2900j = hVar;
        o.i(gVar, "API availability must not be null");
        this.f2901k = gVar;
        this.f2902l = new s0(this, looper);
        this.f2913w = i3;
        this.f2911u = aVar;
        this.f2912v = bVar;
        this.f2914x = str;
    }

    static /* bridge */ /* synthetic */ void a0(c cVar, y0 y0Var) {
        cVar.B = y0Var;
        if (cVar.Q()) {
            e eVar = y0Var.f3050g;
            p.b().c(eVar == null ? null : eVar.g());
        }
    }

    static /* bridge */ /* synthetic */ void b0(c cVar, int i3) {
        int i4;
        int i5;
        synchronized (cVar.f2903m) {
            i4 = cVar.f2910t;
        }
        if (i4 == 3) {
            cVar.A = true;
            i5 = 5;
        } else {
            i5 = 4;
        }
        Handler handler = cVar.f2902l;
        handler.sendMessage(handler.obtainMessage(i5, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(c cVar, int i3, int i4, IInterface iInterface) {
        synchronized (cVar.f2903m) {
            if (cVar.f2910t != i3) {
                return false;
            }
            cVar.g0(i4, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void g0(int i3, IInterface iInterface) {
        k1 k1Var;
        boolean z3 = false;
        if ((i3 == 4) == (iInterface != null)) {
            z3 = true;
        }
        o.a(z3);
        synchronized (this.f2903m) {
            this.f2910t = i3;
            this.f2907q = iInterface;
            if (i3 == 1) {
                v0 v0Var = this.f2909s;
                if (v0Var != null) {
                    h hVar = this.f2900j;
                    String c4 = this.f2897g.c();
                    o.h(c4);
                    hVar.e(c4, this.f2897g.b(), this.f2897g.a(), v0Var, V(), this.f2897g.d());
                    this.f2909s = null;
                }
            } else if (i3 == 2 || i3 == 3) {
                v0 v0Var2 = this.f2909s;
                if (!(v0Var2 == null || (k1Var = this.f2897g) == null)) {
                    String c5 = k1Var.c();
                    String b4 = k1Var.b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c5 + " on " + b4);
                    h hVar2 = this.f2900j;
                    String c6 = this.f2897g.c();
                    o.h(c6);
                    hVar2.e(c6, this.f2897g.b(), this.f2897g.a(), v0Var2, V(), this.f2897g.d());
                    this.C.incrementAndGet();
                }
                v0 v0Var3 = new v0(this, this.C.get());
                this.f2909s = v0Var3;
                k1 k1Var2 = (this.f2910t != 3 || A() == null) ? new k1(F(), E(), false, h.a(), H()) : new k1(x().getPackageName(), A(), true, h.a(), false);
                this.f2897g = k1Var2;
                if (k1Var2.d()) {
                    if (f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2897g.c())));
                    }
                }
                h hVar3 = this.f2900j;
                String c7 = this.f2897g.c();
                o.h(c7);
                if (!hVar3.f(new c1(c7, this.f2897g.b(), this.f2897g.a(), this.f2897g.d()), v0Var3, V(), v())) {
                    String c8 = this.f2897g.c();
                    String b5 = this.f2897g.b();
                    Log.w("GmsClient", "unable to connect to service: " + c8 + " on " + b5);
                    c0(16, (Bundle) null, this.C.get());
                }
            } else if (i3 == 4) {
                o.h(iInterface);
                J(iInterface);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String A() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> B() {
        return Collections.emptySet();
    }

    public final T C() {
        T t3;
        synchronized (this.f2903m) {
            if (this.f2910t != 5) {
                q();
                t3 = this.f2907q;
                o.i(t3, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t3;
    }

    /* access modifiers changed from: protected */
    public abstract String D();

    /* access modifiers changed from: protected */
    public abstract String E();

    /* access modifiers changed from: protected */
    public String F() {
        return "com.google.android.gms";
    }

    public e G() {
        y0 y0Var = this.B;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f3050g;
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        return f() >= 211700000;
    }

    public boolean I() {
        return this.B != null;
    }

    /* access modifiers changed from: protected */
    public void J(T t3) {
        this.f2893c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void K(q.a aVar) {
        this.f2894d = aVar.b();
        this.f2895e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void L(int i3) {
        this.f2891a = i3;
        this.f2892b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void M(int i3, IBinder iBinder, Bundle bundle, int i4) {
        Handler handler = this.f2902l;
        handler.sendMessage(handler.obtainMessage(1, i4, -1, new w0(this, i3, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f2915y = str;
    }

    public void P(int i3) {
        Handler handler = this.f2902l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i3));
    }

    public boolean Q() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String V() {
        String str = this.f2914x;
        return str == null ? this.f2898h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z3;
        synchronized (this.f2903m) {
            z3 = this.f2910t == 4;
        }
        return z3;
    }

    public void c(String str) {
        this.f2896f = str;
        n();
    }

    /* access modifiers changed from: protected */
    public final void c0(int i3, Bundle bundle, int i4) {
        Handler handler = this.f2902l;
        handler.sendMessage(handler.obtainMessage(7, i4, -1, new x0(this, i3, (Bundle) null)));
    }

    public void d(i iVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle z3 = z();
        int i3 = this.f2913w;
        String str = this.f2915y;
        int i4 = g.f2632a;
        Scope[] scopeArr = f.f2955r;
        Bundle bundle = new Bundle();
        q.c[] cVarArr = f.f2956s;
        f fVar = r3;
        f fVar2 = new f(6, i3, i4, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        f fVar3 = fVar;
        fVar3.f2960g = this.f2898h.getPackageName();
        fVar3.f2963j = z3;
        if (set2 != null) {
            fVar3.f2962i = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (o()) {
            Account t3 = t();
            if (t3 == null) {
                t3 = new Account("<<default account>>", "com.google");
            }
            fVar3.f2964k = t3;
            if (iVar != null) {
                fVar3.f2961h = iVar.asBinder();
            }
        } else if (N()) {
            fVar3.f2964k = t();
        }
        fVar3.f2965l = E;
        fVar3.f2966m = u();
        if (Q()) {
            fVar3.f2969p = true;
        }
        try {
            synchronized (this.f2904n) {
                l lVar = this.f2905o;
                if (lVar != null) {
                    lVar.d(new u0(this, this.C.get()), fVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            P(3);
        } catch (SecurityException e5) {
            throw e5;
        } catch (RemoteException | RuntimeException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            M(8, (IBinder) null, (Bundle) null, this.C.get());
        }
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return g.f2632a;
    }

    public boolean g() {
        boolean z3;
        synchronized (this.f2903m) {
            int i3 = this.f2910t;
            z3 = true;
            if (i3 != 2) {
                if (i3 != 3) {
                    z3 = false;
                }
            }
        }
        return z3;
    }

    public final q.c[] h() {
        y0 y0Var = this.B;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f3048e;
    }

    public String i() {
        k1 k1Var;
        if (a() && (k1Var = this.f2897g) != null) {
            return k1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void j(C0050c cVar) {
        o.i(cVar, "Connection progress callbacks cannot be null.");
        this.f2906p = cVar;
        g0(2, (IInterface) null);
    }

    public String l() {
        return this.f2896f;
    }

    public void m(e eVar) {
        eVar.a();
    }

    public void n() {
        this.C.incrementAndGet();
        synchronized (this.f2908r) {
            int size = this.f2908r.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((t0) this.f2908r.get(i3)).d();
            }
            this.f2908r.clear();
        }
        synchronized (this.f2904n) {
            this.f2905o = null;
        }
        g0(1, (IInterface) null);
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract T r(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public q.c[] u() {
        return E;
    }

    /* access modifiers changed from: protected */
    public Executor v() {
        return null;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f2898h;
    }

    public int y() {
        return this.f2913w;
    }

    /* access modifiers changed from: protected */
    public Bundle z() {
        return new Bundle();
    }
}
