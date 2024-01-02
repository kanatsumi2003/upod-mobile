package l0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class q {

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f2275a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f2276b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f2277c = new HashSet();

        b(d<?> dVar) {
            this.f2275a = dVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f2276b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f2277c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public d<?> c() {
            return this.f2275a;
        }

        /* access modifiers changed from: package-private */
        public Set<b> d() {
            return this.f2276b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f2276b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f2277c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f2277c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f2278a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2279b;

        private c(Class<?> cls, boolean z3) {
            this.f2278a = cls;
            this.f2279b = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f2278a.equals(this.f2278a) && cVar.f2279b == this.f2279b;
        }

        public int hashCode() {
            return ((this.f2278a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2279b).hashCode();
        }
    }

    static void a(List<d<?>> list) {
        Set<b> c4 = c(list);
        Set<b> b4 = b(c4);
        int i3 = 0;
        while (!b4.isEmpty()) {
            b next = b4.iterator().next();
            b4.remove(next);
            i3++;
            for (b next2 : next.d()) {
                next2.g(next);
                if (next2.f()) {
                    b4.add(next2);
                }
            }
        }
        if (i3 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b next3 : c4) {
                if (!next3.f() && !next3.e()) {
                    arrayList.add(next3.c());
                }
            }
            throw new s(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b next : set) {
            if (next.f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d next : list) {
            b bVar = new b(next);
            Iterator it = next.h().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    c cVar = new c(cls, !next.n());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f2279b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<b> it2 : hashMap.values()) {
            for (b bVar2 : it2) {
                for (r next2 : bVar2.c().e()) {
                    if (next2.d() && (set = (Set) hashMap.get(new c(next2.b(), next2.f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
