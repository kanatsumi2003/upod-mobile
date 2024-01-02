package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import androidx.window.R;
import j.c;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends n implements j.k {

    /* renamed from: s  reason: collision with root package name */
    final j f227s;

    /* renamed from: t  reason: collision with root package name */
    boolean f228t;

    /* renamed from: u  reason: collision with root package name */
    int f229u = -1;

    public a(j jVar) {
        this.f227s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f375b;
        return fragment != null && fragment.f190k && fragment.G != null && !fragment.f205z && !fragment.f204y && fragment.R();
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.H) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f363h) {
            return true;
        }
        this.f227s.j(this);
        return true;
    }

    public int d() {
        return i(false);
    }

    public int e() {
        return i(true);
    }

    /* access modifiers changed from: package-private */
    public void f(int i3, Fragment fragment, String str, int i4) {
        super.f(i3, fragment, str, i4);
        fragment.f197r = this.f227s;
    }

    public n g(Fragment fragment) {
        j jVar = fragment.f197r;
        if (jVar == null || jVar == this.f227s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void h(int i3) {
        if (this.f363h) {
            if (j.H) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            int size = this.f356a.size();
            for (int i4 = 0; i4 < size; i4++) {
                n.a aVar = this.f356a.get(i4);
                Fragment fragment = aVar.f375b;
                if (fragment != null) {
                    fragment.f196q += i3;
                    if (j.H) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f375b + " to " + aVar.f375b.f196q);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int i(boolean z3) {
        if (!this.f228t) {
            if (j.H) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new c("FragmentManager"));
                j("  ", printWriter);
                printWriter.close();
            }
            this.f228t = true;
            this.f229u = this.f363h ? this.f227s.m(this) : -1;
            this.f227s.h0(this, z3);
            return this.f229u;
        }
        throw new IllegalStateException("commit already called");
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f365j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f229u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f228t);
            if (this.f361f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f361f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f362g));
            }
            if (!(this.f357b == 0 && this.f358c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f357b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f358c));
            }
            if (!(this.f359d == 0 && this.f360e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f359d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f360e));
            }
            if (!(this.f366k == 0 && this.f367l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f366k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f367l);
            }
            if (!(this.f368m == 0 && this.f369n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f368m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f369n);
            }
        }
        if (!this.f356a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f356a.size();
            for (int i3 = 0; i3 < size; i3++) {
                n.a aVar = this.f356a.get(i3);
                switch (aVar.f374a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                        str2 = "SHOW";
                        break;
                    case R.styleable.SplitPairRule_splitRatio /*6*/:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f374a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f375b);
                if (z3) {
                    if (!(aVar.f376c == 0 && aVar.f377d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f376c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f377d));
                    }
                    if (aVar.f378e != 0 || aVar.f379f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f378e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f379f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int size = this.f356a.size();
        for (int i3 = 0; i3 < size; i3++) {
            n.a aVar = this.f356a.get(i3);
            Fragment fragment = aVar.f375b;
            if (fragment != null) {
                fragment.k1(this.f361f, this.f362g);
            }
            switch (aVar.f374a) {
                case 1:
                    fragment.j1(aVar.f376c);
                    this.f227s.k(fragment, false);
                    break;
                case 3:
                    fragment.j1(aVar.f377d);
                    this.f227s.X0(fragment);
                    break;
                case 4:
                    fragment.j1(aVar.f377d);
                    this.f227s.B0(fragment);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                    fragment.j1(aVar.f376c);
                    this.f227s.k1(fragment);
                    break;
                case R.styleable.SplitPairRule_splitRatio /*6*/:
                    fragment.j1(aVar.f377d);
                    this.f227s.w(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f376c);
                    this.f227s.p(fragment);
                    break;
                case 8:
                    this.f227s.j1(fragment);
                    break;
                case 9:
                    this.f227s.j1((Fragment) null);
                    break;
                case 10:
                    this.f227s.i1(fragment, aVar.f381h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f374a);
            }
            if (!(this.f372q || aVar.f374a == 1 || fragment == null)) {
                this.f227s.N0(fragment);
            }
        }
        if (!this.f372q) {
            j jVar = this.f227s;
            jVar.O0(jVar.f288p, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z3) {
        for (int size = this.f356a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f356a.get(size);
            Fragment fragment = aVar.f375b;
            if (fragment != null) {
                fragment.k1(j.c1(this.f361f), this.f362g);
            }
            switch (aVar.f374a) {
                case 1:
                    fragment.j1(aVar.f379f);
                    this.f227s.X0(fragment);
                    break;
                case 3:
                    fragment.j1(aVar.f378e);
                    this.f227s.k(fragment, false);
                    break;
                case 4:
                    fragment.j1(aVar.f378e);
                    this.f227s.k1(fragment);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                    fragment.j1(aVar.f379f);
                    this.f227s.B0(fragment);
                    break;
                case R.styleable.SplitPairRule_splitRatio /*6*/:
                    fragment.j1(aVar.f378e);
                    this.f227s.p(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f379f);
                    this.f227s.w(fragment);
                    break;
                case 8:
                    this.f227s.j1((Fragment) null);
                    break;
                case 9:
                    this.f227s.j1(fragment);
                    break;
                case 10:
                    this.f227s.i1(fragment, aVar.f380g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f374a);
            }
            if (!(this.f372q || aVar.f374a == 3 || fragment == null)) {
                this.f227s.N0(fragment);
            }
        }
        if (!this.f372q && z3) {
            j jVar = this.f227s;
            jVar.O0(jVar.f288p, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment n(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i3 = 0;
        while (i3 < this.f356a.size()) {
            n.a aVar = this.f356a.get(i3);
            int i4 = aVar.f374a;
            if (i4 != 1) {
                if (i4 == 2) {
                    Fragment fragment3 = aVar.f375b;
                    int i5 = fragment3.f202w;
                    boolean z3 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f202w == i5) {
                            if (fragment4 == fragment3) {
                                z3 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f356a.add(i3, new n.a(9, fragment4));
                                    i3++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f376c = aVar.f376c;
                                aVar2.f378e = aVar.f378e;
                                aVar2.f377d = aVar.f377d;
                                aVar2.f379f = aVar.f379f;
                                this.f356a.add(i3, aVar2);
                                arrayList2.remove(fragment4);
                                i3++;
                            }
                        }
                    }
                    if (z3) {
                        this.f356a.remove(i3);
                        i3--;
                    } else {
                        aVar.f374a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i4 == 3 || i4 == 6) {
                    arrayList2.remove(aVar.f375b);
                    Fragment fragment5 = aVar.f375b;
                    if (fragment5 == fragment2) {
                        this.f356a.add(i3, new n.a(9, fragment5));
                        i3++;
                        fragment2 = null;
                    }
                } else if (i4 != 7) {
                    if (i4 == 8) {
                        this.f356a.add(i3, new n.a(9, fragment2));
                        i3++;
                        fragment2 = aVar.f375b;
                    }
                }
                i3++;
            }
            arrayList2.add(aVar.f375b);
            i3++;
        }
        return fragment2;
    }

    public String o() {
        return this.f365j;
    }

    /* access modifiers changed from: package-private */
    public boolean p(int i3) {
        int size = this.f356a.size();
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f356a.get(i4).f375b;
            int i5 = fragment != null ? fragment.f202w : 0;
            if (i5 != 0 && i5 == i3) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean q(ArrayList<a> arrayList, int i3, int i4) {
        if (i4 == i3) {
            return false;
        }
        int size = this.f356a.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            Fragment fragment = this.f356a.get(i6).f375b;
            int i7 = fragment != null ? fragment.f202w : 0;
            if (!(i7 == 0 || i7 == i5)) {
                for (int i8 = i3; i8 < i4; i8++) {
                    a aVar = arrayList.get(i8);
                    int size2 = aVar.f356a.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        Fragment fragment2 = aVar.f356a.get(i9).f375b;
                        if ((fragment2 != null ? fragment2.f202w : 0) == i7) {
                            return true;
                        }
                    }
                }
                i5 = i7;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        for (int i3 = 0; i3 < this.f356a.size(); i3++) {
            if (r(this.f356a.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f373r != null) {
            for (int i3 = 0; i3 < this.f373r.size(); i3++) {
                this.f373r.get(i3).run();
            }
            this.f373r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f229u >= 0) {
            sb.append(" #");
            sb.append(this.f229u);
        }
        if (this.f365j != null) {
            sb.append(" ");
            sb.append(this.f365j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u(Fragment.f fVar) {
        for (int i3 = 0; i3 < this.f356a.size(); i3++) {
            n.a aVar = this.f356a.get(i3);
            if (r(aVar)) {
                aVar.f375b.l1(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f356a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f356a.get(size);
            int i3 = aVar.f374a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case R.styleable.SplitPairRule_splitRatio /*6*/:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f375b;
                            break;
                        case 10:
                            aVar.f381h = aVar.f380g;
                            break;
                    }
                }
                arrayList.add(aVar.f375b);
            }
            arrayList.remove(aVar.f375b);
        }
        return fragment;
    }
}
