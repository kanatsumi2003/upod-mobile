package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import l0.d;
import s0.h;

@Keep
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    public List<d<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-core", "2.3.0"));
    }
}
