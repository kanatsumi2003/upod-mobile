package io.flutter.plugins;

import androidx.annotation.Keep;
import b1.b;
import g2.t;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import r1.c0;
import y0.d;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.o().f(new c0());
        } catch (Exception e4) {
            b.c(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e4);
        }
        try {
            aVar.o().f(new i());
        } catch (Exception e5) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e5);
        }
        try {
            aVar.o().f(new t());
        } catch (Exception e6) {
            b.c(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e6);
        }
        try {
            aVar.o().f(new h2.a());
        } catch (Exception e7) {
            b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e7);
        }
        try {
            aVar.o().f(new i2.i());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e8);
        }
        try {
            aVar.o().f(new d());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e9);
        }
    }
}
