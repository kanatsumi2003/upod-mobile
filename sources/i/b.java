package i;

import android.content.res.Configuration;
import android.os.Build;

public final class b {
    public static d a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.d(configuration.getLocales());
        }
        return d.a(configuration.locale);
    }
}
