package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.i;

@ExperimentalWindowApi
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, float f4) {
        i.e(activityStack, "primaryActivityStack");
        i.e(activityStack2, "secondaryActivityStack");
        this.primaryActivityStack = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.splitRatio = f4;
    }

    public final boolean contains(Activity activity) {
        i.e(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (!i.a(this.primaryActivityStack, splitInfo.primaryActivityStack) || !i.a(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return false;
        }
        return (this.splitRatio > splitInfo.splitRatio ? 1 : (this.splitRatio == splitInfo.splitRatio ? 0 : -1)) == 0;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.floatToIntBits(this.splitRatio);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb.append("splitRatio=" + getSplitRatio() + '}');
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
