package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t2.b;
import t2.d;
import t2.e;
import t2.f;
import t2.g;
import t2.h;
import t2.i;
import t2.j;
import t2.k;
import t2.l;
import t2.m;
import t2.n;
import t2.o;
import t2.p;
import t2.q;
import t2.r;
import t2.s;
import t2.t;
import t2.u;
import t2.v;
import t2.w;

public final class c implements x2.c<Object>, b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f2090e = new a((e) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Class<? extends k2.c<?>>, Integer> f2091f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, String> f2092g;

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String> f2093h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String> f2094i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Map<String, String> f2095j;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f2096d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            i.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        i.d(simpleName, "name");
                        String T = n.T(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (T != null) {
                            return T;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    i.d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return n.S(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return n.T(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) c.f2095j.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) c.f2095j.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i3 = 0;
        List d4 = i.d(t2.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, t2.c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(j.g(d4, 10));
        for (Object next : d4) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i.f();
            }
            arrayList.add(k2.p.a((Class) next, Integer.valueOf(i3)));
            i3 = i4;
        }
        f2091f = z.g(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f2092g = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f2093h = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.d(str, "kotlinName");
            sb.append(n.V(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            k2.l a4 = k2.p.a(sb2, str + ".Companion");
            hashMap3.put(a4.c(), a4.d());
        }
        for (Map.Entry next2 : f2091f.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f2094i = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), n.V((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f2095j = linkedHashMap;
    }

    public c(Class<?> cls) {
        i.e(cls, "jClass");
        this.f2096d = cls;
    }

    public String a() {
        return f2090e.a(b());
    }

    public Class<?> b() {
        return this.f2096d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(s2.a.a(this), s2.a.a((x2.c) obj));
    }

    public int hashCode() {
        return s2.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
