package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b1.b;
import io.flutter.embedding.android.e0;
import io.flutter.embedding.android.j;
import io.flutter.embedding.android.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.editing.m;
import io.flutter.view.h;
import io.flutter.view.u;
import j2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import n1.k;

public class s implements m {
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static Class[] f1763w = {SurfaceView.class};
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final i f1764a = new i();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public io.flutter.embedding.android.a f1765b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Context f1766c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public u f1767d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public io.flutter.view.u f1768e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public m f1769f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public k f1770g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final a f1771h = new a();

    /* renamed from: i  reason: collision with root package name */
    final HashMap<Integer, t> f1772i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    final HashMap<Context, View> f1773j = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray<f> f1774k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray<f1.a> f1775l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<j> f1776m = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray<l> f1777n = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    private int f1778o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1779p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f1780q = true;

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<Integer> f1781r = new HashSet<>();

    /* renamed from: s  reason: collision with root package name */
    private final HashSet<Integer> f1782s = new HashSet<>();

    /* renamed from: t  reason: collision with root package name */
    private final e0 f1783t = e0.a();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f1784u = false;

    /* renamed from: v  reason: collision with root package name */
    private final k.g f1785v = new a();

    class a implements k.g {
        a() {
        }

        private void m(int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < i3) {
                throw new IllegalStateException("Trying to use platform views with API " + i4 + ", required API level is: " + i3);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(k.d dVar, View view, boolean z3) {
            if (z3) {
                s.this.f1770g.d(dVar.f2443a);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(int i3, View view, boolean z3) {
            s sVar = s.this;
            if (z3) {
                sVar.f1770g.d(i3);
            } else if (sVar.f1769f != null) {
                s.this.f1769f.l(i3);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(t tVar, k.b bVar) {
            s.this.j0(tVar);
            bVar.a(new k.c(s.this.g0((double) tVar.d()), s.this.g0((double) tVar.c())));
        }

        public void a(boolean z3) {
            boolean unused = s.this.f1780q = z3;
        }

        public void b(int i3, double d4, double d5) {
            if (!s.this.b(i3)) {
                l lVar = (l) s.this.f1777n.get(i3);
                if (lVar == null) {
                    b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
                    return;
                }
                int w3 = s.this.i0(d4);
                int w4 = s.this.i0(d5);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lVar.getLayoutParams();
                layoutParams.topMargin = w3;
                layoutParams.leftMargin = w4;
                lVar.j(layoutParams);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(int r4, int r5) {
            /*
                r3 = this;
                boolean r0 = io.flutter.plugin.platform.s.k0(r5)
                if (r0 == 0) goto L_0x0058
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                boolean r0 = r0.b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x0023
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.t> r0 = r0.f1772i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.t r0 = (io.flutter.plugin.platform.t) r0
                android.view.View r0 = r0.e()
                goto L_0x004a
            L_0x0023:
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                android.util.SparseArray r0 = r0.f1774k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (io.flutter.plugin.platform.f) r0
                if (r0 != 0) goto L_0x0046
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to an unknown view with id: "
            L_0x0038:
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                b1.b.b(r1, r4)
                return
            L_0x0046:
                android.view.View r0 = r0.c()
            L_0x004a:
                if (r0 != 0) goto L_0x0054
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Setting direction to a null view with id: "
                goto L_0x0038
            L_0x0054:
                r0.setLayoutDirection(r5)
                return
            L_0x0058:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Trying to set unknown direction value: "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = "(view id: "
                r1.append(r5)
                r1.append(r4)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.s.a.c(int, int):void");
        }

        @TargetApi(19)
        public void d(k.d dVar) {
            m(19);
            int i3 = dVar.f2443a;
            if (s.k0(dVar.f2449g)) {
                g a4 = s.this.f1764a.a(dVar.f2444b);
                if (a4 != null) {
                    Object obj = null;
                    if (dVar.f2450h != null) {
                        obj = a4.b().b(dVar.f2450h);
                    }
                    f a5 = a4.a(s.this.f1766c, i3, obj);
                    a5.c().setLayoutDirection(dVar.f2449g);
                    s.this.f1774k.put(i3, a5);
                    b.d("PlatformViewsController", "Using hybrid composition for platform view: " + i3);
                    return;
                }
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f2444b);
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f2449g + "(view id: " + i3 + ")");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(int r4) {
            /*
                r3 = this;
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                boolean r0 = r0.b(r4)
                java.lang.String r1 = "PlatformViewsController"
                if (r0 == 0) goto L_0x001d
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.t> r0 = r0.f1772i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                io.flutter.plugin.platform.t r0 = (io.flutter.plugin.platform.t) r0
                android.view.View r0 = r0.e()
                goto L_0x0044
            L_0x001d:
                io.flutter.plugin.platform.s r0 = io.flutter.plugin.platform.s.this
                android.util.SparseArray r0 = r0.f1774k
                java.lang.Object r0 = r0.get(r4)
                io.flutter.plugin.platform.f r0 = (io.flutter.plugin.platform.f) r0
                if (r0 != 0) goto L_0x0040
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on an unknown view with id: "
            L_0x0032:
                r0.append(r2)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                b1.b.b(r1, r4)
                return
            L_0x0040:
                android.view.View r0 = r0.c()
            L_0x0044:
                if (r0 != 0) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Clearing focus on a null view with id: "
                goto L_0x0032
            L_0x004e:
                r0.clearFocus()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.s.a.e(int):void");
        }

        public void f(k.f fVar) {
            int i3 = fVar.f2454a;
            float f4 = s.this.f1766c.getResources().getDisplayMetrics().density;
            if (s.this.b(i3)) {
                s.this.f1772i.get(Integer.valueOf(i3)).b(s.this.h0(f4, fVar, true));
                return;
            }
            f fVar2 = (f) s.this.f1774k.get(i3);
            if (fVar2 == null) {
                b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
                return;
            }
            View c4 = fVar2.c();
            if (c4 == null) {
                b.b("PlatformViewsController", "Sending touch to a null view with id: " + i3);
                return;
            }
            c4.dispatchTouchEvent(s.this.h0(f4, fVar, false));
        }

        @TargetApi(20)
        public long g(k.d dVar) {
            long j3;
            l lVar;
            int i3 = dVar.f2443a;
            if (s.this.f1777n.get(i3) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i3);
            } else if (!s.k0(dVar.f2449g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f2449g + "(view id: " + i3 + ")");
            } else if (s.this.f1768e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i3);
            } else if (s.this.f1767d != null) {
                g a4 = s.this.f1764a.a(dVar.f2444b);
                if (a4 != null) {
                    Object obj = null;
                    if (dVar.f2450h != null) {
                        obj = a4.b().b(dVar.f2450h);
                    }
                    Object obj2 = obj;
                    f a5 = a4.a(new MutableContextWrapper(s.this.f1766c), i3, obj2);
                    s.this.f1774k.put(i3, a5);
                    View c4 = a5.c();
                    if (c4 == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    } else if (c4.getParent() == null) {
                        c4.setLayoutDirection(dVar.f2449g);
                        int w3 = s.this.i0(dVar.f2445c);
                        int w4 = s.this.i0(dVar.f2446d);
                        boolean z3 = i.f(c4, s.f1763w) || Build.VERSION.SDK_INT < 23;
                        if (s.this.f1784u || !z3) {
                            m(23);
                            b.d("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + i3);
                            if (s.this.f1784u) {
                                lVar = new l(s.this.f1766c);
                                j3 = -1;
                            } else {
                                u.c a6 = s.this.f1768e.a();
                                l lVar2 = new l(s.this.f1766c, a6);
                                long e4 = a6.e();
                                lVar = lVar2;
                                j3 = e4;
                            }
                            lVar.m(s.this.f1765b);
                            lVar.i(w3, w4);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(w3, w4);
                            int w5 = s.this.i0(dVar.f2447e);
                            int w6 = s.this.i0(dVar.f2448f);
                            layoutParams.topMargin = w5;
                            layoutParams.leftMargin = w6;
                            lVar.j(layoutParams);
                            c4.setLayoutParams(new FrameLayout.LayoutParams(w3, w4));
                            c4.setImportantForAccessibility(4);
                            lVar.addView(c4);
                            lVar.k(new q(this, i3));
                            s.this.f1767d.addView(lVar);
                            s.this.f1777n.append(i3, lVar);
                            return j3;
                        }
                        b.d("PlatformViewsController", "Hosting view in a virtual display for platform view: " + i3);
                        m(20);
                        u.c a7 = s.this.f1768e.a();
                        t a8 = t.a(s.this.f1766c, s.this.f1771h, a5, a7, w3, w4, dVar.f2443a, obj2, new p(this, dVar));
                        if (a8 != null) {
                            if (s.this.f1767d != null) {
                                a8.f(s.this.f1767d);
                            }
                            s.this.f1772i.put(Integer.valueOf(dVar.f2443a), a8);
                            s.this.f1773j.put(c4.getContext(), c4);
                            return a7.e();
                        }
                        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f2444b + " with id: " + dVar.f2443a);
                    } else {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                } else {
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f2444b);
                }
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i3);
            }
        }

        public void h(k.e eVar, k.b bVar) {
            int w3 = s.this.i0(eVar.f2452b);
            int w4 = s.this.i0(eVar.f2453c);
            int i3 = eVar.f2451a;
            if (s.this.b(i3)) {
                t tVar = s.this.f1772i.get(Integer.valueOf(i3));
                s.this.S(tVar);
                tVar.i(w3, w4, new r(this, tVar, bVar));
                return;
            }
            f fVar = (f) s.this.f1774k.get(i3);
            l lVar = (l) s.this.f1777n.get(i3);
            if (fVar == null || lVar == null) {
                b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
                return;
            }
            if (w3 > lVar.e() || w4 > lVar.d()) {
                lVar.i(w3, w4);
            }
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            layoutParams.width = w3;
            layoutParams.height = w4;
            lVar.setLayoutParams(layoutParams);
            View c4 = fVar.c();
            if (c4 != null) {
                ViewGroup.LayoutParams layoutParams2 = c4.getLayoutParams();
                layoutParams2.width = w3;
                layoutParams2.height = w4;
                c4.setLayoutParams(layoutParams2);
            }
            bVar.a(new k.c(s.this.g0((double) lVar.e()), s.this.g0((double) lVar.d())));
        }

        public void i(int i3) {
            f fVar = (f) s.this.f1774k.get(i3);
            if (fVar == null) {
                b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
                return;
            }
            s.this.f1774k.remove(i3);
            try {
                fVar.a();
            } catch (RuntimeException e4) {
                b.c("PlatformViewsController", "Disposing platform view threw an exception", e4);
            }
            if (s.this.b(i3)) {
                View e5 = s.this.f1772i.get(Integer.valueOf(i3)).e();
                if (e5 != null) {
                    s.this.f1773j.remove(e5.getContext());
                }
                s.this.f1772i.remove(Integer.valueOf(i3));
                return;
            }
            l lVar = (l) s.this.f1777n.get(i3);
            if (lVar != null) {
                lVar.removeAllViews();
                lVar.h();
                lVar.o();
                ViewGroup viewGroup = (ViewGroup) lVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(lVar);
                }
                s.this.f1777n.remove(i3);
                return;
            }
            f1.a aVar = (f1.a) s.this.f1775l.get(i3);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                s.this.f1775l.remove(i3);
            }
        }
    }

    private void K() {
        while (this.f1774k.size() > 0) {
            this.f1785v.i(this.f1774k.keyAt(0));
        }
    }

    private void L(boolean z3) {
        for (int i3 = 0; i3 < this.f1776m.size(); i3++) {
            int keyAt = this.f1776m.keyAt(i3);
            j valueAt = this.f1776m.valueAt(i3);
            if (this.f1781r.contains(Integer.valueOf(keyAt))) {
                this.f1767d.m(valueAt);
                z3 &= valueAt.d();
            } else {
                if (!this.f1779p) {
                    valueAt.a();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i4 = 0; i4 < this.f1775l.size(); i4++) {
            int keyAt2 = this.f1775l.keyAt(i4);
            View view = this.f1775l.get(keyAt2);
            if (!this.f1782s.contains(Integer.valueOf(keyAt2)) || (!z3 && this.f1780q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    private float M() {
        return this.f1766c.getResources().getDisplayMetrics().density;
    }

    private void P() {
        if (this.f1780q && !this.f1779p) {
            this.f1767d.p();
            this.f1779p = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q(int i3, View view, boolean z3) {
        if (z3) {
            this.f1770g.d(i3);
            return;
        }
        m mVar = this.f1769f;
        if (mVar != null) {
            mVar.l(i3);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        L(false);
    }

    /* access modifiers changed from: private */
    public void S(t tVar) {
        m mVar = this.f1769f;
        if (mVar != null) {
            mVar.u();
            tVar.g();
        }
    }

    private static MotionEvent.PointerCoords a0(Object obj, float f4) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f4;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f4;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f4;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f4;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f4;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f4;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> b0(Object obj, float f4) {
        ArrayList arrayList = new ArrayList();
        for (Object a02 : (List) obj) {
            arrayList.add(a0(a02, f4));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object c02 : (List) obj) {
            arrayList.add(c0(c02));
        }
        return arrayList;
    }

    private void e0() {
        if (this.f1767d == null) {
            b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i3 = 0; i3 < this.f1776m.size(); i3++) {
            this.f1767d.removeView(this.f1776m.valueAt(i3));
        }
        this.f1776m.clear();
    }

    /* access modifiers changed from: private */
    public int g0(double d4) {
        return (int) Math.round(d4 / ((double) M()));
    }

    /* access modifiers changed from: private */
    public int i0(double d4) {
        return (int) Math.round(d4 * ((double) M()));
    }

    /* access modifiers changed from: private */
    public void j0(t tVar) {
        m mVar = this.f1769f;
        if (mVar != null) {
            mVar.G();
            tVar.h();
        }
    }

    /* access modifiers changed from: private */
    public static boolean k0(int i3) {
        return i3 == 0 || i3 == 1;
    }

    public void A(m mVar) {
        this.f1769f = mVar;
    }

    public void B(m1.a aVar) {
        this.f1765b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void C(io.flutter.embedding.android.u uVar) {
        this.f1767d = uVar;
        for (int i3 = 0; i3 < this.f1777n.size(); i3++) {
            this.f1767d.addView(this.f1777n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f1775l.size(); i4++) {
            this.f1767d.addView(this.f1775l.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f1774k.size(); i5++) {
            this.f1774k.valueAt(i5).d(this.f1767d);
        }
    }

    public boolean D(View view) {
        if (view == null || !this.f1773j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f1773j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface E() {
        return F(new j(this.f1767d.getContext(), this.f1767d.getWidth(), this.f1767d.getHeight(), j.b.overlay));
    }

    @TargetApi(19)
    public FlutterOverlaySurface F(j jVar) {
        int i3 = this.f1778o;
        this.f1778o = i3 + 1;
        this.f1776m.put(i3, jVar);
        return new FlutterOverlaySurface(i3, jVar.getSurface());
    }

    public void G() {
        for (int i3 = 0; i3 < this.f1776m.size(); i3++) {
            j valueAt = this.f1776m.valueAt(i3);
            valueAt.a();
            valueAt.f();
        }
    }

    public void H() {
        k kVar = this.f1770g;
        if (kVar != null) {
            kVar.e((k.g) null);
        }
        G();
        this.f1770g = null;
        this.f1766c = null;
        this.f1768e = null;
    }

    public void I() {
        for (int i3 = 0; i3 < this.f1777n.size(); i3++) {
            this.f1767d.removeView(this.f1777n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f1775l.size(); i4++) {
            this.f1767d.removeView(this.f1775l.valueAt(i4));
        }
        G();
        e0();
        this.f1767d = null;
        this.f1779p = false;
        for (int i5 = 0; i5 < this.f1774k.size(); i5++) {
            this.f1774k.valueAt(i5).e();
        }
    }

    public void J() {
        this.f1769f = null;
    }

    public h N() {
        return this.f1764a;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(19)
    public void O(int i3) {
        f fVar = this.f1774k.get(i3);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f1775l.get(i3) == null) {
            View c4 = fVar.c();
            if (c4 == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (c4.getParent() == null) {
                Context context = this.f1766c;
                f1.a aVar = new f1.a(context, context.getResources().getDisplayMetrics().density, this.f1765b);
                aVar.setOnDescendantFocusChangeListener(new n(this, i3));
                this.f1775l.put(i3, aVar);
                c4.setImportantForAccessibility(4);
                aVar.addView(c4);
                this.f1767d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void T() {
    }

    public void U() {
        this.f1781r.clear();
        this.f1782s.clear();
    }

    public void V() {
        K();
    }

    public void W(int i3, int i4, int i5, int i6, int i7) {
        if (this.f1776m.get(i3) != null) {
            P();
            j jVar = this.f1776m.get(i3);
            if (jVar.getParent() == null) {
                this.f1767d.addView(jVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = i5;
            jVar.setLayoutParams(layoutParams);
            jVar.setVisibility(0);
            jVar.bringToFront();
            this.f1781r.add(Integer.valueOf(i3));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
    }

    public void X(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        P();
        O(i3);
        f1.a aVar = this.f1775l.get(i3);
        aVar.a(flutterMutatorsStack, i4, i5, i6, i7);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i9);
        View c4 = this.f1774k.get(i3).c();
        if (c4 != null) {
            c4.setLayoutParams(layoutParams);
            c4.bringToFront();
        }
        this.f1782s.add(Integer.valueOf(i3));
    }

    public void Y() {
        boolean z3 = false;
        if (!this.f1779p || !this.f1782s.isEmpty()) {
            if (this.f1779p && this.f1767d.j()) {
                z3 = true;
            }
            L(z3);
            return;
        }
        this.f1779p = false;
        this.f1767d.B(new o(this));
    }

    public void Z() {
        K();
    }

    public void a(h hVar) {
        this.f1771h.b(hVar);
    }

    public boolean b(int i3) {
        return this.f1772i.containsKey(Integer.valueOf(i3));
    }

    public View c(int i3) {
        if (b(i3)) {
            return this.f1772i.get(Integer.valueOf(i3)).e();
        }
        f fVar = this.f1774k.get(i3);
        if (fVar == null) {
            return null;
        }
        return fVar.c();
    }

    public void d() {
        this.f1771h.b((h) null);
    }

    public void f0(boolean z3) {
        this.f1784u = z3;
    }

    public MotionEvent h0(float f4, k.f fVar, boolean z3) {
        k.f fVar2 = fVar;
        MotionEvent b4 = this.f1783t.b(e0.a.c(fVar2.f2469p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) d0(fVar2.f2459f).toArray(new MotionEvent.PointerProperties[fVar2.f2458e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar2.f2460g, f4).toArray(new MotionEvent.PointerCoords[fVar2.f2458e]);
        if (!z3 && b4 != null) {
            return MotionEvent.obtain(b4.getDownTime(), b4.getEventTime(), b4.getAction(), fVar2.f2458e, pointerPropertiesArr, pointerCoordsArr, b4.getMetaState(), b4.getButtonState(), b4.getXPrecision(), b4.getYPrecision(), b4.getDeviceId(), b4.getEdgeFlags(), b4.getSource(), b4.getFlags());
        }
        return MotionEvent.obtain(fVar2.f2455b.longValue(), fVar2.f2456c.longValue(), fVar2.f2457d, fVar2.f2458e, pointerPropertiesArr, pointerCoordsArr, fVar2.f2461h, fVar2.f2462i, fVar2.f2463j, fVar2.f2464k, fVar2.f2465l, fVar2.f2466m, fVar2.f2467n, fVar2.f2468o);
    }

    public void z(Context context, io.flutter.view.u uVar, c1.a aVar) {
        if (this.f1766c == null) {
            this.f1766c = context;
            this.f1768e = uVar;
            k kVar = new k(aVar);
            this.f1770g = kVar;
            kVar.e(this.f1785v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }
}
