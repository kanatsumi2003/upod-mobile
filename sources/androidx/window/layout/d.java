package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f543d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ WindowLayoutInfo f544e;

    public /* synthetic */ d(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f543d = windowLayoutChangeCallbackWrapper;
        this.f544e = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m6accept$lambda0(this.f543d, this.f544e);
    }
}
