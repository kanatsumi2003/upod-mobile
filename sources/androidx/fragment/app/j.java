package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.window.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class j extends i implements LayoutInflater.Factory2 {
    static boolean H = false;
    static final Interpolator I = new DecelerateInterpolator(2.5f);
    static final Interpolator J = new DecelerateInterpolator(1.5f);
    ArrayList<Boolean> A;
    ArrayList<Fragment> B;
    Bundle C = null;
    SparseArray<Parcelable> D = null;
    ArrayList<m> E;
    private l F;
    Runnable G = new b();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<k> f275c;

    /* renamed from: d  reason: collision with root package name */
    boolean f276d;

    /* renamed from: e  reason: collision with root package name */
    int f277e = 0;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<Fragment> f278f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    final HashMap<String, Fragment> f279g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<a> f280h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<Fragment> f281i;

    /* renamed from: j  reason: collision with root package name */
    private OnBackPressedDispatcher f282j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.b f283k = new a(false);

    /* renamed from: l  reason: collision with root package name */
    ArrayList<a> f284l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<Integer> f285m;

    /* renamed from: n  reason: collision with root package name */
    ArrayList<i.a> f286n;

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList<i> f287o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    int f288p = 0;

    /* renamed from: q  reason: collision with root package name */
    h f289q;

    /* renamed from: r  reason: collision with root package name */
    e f290r;

    /* renamed from: s  reason: collision with root package name */
    Fragment f291s;

    /* renamed from: t  reason: collision with root package name */
    Fragment f292t;

    /* renamed from: u  reason: collision with root package name */
    boolean f293u;

    /* renamed from: v  reason: collision with root package name */
    boolean f294v;

    /* renamed from: w  reason: collision with root package name */
    boolean f295w;

    /* renamed from: x  reason: collision with root package name */
    boolean f296x;

    /* renamed from: y  reason: collision with root package name */
    boolean f297y;

    /* renamed from: z  reason: collision with root package name */
    ArrayList<a> f298z;

    class a extends androidx.activity.b {
        a(boolean z3) {
            super(z3);
        }

        public void b() {
            j.this.A0();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            j.this.k0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f302b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (c.this.f302b.o() != null) {
                    c.this.f302b.f1((View) null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f302b;
                    jVar.Q0(fragment, fragment.J(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f301a = viewGroup;
            this.f302b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f301a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f307c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f305a = viewGroup;
            this.f306b = view;
            this.f307c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f305a.endViewTransition(this.f306b);
            Animator p3 = this.f307c.p();
            this.f307c.g1((Animator) null);
            if (p3 != null && this.f305a.indexOfChild(this.f306b) < 0) {
                j jVar = j.this;
                Fragment fragment = this.f307c;
                jVar.Q0(fragment, fragment.J(), 0, 0, false);
            }
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f311c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f309a = viewGroup;
            this.f310b = view;
            this.f311c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f309a.endViewTransition(this.f310b);
            animator.removeListener(this);
            Fragment fragment = this.f311c;
            View view = fragment.G;
            if (view != null && fragment.f204y) {
                view.setVisibility(8);
            }
        }
    }

    class f extends g {
        f() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            h hVar = j.this.f289q;
            return hVar.b(hVar.g(), str, (Bundle) null);
        }
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f314a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f315b;

        g(Animator animator) {
            this.f314a = null;
            this.f315b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f314a = animation;
            this.f315b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        private final ViewGroup f316d;

        /* renamed from: e  reason: collision with root package name */
        private final View f317e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f318f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f319g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f320h = true;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f316d = viewGroup;
            this.f317e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j3, Transformation transformation) {
            this.f320h = true;
            if (this.f318f) {
                return !this.f319g;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f318f = true;
                k.d.a(this.f316d, this);
            }
            return true;
        }

        public boolean getTransformation(long j3, Transformation transformation, float f4) {
            this.f320h = true;
            if (this.f318f) {
                return !this.f319g;
            }
            if (!super.getTransformation(j3, transformation, f4)) {
                this.f318f = true;
                k.d.a(this.f316d, this);
            }
            return true;
        }

        public void run() {
            if (this.f318f || !this.f320h) {
                this.f316d.endViewTransition(this.f317e);
                this.f319g = true;
                return;
            }
            this.f320h = false;
            this.f316d.post(this);
        }
    }

    private static final class i {

        /* renamed from: a  reason: collision with root package name */
        final boolean f321a;
    }

    /* renamed from: androidx.fragment.app.j$j  reason: collision with other inner class name */
    static class C0003j {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f322a = {16842755, 16842960, 16842961};
    }

    interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* renamed from: a  reason: collision with root package name */
        final String f323a;

        /* renamed from: b  reason: collision with root package name */
        final int f324b;

        /* renamed from: c  reason: collision with root package name */
        final int f325c;

        l(String str, int i3, int i4) {
            this.f323a = str;
            this.f324b = i3;
            this.f325c = i4;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.f292t;
            if (fragment != null && this.f324b < 0 && this.f323a == null && fragment.q().g()) {
                return false;
            }
            return j.this.U0(arrayList, arrayList2, this.f323a, this.f324b, this.f325c);
        }
    }

    static class m implements Fragment.f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f327a;

        /* renamed from: b  reason: collision with root package name */
        final a f328b;

        /* renamed from: c  reason: collision with root package name */
        private int f329c;

        m(a aVar, boolean z3) {
            this.f327a = z3;
            this.f328b = aVar;
        }

        public void a() {
            int i3 = this.f329c - 1;
            this.f329c = i3;
            if (i3 == 0) {
                this.f328b.f227s.g1();
            }
        }

        public void b() {
            this.f329c++;
        }

        public void c() {
            a aVar = this.f328b;
            aVar.f227s.u(aVar, this.f327a, false, false);
        }

        public void d() {
            boolean z3 = this.f329c > 0;
            j jVar = this.f328b.f227s;
            int size = jVar.f278f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = jVar.f278f.get(i3);
                fragment.l1((Fragment.f) null);
                if (z3 && fragment.R()) {
                    fragment.o1();
                }
            }
            a aVar = this.f328b;
            aVar.f227s.u(aVar, this.f327a, !z3, true);
        }

        public boolean e() {
            return this.f329c == 0;
        }
    }

    j() {
    }

    private boolean D0(Fragment fragment) {
        return (fragment.C && fragment.D) || fragment.f199t.r();
    }

    static g J0(float f4, float f5) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(J);
        alphaAnimation.setDuration(220);
        return new g((Animation) alphaAnimation);
    }

    static g L0(float f4, float f5, float f6, float f7) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f4, f5, f4, f5, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(I);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f6, f7);
        alphaAnimation.setInterpolator(J);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new g((Animation) animationSet);
    }

    private void M0(c.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment h3 = bVar.h(i3);
            if (!h3.f190k) {
                View c12 = h3.c1();
                h3.O = c12.getAlpha();
                c12.setAlpha(0.0f);
            }
        }
    }

    private boolean T0(String str, int i3, int i4) {
        k0();
        i0(true);
        Fragment fragment = this.f292t;
        if (fragment != null && i3 < 0 && str == null && fragment.q().g()) {
            return true;
        }
        boolean U0 = U0(this.f298z, this.A, str, i3, i4);
        if (U0) {
            this.f276d = true;
            try {
                Y0(this.f298z, this.A);
            } finally {
                t();
            }
        }
        o1();
        f0();
        q();
        return U0;
    }

    private int V0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4, c.b<Fragment> bVar) {
        int i5 = i4;
        for (int i6 = i4 - 1; i6 >= i3; i6--) {
            a aVar = arrayList.get(i6);
            boolean booleanValue = arrayList2.get(i6).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i6 + 1, i4)) {
                if (this.E == null) {
                    this.E = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.E.add(mVar);
                aVar.u(mVar);
                if (booleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i5--;
                if (i6 != i5) {
                    arrayList.remove(i6);
                    arrayList.add(i5, aVar);
                }
                i(bVar);
            }
        }
        return i5;
    }

    private void W(Fragment fragment) {
        if (fragment != null && this.f279g.get(fragment.f184e) == fragment) {
            fragment.U0();
        }
    }

    private void Y0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            n0(arrayList, arrayList2);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i3 < size) {
                if (!arrayList.get(i3).f372q) {
                    if (i4 != i3) {
                        m0(arrayList, arrayList2, i4, i3);
                    }
                    i4 = i3 + 1;
                    if (arrayList2.get(i3).booleanValue()) {
                        while (i4 < size && arrayList2.get(i4).booleanValue() && !arrayList.get(i4).f372q) {
                            i4++;
                        }
                    }
                    m0(arrayList, arrayList2, i3, i4);
                    i3 = i4 - 1;
                }
                i3++;
            }
            if (i4 != size) {
                m0(arrayList, arrayList2, i4, size);
            }
        }
    }

    public static int c1(int i3) {
        if (i3 == 4097) {
            return 8194;
        }
        if (i3 != 4099) {
            return i3 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void d0(int i3) {
        try {
            this.f276d = true;
            O0(i3, false);
            this.f276d = false;
            k0();
        } catch (Throwable th) {
            this.f276d = false;
            throw th;
        }
    }

    private void g0() {
        for (Fragment next : this.f279g.values()) {
            if (next != null) {
                if (next.o() != null) {
                    int J2 = next.J();
                    View o3 = next.o();
                    Animation animation = o3.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        o3.clearAnimation();
                    }
                    next.f1((View) null);
                    Q0(next, J2, 0, 0, false);
                } else if (next.p() != null) {
                    next.p().end();
                }
            }
        }
    }

    private void i(c.b<Fragment> bVar) {
        int i3 = this.f288p;
        if (i3 >= 1) {
            int min = Math.min(i3, 3);
            int size = this.f278f.size();
            for (int i4 = 0; i4 < size; i4++) {
                Fragment fragment = this.f278f.get(i4);
                if (fragment.f180a < min) {
                    Q0(fragment, min, fragment.z(), fragment.A(), false);
                    if (fragment.G != null && !fragment.f204y && fragment.M) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void i0(boolean z3) {
        if (this.f276d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f289q == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f289q.j().getLooper()) {
            if (!z3) {
                s();
            }
            if (this.f298z == null) {
                this.f298z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.f276d = true;
            try {
                n0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f276d = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void l0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        while (i3 < i4) {
            a aVar = arrayList.get(i3);
            boolean z3 = true;
            if (arrayList2.get(i3).booleanValue()) {
                aVar.h(-1);
                if (i3 != i4 - 1) {
                    z3 = false;
                }
                aVar.m(z3);
            } else {
                aVar.h(1);
                aVar.l();
            }
            i3++;
        }
    }

    private void m0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        int i5;
        int i6;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i7 = i3;
        int i8 = i4;
        boolean z3 = arrayList3.get(i7).f372q;
        ArrayList<Fragment> arrayList5 = this.B;
        if (arrayList5 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.B.addAll(this.f278f);
        Fragment y02 = y0();
        boolean z4 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            a aVar = arrayList3.get(i9);
            y02 = !arrayList4.get(i9).booleanValue() ? aVar.n(this.B, y02) : aVar.v(this.B, y02);
            z4 = z4 || aVar.f363h;
        }
        this.B.clear();
        if (!z3) {
            o.B(this, arrayList, arrayList2, i3, i4, false);
        }
        l0(arrayList, arrayList2, i3, i4);
        if (z3) {
            c.b bVar = new c.b();
            i(bVar);
            int V0 = V0(arrayList, arrayList2, i3, i4, bVar);
            M0(bVar);
            i5 = V0;
        } else {
            i5 = i8;
        }
        if (i5 != i7 && z3) {
            o.B(this, arrayList, arrayList2, i3, i5, true);
            O0(this.f288p, true);
        }
        while (i7 < i8) {
            a aVar2 = arrayList3.get(i7);
            if (arrayList4.get(i7).booleanValue() && (i6 = aVar2.f229u) >= 0) {
                s0(i6);
                aVar2.f229u = -1;
            }
            aVar2.t();
            i7++;
        }
        if (z4) {
            a1();
        }
    }

    private void m1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
        h hVar = this.f289q;
        if (hVar != null) {
            try {
                hVar.l("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
            }
        } else {
            b("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private void n(Fragment fragment, g gVar, int i3) {
        View view = fragment.G;
        ViewGroup viewGroup = fragment.F;
        viewGroup.startViewTransition(view);
        fragment.m1(i3);
        if (gVar.f314a != null) {
            h hVar = new h(gVar.f314a, viewGroup, view);
            fragment.f1(fragment.G);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.G.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f315b;
        fragment.g1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.G);
        animator.start();
    }

    private void n0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.E;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            m mVar = this.E.get(i3);
            if (arrayList == null || mVar.f327a || (indexOf2 = arrayList.indexOf(mVar.f328b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f328b.q(arrayList, 0, arrayList.size()))) {
                    this.E.remove(i3);
                    i3--;
                    size--;
                    if (arrayList == null || mVar.f327a || (indexOf = arrayList.indexOf(mVar.f328b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i3++;
            } else {
                this.E.remove(i3);
                i3--;
                size--;
            }
            mVar.c();
            i3++;
        }
    }

    public static int n1(int i3, boolean z3) {
        if (i3 == 4097) {
            return z3 ? 1 : 2;
        }
        if (i3 == 4099) {
            return z3 ? 5 : 6;
        }
        if (i3 != 8194) {
            return -1;
        }
        return z3 ? 3 : 4;
    }

    private void o1() {
        ArrayList<k> arrayList = this.f275c;
        boolean z3 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            androidx.activity.b bVar = this.f283k;
            if (u0() <= 0 || !E0(this.f291s)) {
                z3 = false;
            }
            bVar.f(z3);
            return;
        }
        this.f283k.f(true);
    }

    private void q() {
        this.f279g.values().removeAll(Collections.singleton((Object) null));
    }

    private Fragment q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.F;
        View view = fragment.G;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f278f.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f278f.get(indexOf);
                if (fragment2.F == viewGroup && fragment2.G != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void r0() {
        if (this.E != null) {
            while (!this.E.isEmpty()) {
                this.E.remove(0).d();
            }
        }
    }

    private void s() {
        if (G0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void t() {
        this.f276d = false;
        this.A.clear();
        this.f298z.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t0(java.util.ArrayList<androidx.fragment.app.a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.j$k> r0 = r4.f275c     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000d
            goto L_0x0038
        L_0x000d:
            java.util.ArrayList<androidx.fragment.app.j$k> r0 = r4.f275c     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = 0
        L_0x0014:
            if (r1 >= r0) goto L_0x0026
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r4.f275c     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            androidx.fragment.app.j$k r3 = (androidx.fragment.app.j.k) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0026:
            java.util.ArrayList<androidx.fragment.app.j$k> r5 = r4.f275c     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            androidx.fragment.app.h r5 = r4.f289q     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.j()     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.G     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.t0(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    public void A() {
        this.f294v = false;
        this.f295w = false;
        d0(1);
    }

    /* access modifiers changed from: package-private */
    public void A0() {
        k0();
        if (this.f283k.c()) {
            g();
        } else {
            this.f282j.c();
        }
    }

    public boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f288p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z3 = false;
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null && fragment.H0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f281i != null) {
            for (int i4 = 0; i4 < this.f281i.size(); i4++) {
                Fragment fragment2 = this.f281i.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.h0();
                }
            }
        }
        this.f281i = arrayList;
        return z3;
    }

    public void B0(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f204y) {
            fragment.f204y = true;
            fragment.N = true ^ fragment.N;
        }
    }

    public void C() {
        this.f296x = true;
        k0();
        d0(0);
        this.f289q = null;
        this.f290r = null;
        this.f291s = null;
        if (this.f282j != null) {
            this.f283k.d();
            this.f282j = null;
        }
    }

    public boolean C0() {
        return this.f296x;
    }

    public void D() {
        d0(1);
    }

    public void E() {
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null) {
                fragment.N0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.f197r;
        return fragment == jVar.y0() && E0(jVar.f291s);
    }

    public void F(boolean z3) {
        for (int size = this.f278f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f278f.get(size);
            if (fragment != null) {
                fragment.O0(z3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean F0(int i3) {
        return this.f288p >= i3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.G(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.G(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    public boolean G0() {
        return this.f294v || this.f295w;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.H(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.H(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public g H0(Fragment fragment, int i3, boolean z3, int i4) {
        int n12;
        int z4 = fragment.z();
        boolean z5 = false;
        fragment.j1(0);
        ViewGroup viewGroup = fragment.F;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation c02 = fragment.c0(i3, z3, z4);
        if (c02 != null) {
            return new g(c02);
        }
        Animator d02 = fragment.d0(i3, z3, z4);
        if (d02 != null) {
            return new g(d02);
        }
        if (z4 != 0) {
            boolean equals = "anim".equals(this.f289q.g().getResources().getResourceTypeName(z4));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f289q.g(), z4);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z5 = true;
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            if (!z5) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f289q.g(), z4);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e5) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f289q.g(), z4);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e5;
                    }
                }
            }
        }
        if (i3 == 0 || (n12 = n1(i3, z3)) < 0) {
            return null;
        }
        switch (n12) {
            case 1:
                return L0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return L0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return L0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return L0(1.0f, 1.075f, 1.0f, 0.0f);
            case R.styleable.SplitPairRule_splitMinWidth:
                return J0(0.0f, 1.0f);
            case R.styleable.SplitPairRule_splitRatio:
                return J0(1.0f, 0.0f);
            default:
                if (i4 == 0 && this.f289q.p()) {
                    this.f289q.o();
                }
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.I(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.I(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void I0(Fragment fragment) {
        if (this.f279g.get(fragment.f184e) == null) {
            this.f279g.put(fragment.f184e, fragment);
            if (fragment.B) {
                if (fragment.A) {
                    l(fragment);
                } else {
                    Z0(fragment);
                }
                fragment.B = false;
            }
            if (H) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.J(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.J(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.K(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.K(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void K0(Fragment fragment) {
        if (this.f279g.get(fragment.f184e) != null) {
            if (H) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragment);
            }
            for (Fragment next : this.f279g.values()) {
                if (next != null && fragment.f184e.equals(next.f187h)) {
                    next.f186g = fragment;
                    next.f187h = null;
                }
            }
            this.f279g.put(fragment.f184e, (Object) null);
            Z0(fragment);
            String str = fragment.f187h;
            if (str != null) {
                fragment.f186g = this.f279g.get(str);
            }
            fragment.N();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.L(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.L(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(androidx.fragment.app.Fragment r3, android.content.Context r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.M(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.M(androidx.fragment.app.Fragment, android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.N(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.N(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = r0.G;
        r1 = r11.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N0(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r10.f279g
            java.lang.String r1 = r11.f184e
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = H
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " to state "
            r0.append(r11)
            int r11 = r10.f288p
            r0.append(r11)
            java.lang.String r11 = "since it is not added to "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r10.f288p
            boolean r1 = r11.f191l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0051
            boolean r1 = r11.Q()
            if (r1 == 0) goto L_0x004d
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x0051
        L_0x004d:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x0051:
            r6 = r0
            int r7 = r11.A()
            int r8 = r11.B()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.Q0(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.G
            if (r0 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r0 = r10.q0(r11)
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = r0.G
            android.view.ViewGroup r1 = r11.F
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.G
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0082
            r1.removeViewAt(r4)
            android.view.View r4 = r11.G
            r1.addView(r4, r0)
        L_0x0082:
            boolean r0 = r11.M
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup r0 = r11.F
            if (r0 == 0) goto L_0x00be
            float r0 = r11.O
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            android.view.View r4 = r11.G
            r4.setAlpha(r0)
        L_0x0096:
            r11.O = r1
            r11.M = r3
            int r0 = r11.A()
            int r1 = r11.B()
            androidx.fragment.app.j$g r0 = r10.H0(r11, r0, r2, r1)
            if (r0 == 0) goto L_0x00be
            android.view.animation.Animation r1 = r0.f314a
            if (r1 == 0) goto L_0x00b2
            android.view.View r0 = r11.G
            r0.startAnimation(r1)
            goto L_0x00be
        L_0x00b2:
            android.animation.Animator r1 = r0.f315b
            android.view.View r2 = r11.G
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f315b
            r0.start()
        L_0x00be:
            boolean r0 = r11.N
            if (r0 == 0) goto L_0x00c5
            r10.v(r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.N0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.O(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.O(androidx.fragment.app.Fragment, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void O0(int i3, boolean z3) {
        h hVar;
        if (this.f289q == null && i3 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z3 || i3 != this.f288p) {
            this.f288p = i3;
            int size = this.f278f.size();
            for (int i4 = 0; i4 < size; i4++) {
                N0(this.f278f.get(i4));
            }
            for (Fragment next : this.f279g.values()) {
                if (next != null && ((next.f191l || next.f205z) && !next.M)) {
                    N0(next);
                }
            }
            l1();
            if (this.f293u && (hVar = this.f289q) != null && this.f288p == 4) {
                hVar.s();
                this.f293u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(androidx.fragment.app.Fragment r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.P(r3, r4, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r5 == 0) goto L_0x002b
            boolean r0 = r4.f321a
            if (r0 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.P(androidx.fragment.app.Fragment, android.os.Bundle, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void P0(Fragment fragment) {
        Q0(fragment, this.f288p, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.Q(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.Q(androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d4;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r7.f190k
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.f205z
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r20
            goto L_0x0016
        L_0x0011:
            r0 = r20
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.f191l
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f180a
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r19.Q()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f180a
        L_0x002a:
            boolean r1 = r7.I
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.f180a
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = 2
        L_0x0037:
            androidx.lifecycle.d$b r1 = r7.R
            androidx.lifecycle.d$b r2 = androidx.lifecycle.d.b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.f180a
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x0323
            boolean r0 = r7.f192m
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.f193n
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r19.o()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r19.p()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.f1(r14)
            r7.g1(r14)
            int r2 = r19.J()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r1 = r19
            r0.Q0(r1, r2, r3, r4, r5)
        L_0x007c:
            int r0 = r7.f180a
            if (r0 == 0) goto L_0x008e
            if (r0 == r8) goto L_0x01e5
            if (r0 == r10) goto L_0x008b
            if (r0 == r9) goto L_0x0088
            goto L_0x04d4
        L_0x0088:
            r0 = 3
            goto L_0x02fd
        L_0x008b:
            r0 = 2
            goto L_0x02db
        L_0x008e:
            if (r11 <= 0) goto L_0x01e5
            boolean r0 = H
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x00a8:
            android.os.Bundle r0 = r7.f181b
            if (r0 == 0) goto L_0x00ff
            androidx.fragment.app.h r1 = r6.f289q
            android.content.Context r1 = r1.g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f181b
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f182c = r0
            android.os.Bundle r0 = r7.f181b
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.w0(r0, r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.f184e
            goto L_0x00d1
        L_0x00d0:
            r0 = r14
        L_0x00d1:
            r7.f187h = r0
            if (r0 == 0) goto L_0x00df
            android.os.Bundle r0 = r7.f181b
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f188i = r0
        L_0x00df:
            java.lang.Boolean r0 = r7.f183d
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.booleanValue()
            r7.J = r0
            r7.f183d = r14
            goto L_0x00f6
        L_0x00ec:
            android.os.Bundle r0 = r7.f181b
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.J = r0
        L_0x00f6:
            boolean r0 = r7.J
            if (r0 != 0) goto L_0x00ff
            r7.I = r8
            if (r11 <= r10) goto L_0x00ff
            r11 = 2
        L_0x00ff:
            androidx.fragment.app.h r0 = r6.f289q
            r7.f198s = r0
            androidx.fragment.app.Fragment r1 = r6.f291s
            r7.f200u = r1
            if (r1 == 0) goto L_0x010c
            androidx.fragment.app.j r0 = r1.f199t
            goto L_0x010e
        L_0x010c:
            androidx.fragment.app.j r0 = r0.f272e
        L_0x010e:
            r7.f197r = r0
            androidx.fragment.app.Fragment r0 = r7.f186g
            java.lang.String r15 = " that does not belong to this FragmentManager!"
            java.lang.String r5 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            if (r0 == 0) goto L_0x0169
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f279g
            java.lang.String r0 = r0.f184e
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.f186g
            if (r0 != r1) goto L_0x0147
            int r0 = r1.f180a
            if (r0 >= r8) goto L_0x013c
            r2 = 1
            r3 = 0
            r16 = 0
            r17 = 1
            r0 = r18
            r9 = r4
            r4 = r16
            r10 = r5
            r5 = r17
            r0.Q0(r1, r2, r3, r4, r5)
            goto L_0x013e
        L_0x013c:
            r9 = r4
            r10 = r5
        L_0x013e:
            androidx.fragment.app.Fragment r0 = r7.f186g
            java.lang.String r0 = r0.f184e
            r7.f187h = r0
            r7.f186g = r14
            goto L_0x016b
        L_0x0147:
            r9 = r4
            r10 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            androidx.fragment.app.Fragment r2 = r7.f186g
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0169:
            r9 = r4
            r10 = r5
        L_0x016b:
            java.lang.String r0 = r7.f187h
            if (r0 == 0) goto L_0x01a8
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f279g
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0188
            int r0 = r1.f180a
            if (r0 >= r8) goto L_0x01a8
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r0.Q0(r1, r2, r3, r4, r5)
            goto L_0x01a8
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r2 = r7.f187h
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a8:
            androidx.fragment.app.h r0 = r6.f289q
            android.content.Context r0 = r0.g()
            r6.M(r7, r0, r13)
            r19.D0()
            androidx.fragment.app.Fragment r0 = r7.f200u
            if (r0 != 0) goto L_0x01be
            androidx.fragment.app.h r0 = r6.f289q
            r0.k(r7)
            goto L_0x01c1
        L_0x01be:
            r0.Z(r7)
        L_0x01c1:
            androidx.fragment.app.h r0 = r6.f289q
            android.content.Context r0 = r0.g()
            r6.H(r7, r0, r13)
            boolean r0 = r7.Q
            if (r0 != 0) goto L_0x01de
            android.os.Bundle r0 = r7.f181b
            r6.N(r7, r0, r13)
            android.os.Bundle r0 = r7.f181b
            r7.G0(r0)
            android.os.Bundle r0 = r7.f181b
            r6.I(r7, r0, r13)
            goto L_0x01e5
        L_0x01de:
            android.os.Bundle r0 = r7.f181b
            r7.d1(r0)
            r7.f180a = r8
        L_0x01e5:
            if (r11 <= 0) goto L_0x01ea
            r18.j0(r19)
        L_0x01ea:
            if (r11 <= r8) goto L_0x008b
            boolean r0 = H
            if (r0 == 0) goto L_0x0204
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0204:
            boolean r0 = r7.f192m
            if (r0 != 0) goto L_0x02c4
            int r0 = r7.f202w
            if (r0 == 0) goto L_0x027a
            r1 = -1
            if (r0 != r1) goto L_0x022d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m1(r0)
        L_0x022d:
            androidx.fragment.app.e r0 = r6.f290r
            int r1 = r7.f202w
            android.view.View r0 = r0.c(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x027b
            boolean r1 = r7.f194o
            if (r1 != 0) goto L_0x027b
            android.content.res.Resources r1 = r19.E()     // Catch:{ NotFoundException -> 0x0248 }
            int r2 = r7.f202w     // Catch:{ NotFoundException -> 0x0248 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0248 }
            goto L_0x024a
        L_0x0248:
            java.lang.String r1 = "unknown"
        L_0x024a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.f202w
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.m1(r2)
            goto L_0x027b
        L_0x027a:
            r0 = r14
        L_0x027b:
            r7.F = r0
            android.os.Bundle r1 = r7.f181b
            android.view.LayoutInflater r1 = r7.M0(r1)
            android.os.Bundle r2 = r7.f181b
            r7.I0(r1, r0, r2)
            android.view.View r1 = r7.G
            if (r1 == 0) goto L_0x02c2
            r7.H = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0298
            android.view.View r1 = r7.G
            r0.addView(r1)
        L_0x0298:
            boolean r0 = r7.f204y
            if (r0 == 0) goto L_0x02a3
            android.view.View r0 = r7.G
            r1 = 8
            r0.setVisibility(r1)
        L_0x02a3:
            android.view.View r0 = r7.G
            android.os.Bundle r1 = r7.f181b
            r7.A0(r0, r1)
            android.view.View r0 = r7.G
            android.os.Bundle r1 = r7.f181b
            r6.S(r7, r0, r1, r13)
            android.view.View r0 = r7.G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02be
            android.view.ViewGroup r0 = r7.F
            if (r0 == 0) goto L_0x02be
            goto L_0x02bf
        L_0x02be:
            r8 = 0
        L_0x02bf:
            r7.M = r8
            goto L_0x02c4
        L_0x02c2:
            r7.H = r14
        L_0x02c4:
            android.os.Bundle r0 = r7.f181b
            r7.C0(r0)
            android.os.Bundle r0 = r7.f181b
            r6.G(r7, r0, r13)
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x02d7
            android.os.Bundle r0 = r7.f181b
            r7.e1(r0)
        L_0x02d7:
            r7.f181b = r14
            goto L_0x008b
        L_0x02db:
            if (r11 <= r0) goto L_0x0088
            boolean r0 = H
            if (r0 == 0) goto L_0x02f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02f5:
            r19.X0()
            r6.Q(r7, r13)
            goto L_0x0088
        L_0x02fd:
            if (r11 <= r0) goto L_0x04d4
            boolean r0 = H
            if (r0 == 0) goto L_0x0317
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0317:
            r19.V0()
            r6.O(r7, r13)
            r7.f181b = r14
            r7.f182c = r14
            goto L_0x04d4
        L_0x0323:
            if (r0 <= r11) goto L_0x04d4
            if (r0 == r8) goto L_0x0403
            r1 = 2
            if (r0 == r1) goto L_0x0373
            r1 = 3
            if (r0 == r1) goto L_0x0352
            r1 = 4
            if (r0 == r1) goto L_0x0332
            goto L_0x04d4
        L_0x0332:
            if (r11 >= r1) goto L_0x0352
            boolean r0 = H
            if (r0 == 0) goto L_0x034c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x034c:
            r19.R0()
            r6.L(r7, r13)
        L_0x0352:
            r0 = 3
            if (r11 >= r0) goto L_0x0373
            boolean r0 = H
            if (r0 == 0) goto L_0x036d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x036d:
            r19.Y0()
            r6.R(r7, r13)
        L_0x0373:
            r0 = 2
            if (r11 >= r0) goto L_0x0403
            boolean r0 = H
            if (r0 == 0) goto L_0x038e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x038e:
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x03a1
            androidx.fragment.app.h r0 = r6.f289q
            boolean r0 = r0.q(r7)
            if (r0 == 0) goto L_0x03a1
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f182c
            if (r0 != 0) goto L_0x03a1
            r18.f1(r19)
        L_0x03a1:
            r19.K0()
            r6.T(r7, r13)
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x03f4
            android.view.ViewGroup r1 = r7.F
            if (r1 == 0) goto L_0x03f4
            r1.endViewTransition(r0)
            android.view.View r0 = r7.G
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r19.C()
            if (r0 == 0) goto L_0x03c5
            androidx.fragment.app.Fragment r0 = r19.C()
            boolean r0 = r0.f191l
            if (r0 != 0) goto L_0x03f4
        L_0x03c5:
            int r0 = r6.f288p
            r1 = 0
            if (r0 <= 0) goto L_0x03e5
            boolean r0 = r6.f296x
            if (r0 != 0) goto L_0x03e5
            android.view.View r0 = r7.G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03e5
            float r0 = r7.O
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03e5
            r0 = r21
            r2 = r22
            androidx.fragment.app.j$g r0 = r6.H0(r7, r0, r13, r2)
            goto L_0x03e6
        L_0x03e5:
            r0 = r14
        L_0x03e6:
            r7.O = r1
            if (r0 == 0) goto L_0x03ed
            r6.n(r7, r0, r11)
        L_0x03ed:
            android.view.ViewGroup r0 = r7.F
            android.view.View r1 = r7.G
            r0.removeView(r1)
        L_0x03f4:
            r7.F = r14
            r7.G = r14
            r7.T = r14
            androidx.lifecycle.l<androidx.lifecycle.g> r0 = r7.U
            r0.g(r14)
            r7.H = r14
            r7.f193n = r13
        L_0x0403:
            if (r11 >= r8) goto L_0x04d4
            boolean r0 = r6.f296x
            if (r0 == 0) goto L_0x042a
            android.view.View r0 = r19.o()
            if (r0 == 0) goto L_0x041a
            android.view.View r0 = r19.o()
            r7.f1(r14)
            r0.clearAnimation()
            goto L_0x042a
        L_0x041a:
            android.animation.Animator r0 = r19.p()
            if (r0 == 0) goto L_0x042a
            android.animation.Animator r0 = r19.p()
            r7.g1(r14)
            r0.cancel()
        L_0x042a:
            android.view.View r0 = r19.o()
            if (r0 != 0) goto L_0x04d0
            android.animation.Animator r0 = r19.p()
            if (r0 == 0) goto L_0x0438
            goto L_0x04d0
        L_0x0438:
            boolean r0 = H
            if (r0 == 0) goto L_0x0450
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0450:
            boolean r0 = r7.f191l
            if (r0 == 0) goto L_0x045c
            boolean r0 = r19.Q()
            if (r0 != 0) goto L_0x045c
            r0 = 1
            goto L_0x045d
        L_0x045c:
            r0 = 0
        L_0x045d:
            if (r0 != 0) goto L_0x046b
            androidx.fragment.app.l r1 = r6.F
            boolean r1 = r1.l(r7)
            if (r1 == 0) goto L_0x0468
            goto L_0x046b
        L_0x0468:
            r7.f180a = r13
            goto L_0x049c
        L_0x046b:
            androidx.fragment.app.h r1 = r6.f289q
            boolean r2 = r1 instanceof androidx.lifecycle.t
            if (r2 == 0) goto L_0x0478
            androidx.fragment.app.l r1 = r6.F
            boolean r8 = r1.j()
            goto L_0x048d
        L_0x0478:
            android.content.Context r1 = r1.g()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x048d
            androidx.fragment.app.h r1 = r6.f289q
            android.content.Context r1 = r1.g()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x048d:
            if (r0 != 0) goto L_0x0491
            if (r8 == 0) goto L_0x0496
        L_0x0491:
            androidx.fragment.app.l r1 = r6.F
            r1.e(r7)
        L_0x0496:
            r19.J0()
            r6.J(r7, r13)
        L_0x049c:
            r19.L0()
            r6.K(r7, r13)
            if (r23 != 0) goto L_0x04d4
            if (r0 != 0) goto L_0x04cc
            androidx.fragment.app.l r0 = r6.F
            boolean r0 = r0.l(r7)
            if (r0 == 0) goto L_0x04af
            goto L_0x04cc
        L_0x04af:
            r7.f198s = r14
            r7.f200u = r14
            r7.f197r = r14
            java.lang.String r0 = r7.f187h
            if (r0 == 0) goto L_0x04d4
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f279g
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x04d4
            boolean r1 = r0.F()
            if (r1 == 0) goto L_0x04d4
            r7.f186g = r0
            goto L_0x04d4
        L_0x04cc:
            r18.K0(r19)
            goto L_0x04d4
        L_0x04d0:
            r7.m1(r11)
            goto L_0x04d5
        L_0x04d4:
            r8 = r11
        L_0x04d5:
            int r0 = r7.f180a
            if (r0 == r8) goto L_0x0501
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f180a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f180a = r8
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.Q0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.R(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.R(androidx.fragment.app.Fragment, boolean):void");
    }

    public void R0() {
        this.f294v = false;
        this.f295w = false;
        int size = this.f278f.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null) {
                fragment.U();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(androidx.fragment.app.Fragment r3, android.view.View r4, android.os.Bundle r5, boolean r6) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.S(r3, r4, r5, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.j$i r4 = (androidx.fragment.app.j.i) r4
            if (r6 == 0) goto L_0x002b
            boolean r5 = r4.f321a
            if (r5 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r4.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.S(androidx.fragment.app.Fragment, android.view.View, android.os.Bundle, boolean):void");
    }

    public void S0(Fragment fragment) {
        if (!fragment.I) {
            return;
        }
        if (this.f276d) {
            this.f297y = true;
            return;
        }
        fragment.I = false;
        Q0(fragment, this.f288p, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T(androidx.fragment.app.Fragment r3, boolean r4) {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.f291s
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.i r0 = r0.w()
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L_0x0012
            androidx.fragment.app.j r0 = (androidx.fragment.app.j) r0
            r1 = 1
            r0.T(r3, r1)
        L_0x0012:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.j$i> r3 = r2.f287o
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.j$i r0 = (androidx.fragment.app.j.i) r0
            if (r4 == 0) goto L_0x002b
            boolean r1 = r0.f321a
            if (r1 != 0) goto L_0x002b
            goto L_0x0018
        L_0x002b:
            r0.getClass()
            r3 = 0
            throw r3
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.T(androidx.fragment.app.Fragment, boolean):void");
    }

    public boolean U(MenuItem menuItem) {
        if (this.f288p < 1) {
            return false;
        }
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean U0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i3, int i4) {
        int i5;
        ArrayList<a> arrayList3 = this.f280h;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i3 < 0 && (i4 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f280h.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i3 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f280h.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i3 >= 0 && i3 == aVar.f229u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i4 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f280h.get(size2);
                        if ((str == null || !str.equals(aVar2.o())) && (i3 < 0 || i3 != aVar2.f229u)) {
                            break;
                        }
                    }
                }
                i5 = size2;
            } else {
                i5 = -1;
            }
            if (i5 == this.f280h.size() - 1) {
                return false;
            }
            for (int size3 = this.f280h.size() - 1; size3 > i5; size3--) {
                arrayList.add(this.f280h.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void V(Menu menu) {
        if (this.f288p >= 1) {
            for (int i3 = 0; i3 < this.f278f.size(); i3++) {
                Fragment fragment = this.f278f.get(i3);
                if (fragment != null) {
                    fragment.Q0(menu);
                }
            }
        }
    }

    public void W0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f197r != this) {
            m1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f184e);
    }

    public void X() {
        d0(3);
    }

    public void X0(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f196q);
        }
        boolean z3 = !fragment.Q();
        if (!fragment.f205z || z3) {
            synchronized (this.f278f) {
                this.f278f.remove(fragment);
            }
            if (D0(fragment)) {
                this.f293u = true;
            }
            fragment.f190k = false;
            fragment.f191l = true;
        }
    }

    public void Y(boolean z3) {
        for (int size = this.f278f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f278f.get(size);
            if (fragment != null) {
                fragment.S0(z3);
            }
        }
    }

    public boolean Z(Menu menu) {
        if (this.f288p < 1) {
            return false;
        }
        boolean z3 = false;
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null && fragment.T0(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (G0()) {
            if (H) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.F.k(fragment) && H) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public n a() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        o1();
        W(this.f292t);
    }

    /* access modifiers changed from: package-private */
    public void a1() {
        if (this.f286n != null) {
            for (int i3 = 0; i3 < this.f286n.size(); i3++) {
                this.f286n.get(i3).onBackStackChanged();
            }
        }
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f279g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment next : this.f279g.values()) {
                printWriter.print(str);
                printWriter.println(next);
                if (next != null) {
                    next.g(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f278f.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size5; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f278f.get(i3).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f281i;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.f281i.get(i4).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f280h;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                a aVar = this.f280h.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<a> arrayList3 = this.f284l;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(this.f284l.get(i6));
                }
            }
            ArrayList<Integer> arrayList4 = this.f285m;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f285m.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f275c;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(this.f275c.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f289q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f290r);
        if (this.f291s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f291s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f288p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f294v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f295w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f296x);
        if (this.f293u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f293u);
        }
    }

    public void b0() {
        this.f294v = false;
        this.f295w = false;
        d0(4);
    }

    /* access modifiers changed from: package-private */
    public void b1(Parcelable parcelable) {
        m mVar;
        if (parcelable != null) {
            k kVar = (k) parcelable;
            if (kVar.f330d != null) {
                for (Fragment next : this.F.h()) {
                    if (H) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + next);
                    }
                    Iterator<m> it = kVar.f330d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = null;
                            break;
                        }
                        mVar = it.next();
                        if (mVar.f343e.equals(next.f184e)) {
                            break;
                        }
                    }
                    if (mVar == null) {
                        if (H) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + kVar.f330d);
                        }
                        Fragment fragment = next;
                        Q0(fragment, 1, 0, 0, false);
                        next.f191l = true;
                        Q0(fragment, 0, 0, 0, false);
                    } else {
                        mVar.f355q = next;
                        next.f182c = null;
                        next.f196q = 0;
                        next.f193n = false;
                        next.f190k = false;
                        Fragment fragment2 = next.f186g;
                        next.f187h = fragment2 != null ? fragment2.f184e : null;
                        next.f186g = null;
                        Bundle bundle = mVar.f354p;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f289q.g().getClassLoader());
                            next.f182c = mVar.f354p.getSparseParcelableArray("android:view_state");
                            next.f181b = mVar.f354p;
                        }
                    }
                }
                this.f279g.clear();
                Iterator<m> it2 = kVar.f330d.iterator();
                while (it2.hasNext()) {
                    m next2 = it2.next();
                    if (next2 != null) {
                        Fragment a4 = next2.a(this.f289q.g().getClassLoader(), d());
                        a4.f197r = this;
                        if (H) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a4.f184e + "): " + a4);
                        }
                        this.f279g.put(a4.f184e, a4);
                        next2.f355q = null;
                    }
                }
                this.f278f.clear();
                ArrayList<String> arrayList = kVar.f331e;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        Fragment fragment3 = this.f279g.get(next3);
                        if (fragment3 == null) {
                            m1(new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                        }
                        fragment3.f190k = true;
                        if (H) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + fragment3);
                        }
                        if (!this.f278f.contains(fragment3)) {
                            synchronized (this.f278f) {
                                this.f278f.add(fragment3);
                            }
                        } else {
                            throw new IllegalStateException("Already added " + fragment3);
                        }
                    }
                }
                if (kVar.f332f != null) {
                    this.f280h = new ArrayList<>(kVar.f332f.length);
                    int i3 = 0;
                    while (true) {
                        b[] bVarArr = kVar.f332f;
                        if (i3 >= bVarArr.length) {
                            break;
                        }
                        a a5 = bVarArr[i3].a(this);
                        if (H) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a5.f229u + "): " + a5);
                            PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
                            a5.k("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f280h.add(a5);
                        int i4 = a5.f229u;
                        if (i4 >= 0) {
                            h1(i4, a5);
                        }
                        i3++;
                    }
                } else {
                    this.f280h = null;
                }
                String str = kVar.f333g;
                if (str != null) {
                    Fragment fragment4 = this.f279g.get(str);
                    this.f292t = fragment4;
                    W(fragment4);
                }
                this.f277e = kVar.f334h;
            }
        }
    }

    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f278f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f278f.get(size);
                if (fragment != null && str.equals(fragment.f203x)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment next : this.f279g.values()) {
            if (next != null && str.equals(next.f203x)) {
                return next;
            }
        }
        return null;
    }

    public void c0() {
        this.f294v = false;
        this.f295w = false;
        d0(3);
    }

    public g d() {
        if (super.d() == i.f273b) {
            Fragment fragment = this.f291s;
            if (fragment != null) {
                return fragment.f197r.d();
            }
            h(new f());
        }
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public Parcelable d1() {
        ArrayList<String> arrayList;
        int size;
        r0();
        g0();
        k0();
        this.f294v = true;
        b[] bVarArr = null;
        if (this.f279g.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.f279g.size());
        boolean z3 = false;
        for (Fragment next : this.f279g.values()) {
            if (next != null) {
                if (next.f197r != this) {
                    m1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                m mVar = new m(next);
                arrayList2.add(mVar);
                if (next.f180a <= 0 || mVar.f354p != null) {
                    mVar.f354p = next.f181b;
                } else {
                    mVar.f354p = e1(next);
                    String str = next.f187h;
                    if (str != null) {
                        Fragment fragment = this.f279g.get(str);
                        if (fragment == null) {
                            m1(new IllegalStateException("Failure saving state: " + next + " has target not in fragment manager: " + next.f187h));
                        }
                        if (mVar.f354p == null) {
                            mVar.f354p = new Bundle();
                        }
                        W0(mVar.f354p, "android:target_state", fragment);
                        int i3 = next.f188i;
                        if (i3 != 0) {
                            mVar.f354p.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (H) {
                    Log.v("FragmentManager", "Saved state of " + next + ": " + mVar.f354p);
                }
                z3 = true;
            }
        }
        if (!z3) {
            if (H) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f278f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f278f.iterator();
            while (it.hasNext()) {
                Fragment next2 = it.next();
                arrayList.add(next2.f184e);
                if (next2.f197r != this) {
                    m1(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                }
                if (H) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f184e + "): " + next2);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a> arrayList3 = this.f280h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (int i4 = 0; i4 < size; i4++) {
                bVarArr[i4] = new b(this.f280h.get(i4));
                if (H) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f280h.get(i4));
                }
            }
        }
        k kVar = new k();
        kVar.f330d = arrayList2;
        kVar.f331e = arrayList;
        kVar.f332f = bVarArr;
        Fragment fragment2 = this.f292t;
        if (fragment2 != null) {
            kVar.f333g = fragment2.f184e;
        }
        kVar.f334h = this.f277e;
        return kVar;
    }

    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f278f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f278f) {
            list = (List) this.f278f.clone();
        }
        return list;
    }

    public void e0() {
        this.f295w = true;
        d0(2);
    }

    /* access modifiers changed from: package-private */
    public Bundle e1(Fragment fragment) {
        if (this.C == null) {
            this.C = new Bundle();
        }
        fragment.W0(this.C);
        P(fragment, this.C, false);
        Bundle bundle = null;
        if (!this.C.isEmpty()) {
            Bundle bundle2 = this.C;
            this.C = null;
            bundle = bundle2;
        }
        if (fragment.G != null) {
            f1(fragment);
        }
        if (fragment.f182c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f182c);
        }
        if (!fragment.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.J);
        }
        return bundle;
    }

    public void f(int i3, int i4) {
        if (i3 >= 0) {
            h0(new l((String) null, i3, i4), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        if (this.f297y) {
            this.f297y = false;
            l1();
        }
    }

    /* access modifiers changed from: package-private */
    public void f1(Fragment fragment) {
        if (fragment.H != null) {
            SparseArray<Parcelable> sparseArray = this.D;
            if (sparseArray == null) {
                this.D = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.H.saveHierarchyState(this.D);
            if (this.D.size() > 0) {
                fragment.f182c = this.D;
                this.D = null;
            }
        }
    }

    public boolean g() {
        s();
        return T0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.E;
            boolean z3 = false;
            boolean z4 = arrayList != null && !arrayList.isEmpty();
            ArrayList<k> arrayList2 = this.f275c;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z3 = true;
            }
            if (z4 || z3) {
                this.f289q.j().removeCallbacks(this.G);
                this.f289q.j().post(this.G);
                o1();
            }
        }
    }

    public void h0(k kVar, boolean z3) {
        if (!z3) {
            s();
        }
        synchronized (this) {
            if (!this.f296x) {
                if (this.f289q != null) {
                    if (this.f275c == null) {
                        this.f275c = new ArrayList<>();
                    }
                    this.f275c.add(kVar);
                    g1();
                    return;
                }
            }
            if (!z3) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void h1(int i3, a aVar) {
        synchronized (this) {
            if (this.f284l == null) {
                this.f284l = new ArrayList<>();
            }
            int size = this.f284l.size();
            if (i3 < size) {
                if (H) {
                    Log.v("FragmentManager", "Setting back stack index " + i3 + " to " + aVar);
                }
                this.f284l.set(i3, aVar);
            } else {
                while (size < i3) {
                    this.f284l.add((Object) null);
                    if (this.f285m == null) {
                        this.f285m = new ArrayList<>();
                    }
                    if (H) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f285m.add(Integer.valueOf(size));
                    size++;
                }
                if (H) {
                    Log.v("FragmentManager", "Adding back stack index " + i3 + " with " + aVar);
                }
                this.f284l.add(aVar);
            }
        }
    }

    public void i1(Fragment fragment, d.b bVar) {
        if (this.f279g.get(fragment.f184e) == fragment && (fragment.f198s == null || fragment.w() == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void j(a aVar) {
        if (this.f280h == null) {
            this.f280h = new ArrayList<>();
        }
        this.f280h.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void j0(Fragment fragment) {
        if (fragment.f192m && !fragment.f195p) {
            fragment.I0(fragment.M0(fragment.f181b), (ViewGroup) null, fragment.f181b);
            View view = fragment.G;
            if (view != null) {
                fragment.H = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.f204y) {
                    fragment.G.setVisibility(8);
                }
                fragment.A0(fragment.G, fragment.f181b);
                S(fragment, fragment.G, fragment.f181b, false);
                return;
            }
            fragment.H = null;
        }
    }

    public void j1(Fragment fragment) {
        if (fragment == null || (this.f279g.get(fragment.f184e) == fragment && (fragment.f198s == null || fragment.w() == this))) {
            Fragment fragment2 = this.f292t;
            this.f292t = fragment;
            W(fragment2);
            W(this.f292t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void k(Fragment fragment, boolean z3) {
        if (H) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        I0(fragment);
        if (fragment.f205z) {
            return;
        }
        if (!this.f278f.contains(fragment)) {
            synchronized (this.f278f) {
                this.f278f.add(fragment);
            }
            fragment.f190k = true;
            fragment.f191l = false;
            if (fragment.G == null) {
                fragment.N = false;
            }
            if (D0(fragment)) {
                this.f293u = true;
            }
            if (z3) {
                P0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: finally extract failed */
    public boolean k0() {
        i0(true);
        boolean z3 = false;
        while (t0(this.f298z, this.A)) {
            this.f276d = true;
            try {
                Y0(this.f298z, this.A);
                t();
                z3 = true;
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        o1();
        f0();
        q();
        return z3;
    }

    public void k1(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f204y) {
            fragment.f204y = false;
            fragment.N = !fragment.N;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (G0()) {
            if (H) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.F.d(fragment) && H) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void l1() {
        for (Fragment next : this.f279g.values()) {
            if (next != null) {
                S0(next);
            }
        }
    }

    public int m(a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f285m;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    ArrayList<Integer> arrayList2 = this.f285m;
                    int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
                    if (H) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.f284l.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f284l == null) {
                this.f284l = new ArrayList<>();
            }
            int size = this.f284l.size();
            if (H) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f284l.add(aVar);
            return size;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(androidx.fragment.app.h r3, androidx.fragment.app.e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h r0 = r2.f289q
            if (r0 != 0) goto L_0x0046
            r2.f289q = r3
            r2.f290r = r4
            r2.f291s = r5
            if (r5 == 0) goto L_0x000f
            r2.o1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0024
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.h()
            r2.f282j = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.b r1 = r2.f283k
            r0.a(r4, r1)
        L_0x0024:
            if (r5 == 0) goto L_0x002f
            androidx.fragment.app.j r3 = r5.f197r
            androidx.fragment.app.l r3 = r3.v0(r5)
        L_0x002c:
            r2.F = r3
            goto L_0x0045
        L_0x002f:
            boolean r4 = r3 instanceof androidx.lifecycle.t
            if (r4 == 0) goto L_0x003e
            androidx.lifecycle.t r3 = (androidx.lifecycle.t) r3
            androidx.lifecycle.s r3 = r3.d()
            androidx.fragment.app.l r3 = androidx.fragment.app.l.g(r3)
            goto L_0x002c
        L_0x003e:
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r4 = 0
            r3.<init>(r4)
            goto L_0x002c
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.o(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    public Fragment o0(int i3) {
        for (int size = this.f278f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f278f.get(size);
            if (fragment != null && fragment.f201v == i3) {
                return fragment;
            }
        }
        for (Fragment next : this.f279g.values()) {
            if (next != null && next.f201v == i3) {
                return next;
            }
        }
        return null;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0003j.f322a);
        int i3 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !g.b(context.getClassLoader(), str2)) {
            return null;
        }
        if (view != null) {
            i3 = view.getId();
        }
        if (i3 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        if (resourceId != -1) {
            fragment = o0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = c(string);
        }
        if (fragment == null && i3 != -1) {
            fragment = o0(i3);
        }
        if (H) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = d().a(context.getClassLoader(), str2);
            fragment.f192m = true;
            fragment.f201v = resourceId != 0 ? resourceId : i3;
            fragment.f202w = i3;
            fragment.f203x = string;
            fragment.f193n = true;
            fragment.f197r = this;
            h hVar = this.f289q;
            fragment.f198s = hVar;
            fragment.n0(hVar.g(), attributeSet, fragment.f181b);
            k(fragment, true);
        } else if (!fragment.f193n) {
            fragment.f193n = true;
            h hVar2 = this.f289q;
            fragment.f198s = hVar2;
            fragment.n0(hVar2.g(), attributeSet, fragment.f181b);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i3) + " with another fragment for " + str2);
        }
        Fragment fragment2 = fragment;
        if (this.f288p >= 1 || !fragment2.f192m) {
            P0(fragment2);
        } else {
            Q0(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.G;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment2.G.getTag() == null) {
                fragment2.G.setTag(string);
            }
            return fragment2.G;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void p(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f205z) {
            fragment.f205z = false;
            if (fragment.f190k) {
                return;
            }
            if (!this.f278f.contains(fragment)) {
                if (H) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f278f) {
                    this.f278f.add(fragment);
                }
                fragment.f190k = true;
                if (D0(fragment)) {
                    this.f293u = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public Fragment p0(String str) {
        Fragment k3;
        for (Fragment next : this.f279g.values()) {
            if (next != null && (k3 = next.k(str)) != null) {
                return k3;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        boolean z3 = false;
        for (Fragment next : this.f279g.values()) {
            if (next != null) {
                z3 = D0(next);
                continue;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public void s0(int i3) {
        synchronized (this) {
            this.f284l.set(i3, (Object) null);
            if (this.f285m == null) {
                this.f285m = new ArrayList<>();
            }
            if (H) {
                Log.v("FragmentManager", "Freeing back stack index " + i3);
            }
            this.f285m.add(Integer.valueOf(i3));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f291s;
        if (obj == null) {
            obj = this.f289q;
        }
        j.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(a aVar, boolean z3, boolean z4, boolean z5) {
        if (z3) {
            aVar.m(z5);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z3));
        if (z4) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z5) {
            O0(this.f288p, true);
        }
        for (Fragment next : this.f279g.values()) {
            if (next != null && next.G != null && next.M && aVar.p(next.f202w)) {
                float f4 = next.O;
                if (f4 > 0.0f) {
                    next.G.setAlpha(f4);
                }
                if (z5) {
                    next.O = 0.0f;
                } else {
                    next.O = -1.0f;
                    next.M = false;
                }
            }
        }
    }

    public int u0() {
        ArrayList<a> arrayList = this.f280h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void v(Fragment fragment) {
        Animator animator;
        if (fragment.G != null) {
            g H0 = H0(fragment, fragment.A(), !fragment.f204y, fragment.B());
            if (H0 == null || (animator = H0.f315b) == null) {
                if (H0 != null) {
                    fragment.G.startAnimation(H0.f314a);
                    H0.f314a.start();
                }
                fragment.G.setVisibility((!fragment.f204y || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.i1(false);
                }
            } else {
                animator.setTarget(fragment.G);
                if (!fragment.f204y) {
                    fragment.G.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.i1(false);
                } else {
                    ViewGroup viewGroup = fragment.F;
                    View view = fragment.G;
                    viewGroup.startViewTransition(view);
                    H0.f315b.addListener(new e(viewGroup, view, fragment));
                }
                H0.f315b.start();
            }
        }
        if (fragment.f190k && D0(fragment)) {
            this.f293u = true;
        }
        fragment.N = false;
        fragment.l0(fragment.f204y);
    }

    /* access modifiers changed from: package-private */
    public l v0(Fragment fragment) {
        return this.F.f(fragment);
    }

    public void w(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f205z) {
            fragment.f205z = true;
            if (fragment.f190k) {
                if (H) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f278f) {
                    this.f278f.remove(fragment);
                }
                if (D0(fragment)) {
                    this.f293u = true;
                }
                fragment.f190k = false;
            }
        }
    }

    public Fragment w0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f279g.get(string);
        if (fragment == null) {
            m1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void x() {
        this.f294v = false;
        this.f295w = false;
        d0(2);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 x0() {
        return this;
    }

    public void y(Configuration configuration) {
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null) {
                fragment.E0(configuration);
            }
        }
    }

    public Fragment y0() {
        return this.f292t;
    }

    public boolean z(MenuItem menuItem) {
        if (this.f288p < 1) {
            return false;
        }
        for (int i3 = 0; i3 < this.f278f.size(); i3++) {
            Fragment fragment = this.f278f.get(i3);
            if (fragment != null && fragment.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public s z0(Fragment fragment) {
        return this.F.i(fragment);
    }
}
