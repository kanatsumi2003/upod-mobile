package l0;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f2252a;

    /* renamed from: b  reason: collision with root package name */
    private final c<T> f2253b;

    private static class b implements c<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f2254a;

        private b(Class<? extends Service> cls) {
            this.f2254a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f2254a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f2254a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b4 = b(context);
            if (b4 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b4.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b4.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t3);
    }

    g(T t3, c<T> cVar) {
        this.f2252a = t3;
        this.f2253b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    /* access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e4) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e4);
        } catch (InstantiationException e5) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e5);
        } catch (NoSuchMethodException e6) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e6);
        } catch (InvocationTargetException e7) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e7);
        }
    }

    public List<q0.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f2253b.a(this.f2252a)) {
            arrayList.add(new f(fVar));
        }
        return arrayList;
    }
}
