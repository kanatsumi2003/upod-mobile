package s;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b0.e;
import c.a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class e0 extends Fragment implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f2828d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f2829a = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f2830b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2831c;

    public static e0 f(Activity activity) {
        e0 e0Var;
        WeakHashMap weakHashMap = f2828d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (e0Var = (e0) weakReference.get()) != null) {
            return e0Var;
        }
        try {
            e0 e0Var2 = (e0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (e0Var2 == null || e0Var2.isRemoving()) {
                e0Var2 = new e0();
                activity.getFragmentManager().beginTransaction().add(e0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(e0Var2));
            return e0Var2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f2829a.containsKey(str)) {
            this.f2829a.put(str, lifecycleCallback);
            if (this.f2830b > 0) {
                new e(Looper.getMainLooper()).post(new d0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f2829a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a4 : this.f2829a.values()) {
            a4.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Activity e() {
        return getActivity();
    }

    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        for (LifecycleCallback e4 : this.f2829a.values()) {
            e4.e(i3, i4, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2830b = 1;
        this.f2831c = bundle;
        for (Map.Entry entry : this.f2829a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2830b = 5;
        for (LifecycleCallback g3 : this.f2829a.values()) {
            g3.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2830b = 3;
        for (LifecycleCallback h3 : this.f2829a.values()) {
            h3.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f2829a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2830b = 2;
        for (LifecycleCallback j3 : this.f2829a.values()) {
            j3.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2830b = 4;
        for (LifecycleCallback k3 : this.f2829a.values()) {
            k3.k();
        }
    }
}
