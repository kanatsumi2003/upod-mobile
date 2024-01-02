package p0;

import android.content.Context;
import f0.k;
import f0.n;
import i.j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.d;
import l0.r;
import q0.b;
import s0.i;

public class e implements g, h {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f2604f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b<j> f2605a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2606b;

    /* renamed from: c  reason: collision with root package name */
    private final b<i> f2607c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<f> f2608d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2609e;

    private e(Context context, String str, Set<f> set, b<i> bVar) {
        this(new d(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f2604f), bVar, context);
    }

    e(b<j> bVar, Set<f> set, Executor executor, b<i> bVar2, Context context) {
        this.f2605a = bVar;
        this.f2608d = set;
        this.f2609e = executor;
        this.f2607c = bVar2;
        this.f2606b = context;
    }

    public static d<e> e() {
        return d.d(e.class, g.class, h.class).b(r.h(Context.class)).b(r.h(g0.d.class)).b(r.j(f.class)).b(r.i(i.class)).d(new c()).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ e f(l0.e eVar) {
        return new e((Context) eVar.a(Context.class), ((g0.d) eVar.a(g0.d.class)).r(), eVar.b(f.class), eVar.c(i.class));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ j g(Context context, String str) {
        return new j(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void h() {
        synchronized (this) {
            this.f2605a.get().c(System.currentTimeMillis(), this.f2607c.get().a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread i(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    public k<Void> j() {
        return this.f2608d.size() <= 0 ? n.d(null) : j.a(this.f2606b) ^ true ? n.d(null) : n.c(this.f2609e, new b(this));
    }
}
