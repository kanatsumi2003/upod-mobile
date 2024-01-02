package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.u;

@TargetApi(20)
class t {

    /* renamed from: a  reason: collision with root package name */
    SingleViewPresentation f1787a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1788b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1789c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1790d;

    /* renamed from: e  reason: collision with root package name */
    private final u.c f1791e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f1792f;

    /* renamed from: g  reason: collision with root package name */
    private final Surface f1793g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualDisplay f1794h;

    /* renamed from: i  reason: collision with root package name */
    private int f1795i;

    /* renamed from: j  reason: collision with root package name */
    private int f1796j;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f1798b;

        /* renamed from: io.flutter.plugin.platform.t$a$a  reason: collision with other inner class name */
        class C0027a implements Runnable {
            C0027a() {
            }

            public void run() {
                a aVar = a.this;
                aVar.f1797a.postDelayed(aVar.f1798b, 128);
            }
        }

        a(View view, Runnable runnable) {
            this.f1797a = view;
            this.f1798b = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            b.a(this.f1797a, new C0027a());
            this.f1797a.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final View f1801a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f1802b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                b.this.f1801a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f1801a = view;
            this.f1802b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f1802b;
            if (runnable != null) {
                runnable.run();
                this.f1802b = null;
                this.f1801a.post(new a());
            }
        }
    }

    private t(Context context, a aVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, u.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i3, Object obj) {
        Context context2 = context;
        this.f1788b = context2;
        a aVar2 = aVar;
        this.f1789c = aVar2;
        this.f1791e = cVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f1792f = onFocusChangeListener2;
        this.f1793g = surface;
        this.f1794h = virtualDisplay;
        this.f1790d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f1794h.getDisplay(), fVar, aVar2, i3, obj, onFocusChangeListener2);
        this.f1787a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static t a(Context context, a aVar, f fVar, u.c cVar, int i3, int i4, int i5, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i6 = i3;
        int i7 = i4;
        context.getResources().getDisplayMetrics();
        if (i6 == 0 || i7 == 0) {
            return null;
        }
        cVar.d().setDefaultBufferSize(i6, i7);
        Surface surface = new Surface(cVar.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i3, i4, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        t tVar = new t(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i5, obj);
        tVar.f1795i = i6;
        tVar.f1796j = i7;
        return tVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f1787a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    public int c() {
        return this.f1796j;
    }

    public int d() {
        return this.f1795i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f1787a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().c();
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        SingleViewPresentation singleViewPresentation = this.f1787a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f1787a.getView().d(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.f1787a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f1787a.getView().f();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        SingleViewPresentation singleViewPresentation = this.f1787a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f1787a.getView().b();
        }
    }

    public void i(int i3, int i4, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f1787a.detachState();
        this.f1794h.setSurface((Surface) null);
        this.f1794h.release();
        this.f1795i = i3;
        this.f1796j = i4;
        this.f1791e.d().setDefaultBufferSize(i3, i4);
        this.f1794h = ((DisplayManager) this.f1788b.getSystemService("display")).createVirtualDisplay("flutter-vd", i3, i4, this.f1790d, this.f1793g, 0);
        View e4 = e();
        e4.addOnAttachStateChangeListener(new a(e4, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f1788b, this.f1794h.getDisplay(), this.f1789c, detachState, this.f1792f, isFocused);
        singleViewPresentation.show();
        this.f1787a.cancel();
        this.f1787a = singleViewPresentation;
    }
}
