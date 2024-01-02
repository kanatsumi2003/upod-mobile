package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import j.a;
import java.util.concurrent.Executor;

public class j0 {

    /* renamed from: a  reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f1511a;

    public j0(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f1511a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        this.f1511a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(a<WindowLayoutInfo> aVar) {
        this.f1511a.removeWindowLayoutInfoListener(aVar);
    }
}
