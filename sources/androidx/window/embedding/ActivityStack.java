package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@ExperimentalWindowApi
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    public ActivityStack(List<? extends Activity> list, boolean z3) {
        i.e(list, "activities");
        this.activities = list;
        this.isEmpty = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStack(List list, boolean z3, int i3, e eVar) {
        this(list, (i3 & 2) != 0 ? false : z3);
    }

    public final boolean contains(Activity activity) {
        i.e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return !i.a(this.activities, activityStack.activities) && this.isEmpty != activityStack.isEmpty;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * true) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(i.j("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
