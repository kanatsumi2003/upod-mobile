package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets$Type;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.c0;
import io.flutter.plugin.editing.e;
import io.flutter.plugin.platform.s;
import java.util.HashMap;
import n1.p;

public class m implements e.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f1681a;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f1682b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f1683c;

    /* renamed from: d  reason: collision with root package name */
    private final p f1684d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public c f1685e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private p.b f1686f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<p.b> f1687g;

    /* renamed from: h  reason: collision with root package name */
    private e f1688h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1689i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f1690j;

    /* renamed from: k  reason: collision with root package name */
    private s f1691k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f1692l;

    /* renamed from: m  reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f1693m;

    /* renamed from: n  reason: collision with root package name */
    private p.e f1694n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1695o;

    class a implements p.f {
        a() {
        }

        public void a() {
            m.this.m();
        }

        public void b() {
            m mVar = m.this;
            mVar.F(mVar.f1681a);
        }

        public void c(p.e eVar) {
            m mVar = m.this;
            mVar.E(mVar.f1681a, eVar);
        }

        public void d(String str, Bundle bundle) {
            m.this.B(str, bundle);
        }

        public void e(int i3, p.b bVar) {
            m.this.D(i3, bVar);
        }

        public void f(int i3, boolean z3) {
            m.this.C(i3, z3);
        }

        public void g(double d4, double d5, double[] dArr) {
            m.this.A(d4, d5, dArr);
        }

        public void h() {
            m.this.x();
        }

        public void i(boolean z3) {
            if (Build.VERSION.SDK_INT >= 26 && m.this.f1683c != null) {
                if (z3) {
                    m.this.f1683c.commit();
                } else {
                    m.this.f1683c.cancel();
                }
            }
        }

        public void j() {
            if (m.this.f1685e.f1701a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                m.this.y();
                return;
            }
            m mVar = m.this;
            mVar.s(mVar.f1681a);
        }
    }

    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f1697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f1698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double[] f1699c;

        b(boolean z3, double[] dArr, double[] dArr2) {
            this.f1697a = z3;
            this.f1698b = dArr;
            this.f1699c = dArr2;
        }

        public void a(double d4, double d5) {
            double d6 = 1.0d;
            if (!this.f1697a) {
                double[] dArr = this.f1698b;
                d6 = 1.0d / (((dArr[3] * d4) + (dArr[7] * d5)) + dArr[15]);
            }
            double[] dArr2 = this.f1698b;
            double d7 = ((dArr2[0] * d4) + (dArr2[4] * d5) + dArr2[12]) * d6;
            double d8 = ((dArr2[1] * d4) + (dArr2[5] * d5) + dArr2[13]) * d6;
            double[] dArr3 = this.f1699c;
            if (d7 < dArr3[0]) {
                dArr3[0] = d7;
            } else if (d7 > dArr3[1]) {
                dArr3[1] = d7;
            }
            if (d8 < dArr3[2]) {
                dArr3[2] = d8;
            } else if (d8 > dArr3[3]) {
                dArr3[3] = d8;
            }
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        a f1701a;

        /* renamed from: b  reason: collision with root package name */
        int f1702b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i3) {
            this.f1701a = aVar;
            this.f1702b = i3;
        }
    }

    private interface d {
        void a(double d4, double d5);
    }

    @SuppressLint({"NewApi"})
    public m(View view, p pVar, s sVar) {
        int i3 = 0;
        this.f1681a = view;
        AutofillManager autofillManager = null;
        this.f1688h = new e((p.e) null, view);
        this.f1682b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = Build.VERSION.SDK_INT;
        this.f1683c = i4 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : autofillManager;
        if (i4 >= 30) {
            i3 = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets$Type.navigationBars() : i3;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? i3 | WindowInsets$Type.statusBars() : i3, WindowInsets$Type.ime());
            this.f1693m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f1684d = pVar;
        pVar.m(new a());
        pVar.j();
        this.f1691k = sVar;
        sVar.A(this);
    }

    /* access modifiers changed from: private */
    public void A(double d4, double d5, double[] dArr) {
        double d6 = d4;
        double d7 = d5;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z3 = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d8 = dArr2[12];
        double d9 = dArr2[15];
        double d10 = d8 / d9;
        dArr3[1] = d10;
        dArr3[0] = d10;
        double d11 = dArr2[13] / d9;
        dArr3[3] = d11;
        dArr3[2] = d11;
        b bVar = new b(z3, dArr2, dArr3);
        bVar.a(d6, 0.0d);
        bVar.a(d6, d7);
        bVar.a(0.0d, d7);
        Float valueOf = Float.valueOf(this.f1681a.getContext().getResources().getDisplayMetrics().density);
        this.f1692l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    public void C(int i3, boolean z3) {
        if (z3) {
            this.f1681a.requestFocus();
            this.f1685e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i3);
            this.f1682b.restartInput(this.f1681a);
            this.f1689i = false;
            return;
        }
        this.f1685e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i3);
        this.f1690j = null;
    }

    private void H(p.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f2505j == null) {
                this.f1687g = null;
                return;
            }
            p.b[] bVarArr = bVar.f2506k;
            SparseArray<p.b> sparseArray = new SparseArray<>();
            this.f1687g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f2505j.f2507a.hashCode(), bVar);
                return;
            }
            for (p.b bVar2 : bVarArr) {
                p.b.a aVar = bVar2.f2505j;
                if (aVar != null) {
                    this.f1687g.put(aVar.f2507a.hashCode(), bVar2);
                    this.f1683c.notifyValueChanged(this.f1681a, aVar.f2507a.hashCode(), AutofillValue.forText(aVar.f2509c.f2520a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f2502g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
            r3 = this;
            n1.p$b r0 = r3.f1686f
            r1 = 1
            if (r0 == 0) goto L_0x0012
            n1.p$c r0 = r0.f2502g
            if (r0 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            n1.p$g r0 = r0.f2511a
            n1.p$g r2 = n1.p.g.NONE
            if (r0 == r2) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.m.k():boolean");
    }

    private static boolean n(p.e eVar, p.e eVar2) {
        int i3 = eVar.f2524e - eVar.f2523d;
        if (i3 != eVar2.f2524e - eVar2.f2523d) {
            return true;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (eVar.f2520a.charAt(eVar.f2523d + i4) != eVar2.f2520a.charAt(eVar2.f2523d + i4)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f1682b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(p.c cVar, boolean z3, boolean z4, boolean z5, boolean z6, p.d dVar) {
        p.g gVar = cVar.f2511a;
        if (gVar == p.g.DATETIME) {
            return 4;
        }
        if (gVar == p.g.NUMBER) {
            int i3 = 2;
            if (cVar.f2512b) {
                i3 = 4098;
            }
            return cVar.f2513c ? i3 | 8192 : i3;
        } else if (gVar == p.g.PHONE) {
            return 3;
        } else {
            if (gVar == p.g.NONE) {
                return 0;
            }
            int i4 = 1;
            if (gVar == p.g.MULTILINE) {
                i4 = 131073;
            } else if (gVar == p.g.EMAIL_ADDRESS) {
                i4 = 33;
            } else if (gVar == p.g.URL) {
                i4 = 17;
            } else if (gVar == p.g.VISIBLE_PASSWORD) {
                i4 = 145;
            } else if (gVar == p.g.NAME) {
                i4 = 97;
            } else if (gVar == p.g.POSTAL_ADDRESS) {
                i4 = 113;
            }
            if (z3) {
                i4 = i4 | 524288 | 128;
            } else {
                if (z4) {
                    i4 |= 32768;
                }
                if (!z5) {
                    i4 |= 524288;
                }
            }
            return dVar == p.d.CHARACTERS ? i4 | 4096 : dVar == p.d.WORDS ? i4 | 8192 : dVar == p.d.SENTENCES ? i4 | 16384 : i4;
        }
    }

    private boolean v() {
        return this.f1687g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f1683c != null && v()) {
            this.f1683c.notifyValueChanged(this.f1681a, this.f1686f.f2505j.f2507a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT >= 26 && this.f1683c != null && v()) {
            String str = this.f1686f.f2505j.f2507a;
            int[] iArr = new int[2];
            this.f1681a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f1692l);
            rect.offset(iArr[0], iArr[1]);
            this.f1683c.notifyViewEntered(this.f1681a, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        p.b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.f1683c != null && (bVar = this.f1686f) != null && bVar.f2505j != null && v()) {
            this.f1683c.notifyViewExited(this.f1681a, this.f1686f.f2505j.f2507a.hashCode());
        }
    }

    public void B(String str, Bundle bundle) {
        this.f1682b.sendAppPrivateCommand(this.f1681a, str, bundle);
    }

    /* access modifiers changed from: package-private */
    public void D(int i3, p.b bVar) {
        y();
        this.f1686f = bVar;
        this.f1685e = k() ? new c(c.a.FRAMEWORK_CLIENT, i3) : new c(c.a.NO_TARGET, i3);
        this.f1688h.l(this);
        p.b.a aVar = bVar.f2505j;
        this.f1688h = new e(aVar != null ? aVar.f2509c : null, this.f1681a);
        H(bVar);
        this.f1689i = true;
        G();
        this.f1692l = null;
        this.f1688h.a(this);
    }

    /* access modifiers changed from: package-private */
    public void E(View view, p.e eVar) {
        p.e eVar2;
        if (!this.f1689i && (eVar2 = this.f1694n) != null && eVar2.b()) {
            boolean n3 = n(this.f1694n, eVar);
            this.f1689i = n3;
            if (n3) {
                b1.b.d("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f1694n = eVar;
        this.f1688h.n(eVar);
        if (this.f1689i) {
            this.f1682b.restartInput(view);
            this.f1689i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void F(View view) {
        if (k()) {
            view.requestFocus();
            this.f1682b.showSoftInput(view, 0);
            return;
        }
        s(view);
    }

    public void G() {
        if (this.f1685e.f1701a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f1695o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f2524e) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.e r9 = r8.f1688h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        L_0x000b:
            io.flutter.plugin.editing.e r9 = r8.f1688h
            int r9 = r9.i()
            io.flutter.plugin.editing.e r10 = r8.f1688h
            int r10 = r10.h()
            io.flutter.plugin.editing.e r11 = r8.f1688h
            int r11 = r11.g()
            io.flutter.plugin.editing.e r0 = r8.f1688h
            int r7 = r0.f()
            io.flutter.plugin.editing.e r0 = r8.f1688h
            java.util.ArrayList r0 = r0.e()
            n1.p$e r1 = r8.f1694n
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.e r1 = r8.f1688h
            java.lang.String r1 = r1.toString()
            n1.p$e r2 = r8.f1694n
            java.lang.String r2 = r2.f2520a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            n1.p$e r1 = r8.f1694n
            int r2 = r1.f2521b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f2522c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f2523d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f2524e
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.e r2 = r8.f1688h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            b1.b.e(r2, r1)
            n1.p$b r1 = r8.f1686f
            boolean r1 = r1.f2500e
            if (r1 == 0) goto L_0x0086
            n1.p r1 = r8.f1684d
            io.flutter.plugin.editing.m$c r2 = r8.f1685e
            int r2 = r2.f1702b
            r1.p(r2, r0)
            io.flutter.plugin.editing.e r0 = r8.f1688h
            r0.c()
            goto L_0x0099
        L_0x0086:
            n1.p r0 = r8.f1684d
            io.flutter.plugin.editing.m$c r1 = r8.f1685e
            int r1 = r1.f1702b
            io.flutter.plugin.editing.e r2 = r8.f1688h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.o(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            n1.p$e r6 = new n1.p$e
            io.flutter.plugin.editing.e r0 = r8.f1688h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f1694n = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.e r9 = r8.f1688h
            r9.c()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.m.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        p.b bVar;
        p.b.a aVar;
        p.b.a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (bVar = this.f1686f) != null && this.f1687g != null && (aVar = bVar.f2505j) != null) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                p.b bVar2 = this.f1687g.get(sparseArray.keyAt(i3));
                if (!(bVar2 == null || (aVar2 = bVar2.f2505j) == null)) {
                    String charSequence = sparseArray.valueAt(i3).getTextValue().toString();
                    p.e eVar = new p.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f2507a.equals(aVar.f2507a)) {
                        this.f1688h.n(eVar);
                    } else {
                        hashMap.put(aVar2.f2507a, eVar);
                    }
                }
            }
            this.f1684d.q(this.f1685e.f1702b, hashMap);
        }
    }

    public void l(int i3) {
        c cVar = this.f1685e;
        c.a aVar = cVar.f1701a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f1702b == i3) {
            this.f1685e = new c(c.a.NO_TARGET, 0);
            y();
            this.f1682b.hideSoftInputFromWindow(this.f1681a.getApplicationWindowToken(), 0);
            this.f1682b.restartInput(this.f1681a);
            this.f1689i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (this.f1685e.f1701a != c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f1688h.l(this);
            y();
            this.f1686f = null;
            H((p.b) null);
            this.f1685e = new c(c.a.NO_TARGET, 0);
            G();
            this.f1692l = null;
        }
    }

    public InputConnection o(View view, c0 c0Var, EditorInfo editorInfo) {
        c cVar = this.f1685e;
        c.a aVar = cVar.f1701a;
        if (aVar == c.a.NO_TARGET) {
            this.f1690j = null;
            return null;
        } else if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                p.b bVar = this.f1686f;
                int t3 = t(bVar.f2502g, bVar.f2496a, bVar.f2497b, bVar.f2498c, bVar.f2499d, bVar.f2501f);
                editorInfo.inputType = t3;
                editorInfo.imeOptions = 33554432;
                if (Build.VERSION.SDK_INT >= 26 && !this.f1686f.f2499d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = this.f1686f.f2503h;
                int intValue = num == null ? (t3 & 131072) != 0 ? 1 : 6 : num.intValue();
                String str = this.f1686f.f2504i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = intValue;
                }
                editorInfo.imeOptions = intValue | editorInfo.imeOptions;
                d dVar = new d(view, this.f1685e.f1702b, this.f1684d, c0Var, this.f1688h, editorInfo);
                editorInfo.initialSelStart = this.f1688h.i();
                editorInfo.initialSelEnd = this.f1688h.h();
                this.f1690j = dVar;
                return dVar;
            } else if (this.f1695o) {
                return this.f1690j;
            } else {
                InputConnection onCreateInputConnection = this.f1691k.c(cVar.f1702b).onCreateInputConnection(editorInfo);
                this.f1690j = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f1691k.J();
        this.f1684d.m((p.f) null);
        y();
        this.f1688h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f1693m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f1682b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f1690j) == null) {
            return false;
        }
        return inputConnection instanceof d ? ((d) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f1685e.f1701a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f1695o = true;
        }
    }

    public void z(ViewStructure viewStructure, int i3) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && v()) {
            String str = this.f1686f.f2505j.f2507a;
            AutofillId a4 = viewStructure.getAutofillId();
            for (int i4 = 0; i4 < this.f1687g.size(); i4++) {
                int keyAt = this.f1687g.keyAt(i4);
                p.b.a aVar = this.f1687g.valueAt(i4).f2505j;
                if (aVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i4);
                    newChild.setAutofillId(a4, keyAt);
                    String[] strArr = aVar.f2508b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f2510d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f1692l) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(aVar.f2509c.f2520a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f1692l.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.f1688h));
                    }
                }
            }
        }
    }
}
