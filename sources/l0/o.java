package l0;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o0.c;
import o0.d;
import s.b0;

public class o extends a implements m0.a {

    /* renamed from: h  reason: collision with root package name */
    private static final q0.b<Set<Object>> f2262h = new l();

    /* renamed from: a  reason: collision with root package name */
    private final Map<d<?>, q0.b<?>> f2263a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, q0.b<?>> f2264b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, y<?>> f2265c;

    /* renamed from: d  reason: collision with root package name */
    private final List<q0.b<ComponentRegistrar>> f2266d;

    /* renamed from: e  reason: collision with root package name */
    private final v f2267e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f2268f;

    /* renamed from: g  reason: collision with root package name */
    private final j f2269g;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f2270a;

        /* renamed from: b  reason: collision with root package name */
        private final List<q0.b<ComponentRegistrar>> f2271b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<d<?>> f2272c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f2273d = j.f2255a;

        b(Executor executor) {
            this.f2270a = executor;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(d<?> dVar) {
            this.f2272c.add(dVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f2271b.add(new p(componentRegistrar));
            return this;
        }

        public b d(Collection<q0.b<ComponentRegistrar>> collection) {
            this.f2271b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f2270a, this.f2271b, this.f2272c, this.f2273d);
        }

        public b g(j jVar) {
            this.f2273d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable<q0.b<ComponentRegistrar>> iterable, Collection<d<?>> collection, j jVar) {
        this.f2263a = new HashMap();
        this.f2264b = new HashMap();
        this.f2265c = new HashMap();
        this.f2268f = new AtomicReference<>();
        v vVar = new v(executor);
        this.f2267e = vVar;
        this.f2269g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.q(vVar, v.class, d.class, c.class));
        arrayList.add(d.q(this, m0.a.class, new Class[0]));
        for (d next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f2266d = l(iterable);
        i(arrayList);
    }

    public static b h(Executor executor) {
        return new b(executor);
    }

    private void i(List<d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<q0.b<ComponentRegistrar>> it = this.f2266d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f2269g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e4) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            if (this.f2263a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f2263a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (d next : list) {
                this.f2263a.put(next, new x(new k(this, next)));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        p();
    }

    private void j(Map<d<?>, q0.b<?>> map, boolean z3) {
        for (Map.Entry next : map.entrySet()) {
            d dVar = (d) next.getKey();
            q0.b bVar = (q0.b) next.getValue();
            if (dVar.l() || (dVar.m() && z3)) {
                bVar.get();
            }
        }
        this.f2267e.c();
    }

    private static <T> List<T> l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object m(d dVar) {
        return dVar.f().a(new e0(dVar, this));
    }

    private void p() {
        Boolean bool = this.f2268f.get();
        if (bool != null) {
            j(this.f2263a, bool.booleanValue());
        }
    }

    private void q() {
        Map map;
        Class<?> b4;
        Object c4;
        for (d next : this.f2263a.keySet()) {
            Iterator<r> it = next.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    r next2 = it.next();
                    if (next2.f() && !this.f2265c.containsKey(next2.b())) {
                        map = this.f2265c;
                        b4 = next2.b();
                        c4 = y.b(Collections.emptySet());
                    } else if (this.f2264b.containsKey(next2.b())) {
                        continue;
                    } else if (next2.e()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.b()}));
                    } else if (!next2.f()) {
                        map = this.f2264b;
                        b4 = next2.b();
                        c4 = c0.c();
                    }
                    map.put(b4, c4);
                }
            }
        }
    }

    private List<Runnable> r(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d next : list) {
            if (next.n()) {
                q0.b bVar = this.f2263a.get(next);
                for (Class cls : next.h()) {
                    if (!this.f2264b.containsKey(cls)) {
                        this.f2264b.put(cls, bVar);
                    } else {
                        arrayList.add(new m((c0) this.f2264b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f2263a.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.n()) {
                q0.b bVar = (q0.b) next.getValue();
                for (Class cls : dVar.h()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f2265c.containsKey(entry.getKey())) {
                this.f2265c.put((Class) entry.getKey(), y.b((Collection) entry.getValue()));
            } else {
                y yVar = this.f2265c.get(entry.getKey());
                for (q0.b nVar : (Set) entry.getValue()) {
                    arrayList.add(new n(yVar, nVar));
                }
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    public /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    public synchronized <T> q0.b<T> c(Class<T> cls) {
        d0.c(cls, "Null interface requested.");
        return this.f2264b.get(cls);
    }

    public synchronized <T> q0.b<Set<T>> d(Class<T> cls) {
        y yVar = this.f2265c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return f2262h;
    }

    public void k(boolean z3) {
        HashMap hashMap;
        if (b0.a(this.f2268f, (Object) null, Boolean.valueOf(z3))) {
            synchronized (this) {
                hashMap = new HashMap(this.f2263a);
            }
            j(hashMap, z3);
        }
    }
}
