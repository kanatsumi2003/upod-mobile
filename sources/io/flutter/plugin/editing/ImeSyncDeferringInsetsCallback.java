package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import java.util.List;

@SuppressLint({"NewApi", "Override"})
@Keep
@TargetApi(30)
class ImeSyncDeferringInsetsCallback {
    /* access modifiers changed from: private */
    public boolean animating = false;
    private AnimationCallback animationCallback;
    /* access modifiers changed from: private */
    public int deferredInsetTypes;
    private b insetsListener;
    /* access modifiers changed from: private */
    public WindowInsets lastWindowInsets;
    /* access modifiers changed from: private */
    public boolean needsSave = false;
    /* access modifiers changed from: private */
    public int overlayInsetTypes;
    /* access modifiers changed from: private */
    public View view;

    @Keep
    private class AnimationCallback extends WindowInsetsAnimation.Callback {
        AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = false;
                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            if ((windowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = true;
                boolean unused2 = ImeSyncDeferringInsetsCallback.this.needsSave = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z3 = false;
                for (WindowInsetsAnimation typeMask : list) {
                    if ((typeMask.getTypeMask() & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z3 = true;
                    }
                }
                if (!z3) {
                    return windowInsets;
                }
                WindowInsets$Builder windowInsets$Builder = new WindowInsets$Builder(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                WindowInsets$Builder unused = windowInsets$Builder.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.overlayInsetTypes).bottom, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(windowInsets$Builder.build());
            }
            return windowInsets;
        }
    }

    private class b implements View.OnApplyWindowInsetsListener {
        private b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            View unused = ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                WindowInsets unused2 = ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                boolean unused3 = ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            return ImeSyncDeferringInsetsCallback.this.animating ? WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    ImeSyncDeferringInsetsCallback(View view2, int i3, int i4) {
        this.overlayInsetTypes = i3;
        this.deferredInsetTypes = i4;
        this.view = view2;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b();
    }

    /* access modifiers changed from: package-private */
    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    /* access modifiers changed from: package-private */
    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    /* access modifiers changed from: package-private */
    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    /* access modifiers changed from: package-private */
    public void remove() {
        this.view.setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }
}
