package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@TargetApi(17)
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused = false;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        private final a f1708a;

        /* renamed from: b  reason: collision with root package name */
        private final View f1709b;

        public a(Context context, a aVar, View view) {
            super(context);
            this.f1708a = aVar;
            this.f1709b = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1708a.a(this.f1709b, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f1710a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1711b = new Rect();

        public b(Context context) {
            super(context);
        }

        private static int a(int i3) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f1710a.set(i3, i4, i5, i6);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f1710a, layoutParams.x, layoutParams.y, this.f1711b);
                Rect rect = this.f1711b;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                getChildAt(i5).measure(a(i3), a(i4));
            }
            super.onMeasure(i3, i4);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final InputMethodManager f1712a;

        c(Context context) {
            this(context, (InputMethodManager) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private c(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f1712a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }

        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f1712a);
        }

        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f1712a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final f f1713a;

        /* renamed from: b  reason: collision with root package name */
        private WindowManager f1714b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f1715c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f1713a = fVar;
            this.f1715c = context2;
        }

        private WindowManager a() {
            if (this.f1714b == null) {
                this.f1714b = this.f1713a.b();
            }
            return this.f1714b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i3 = 0;
            while (i3 < stackTrace.length && i3 < 11) {
                if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                    return true;
                }
                i3++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f1715c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public f f1716a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public f f1717b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public b f1718c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f1719a;

        /* renamed from: b  reason: collision with root package name */
        b f1720b;

        f(WindowManager windowManager, b bVar) {
            this.f1719a = windowManager;
            this.f1720b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f1720b;
            if (bVar == null) {
                b1.b.f(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f1720b;
            if (bVar == null) {
                b1.b.f(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView(objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f1720b == null) {
                b1.b.f(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = objArr[0];
            view.clearAnimation();
            this.f1720b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f1720b;
            if (bVar == null) {
                b1.b.f(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            char c4 = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    a(objArr);
                    return null;
                case 1:
                    d(objArr);
                    return null;
                case 2:
                    e(objArr);
                    return null;
                case 3:
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f1719a, objArr);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i3;
        this.createParams = obj;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        f unused = eVar.f1716a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public f getView() {
        if (this.state.f1716a == null) {
            return null;
        }
        return this.state.f1716a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f1718c == null) {
            b unused = this.state.f1718c = new b(getContext());
        }
        if (this.state.f1717b == null) {
            e eVar = this.state;
            f unused2 = eVar.f1717b = new f((WindowManager) getContext().getSystemService("window"), eVar.f1718c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f1717b, this.outerContext);
        View c4 = this.state.f1716a.c();
        if (c4.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) c4.getContext()).setBaseContext(dVar);
        } else {
            b1.b.f(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(c4);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, c4);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f1718c);
        c4.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            c4.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
