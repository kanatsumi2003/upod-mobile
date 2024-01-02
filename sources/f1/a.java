package f1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import j2.i;

@TargetApi(19)
public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private FlutterMutatorsStack f1230a;

    /* renamed from: b  reason: collision with root package name */
    private float f1231b;

    /* renamed from: c  reason: collision with root package name */
    private int f1232c;

    /* renamed from: d  reason: collision with root package name */
    private int f1233d;

    /* renamed from: e  reason: collision with root package name */
    private int f1234e;

    /* renamed from: f  reason: collision with root package name */
    private int f1235f;

    /* renamed from: g  reason: collision with root package name */
    private final io.flutter.embedding.android.a f1236g;

    /* renamed from: h  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f1237h;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    class C0021a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f1238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1239b;

        C0021a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f1238a = onFocusChangeListener;
            this.f1239b = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f1238a;
            View view3 = this.f1239b;
            onFocusChangeListener.onFocusChange(view3, i.c(view3));
        }
    }

    public a(Context context, float f4, io.flutter.embedding.android.a aVar) {
        super(context, (AttributeSet) null);
        this.f1231b = f4;
        this.f1236g = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f1230a.getFinalMatrix());
        float f4 = this.f1231b;
        matrix.preScale(1.0f / f4, 1.0f / f4);
        matrix.postTranslate((float) (-this.f1232c), (float) (-this.f1233d));
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i3, int i4, int i5, int i6) {
        this.f1230a = flutterMutatorsStack;
        this.f1232c = i3;
        this.f1233d = i4;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f1237h) != null) {
            this.f1237h = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f1230a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f1232c), (float) (-this.f1233d));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        float f4;
        if (this.f1236g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f1232c;
            this.f1234e = i4;
            i3 = this.f1233d;
            this.f1235f = i3;
            f4 = (float) i4;
        } else if (action != 2) {
            f4 = (float) this.f1232c;
            i3 = this.f1233d;
        } else {
            matrix.postTranslate((float) this.f1234e, (float) this.f1235f);
            this.f1234e = this.f1232c;
            this.f1235f = this.f1233d;
            return this.f1236g.g(motionEvent, matrix);
        }
        matrix.postTranslate(f4, (float) i3);
        return this.f1236g.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f1237h == null) {
            C0021a aVar = new C0021a(onFocusChangeListener, this);
            this.f1237h = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
