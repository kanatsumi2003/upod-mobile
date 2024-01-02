package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a  reason: collision with root package name */
    private b.b<String, b> f515a = new b.b<>();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f516b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f517c;

    /* renamed from: d  reason: collision with root package name */
    boolean f518d = true;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.f517c) {
            Bundle bundle = this.f516b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f516b.remove(str);
            if (this.f516b.isEmpty()) {
                this.f516b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void b(d dVar, Bundle bundle) {
        if (!this.f517c) {
            if (bundle != null) {
                this.f516b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            dVar.a(new e() {
                public void d(g gVar, d.a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z3;
                    if (aVar == d.a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z3 = true;
                    } else if (aVar == d.a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z3 = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f518d = z3;
                }
            });
            this.f517c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f516b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b<K, V>.d c4 = this.f515a.c();
        while (c4.hasNext()) {
            Map.Entry entry = (Map.Entry) c4.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
