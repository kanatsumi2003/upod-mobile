package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import q.c;
import r.a;
import r.a.d;
import r.e;
import r.f;
import r.l;
import s.a0;
import s.b;
import s.q;
import s.u;
import s.y;
import t.n;
import t.o;

public final class m<O extends a.d> implements f.a, f.b {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<x> f833a = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final a.f f834b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b<O> f835c;

    /* renamed from: d  reason: collision with root package name */
    private final e f836d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<a0> f837e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map<s.f<?>, u> f838f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final int f839g;

    /* renamed from: h  reason: collision with root package name */
    private final y f840h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f841i;

    /* renamed from: j  reason: collision with root package name */
    private final List<n> f842j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private q.a f843k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f844l = 0;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ b f845m;

    public m(b bVar, e<O> eVar) {
        this.f845m = bVar;
        a.f g3 = eVar.g(bVar.f805p.getLooper(), this);
        this.f834b = g3;
        this.f835c = eVar.d();
        this.f836d = new e();
        this.f839g = eVar.f();
        if (g3.o()) {
            this.f840h = eVar.h(bVar.f796g, bVar.f805p);
        } else {
            this.f840h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(m mVar, n nVar) {
        if (!mVar.f842j.contains(nVar) || mVar.f841i) {
            return;
        }
        if (!mVar.f834b.a()) {
            mVar.E();
        } else {
            mVar.i();
        }
    }

    static /* bridge */ /* synthetic */ void C(m mVar, n nVar) {
        c[] g3;
        if (mVar.f842j.remove(nVar)) {
            mVar.f845m.f805p.removeMessages(15, nVar);
            mVar.f845m.f805p.removeMessages(16, nVar);
            c a4 = nVar.f847b;
            ArrayList arrayList = new ArrayList(mVar.f833a.size());
            for (x next : mVar.f833a) {
                if ((next instanceof q) && (g3 = ((q) next).g(mVar)) != null && x.a.b(g3, a4)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                x xVar = (x) arrayList.get(i3);
                mVar.f833a.remove(xVar);
                xVar.b(new l(a4));
            }
        }
    }

    private final c e(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] h3 = this.f834b.h();
            if (h3 == null) {
                h3 = new c[0];
            }
            c.a aVar = new c.a(r3);
            for (c cVar : h3) {
                aVar.put(cVar.b(), Long.valueOf(cVar.c()));
            }
            for (c cVar2 : cVarArr) {
                Long l3 = (Long) aVar.get(cVar2.b());
                if (l3 == null || l3.longValue() < cVar2.c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(q.a aVar) {
        for (a0 b4 : this.f837e) {
            b4.b(this.f835c, aVar, n.a(aVar, q.a.f2617h) ? this.f834b.i() : null);
        }
        this.f837e.clear();
    }

    /* access modifiers changed from: private */
    public final void g(Status status) {
        o.c(this.f845m.f805p);
        h(status, (Exception) null, false);
    }

    private final void h(Status status, Exception exc, boolean z3) {
        o.c(this.f845m.f805p);
        boolean z4 = false;
        boolean z5 = status == null;
        if (exc == null) {
            z4 = true;
        }
        if (z5 != z4) {
            Iterator<x> it = this.f833a.iterator();
            while (it.hasNext()) {
                x next = it.next();
                if (!z3 || next.f871a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f833a);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            x xVar = (x) arrayList.get(i3);
            if (this.f834b.a()) {
                if (o(xVar)) {
                    this.f833a.remove(xVar);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void j() {
        D();
        f(q.a.f2617h);
        n();
        Iterator<u> it = this.f838f.values().iterator();
        if (!it.hasNext()) {
            i();
            l();
            return;
        }
        it.next().getClass();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void k(int i3) {
        D();
        this.f841i = true;
        this.f836d.c(i3, this.f834b.l());
        b bVar = this.f845m;
        bVar.f805p.sendMessageDelayed(Message.obtain(bVar.f805p, 9, this.f835c), this.f845m.f790a);
        b bVar2 = this.f845m;
        bVar2.f805p.sendMessageDelayed(Message.obtain(bVar2.f805p, 11, this.f835c), this.f845m.f791b);
        this.f845m.f798i.c();
        for (u uVar : this.f838f.values()) {
            uVar.f2862a.run();
        }
    }

    private final void l() {
        this.f845m.f805p.removeMessages(12, this.f835c);
        b bVar = this.f845m;
        bVar.f805p.sendMessageDelayed(bVar.f805p.obtainMessage(12, this.f835c), this.f845m.f792c);
    }

    private final void m(x xVar) {
        xVar.d(this.f836d, P());
        try {
            xVar.c(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.f834b.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        if (this.f841i) {
            this.f845m.f805p.removeMessages(11, this.f835c);
            this.f845m.f805p.removeMessages(9, this.f835c);
            this.f841i = false;
        }
    }

    private final boolean o(x xVar) {
        if (!(xVar instanceof q)) {
            m(xVar);
            return true;
        }
        q qVar = (q) xVar;
        c e4 = e(qVar.g(this));
        if (e4 == null) {
            m(xVar);
            return true;
        }
        String name = this.f834b.getClass().getName();
        String b4 = e4.b();
        long c4 = e4.c();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(b4).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(b4);
        sb.append(", ");
        sb.append(c4);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f845m.f806q || !qVar.f(this)) {
            qVar.b(new l(e4));
            return true;
        }
        n nVar = new n(this.f835c, e4, (s.m) null);
        int indexOf = this.f842j.indexOf(nVar);
        if (indexOf >= 0) {
            n nVar2 = this.f842j.get(indexOf);
            this.f845m.f805p.removeMessages(15, nVar2);
            b bVar = this.f845m;
            bVar.f805p.sendMessageDelayed(Message.obtain(bVar.f805p, 15, nVar2), this.f845m.f790a);
            return false;
        }
        this.f842j.add(nVar);
        b bVar2 = this.f845m;
        bVar2.f805p.sendMessageDelayed(Message.obtain(bVar2.f805p, 15, nVar), this.f845m.f790a);
        b bVar3 = this.f845m;
        bVar3.f805p.sendMessageDelayed(Message.obtain(bVar3.f805p, 16, nVar), this.f845m.f791b);
        q.a aVar = new q.a(2, (PendingIntent) null);
        if (p(aVar)) {
            return false;
        }
        this.f845m.g(aVar, this.f839g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p(q.a r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.b.f788t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.b r1 = r3.f845m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.f r2 = r1.f802m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f803n     // Catch:{ all -> 0x002a }
            s.b<O> r2 = r3.f835c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.b r1 = r3.f845m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.f r1 = r1.f802m     // Catch:{ all -> 0x002a }
            int r2 = r3.f839g     // Catch:{ all -> 0x002a }
            r1.s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.m.p(q.a):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean q(boolean z3) {
        o.c(this.f845m.f805p);
        if (!this.f834b.a() || this.f838f.size() != 0) {
            return false;
        }
        if (this.f836d.e()) {
            if (z3) {
                l();
            }
            return false;
        }
        this.f834b.c("Timing out service connection.");
        return true;
    }

    public final void D() {
        o.c(this.f845m.f805p);
        this.f843k = null;
    }

    public final void E() {
        q.a aVar;
        o.c(this.f845m.f805p);
        if (!this.f834b.a() && !this.f834b.g()) {
            try {
                b bVar = this.f845m;
                int b4 = bVar.f798i.b(bVar.f796g, this.f834b);
                if (b4 != 0) {
                    q.a aVar2 = new q.a(b4, (PendingIntent) null);
                    String name = this.f834b.getClass().getName();
                    String obj = aVar2.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    H(aVar2, (Exception) null);
                    return;
                }
                b bVar2 = this.f845m;
                a.f fVar = this.f834b;
                p pVar = new p(bVar2, fVar, this.f835c);
                if (fVar.o()) {
                    ((y) o.h(this.f840h)).o(pVar);
                }
                try {
                    this.f834b.j(pVar);
                } catch (SecurityException e4) {
                    e = e4;
                    aVar = new q.a(10);
                    H(aVar, e);
                }
            } catch (IllegalStateException e5) {
                e = e5;
                aVar = new q.a(10);
                H(aVar, e);
            }
        }
    }

    public final void F(x xVar) {
        o.c(this.f845m.f805p);
        if (!this.f834b.a()) {
            this.f833a.add(xVar);
            q.a aVar = this.f843k;
            if (aVar == null || !aVar.e()) {
                E();
            } else {
                H(this.f843k, (Exception) null);
            }
        } else if (o(xVar)) {
            l();
        } else {
            this.f833a.add(xVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.f844l++;
    }

    public final void H(q.a aVar, Exception exc) {
        o.c(this.f845m.f805p);
        y yVar = this.f840h;
        if (yVar != null) {
            yVar.p();
        }
        D();
        this.f845m.f798i.c();
        f(aVar);
        if ((this.f834b instanceof v.e) && aVar.b() != 24) {
            this.f845m.f793d = true;
            b bVar = this.f845m;
            bVar.f805p.sendMessageDelayed(bVar.f805p.obtainMessage(19), 300000);
        }
        if (aVar.b() == 4) {
            g(b.f787s);
        } else if (this.f833a.isEmpty()) {
            this.f843k = aVar;
        } else if (exc != null) {
            o.c(this.f845m.f805p);
            h((Status) null, exc, false);
        } else if (this.f845m.f806q) {
            h(b.h(this.f835c, aVar), (Exception) null, true);
            if (!this.f833a.isEmpty() && !p(aVar) && !this.f845m.g(aVar, this.f839g)) {
                if (aVar.b() == 18) {
                    this.f841i = true;
                }
                if (this.f841i) {
                    b bVar2 = this.f845m;
                    bVar2.f805p.sendMessageDelayed(Message.obtain(bVar2.f805p, 9, this.f835c), this.f845m.f790a);
                    return;
                }
                g(b.h(this.f835c, aVar));
            }
        } else {
            g(b.h(this.f835c, aVar));
        }
    }

    public final void I(q.a aVar) {
        o.c(this.f845m.f805p);
        a.f fVar = this.f834b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.c(sb.toString());
        H(aVar, (Exception) null);
    }

    public final void J(a0 a0Var) {
        o.c(this.f845m.f805p);
        this.f837e.add(a0Var);
    }

    public final void K() {
        o.c(this.f845m.f805p);
        if (this.f841i) {
            E();
        }
    }

    public final void L() {
        o.c(this.f845m.f805p);
        g(b.f786r);
        this.f836d.d();
        for (s.f wVar : (s.f[]) this.f838f.keySet().toArray(new s.f[0])) {
            F(new w(wVar, new f0.l()));
        }
        f(new q.a(4));
        if (this.f834b.a()) {
            this.f834b.m(new l(this));
        }
    }

    public final void M() {
        o.c(this.f845m.f805p);
        if (this.f841i) {
            n();
            b bVar = this.f845m;
            g(bVar.f797h.e(bVar.f796g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f834b.c("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean O() {
        return this.f834b.a();
    }

    public final boolean P() {
        return this.f834b.o();
    }

    public final void a(int i3) {
        if (Looper.myLooper() == this.f845m.f805p.getLooper()) {
            k(i3);
        } else {
            this.f845m.f805p.post(new j(this, i3));
        }
    }

    public final void b(q.a aVar) {
        H(aVar, (Exception) null);
    }

    public final void c(Bundle bundle) {
        if (Looper.myLooper() == this.f845m.f805p.getLooper()) {
            j();
        } else {
            this.f845m.f805p.post(new i(this));
        }
    }

    public final boolean d() {
        return q(true);
    }

    public final int r() {
        return this.f839g;
    }

    /* access modifiers changed from: package-private */
    public final int s() {
        return this.f844l;
    }

    public final q.a t() {
        o.c(this.f845m.f805p);
        return this.f843k;
    }

    public final a.f v() {
        return this.f834b;
    }

    public final Map<s.f<?>, u> x() {
        return this.f838f;
    }
}
