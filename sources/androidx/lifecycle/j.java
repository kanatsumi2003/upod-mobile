package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, Integer> f496a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends c>>> f497b = new HashMap();

    private static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return (c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static Constructor<? extends c> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c4 = c(canonicalName);
            if (!name.isEmpty()) {
                c4 = name + "." + c4;
            }
            Constructor<?> declaredConstructor = Class.forName(c4).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f496a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g3 = g(cls);
        f496a.put(cls, Integer.valueOf(g3));
        return g3;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && f.class.isAssignableFrom(cls);
    }

    static e f(Object obj) {
        boolean z3 = obj instanceof e;
        boolean z4 = obj instanceof b;
        if (z3 && z4) {
            return new FullLifecycleObserverAdapter((b) obj, (e) obj);
        }
        if (z4) {
            return new FullLifecycleObserverAdapter((b) obj, (e) null);
        }
        if (z3) {
            return (e) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f497b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            cVarArr[i3] = a((Constructor) list.get(i3), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends c> b4 = b(cls);
        if (b4 != null) {
            f497b.put(cls, Collections.singletonList(b4));
            return 2;
        } else if (a.f471c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f497b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f497b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f497b.put(cls, arrayList);
            return 2;
        }
    }
}
