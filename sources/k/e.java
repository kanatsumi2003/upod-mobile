package k;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f2045a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, Object> f2046b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2047c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2048d = {d.a.accessibility_custom_action_0, d.a.accessibility_custom_action_1, d.a.accessibility_custom_action_2, d.a.accessibility_custom_action_3, d.a.accessibility_custom_action_4, d.a.accessibility_custom_action_5, d.a.accessibility_custom_action_6, d.a.accessibility_custom_action_7, d.a.accessibility_custom_action_8, d.a.accessibility_custom_action_9, d.a.accessibility_custom_action_10, d.a.accessibility_custom_action_11, d.a.accessibility_custom_action_12, d.a.accessibility_custom_action_13, d.a.accessibility_custom_action_14, d.a.accessibility_custom_action_15, d.a.accessibility_custom_action_16, d.a.accessibility_custom_action_17, d.a.accessibility_custom_action_18, d.a.accessibility_custom_action_19, d.a.accessibility_custom_action_20, d.a.accessibility_custom_action_21, d.a.accessibility_custom_action_22, d.a.accessibility_custom_action_23, d.a.accessibility_custom_action_24, d.a.accessibility_custom_action_25, d.a.accessibility_custom_action_26, d.a.accessibility_custom_action_27, d.a.accessibility_custom_action_28, d.a.accessibility_custom_action_29, d.a.accessibility_custom_action_30, d.a.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    private static final c f2049e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static c f2050f = new c();

    class a implements c {
        a() {
        }
    }

    class b extends d<CharSequence> {
        b(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2051a = new WeakHashMap<>();

        c() {
        }

        private void a(View view, boolean z3) {
            boolean z4 = view.getVisibility() == 0;
            if (z3 != z4) {
                e.h(view, z4 ? 16 : 32);
                this.f2051a.put(view, Boolean.valueOf(z4));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f2051a.entrySet()) {
                    a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f2052a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2053b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2054c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2055d;

        d(int i3, Class<T> cls, int i4, int i5) {
            this.f2052a = i3;
            this.f2053b = cls;
            this.f2055d = i4;
            this.f2054c = i5;
        }

        private boolean a() {
            return true;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f2054c;
        }

        /* access modifiers changed from: package-private */
        public abstract T c(View view);

        /* access modifiers changed from: package-private */
        public T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T tag = view.getTag(this.f2052a);
            if (this.f2053b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    /* renamed from: k.e$e  reason: collision with other inner class name */
    public interface C0031e {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class f {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2056d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2057a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2058b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f2059c = null;

        f() {
        }

        static f a(View view) {
            int i3 = d.a.tag_unhandled_key_event_manager;
            f fVar = (f) view.getTag(i3);
            if (fVar != null) {
                return fVar;
            }
            f fVar2 = new f();
            view.setTag(i3, fVar2);
            return fVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2057a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c4 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c4 != null) {
                            return c4;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f2058b == null) {
                this.f2058b = new SparseArray<>();
            }
            return this.f2058b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(d.a.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0031e) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2057a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2056d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2057a == null) {
                        this.f2057a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2056d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2057a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2057a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c4 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c4 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c4));
                }
            }
            return c4 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2059c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2059c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d4 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d4.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d4.valueAt(indexOfKey);
                d4.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d4.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && e.g(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return f.a(view).b(view, keyEvent);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return f.a(view).f(keyEvent);
    }

    public static int c(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static CharSequence d(View view) {
        return i().d(view);
    }

    public static int e(View view) {
        return view.getImportantForAccessibility();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static boolean g(View view) {
        return view.isAttachedToWindow();
    }

    static void h(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = d(view) != null && view.getVisibility() == 0;
            int i4 = 32;
            if (c(view) != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z3) {
                    i4 = 2048;
                }
                obtain.setEventType(i4);
                obtain.setContentChangeTypes(i3);
                if (z3) {
                    obtain.getText().add(d(view));
                    l(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i3 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i3);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    private static d<CharSequence> i() {
        return new b(d.a.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void j(View view, int i3) {
        view.setImportantForAccessibility(i3);
    }

    public static void k(View view, String str) {
        view.setTransitionName(str);
    }

    private static void l(View view) {
        if (e(view) == 0) {
            j(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (e((View) parent) == 4) {
                j(view, 2);
                return;
            }
        }
    }
}
