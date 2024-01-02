package l0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o0.c;
import q0.b;

final class e0 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f2242a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f2243b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f2244c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f2245d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f2246e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f2247f;

    /* renamed from: g  reason: collision with root package name */
    private final e f2248g;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f2249a;

        /* renamed from: b  reason: collision with root package name */
        private final c f2250b;

        public a(Set<Class<?>> set, c cVar) {
            this.f2249a = set;
            this.f2250b = cVar;
        }

        public void a(o0.a<?> aVar) {
            if (this.f2249a.contains(aVar.a())) {
                this.f2250b.a(aVar);
            } else {
                throw new t(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    e0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r next : dVar.e()) {
            if (next.d()) {
                boolean f4 = next.f();
                Class<?> b4 = next.b();
                if (f4) {
                    hashSet4.add(b4);
                } else {
                    hashSet.add(b4);
                }
            } else if (next.c()) {
                hashSet3.add(next.b());
            } else {
                boolean f5 = next.f();
                Class<?> b5 = next.b();
                if (f5) {
                    hashSet5.add(b5);
                } else {
                    hashSet2.add(b5);
                }
            }
        }
        if (!dVar.i().isEmpty()) {
            hashSet.add(c.class);
        }
        this.f2242a = Collections.unmodifiableSet(hashSet);
        this.f2243b = Collections.unmodifiableSet(hashSet2);
        this.f2244c = Collections.unmodifiableSet(hashSet3);
        this.f2245d = Collections.unmodifiableSet(hashSet4);
        this.f2246e = Collections.unmodifiableSet(hashSet5);
        this.f2247f = dVar.i();
        this.f2248g = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f2242a.contains(cls)) {
            T a4 = this.f2248g.a(cls);
            return !cls.equals(c.class) ? a4 : new a(this.f2247f, (c) a4);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> Set<T> b(Class<T> cls) {
        if (this.f2245d.contains(cls)) {
            return this.f2248g.b(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> b<T> c(Class<T> cls) {
        if (this.f2243b.contains(cls)) {
            return this.f2248g.c(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> b<Set<T>> d(Class<T> cls) {
        if (this.f2246e.contains(cls)) {
            return this.f2248g.d(cls);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
