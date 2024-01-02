package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
public final class b implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f1438a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView.ScaleType f1439b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1440c;

    /* renamed from: d  reason: collision with root package name */
    private C0024b f1441d;

    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f1442a;

        a(Runnable runnable) {
            this.f1442a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1442a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f1442a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b  reason: collision with other inner class name */
    public static class C0024b extends ImageView {
        public C0024b(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        public C0024b(Context context, AttributeSet attributeSet, int i3) {
            super(context, attributeSet, i3);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j3) {
        this.f1438a = drawable;
        this.f1439b = scaleType;
        this.f1440c = j3;
    }

    public void a(Runnable runnable) {
        C0024b bVar = this.f1441d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f1440c).setListener(new a(runnable));
        }
    }

    public /* synthetic */ boolean b() {
        return g0.a(this);
    }

    public View c(Context context, Bundle bundle) {
        C0024b bVar = new C0024b(context);
        this.f1441d = bVar;
        bVar.a(this.f1438a, this.f1439b);
        return this.f1441d;
    }

    public /* synthetic */ Bundle d() {
        return g0.b(this);
    }
}
