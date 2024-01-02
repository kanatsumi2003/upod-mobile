package s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import b0.e;
import c.a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class g0 extends Fragment implements e {

    /* renamed from: b0  reason: collision with root package name */
    private static final WeakHashMap f2849b0 = new WeakHashMap();
    private final Map Y = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */
    public int Z = 0;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public Bundle f2850a0;

    public static g0 r1(d dVar) {
        g0 g0Var;
        WeakHashMap weakHashMap = f2849b0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(dVar);
        if (weakReference != null && (g0Var = (g0) weakReference.get()) != null) {
            return g0Var;
        }
        try {
            g0 g0Var2 = (g0) dVar.l().c("SupportLifecycleFragmentImpl");
            if (g0Var2 == null || g0Var2.S()) {
                g0Var2 = new g0();
                dVar.l().a().b(g0Var2, "SupportLifecycleFragmentImpl").e();
            }
            weakHashMap.put(dVar, new WeakReference(g0Var2));
            return g0Var2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e4);
        }
    }

    public final void W(int i3, int i4, Intent intent) {
        super.W(i3, i4, intent);
        for (LifecycleCallback e4 : this.Y.values()) {
            e4.e(i3, i4, intent);
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Y.containsKey(str)) {
            this.Y.put(str, lifecycleCallback);
            if (this.Z > 0) {
                new e(Looper.getMainLooper()).post(new f0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.Z = 1;
        this.f2850a0 = bundle;
        for (Map.Entry entry : this.Y.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.Y.get(str));
    }

    public final /* synthetic */ Activity e() {
        return l();
    }

    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a4 : this.Y.values()) {
            a4.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void g0() {
        super.g0();
        this.Z = 5;
        for (LifecycleCallback g3 : this.Y.values()) {
            g3.g();
        }
    }

    public final void w0() {
        super.w0();
        this.Z = 3;
        for (LifecycleCallback h3 : this.Y.values()) {
            h3.h();
        }
    }

    public final void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.Y.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void y0() {
        super.y0();
        this.Z = 2;
        for (LifecycleCallback j3 : this.Y.values()) {
            j3.j();
        }
    }

    public final void z0() {
        super.z0();
        this.Z = 4;
        for (LifecycleCallback k3 : this.Y.values()) {
            k3.k();
        }
    }
}
