package com.google.firebase.storage;

import android.app.Activity;
import com.google.firebase.storage.s;
import com.google.firebase.storage.s.a;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import t.o;
import u0.g;

class y<ListenerTypeT, ResultT extends s.a> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<ListenerTypeT> f1026a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<ListenerTypeT, g> f1027b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private s<ResultT> f1028c;

    /* renamed from: d  reason: collision with root package name */
    private int f1029d;

    /* renamed from: e  reason: collision with root package name */
    private a<ListenerTypeT, ResultT> f1030e;

    interface a<ListenerTypeT, ResultT> {
        void a(ListenerTypeT listenertypet, ResultT resultt);
    }

    public y(s<ResultT> sVar, int i3, a<ListenerTypeT, ResultT> aVar) {
        this.f1028c = sVar;
        this.f1029d = i3;
        this.f1030e = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Object obj, s.a aVar) {
        this.f1030e.a(obj, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Object obj, s.a aVar) {
        this.f1030e.a(obj, aVar);
    }

    public void d(Activity activity, Executor executor, ListenerTypeT listenertypet) {
        boolean z3;
        g gVar;
        o.h(listenertypet);
        synchronized (this.f1028c.P()) {
            boolean z4 = true;
            z3 = (this.f1028c.I() & this.f1029d) != 0;
            this.f1026a.add(listenertypet);
            gVar = new g(executor);
            this.f1027b.put(listenertypet, gVar);
            if (activity != null) {
                if (activity.isDestroyed()) {
                    z4 = false;
                }
                o.b(z4, "Activity is already destroyed!");
                u0.a.a().c(activity, listenertypet, new w(this, listenertypet));
            }
        }
        if (z3) {
            gVar.a(new x(this, listenertypet, this.f1028c.k0()));
        }
    }

    public void h() {
        if ((this.f1028c.I() & this.f1029d) != 0) {
            ResultT k02 = this.f1028c.k0();
            for (ListenerTypeT next : this.f1026a) {
                g gVar = this.f1027b.get(next);
                if (gVar != null) {
                    gVar.a(new v(this, next, k02));
                }
            }
        }
    }

    /* renamed from: i */
    public void e(ListenerTypeT listenertypet) {
        o.h(listenertypet);
        synchronized (this.f1028c.P()) {
            this.f1027b.remove(listenertypet);
            this.f1026a.remove(listenertypet);
            u0.a.a().b(listenertypet);
        }
    }
}
