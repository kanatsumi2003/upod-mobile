package androidx.window.layout;

import android.app.Activity;
import d3.b;
import d3.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((e) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        i.e(windowMetricsCalculator2, "windowMetricsCalculator");
        i.e(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        i.e(activity, "activity");
        return d.a(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (m2.d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
