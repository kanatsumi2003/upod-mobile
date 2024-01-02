package t;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import s.e;

public abstract class d0 implements DialogInterface.OnClickListener {
    public static d0 b(Activity activity, Intent intent, int i3) {
        return new b0(intent, activity, i3);
    }

    public static d0 c(e eVar, Intent intent, int i3) {
        return new c0(intent, eVar, 2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e4);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
