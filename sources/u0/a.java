package u0;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.d;
import s.e;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final a f3078c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, C0052a> f3079a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f3080b = new Object();

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    private static class C0052a {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f3081a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f3082b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f3083c;

        public C0052a(Activity activity, Runnable runnable, Object obj) {
            this.f3081a = activity;
            this.f3082b = runnable;
            this.f3083c = obj;
        }

        public Activity a() {
            return this.f3081a;
        }

        public Object b() {
            return this.f3083c;
        }

        public Runnable c() {
            return this.f3082b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0052a)) {
                return false;
            }
            C0052a aVar = (C0052a) obj;
            return aVar.f3083c.equals(this.f3083c) && aVar.f3082b == this.f3082b && aVar.f3081a == this.f3081a;
        }

        public int hashCode() {
            return this.f3083c.hashCode();
        }
    }

    private static class b extends LifecycleCallback {

        /* renamed from: b  reason: collision with root package name */
        private final List<C0052a> f3084b = new ArrayList();

        private b(e eVar) {
            super(eVar);
            this.f778a.b("StorageOnStopCallback", this);
        }

        public static b m(Activity activity) {
            e d4 = LifecycleCallback.d(new d(activity));
            b bVar = (b) d4.c("StorageOnStopCallback", b.class);
            return bVar == null ? new b(d4) : bVar;
        }

        public void k() {
            ArrayList arrayList;
            synchronized (this.f3084b) {
                arrayList = new ArrayList(this.f3084b);
                this.f3084b.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0052a aVar = (C0052a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.c().run();
                    a.a().b(aVar.b());
                }
            }
        }

        public void l(C0052a aVar) {
            synchronized (this.f3084b) {
                this.f3084b.add(aVar);
            }
        }

        public void n(C0052a aVar) {
            synchronized (this.f3084b) {
                this.f3084b.remove(aVar);
            }
        }
    }

    private a() {
    }

    public static a a() {
        return f3078c;
    }

    public void b(Object obj) {
        synchronized (this.f3080b) {
            C0052a aVar = this.f3079a.get(obj);
            if (aVar != null) {
                b.m(aVar.a()).n(aVar);
            }
        }
    }

    public void c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f3080b) {
            C0052a aVar = new C0052a(activity, runnable, obj);
            b.m(activity).l(aVar);
            this.f3079a.put(obj, aVar);
        }
    }
}
