package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class e {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.O(context, str, bundle);
    }

    public abstract View c(int i3);

    public abstract boolean e();
}
