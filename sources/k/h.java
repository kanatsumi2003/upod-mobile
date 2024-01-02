package k;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final e f2060a;

    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f2061a;

        /* renamed from: b  reason: collision with root package name */
        private final View f2062b;

        a(Window window, View view) {
            this.f2061a = window;
            this.f2062b = view;
        }

        /* access modifiers changed from: protected */
        public void c(int i3) {
            View decorView = this.f2061a.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i3) {
            this.f2061a.addFlags(i3);
        }

        /* access modifiers changed from: protected */
        public void e(int i3) {
            View decorView = this.f2061a.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void f(int i3) {
            this.f2061a.clearFlags(i3);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z3) {
            if (z3) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z3) {
            if (z3) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final h f2063a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f2064b;

        /* renamed from: c  reason: collision with root package name */
        private final c.e<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2065c;

        d(Window window, h hVar) {
            this(window.getInsetsController(), hVar);
        }

        d(WindowInsetsController windowInsetsController, h hVar) {
            this.f2065c = new c.e<>();
            this.f2064b = windowInsetsController;
            this.f2063a = hVar;
        }

        public void a(boolean z3) {
            if (z3) {
                this.f2064b.setSystemBarsAppearance(16, 16);
            } else {
                this.f2064b.setSystemBarsAppearance(0, 16);
            }
        }

        public void b(boolean z3) {
            if (z3) {
                this.f2064b.setSystemBarsAppearance(8, 8);
            } else {
                this.f2064b.setSystemBarsAppearance(0, 8);
            }
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z3) {
        }

        public void b(boolean z3) {
        }
    }

    public h(Window window, View view) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f2060a = new d(window, this);
        } else {
            this.f2060a = i3 >= 26 ? new c(window, view) : i3 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(boolean z3) {
        this.f2060a.a(z3);
    }

    public void b(boolean z3) {
        this.f2060a.b(z3);
    }
}
