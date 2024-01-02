package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import e.a0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g, t, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D = true;
    private boolean E;
    ViewGroup F;
    View G;
    View H;
    boolean I;
    boolean J = true;
    d K;
    Runnable L = new a();
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    d.b R = d.b.RESUMED;
    h S;
    r T;
    l<g> U = new l<>();
    androidx.savedstate.a V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    int f180a = 0;

    /* renamed from: b  reason: collision with root package name */
    Bundle f181b;

    /* renamed from: c  reason: collision with root package name */
    SparseArray<Parcelable> f182c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f183d;

    /* renamed from: e  reason: collision with root package name */
    String f184e = UUID.randomUUID().toString();

    /* renamed from: f  reason: collision with root package name */
    Bundle f185f;

    /* renamed from: g  reason: collision with root package name */
    Fragment f186g;

    /* renamed from: h  reason: collision with root package name */
    String f187h = null;

    /* renamed from: i  reason: collision with root package name */
    int f188i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f189j = null;

    /* renamed from: k  reason: collision with root package name */
    boolean f190k;

    /* renamed from: l  reason: collision with root package name */
    boolean f191l;

    /* renamed from: m  reason: collision with root package name */
    boolean f192m;

    /* renamed from: n  reason: collision with root package name */
    boolean f193n;

    /* renamed from: o  reason: collision with root package name */
    boolean f194o;

    /* renamed from: p  reason: collision with root package name */
    boolean f195p;

    /* renamed from: q  reason: collision with root package name */
    int f196q;

    /* renamed from: r  reason: collision with root package name */
    j f197r;

    /* renamed from: s  reason: collision with root package name */
    h f198s;

    /* renamed from: t  reason: collision with root package name */
    j f199t = new j();

    /* renamed from: u  reason: collision with root package name */
    Fragment f200u;

    /* renamed from: v  reason: collision with root package name */
    int f201v;

    /* renamed from: w  reason: collision with root package name */
    int f202w;

    /* renamed from: x  reason: collision with root package name */
    String f203x;

    /* renamed from: y  reason: collision with root package name */
    boolean f204y;

    /* renamed from: z  reason: collision with root package name */
    boolean f205z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.o1();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.f();
        }
    }

    class c extends e {
        c() {
        }

        public View c(int i3) {
            View view = Fragment.this.G;
            if (view != null) {
                return view.findViewById(i3);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        public boolean e() {
            return Fragment.this.G != null;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        View f210a;

        /* renamed from: b  reason: collision with root package name */
        Animator f211b;

        /* renamed from: c  reason: collision with root package name */
        int f212c;

        /* renamed from: d  reason: collision with root package name */
        int f213d;

        /* renamed from: e  reason: collision with root package name */
        int f214e;

        /* renamed from: f  reason: collision with root package name */
        int f215f;

        /* renamed from: g  reason: collision with root package name */
        Object f216g = null;

        /* renamed from: h  reason: collision with root package name */
        Object f217h;

        /* renamed from: i  reason: collision with root package name */
        Object f218i;

        /* renamed from: j  reason: collision with root package name */
        Object f219j;

        /* renamed from: k  reason: collision with root package name */
        Object f220k;

        /* renamed from: l  reason: collision with root package name */
        Object f221l;

        /* renamed from: m  reason: collision with root package name */
        Boolean f222m;

        /* renamed from: n  reason: collision with root package name */
        Boolean f223n;

        /* renamed from: o  reason: collision with root package name */
        boolean f224o;

        /* renamed from: p  reason: collision with root package name */
        f f225p;

        /* renamed from: q  reason: collision with root package name */
        boolean f226q;

        d() {
            Object obj = Fragment.X;
            this.f217h = obj;
            this.f218i = null;
            this.f219j = obj;
            this.f220k = null;
            this.f221l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        M();
    }

    private void M() {
        this.S = new h(this);
        this.V = androidx.savedstate.a.a(this);
        this.S.a(new androidx.lifecycle.e() {
            public void d(g gVar, d.a aVar) {
                View view;
                if (aVar == d.a.ON_STOP && (view = Fragment.this.G) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    @Deprecated
    public static Fragment O(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.h1(bundle);
            }
            return fragment;
        } catch (InstantiationException e4) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (IllegalAccessException e5) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    private d j() {
        if (this.K == null) {
            this.K = new d();
        }
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public int A() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f214e;
    }

    public void A0(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int B() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f215f;
    }

    public void B0(Bundle bundle) {
        this.E = true;
    }

    public final Fragment C() {
        return this.f200u;
    }

    /* access modifiers changed from: package-private */
    public void C0(Bundle bundle) {
        this.f199t.R0();
        this.f180a = 2;
        this.E = false;
        V(bundle);
        if (this.E) {
            this.f199t.x();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object D() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f219j;
        return obj == X ? u() : obj;
    }

    /* access modifiers changed from: package-private */
    public void D0() {
        this.f199t.o(this.f198s, new c(), this);
        this.E = false;
        Y(this.f198s.g());
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final Resources E() {
        return a1().getResources();
    }

    /* access modifiers changed from: package-private */
    public void E0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f199t.y(configuration);
    }

    public final boolean F() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean F0(MenuItem menuItem) {
        if (!this.f204y) {
            return a0(menuItem) || this.f199t.z(menuItem);
        }
        return false;
    }

    public Object G() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f217h;
        return obj == X ? s() : obj;
    }

    /* access modifiers changed from: package-private */
    public void G0(Bundle bundle) {
        this.f199t.R0();
        this.f180a = 1;
        this.E = false;
        this.V.c(bundle);
        b0(bundle);
        this.Q = true;
        if (this.E) {
            this.S.i(d.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object H() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f220k;
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Menu menu, MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.f204y) {
            return false;
        }
        if (this.C && this.D) {
            z3 = true;
            e0(menu, menuInflater);
        }
        return z3 | this.f199t.B(menu, menuInflater);
    }

    public Object I() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f221l;
        return obj == X ? H() : obj;
    }

    /* access modifiers changed from: package-private */
    public void I0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f199t.R0();
        this.f195p = true;
        this.T = new r();
        View f02 = f0(layoutInflater, viewGroup, bundle);
        this.G = f02;
        if (f02 != null) {
            this.T.c();
            this.U.g(this.T);
        } else if (!this.T.d()) {
            this.T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public int J() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f212c;
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        this.f199t.C();
        this.S.i(d.a.ON_DESTROY);
        this.f180a = 0;
        this.E = false;
        this.Q = false;
        g0();
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final Fragment K() {
        String str;
        Fragment fragment = this.f186g;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.f197r;
        if (jVar == null || (str = this.f187h) == null) {
            return null;
        }
        return jVar.f279g.get(str);
    }

    /* access modifiers changed from: package-private */
    public void K0() {
        this.f199t.D();
        if (this.G != null) {
            this.T.b(d.a.ON_DESTROY);
        }
        this.f180a = 1;
        this.E = false;
        i0();
        if (this.E) {
            androidx.loader.app.a.b(this).c();
            this.f195p = false;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public View L() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void L0() {
        this.E = false;
        j0();
        this.P = null;
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f199t.C0()) {
            this.f199t.C();
            this.f199t = new j();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater M0(Bundle bundle) {
        LayoutInflater k02 = k0(bundle);
        this.P = k02;
        return k02;
    }

    /* access modifiers changed from: package-private */
    public void N() {
        M();
        this.f184e = UUID.randomUUID().toString();
        this.f190k = false;
        this.f191l = false;
        this.f192m = false;
        this.f193n = false;
        this.f194o = false;
        this.f196q = 0;
        this.f197r = null;
        this.f199t = new j();
        this.f198s = null;
        this.f201v = 0;
        this.f202w = 0;
        this.f203x = null;
        this.f204y = false;
        this.f205z = false;
    }

    /* access modifiers changed from: package-private */
    public void N0() {
        onLowMemory();
        this.f199t.E();
    }

    /* access modifiers changed from: package-private */
    public void O0(boolean z3) {
        o0(z3);
        this.f199t.F(z3);
    }

    /* access modifiers changed from: package-private */
    public boolean P() {
        d dVar = this.K;
        if (dVar == null) {
            return false;
        }
        return dVar.f226q;
    }

    /* access modifiers changed from: package-private */
    public boolean P0(MenuItem menuItem) {
        if (!this.f204y) {
            return (this.C && this.D && p0(menuItem)) || this.f199t.U(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean Q() {
        return this.f196q > 0;
    }

    /* access modifiers changed from: package-private */
    public void Q0(Menu menu) {
        if (!this.f204y) {
            if (this.C && this.D) {
                q0(menu);
            }
            this.f199t.V(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean R() {
        d dVar = this.K;
        if (dVar == null) {
            return false;
        }
        return dVar.f224o;
    }

    /* access modifiers changed from: package-private */
    public void R0() {
        this.f199t.X();
        if (this.G != null) {
            this.T.b(d.a.ON_PAUSE);
        }
        this.S.i(d.a.ON_PAUSE);
        this.f180a = 3;
        this.E = false;
        r0();
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public final boolean S() {
        return this.f191l;
    }

    /* access modifiers changed from: package-private */
    public void S0(boolean z3) {
        s0(z3);
        this.f199t.Y(z3);
    }

    public final boolean T() {
        j jVar = this.f197r;
        if (jVar == null) {
            return false;
        }
        return jVar.G0();
    }

    /* access modifiers changed from: package-private */
    public boolean T0(Menu menu) {
        boolean z3 = false;
        if (this.f204y) {
            return false;
        }
        if (this.C && this.D) {
            z3 = true;
            t0(menu);
        }
        return z3 | this.f199t.Z(menu);
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.f199t.R0();
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        boolean E0 = this.f197r.E0(this);
        Boolean bool = this.f189j;
        if (bool == null || bool.booleanValue() != E0) {
            this.f189j = Boolean.valueOf(E0);
            u0(E0);
            this.f199t.a0();
        }
    }

    public void V(Bundle bundle) {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void V0() {
        this.f199t.R0();
        this.f199t.k0();
        this.f180a = 4;
        this.E = false;
        w0();
        if (this.E) {
            h hVar = this.S;
            d.a aVar = d.a.ON_RESUME;
            hVar.i(aVar);
            if (this.G != null) {
                this.T.b(aVar);
            }
            this.f199t.b0();
            this.f199t.k0();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onResume()");
    }

    public void W(int i3, int i4, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void W0(Bundle bundle) {
        x0(bundle);
        this.V.d(bundle);
        Parcelable d12 = this.f199t.d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
    }

    @Deprecated
    public void X(Activity activity) {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void X0() {
        this.f199t.R0();
        this.f199t.k0();
        this.f180a = 3;
        this.E = false;
        y0();
        if (this.E) {
            h hVar = this.S;
            d.a aVar = d.a.ON_START;
            hVar.i(aVar);
            if (this.G != null) {
                this.T.b(aVar);
            }
            this.f199t.c0();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStart()");
    }

    public void Y(Context context) {
        this.E = true;
        h hVar = this.f198s;
        Activity f4 = hVar == null ? null : hVar.f();
        if (f4 != null) {
            this.E = false;
            X(f4);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        this.f199t.e0();
        if (this.G != null) {
            this.T.b(d.a.ON_STOP);
        }
        this.S.i(d.a.ON_STOP);
        this.f180a = 2;
        this.E = false;
        z0();
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void Z(Fragment fragment) {
    }

    public final d Z0() {
        d l3 = l();
        if (l3 != null) {
            return l3;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public androidx.lifecycle.d a() {
        return this.S;
    }

    public boolean a0(MenuItem menuItem) {
        return false;
    }

    public final Context a1() {
        Context r3 = r();
        if (r3 != null) {
            return r3;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void b0(Bundle bundle) {
        this.E = true;
        d1(bundle);
        if (!this.f199t.F0(1)) {
            this.f199t.A();
        }
    }

    public final i b1() {
        i w3 = w();
        if (w3 != null) {
            return w3;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation c0(int i3, boolean z3, int i4) {
        return null;
    }

    public final View c1() {
        View L2 = L();
        if (L2 != null) {
            return L2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public s d() {
        j jVar = this.f197r;
        if (jVar != null) {
            return jVar.z0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Animator d0(int i3, boolean z3, int i4) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f199t.b1(parcelable);
            this.f199t.A();
        }
    }

    public void e0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public final void e1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f182c;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f182c = null;
        }
        this.E = false;
        B0(bundle);
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.G != null) {
            this.T.b(d.a.ON_CREATE);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        d dVar = this.K;
        f fVar = null;
        if (dVar != null) {
            dVar.f224o = false;
            f fVar2 = dVar.f225p;
            dVar.f225p = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3 = this.W;
        if (i3 != 0) {
            return layoutInflater.inflate(i3, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f1(View view) {
        j().f210a = view;
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f201v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f202w));
        printWriter.print(" mTag=");
        printWriter.println(this.f203x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f180a);
        printWriter.print(" mWho=");
        printWriter.print(this.f184e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f196q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f190k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f191l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f192m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f193n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f204y);
        printWriter.print(" mDetached=");
        printWriter.print(this.f205z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.D);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.f197r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f197r);
        }
        if (this.f198s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f198s);
        }
        if (this.f200u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f200u);
        }
        if (this.f185f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f185f);
        }
        if (this.f181b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f181b);
        }
        if (this.f182c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f182c);
        }
        Fragment K2 = K();
        if (K2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(K2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f188i);
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(z());
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.G);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(J());
        }
        if (r() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f199t + ":");
        j jVar = this.f199t;
        jVar.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void g0() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void g1(Animator animator) {
        j().f211b = animator;
    }

    public void h0() {
    }

    public void h1(Bundle bundle) {
        if (this.f197r == null || !T()) {
            this.f185f = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final SavedStateRegistry i() {
        return this.V.b();
    }

    public void i0() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void i1(boolean z3) {
        j().f226q = z3;
    }

    public void j0() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void j1(int i3) {
        if (this.K != null || i3 != 0) {
            j().f213d = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k(String str) {
        return str.equals(this.f184e) ? this : this.f199t.p0(str);
    }

    public LayoutInflater k0(Bundle bundle) {
        return y(bundle);
    }

    /* access modifiers changed from: package-private */
    public void k1(int i3, int i4) {
        if (this.K != null || i3 != 0 || i4 != 0) {
            j();
            d dVar = this.K;
            dVar.f214e = i3;
            dVar.f215f = i4;
        }
    }

    public final d l() {
        h hVar = this.f198s;
        if (hVar == null) {
            return null;
        }
        return (d) hVar.f();
    }

    public void l0(boolean z3) {
    }

    /* access modifiers changed from: package-private */
    public void l1(f fVar) {
        j();
        d dVar = this.K;
        f fVar2 = dVar.f225p;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                if (dVar.f224o) {
                    dVar.f225p = fVar;
                }
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public boolean m() {
        Boolean bool;
        d dVar = this.K;
        if (dVar == null || (bool = dVar.f223n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void m0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void m1(int i3) {
        j().f212c = i3;
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.K;
        if (dVar == null || (bool = dVar.f222m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
        h hVar = this.f198s;
        Activity f4 = hVar == null ? null : hVar.f();
        if (f4 != null) {
            this.E = false;
            m0(f4, attributeSet, bundle);
        }
    }

    public void n1(@SuppressLint({"UnknownNullness"}) Intent intent, int i3, Bundle bundle) {
        h hVar = this.f198s;
        if (hVar != null) {
            hVar.r(this, intent, i3, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public View o() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f210a;
    }

    public void o0(boolean z3) {
    }

    public void o1() {
        j jVar = this.f197r;
        if (jVar == null || jVar.f289q == null) {
            j().f224o = false;
        } else if (Looper.myLooper() != this.f197r.f289q.j().getLooper()) {
            this.f197r.f289q.j().postAtFrontOfQueue(new b());
        } else {
            f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public Animator p() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f211b;
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public final i q() {
        if (this.f198s != null) {
            return this.f199t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void q0(Menu menu) {
    }

    public Context r() {
        h hVar = this.f198s;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void r0() {
        this.E = true;
    }

    public Object s() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f216g;
    }

    public void s0(boolean z3) {
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i3) {
        n1(intent, i3, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public a0 t() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        j.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f184e);
        sb.append(")");
        if (this.f201v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f201v));
        }
        if (this.f203x != null) {
            sb.append(" ");
            sb.append(this.f203x);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        return dVar.f218i;
    }

    public void u0(boolean z3) {
    }

    /* access modifiers changed from: package-private */
    public a0 v() {
        d dVar = this.K;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void v0(int i3, String[] strArr, int[] iArr) {
    }

    public final i w() {
        return this.f197r;
    }

    public void w0() {
        this.E = true;
    }

    public final Object x() {
        h hVar = this.f198s;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void x0(Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater y(Bundle bundle) {
        h hVar = this.f198s;
        if (hVar != null) {
            LayoutInflater n3 = hVar.n();
            k.b.a(n3, this.f199t.x0());
            return n3;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void y0() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public int z() {
        d dVar = this.K;
        if (dVar == null) {
            return 0;
        }
        return dVar.f213d;
    }

    public void z0() {
        this.E = true;
    }
}
