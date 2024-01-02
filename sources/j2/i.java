package j2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

public final class i {

    public interface a {
        boolean a(View view);
    }

    public static boolean c(View view) {
        return i(view, new g());
    }

    public static int d(int i3) {
        return View.generateViewId();
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, Class<? extends View>[] clsArr) {
        return i(view, new h(clsArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean h(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(View view, a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                if (i(viewGroup.getChildAt(i3), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
