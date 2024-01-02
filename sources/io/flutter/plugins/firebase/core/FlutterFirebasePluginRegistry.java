package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import f0.k;
import f0.l;
import f0.n;
import g0.d;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static k<Void> didReinitializeFirebaseCore() {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(lVar));
        return lVar.a();
    }

    static k<Map<String, Object>> getPluginConstantsForFirebaseApp(d dVar) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(dVar, lVar));
        return lVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(l lVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
                n.a(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
            }
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(d dVar, l lVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), n.a(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(dVar)));
            }
            lVar.c(hashMap);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
