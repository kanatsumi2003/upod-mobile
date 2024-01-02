package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import f0.k;
import g0.d;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    k<Void> didReinitializeFirebaseCore();

    k<Map<String, Object>> getPluginConstantsForFirebaseApp(d dVar);
}
