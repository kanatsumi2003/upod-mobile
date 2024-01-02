package k;

import android.view.View;
import android.view.ViewTreeObserver;

public final class d implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f2042a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f2043b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f2044c;

    private d(View view, Runnable runnable) {
        this.f2042a = view;
        this.f2043b = view.getViewTreeObserver();
        this.f2044c = runnable;
    }

    public static d a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            d dVar = new d(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(dVar);
            view.addOnAttachStateChangeListener(dVar);
            return dVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        (this.f2043b.isAlive() ? this.f2043b : this.f2042a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2042a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f2044c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2043b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
