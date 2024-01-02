package g0;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import i.j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.o;
import l0.x;
import s.b0;
import t.n;
import x.g;
import x.h;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1254k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private static final Executor f1255l = new C0022d();

    /* renamed from: m  reason: collision with root package name */
    static final Map<String, d> f1256m = new c.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f1257a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1258b;

    /* renamed from: c  reason: collision with root package name */
    private final k f1259c;

    /* renamed from: d  reason: collision with root package name */
    private final o f1260d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f1261e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f1262f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final x<r0.a> f1263g;

    /* renamed from: h  reason: collision with root package name */
    private final q0.b<p0.e> f1264h;

    /* renamed from: i  reason: collision with root package name */
    private final List<b> f1265i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<e> f1266j = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z3);
    }

    @TargetApi(14)
    private static class c implements a.C0015a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<c> f1267a = new AtomicReference<>();

        private c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (g.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f1267a.get() == null) {
                    c cVar = new c();
                    if (b0.a(f1267a, (Object) null, cVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(cVar);
                    }
                }
            }
        }

        public void a(boolean z3) {
            synchronized (d.f1254k) {
                Iterator it = new ArrayList(d.f1256m.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f1261e.get()) {
                        dVar.B(z3);
                    }
                }
            }
        }
    }

    /* renamed from: g0.d$d  reason: collision with other inner class name */
    private static class C0022d implements Executor {

        /* renamed from: d  reason: collision with root package name */
        private static final Handler f1268d = new Handler(Looper.getMainLooper());

        private C0022d() {
        }

        public void execute(Runnable runnable) {
            f1268d.post(runnable);
        }
    }

    @TargetApi(24)
    private static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<e> f1269b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f1270a;

        public e(Context context) {
            this.f1270a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f1269b.get() == null) {
                e eVar = new e(context);
                if (b0.a(f1269b, (Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f1270a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (d.f1254k) {
                for (d d4 : d.f1256m.values()) {
                    d4.s();
                }
            }
            c();
        }
    }

    protected d(Context context, String str, k kVar) {
        this.f1257a = (Context) t.o.h(context);
        this.f1258b = t.o.d(str);
        this.f1259c = (k) t.o.h(kVar);
        x0.c.b("Firebase");
        x0.c.b("ComponentDiscovery");
        List<q0.b<ComponentRegistrar>> b4 = l0.g.c(context, ComponentDiscoveryService.class).b();
        x0.c.a();
        x0.c.b("Runtime");
        o e4 = o.h(f1255l).d(b4).c(new FirebaseCommonRegistrar()).b(l0.d.q(context, Context.class, new Class[0])).b(l0.d.q(this, d.class, new Class[0])).b(l0.d.q(kVar, k.class, new Class[0])).g(new x0.b()).e();
        this.f1260d = e4;
        x0.c.a();
        this.f1263g = new x<>(new b(this, context));
        this.f1264h = e4.c(p0.e.class);
        g(new c(this));
        x0.c.a();
    }

    private static String A(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void B(boolean z3) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a4 : this.f1265i) {
            a4.a(z3);
        }
    }

    private void C() {
        for (e a4 : this.f1266j) {
            a4.a(this.f1258b, this.f1259c);
        }
    }

    private void h() {
        t.o.k(!this.f1262f.get(), "FirebaseApp was deleted");
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f1254k) {
            for (d p3 : f1256m.values()) {
                arrayList.add(p3.p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<d> m(Context context) {
        ArrayList arrayList;
        synchronized (f1254k) {
            arrayList = new ArrayList(f1256m.values());
        }
        return arrayList;
    }

    public static d n() {
        d dVar;
        synchronized (f1254k) {
            dVar = f1256m.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    public static d o(String str) {
        d dVar;
        String str2;
        synchronized (f1254k) {
            dVar = f1256m.get(A(str));
            if (dVar != null) {
                dVar.f1264h.get().j();
            } else {
                List<String> k3 = k();
                if (k3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", k3);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    public void s() {
        if (!j.a(this.f1257a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            e.b(this.f1257a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f1260d.k(x());
        this.f1264h.get().j();
    }

    public static d t(Context context) {
        synchronized (f1254k) {
            if (f1256m.containsKey("[DEFAULT]")) {
                d n3 = n();
                return n3;
            }
            k a4 = k.a(context);
            if (a4 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            d u3 = u(context, a4);
            return u3;
        }
    }

    public static d u(Context context, k kVar) {
        return v(context, kVar, "[DEFAULT]");
    }

    public static d v(Context context, k kVar, String str) {
        d dVar;
        c.c(context);
        String A = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1254k) {
            Map<String, d> map = f1256m;
            boolean z3 = !map.containsKey(A);
            t.o.k(z3, "FirebaseApp name " + A + " already exists!");
            t.o.i(context, "Application context cannot be null.");
            dVar = new d(context, A, kVar);
            map.put(A, dVar);
        }
        dVar.s();
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ r0.a y(Context context) {
        return new r0.a(context, r(), (o0.c) this.f1260d.a(o0.c.class));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(boolean z3) {
        if (!z3) {
            this.f1264h.get().j();
        }
    }

    public void D(boolean z3) {
        boolean z4;
        h();
        if (this.f1261e.compareAndSet(!z3, z3)) {
            boolean d4 = com.google.android.gms.common.api.internal.a.b().d();
            if (z3 && d4) {
                z4 = true;
            } else if (!z3 && d4) {
                z4 = false;
            } else {
                return;
            }
            B(z4);
        }
    }

    public void E(Boolean bool) {
        h();
        this.f1263g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f1258b.equals(((d) obj).p());
    }

    public void g(b bVar) {
        h();
        if (this.f1261e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            bVar.a(true);
        }
        this.f1265i.add(bVar);
    }

    public int hashCode() {
        return this.f1258b.hashCode();
    }

    public void i() {
        if (this.f1262f.compareAndSet(false, true)) {
            synchronized (f1254k) {
                f1256m.remove(this.f1258b);
            }
            C();
        }
    }

    public <T> T j(Class<T> cls) {
        h();
        return this.f1260d.a(cls);
    }

    public Context l() {
        h();
        return this.f1257a;
    }

    public String p() {
        h();
        return this.f1258b;
    }

    public k q() {
        h();
        return this.f1259c;
    }

    public String r() {
        return x.b.a(p().getBytes(Charset.defaultCharset())) + "+" + x.b.a(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return n.c(this).a("name", this.f1258b).a("options", this.f1259c).toString();
    }

    public boolean w() {
        h();
        return this.f1263g.get().b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
