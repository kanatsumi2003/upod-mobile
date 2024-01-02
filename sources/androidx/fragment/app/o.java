package androidx.fragment.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f382a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    private static final q f383b = new p();

    /* renamed from: c  reason: collision with root package name */
    private static final q f384c = w();

    static class a implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f385d;

        a(ArrayList arrayList) {
            this.f385d = arrayList;
        }

        public void run() {
            o.A(this.f385d, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f386d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f387e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f388f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Fragment f389g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f390h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ArrayList f391i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f392j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f393k;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f386d = obj;
            this.f387e = qVar;
            this.f388f = view;
            this.f389g = fragment;
            this.f390h = arrayList;
            this.f391i = arrayList2;
            this.f392j = arrayList3;
            this.f393k = obj2;
        }

        public void run() {
            Object obj = this.f386d;
            if (obj != null) {
                this.f387e.p(obj, this.f388f);
                this.f391i.addAll(o.k(this.f387e, this.f386d, this.f389g, this.f390h, this.f388f));
            }
            if (this.f392j != null) {
                if (this.f393k != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f388f);
                    this.f387e.q(this.f393k, this.f392j, arrayList);
                }
                this.f392j.clear();
                this.f392j.add(this.f388f);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f394d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f395e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f396f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.a f397g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f398h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q f399i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Rect f400j;

        c(Fragment fragment, Fragment fragment2, boolean z3, c.a aVar, View view, q qVar, Rect rect) {
            this.f394d = fragment;
            this.f395e = fragment2;
            this.f396f = z3;
            this.f397g = aVar;
            this.f398h = view;
            this.f399i = qVar;
            this.f400j = rect;
        }

        public void run() {
            o.f(this.f394d, this.f395e, this.f396f, this.f397g, false);
            View view = this.f398h;
            if (view != null) {
                this.f399i.k(view, this.f400j);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c.a f402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f403f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f404g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f405h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ View f406i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Fragment f407j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Fragment f408k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f409l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f410m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f411n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Rect f412o;

        d(q qVar, c.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z3, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f401d = qVar;
            this.f402e = aVar;
            this.f403f = obj;
            this.f404g = eVar;
            this.f405h = arrayList;
            this.f406i = view;
            this.f407j = fragment;
            this.f408k = fragment2;
            this.f409l = z3;
            this.f410m = arrayList2;
            this.f411n = obj2;
            this.f412o = rect;
        }

        public void run() {
            c.a<String, View> h3 = o.h(this.f401d, this.f402e, this.f403f, this.f404g);
            if (h3 != null) {
                this.f405h.addAll(h3.values());
                this.f405h.add(this.f406i);
            }
            o.f(this.f407j, this.f408k, this.f409l, h3, false);
            Object obj = this.f403f;
            if (obj != null) {
                this.f401d.z(obj, this.f410m, this.f405h);
                View s3 = o.s(h3, this.f404g, this.f411n, this.f409l);
                if (s3 != null) {
                    this.f401d.k(s3, this.f412o);
                }
            }
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f413a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f414b;

        /* renamed from: c  reason: collision with root package name */
        public a f415c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f416d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f417e;

        /* renamed from: f  reason: collision with root package name */
        public a f418f;

        e() {
        }
    }

    static void A(ArrayList<View> arrayList, int i3) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i3);
            }
        }
    }

    static void B(j jVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4, boolean z3) {
        if (jVar.f288p >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i5 = i3; i5 < i4; i5++) {
                a aVar = arrayList.get(i5);
                if (arrayList2.get(i5).booleanValue()) {
                    e(aVar, sparseArray, z3);
                } else {
                    c(aVar, sparseArray, z3);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar.f289q.g());
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = sparseArray.keyAt(i6);
                    c.a<String, String> d4 = d(keyAt, arrayList, arrayList2, i3, i4);
                    e eVar = (e) sparseArray.valueAt(i6);
                    if (z3) {
                        o(jVar, keyAt, eVar, view, d4);
                    } else {
                        n(jVar, keyAt, eVar, view, d4);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, c.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l3 = aVar.l(size);
            if (collection.contains(k.e.f(l3))) {
                arrayList.add(l3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.f190k != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0090, code lost:
        if (r10.f204y == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f375b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f202w
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f382a
            int r1 = r1.f374a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f374a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0085
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0085
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x0098
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.N
            if (r1 == 0) goto L_0x0094
            boolean r1 = r10.f204y
            if (r1 != 0) goto L_0x0094
            boolean r1 = r10.f190k
            if (r1 == 0) goto L_0x0094
            goto L_0x0092
        L_0x0044:
            boolean r1 = r10.f204y
            goto L_0x0095
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.N
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f190k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f204y
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.f190k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f204y
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            boolean r1 = r10.f190k
            if (r20 == 0) goto L_0x007a
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.G
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.O
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0081
        L_0x0078:
            r1 = 0
            goto L_0x0081
        L_0x007a:
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f204y
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0081:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x0098
        L_0x0085:
            if (r20 == 0) goto L_0x008a
            boolean r1 = r10.M
            goto L_0x0095
        L_0x008a:
            boolean r1 = r10.f190k
            if (r1 != 0) goto L_0x0094
            boolean r1 = r10.f204y
            if (r1 != 0) goto L_0x0094
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x0098:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.o$e r6 = (androidx.fragment.app.o.e) r6
            if (r4 == 0) goto L_0x00aa
            androidx.fragment.app.o$e r6 = p(r6, r2, r11)
            r6.f413a = r10
            r6.f414b = r3
            r6.f415c = r0
        L_0x00aa:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            if (r14 == 0) goto L_0x00b8
            androidx.fragment.app.Fragment r1 = r14.f416d
            if (r1 != r10) goto L_0x00b8
            r14.f416d = r15
        L_0x00b8:
            androidx.fragment.app.j r4 = r0.f227s
            int r1 = r10.f180a
            if (r1 >= r5) goto L_0x00d1
            int r1 = r4.f288p
            if (r1 < r5) goto L_0x00d1
            boolean r1 = r0.f372q
            if (r1 != 0) goto L_0x00d1
            r4.I0(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.Q0(r5, r6, r7, r8, r9)
        L_0x00d1:
            if (r13 == 0) goto L_0x00e3
            if (r14 == 0) goto L_0x00d9
            androidx.fragment.app.Fragment r1 = r14.f416d
            if (r1 != 0) goto L_0x00e3
        L_0x00d9:
            androidx.fragment.app.o$e r14 = p(r14, r2, r11)
            r14.f416d = r10
            r14.f417e = r3
            r14.f418f = r0
        L_0x00e3:
            if (r20 != 0) goto L_0x00ef
            if (r12 == 0) goto L_0x00ef
            if (r14 == 0) goto L_0x00ef
            androidx.fragment.app.Fragment r0 = r14.f413a
            if (r0 != r10) goto L_0x00ef
            r14.f413a = r15
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<e> sparseArray, boolean z3) {
        int size = aVar.f356a.size();
        for (int i3 = 0; i3 < size; i3++) {
            b(aVar, aVar.f356a.get(i3), sparseArray, false, z3);
        }
    }

    private static c.a<String, String> d(int i3, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        c.a<String, String> aVar = new c.a<>();
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            a aVar2 = arrayList.get(i6);
            if (aVar2.p(i3)) {
                boolean booleanValue = arrayList2.get(i6).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f370o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f370o;
                        arrayList4 = aVar2.f371p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f370o;
                        arrayList3 = aVar2.f371p;
                        arrayList4 = arrayList6;
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        String str = arrayList4.get(i7);
                        String str2 = arrayList3.get(i7);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<e> sparseArray, boolean z3) {
        if (aVar.f227s.f290r.e()) {
            for (int size = aVar.f356a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f356a.get(size), sparseArray, true, z3);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z3, c.a<String, View> aVar, boolean z4) {
        if (z3) {
            fragment2.t();
        } else {
            fragment.t();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!qVar.e(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    static c.a<String, View> h(q qVar, c.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f413a;
        View L = fragment.L();
        if (aVar.isEmpty() || obj == null || L == null) {
            aVar.clear();
            return null;
        }
        c.a<String, View> aVar2 = new c.a<>();
        qVar.j(aVar2, L);
        a aVar3 = eVar.f415c;
        if (eVar.f414b) {
            fragment.v();
            arrayList = aVar3.f370o;
        } else {
            fragment.t();
            arrayList = aVar3.f371p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static c.a<String, View> i(q qVar, c.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f416d;
        c.a<String, View> aVar2 = new c.a<>();
        qVar.j(aVar2, fragment.c1());
        a aVar3 = eVar.f418f;
        if (eVar.f417e) {
            fragment.t();
            arrayList = aVar3.f371p;
        } else {
            fragment.v();
            arrayList = aVar3.f370o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u3 = fragment.u();
            if (u3 != null) {
                arrayList.add(u3);
            }
            Object G = fragment.G();
            if (G != null) {
                arrayList.add(G);
            }
            Object I = fragment.I();
            if (I != null) {
                arrayList.add(I);
            }
        }
        if (fragment2 != null) {
            Object s3 = fragment2.s();
            if (s3 != null) {
                arrayList.add(s3);
            }
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object H = fragment2.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f383b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f384c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View L = fragment.L();
        if (L != null) {
            qVar.f(arrayList2, L);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, c.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        c.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        q qVar2 = qVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = eVar2.f413a;
        Fragment fragment2 = eVar2.f416d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = eVar2.f414b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = t(qVar2, fragment, fragment2, z3);
            aVar2 = aVar;
        }
        c.a<String, View> i3 = i(qVar2, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i3.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z3, i3, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar2.y(obj4, view, arrayList3);
            z(qVar, obj4, obj2, i3, eVar2.f417e, eVar2.f418f);
            if (obj5 != null) {
                qVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        d dVar = r0;
        d dVar2 = new d(qVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z3, arrayList, obj, rect);
        k.d.a(viewGroup, dVar);
        return obj4;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, c.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        q qVar2 = qVar;
        View view3 = view;
        c.a<String, String> aVar2 = aVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = eVar2.f413a;
        Fragment fragment2 = eVar2.f416d;
        if (fragment != null) {
            fragment.c1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z3 = eVar2.f414b;
        Object t3 = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z3);
        c.a<String, View> i3 = i(qVar, aVar2, t3, eVar2);
        c.a<String, View> h3 = h(qVar, aVar2, t3, eVar2);
        if (aVar.isEmpty()) {
            if (i3 != null) {
                i3.clear();
            }
            if (h3 != null) {
                h3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i3, aVar.keySet());
            a(arrayList4, h3, aVar.values());
            obj3 = t3;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z3, i3, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            qVar.y(obj3, view3, arrayList3);
            z(qVar, obj3, obj2, i3, eVar2.f417e, eVar2.f418f);
            Rect rect2 = new Rect();
            View s3 = s(h3, eVar2, obj4, z3);
            if (s3 != null) {
                qVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = s3;
        } else {
            view2 = null;
            rect = null;
        }
        k.d.a(viewGroup, new c(fragment, fragment2, z3, h3, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int i3, e eVar, View view, c.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j3;
        Object obj;
        j jVar2 = jVar;
        e eVar2 = eVar;
        View view2 = view;
        c.a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = jVar2.f290r.e() ? (ViewGroup) jVar2.f290r.c(i3) : null;
        if (viewGroup != null && (j3 = j(fragment2, fragment)) != null) {
            boolean z3 = eVar2.f414b;
            boolean z4 = eVar2.f417e;
            Object q3 = q(j3, (fragment = eVar2.f413a), z3);
            Object r3 = r(j3, (fragment2 = eVar2.f416d), z4);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r3;
            q qVar = j3;
            Object l3 = l(j3, viewGroup, view, aVar, eVar, arrayList, arrayList2, q3, obj2);
            Object obj3 = q3;
            if (obj3 == null && l3 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> k3 = k(qVar, obj, fragment2, arrayList3, view2);
            Object obj4 = (k3 == null || k3.isEmpty()) ? null : obj;
            qVar.a(obj3, view2);
            Object u3 = u(qVar, obj3, obj4, l3, fragment, eVar2.f414b);
            if (u3 != null) {
                ArrayList arrayList4 = new ArrayList();
                q qVar2 = qVar;
                qVar2.t(u3, obj3, arrayList4, obj4, k3, l3, arrayList2);
                y(qVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList4, obj4, k3);
                ArrayList arrayList5 = arrayList2;
                qVar.w(viewGroup, arrayList5, aVar2);
                qVar.c(viewGroup, u3);
                qVar.s(viewGroup, arrayList5, aVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f413a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(androidx.fragment.app.j r17, int r18, androidx.fragment.app.o.e r19, android.view.View r20, c.a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            androidx.fragment.app.e r1 = r0.f290r
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0019
            androidx.fragment.app.e r0 = r0.f290r
            r1 = r18
            android.view.View r0 = r0.c(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            androidx.fragment.app.Fragment r11 = r4.f413a
            androidx.fragment.app.Fragment r12 = r4.f416d
            androidx.fragment.app.q r13 = j(r12, r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f414b
            boolean r0 = r4.f417e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = q(r13, r11, r14)
            java.lang.Object r6 = r(r13, r12, r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = k(r13, r7, r12, r10, r9)
            java.util.ArrayList r9 = k(r13, r6, r11, r15, r9)
            r0 = 4
            A(r9, r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = u(r0, r1, r2, r3, r4, r5)
            if (r14 == 0) goto L_0x00a4
            v(r13, r7, r12, r11)
            java.util.ArrayList r12 = r13.o(r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.c(r0, r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.x(r2, r3, r4, r5, r6)
            r0 = 0
            A(r9, r0)
            r13.z(r8, r10, r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.o(androidx.fragment.app.j, int, androidx.fragment.app.o$e, android.view.View, c.a):void");
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i3) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i3, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z3 ? fragment.D() : fragment.s());
    }

    private static Object r(q qVar, Fragment fragment, boolean z3) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z3 ? fragment.G() : fragment.u());
    }

    static View s(c.a<String, View> aVar, e eVar, Object obj, boolean z3) {
        ArrayList<String> arrayList;
        a aVar2 = eVar.f415c;
        if (obj == null || aVar == null || (arrayList = aVar2.f370o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z3 ? aVar2.f370o : aVar2.f371p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z3) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z3 ? fragment2.I() : fragment.H()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z3) {
        return (obj == null || obj2 == null || fragment == null) ? true : z3 ? fragment.n() : fragment.m() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f190k && fragment.f204y && fragment.N) {
            fragment.i1(true);
            qVar.r(obj, fragment.L(), arrayList);
            k.d.a(fragment.F, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(c.a<String, String> aVar, c.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        k.d.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, c.a<String, View> aVar, boolean z3, a aVar2) {
        ArrayList<String> arrayList = aVar2.f370o;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z3 ? aVar2.f371p : aVar2.f370o).get(0));
            qVar.v(obj, view);
            if (obj2 != null) {
                qVar.v(obj2, view);
            }
        }
    }
}
