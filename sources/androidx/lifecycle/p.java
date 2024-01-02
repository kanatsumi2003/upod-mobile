package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.d;

public class p extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f499a;

    interface a {
        void a();

        void b();

        void c();
    }

    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            p.a(activity, d.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            p.a(activity, d.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            p.a(activity, d.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            p.a(activity, d.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            p.a(activity, d.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            p.a(activity, d.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, d.a aVar) {
        if (activity instanceof i) {
            ((i) activity).a().i(aVar);
        } else if (activity instanceof g) {
            d a4 = ((g) activity).a();
            if (a4 instanceof h) {
                ((h) a4).i(aVar);
            }
        }
    }

    private void b(d.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f499a);
        b(d.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(d.a.ON_DESTROY);
        this.f499a = null;
    }

    public void onPause() {
        super.onPause();
        b(d.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.f499a);
        b(d.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.f499a);
        b(d.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(d.a.ON_STOP);
    }
}
