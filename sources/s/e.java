package s;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface e {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T c(String str, Class<T> cls);

    Activity e();

    void startActivityForResult(Intent intent, int i3);
}
