package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.u;

final class FlutterSplashView extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private static String f1417j = "FlutterSplashView";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public h0 f1418a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public u f1419b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f1420c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f1421d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f1422e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f1423f;

    /* renamed from: g  reason: collision with root package name */
    private final u.f f1424g;

    /* renamed from: h  reason: collision with root package name */
    private final m1.b f1425h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f1426i;

    @Keep
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        /* access modifiers changed from: private */
        public String previousCompletedSplashIsolate;
        /* access modifiers changed from: private */
        public Bundle splashScreenState;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    class a implements u.f {
        a() {
        }

        public void a() {
        }

        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f1419b.y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f1419b, FlutterSplashView.this.f1418a);
        }
    }

    class b implements m1.b {
        b() {
        }

        public void c() {
        }

        public void f() {
            if (FlutterSplashView.this.f1418a != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f1420c);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f1423f = flutterSplashView2.f1422e;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f1424g = new a();
        this.f1425h = new b();
        this.f1426i = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        u uVar = this.f1419b;
        if (uVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (uVar.w()) {
            return this.f1419b.getAttachedFlutterEngine().h().k() != null && this.f1419b.getAttachedFlutterEngine().h().k().equals(this.f1423f);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    private boolean i() {
        u uVar = this.f1419b;
        return uVar != null && uVar.w() && !this.f1419b.u() && !h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1418a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j() {
        /*
            r1 = this;
            io.flutter.embedding.android.u r0 = r1.f1419b
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x001c
            io.flutter.embedding.android.h0 r0 = r1.f1418a
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterSplashView.j():boolean");
    }

    /* access modifiers changed from: private */
    public void k() {
        this.f1422e = this.f1419b.getAttachedFlutterEngine().h().k();
        String str = f1417j;
        b1.b.e(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f1422e);
        this.f1418a.a(this.f1426i);
    }

    private boolean l() {
        u uVar = this.f1419b;
        if (uVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (uVar.w()) {
            return this.f1419b.u() && !h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    public void g(u uVar, h0 h0Var) {
        u uVar2 = this.f1419b;
        if (uVar2 != null) {
            uVar2.z(this.f1425h);
            removeView(this.f1419b);
        }
        View view = this.f1420c;
        if (view != null) {
            removeView(view);
        }
        this.f1419b = uVar;
        addView(uVar);
        this.f1418a = h0Var;
        if (h0Var == null) {
            return;
        }
        if (i()) {
            b1.b.e(f1417j, "Showing splash screen UI.");
            View c4 = h0Var.c(getContext(), this.f1421d);
            this.f1420c = c4;
            addView(c4);
            uVar.l(this.f1425h);
        } else if (j()) {
            b1.b.e(f1417j, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c5 = h0Var.c(getContext(), this.f1421d);
            this.f1420c = c5;
            addView(c5);
            k();
        } else if (!uVar.w()) {
            b1.b.e(f1417j, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            uVar.k(this.f1424g);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1423f = savedState.previousCompletedSplashIsolate;
        this.f1421d = savedState.splashScreenState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f1423f;
        h0 h0Var = this.f1418a;
        Bundle unused2 = savedState.splashScreenState = h0Var != null ? h0Var.d() : null;
        return savedState;
    }
}
