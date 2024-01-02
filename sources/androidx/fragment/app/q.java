package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.d;
import k.e;
import k.g;

@SuppressLint({"UnknownNullness"})
public abstract class q {

    class a implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f434e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f435f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f436g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f437h;

        a(int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f433d = i3;
            this.f434e = arrayList;
            this.f435f = arrayList2;
            this.f436g = arrayList3;
            this.f437h = arrayList4;
        }

        public void run() {
            for (int i3 = 0; i3 < this.f433d; i3++) {
                e.k((View) this.f434e.get(i3), (String) this.f435f.get(i3));
                e.k((View) this.f436g.get(i3), (String) this.f437h.get(i3));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f439d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f440e;

        b(ArrayList arrayList, Map map) {
            this.f439d = arrayList;
            this.f440e = map;
        }

        public void run() {
            int size = this.f439d.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) this.f439d.get(i3);
                String f4 = e.f(view);
                if (f4 != null) {
                    e.k(view, q.i(this.f440e, f4));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f442d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f443e;

        c(ArrayList arrayList, Map map) {
            this.f442d = arrayList;
            this.f443e = map;
        }

        public void run() {
            int size = this.f442d.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) this.f442d.get(i3);
                e.k(view, (String) this.f443e.get(e.f(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            list.add(view);
            for (int i3 = size; i3 < list.size(); i3++) {
                View view2 = list.get(i3);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (!h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (list.get(i4) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z3 = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z3) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a4 = g.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a4) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        f(arrayList, viewGroup2.getChildAt(i3));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String f4 = e.f(view);
            if (f4 != null) {
                map.put(f4, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    j(map, viewGroup.getChildAt(i3));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        rect.set(i3, iArr[1], view.getWidth() + i3, iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = arrayList.get(i3);
            arrayList2.add(e.f(view));
            e.k(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        d.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    /* access modifiers changed from: package-private */
    public void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        d.a(view, new b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = arrayList.get(i3);
            String f4 = e.f(view2);
            arrayList4.add(f4);
            if (f4 != null) {
                e.k(view2, (String) null);
                String str = map.get(f4);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i4))) {
                        e.k(arrayList2.get(i4), f4);
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        d.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
