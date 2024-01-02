package s;

import android.app.Activity;
import t.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2824a;

    public d(Activity activity) {
        o.i(activity, "Activity must not be null");
        this.f2824a = activity;
    }

    public final Activity a() {
        return (Activity) this.f2824a;
    }

    public final androidx.fragment.app.d b() {
        return (androidx.fragment.app.d) this.f2824a;
    }

    public final boolean c() {
        return this.f2824a instanceof Activity;
    }

    public final boolean d() {
        return this.f2824a instanceof androidx.fragment.app.d;
    }
}
