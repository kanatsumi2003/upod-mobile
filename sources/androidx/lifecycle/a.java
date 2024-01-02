package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class a {

    /* renamed from: c  reason: collision with root package name */
    static a f471c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C0004a> f472a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f473b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    static class C0004a {

        /* renamed from: a  reason: collision with root package name */
        final Map<d.a, List<b>> f474a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, d.a> f475b;

        C0004a(Map<b, d.a> map) {
            this.f475b = map;
            for (Map.Entry next : map.entrySet()) {
                d.a aVar = (d.a) next.getValue();
                List list = this.f474a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f474a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, d.a aVar, Object obj) {
            b(this.f474a.get(aVar), gVar, aVar, obj);
            b(this.f474a.get(d.a.ON_ANY), gVar, aVar, obj);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f476a;

        /* renamed from: b  reason: collision with root package name */
        final Method f477b;

        b(int i3, Method method) {
            this.f476a = i3;
            this.f477b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, d.a aVar, Object obj) {
            try {
                int i3 = this.f476a;
                if (i3 == 0) {
                    this.f477b.invoke(obj, new Object[0]);
                } else if (i3 == 1) {
                    this.f477b.invoke(obj, new Object[]{gVar});
                } else if (i3 == 2) {
                    this.f477b.invoke(obj, new Object[]{gVar, aVar});
                }
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f476a == bVar.f476a && this.f477b.getName().equals(bVar.f477b.getName());
        }

        public int hashCode() {
            return (this.f476a * 31) + this.f477b.getName().hashCode();
        }
    }

    a() {
    }

    private C0004a a(Class<?> cls, Method[] methodArr) {
        int i3;
        C0004a c4;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c4 = c(superclass)) == null)) {
            hashMap.putAll(c4.f475b);
        }
        for (Class c5 : cls.getInterfaces()) {
            for (Map.Entry next : c(c5).f475b.entrySet()) {
                e(hashMap, (b) next.getKey(), (d.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else if (parameterTypes[0].isAssignableFrom(g.class)) {
                    i3 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                d.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == d.a.ON_ANY) {
                        i3 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i3, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0004a aVar = new C0004a(hashMap);
        this.f472a.put(cls, aVar);
        this.f473b.put(cls, Boolean.valueOf(z3));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class<?> cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f477b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public C0004a c(Class<?> cls) {
        C0004a aVar = this.f472a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f473b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b4 = b(cls);
        for (Method annotation : b4) {
            if (((n) annotation.getAnnotation(n.class)) != null) {
                a(cls, b4);
                return true;
            }
        }
        this.f473b.put(cls, Boolean.FALSE);
        return false;
    }
}
