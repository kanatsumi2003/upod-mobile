package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public class v {

    /* renamed from: d  reason: collision with root package name */
    private static v f2024d;

    /* renamed from: e  reason: collision with root package name */
    private static b f2025e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f2026a = -1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public FlutterJNI f2027b;

    /* renamed from: c  reason: collision with root package name */
    private final FlutterJNI.b f2028c = new a();

    class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.v$a$a  reason: collision with other inner class name */
        class C0029a implements Choreographer.FrameCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f2030a;

            C0029a(long j3) {
                this.f2030a = j3;
            }

            public void doFrame(long j3) {
                long nanoTime = System.nanoTime() - j3;
                v.this.f2027b.onVsync(nanoTime < 0 ? 0 : nanoTime, v.this.f2026a, this.f2030a);
            }
        }

        a() {
        }

        public void a(long j3) {
            Choreographer.getInstance().postFrameCallback(new C0029a(j3));
        }
    }

    @TargetApi(17)
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private DisplayManager f2032a;

        b(DisplayManager displayManager) {
            this.f2032a = displayManager;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2032a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i3) {
        }

        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                float refreshRate = this.f2032a.getDisplay(0).getRefreshRate();
                long unused = v.this.f2026a = (long) (1.0E9d / ((double) refreshRate));
                v.this.f2027b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i3) {
        }
    }

    private v(FlutterJNI flutterJNI) {
        this.f2027b = flutterJNI;
    }

    @TargetApi(17)
    public static v d(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2024d == null) {
            f2024d = new v(flutterJNI);
        }
        if (f2025e == null) {
            v vVar = f2024d;
            Objects.requireNonNull(vVar);
            b bVar = new b(displayManager);
            f2025e = bVar;
            bVar.a();
        }
        if (f2024d.f2026a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2024d.f2026a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2024d;
    }

    public void e() {
        this.f2027b.setAsyncWaitForVsyncDelegate(this.f2028c);
    }
}
