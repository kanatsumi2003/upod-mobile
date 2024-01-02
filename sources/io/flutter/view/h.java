package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n1.a;

public class h extends AccessibilityNodeProvider {
    private static int A = 267386881;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final int f1894y = (((g.SCROLL_RIGHT.f1957d | g.SCROLL_LEFT.f1957d) | g.SCROLL_UP.f1957d) | g.SCROLL_DOWN.f1957d);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final int f1895z = (((((((((((i.HAS_CHECKED_STATE.f1985d | i.IS_CHECKED.f1985d) | i.IS_SELECTED.f1985d) | i.IS_TEXT_FIELD.f1985d) | i.IS_FOCUSED.f1985d) | i.HAS_ENABLED_STATE.f1985d) | i.IS_ENABLED.f1985d) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f1985d) | i.HAS_TOGGLED_STATE.f1985d) | i.IS_TOGGLED.f1985d) | i.IS_FOCUSABLE.f1985d) | i.IS_SLIDER.f1985d);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f1896a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n1.a f1897b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f1898c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f1899d;

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.plugin.platform.m f1900e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f1901f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f1902g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, C0028h> f1903h;

    /* renamed from: i  reason: collision with root package name */
    private l f1904i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f1905j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f1906k;

    /* renamed from: l  reason: collision with root package name */
    private int f1907l;

    /* renamed from: m  reason: collision with root package name */
    private l f1908m;

    /* renamed from: n  reason: collision with root package name */
    private l f1909n;

    /* renamed from: o  reason: collision with root package name */
    private l f1910o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Integer> f1911p;

    /* renamed from: q  reason: collision with root package name */
    private int f1912q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f1913r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public k f1914s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f1915t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final a.b f1916u;

    /* renamed from: v  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f1917v;
    @TargetApi(19)

    /* renamed from: w  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f1918w;

    /* renamed from: x  reason: collision with root package name */
    private final ContentObserver f1919x;

    class a implements a.b {
        a() {
        }

        public void a(String str) {
            h.this.f1896a.announceForAccessibility(str);
        }

        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            h.this.X(byteBuffer, strArr, byteBufferArr);
        }

        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            h.this.W(byteBuffer, strArr);
        }

        public void d(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent j3 = h.this.G(0, 32);
                j3.getText().add(str);
                h.this.Q(j3);
            }
        }

        public void e(int i3) {
            h.this.P(i3, 2);
        }

        public void f(int i3) {
            h.this.P(i3, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        public void onAccessibilityStateChanged(boolean z3) {
            if (!h.this.f1915t) {
                n1.a p3 = h.this.f1897b;
                if (z3) {
                    p3.g(h.this.f1916u);
                    h.this.f1897b.e();
                } else {
                    p3.g((a.b) null);
                    h.this.f1897b.d();
                }
                if (h.this.f1914s != null) {
                    h.this.f1914s.a(z3, h.this.f1898c.isTouchExplorationEnabled());
                }
            }
        }
    }

    class c extends ContentObserver {
        c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z3) {
            onChange(z3, (Uri) null);
        }

        public void onChange(boolean z3, Uri uri) {
            if (!h.this.f1915t) {
                String string = Settings.Global.getString(h.this.f1901f, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    h.f(h.this, f.DISABLE_ANIMATIONS.f1934d);
                } else {
                    h.e(h.this, ~f.DISABLE_ANIMATIONS.f1934d);
                }
                h.this.R();
            }
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f1923a;

        d(AccessibilityManager accessibilityManager) {
            this.f1923a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z3) {
            if (!h.this.f1915t) {
                h hVar = h.this;
                if (z3) {
                    h.f(hVar, f.ACCESSIBLE_NAVIGATION.f1934d);
                } else {
                    hVar.J();
                    h.e(h.this, ~f.ACCESSIBLE_NAVIGATION.f1934d);
                }
                h.this.R();
                if (h.this.f1914s != null) {
                    h.this.f1914s.a(this.f1923a.isEnabled(), z3);
                }
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1925a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.h$o[] r0 = io.flutter.view.h.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1925a = r0
                io.flutter.view.h$o r1 = io.flutter.view.h.o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1925a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.h$o r1 = io.flutter.view.h.o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.e.<clinit>():void");
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: d  reason: collision with root package name */
        final int f1934d;

        private f(int i3) {
            this.f1934d = i3;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: d  reason: collision with root package name */
        public final int f1957d;

        private g(int i3) {
            this.f1957d = i3;
        }
    }

    /* renamed from: io.flutter.view.h$h  reason: collision with other inner class name */
    private static class C0028h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f1958a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f1959b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f1960c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f1961d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f1962e;

        C0028h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);
        

        /* renamed from: d  reason: collision with root package name */
        final int f1985d;

        private i(int i3) {
            this.f1985d = i3;
        }
    }

    private static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f1986d;

        private j() {
            super((a) null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z3, boolean z4);
    }

    private static class l {
        private p A;
        /* access modifiers changed from: private */
        public boolean B = false;
        private int C;
        private int D;
        /* access modifiers changed from: private */
        public int E;
        /* access modifiers changed from: private */
        public int F;
        private float G;
        private float H;
        private float I;
        /* access modifiers changed from: private */
        public String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        /* access modifiers changed from: private */
        public l Q;
        /* access modifiers changed from: private */
        public List<l> R = new ArrayList();
        /* access modifiers changed from: private */
        public List<l> S = new ArrayList();
        /* access modifiers changed from: private */
        public List<C0028h> T;
        /* access modifiers changed from: private */
        public C0028h U;
        /* access modifiers changed from: private */
        public C0028h V;
        /* access modifiers changed from: private */
        public boolean W = true;
        private float[] X;
        /* access modifiers changed from: private */
        public boolean Y = true;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final h f1987a;

        /* renamed from: a0  reason: collision with root package name */
        private Rect f1988a0;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f1989b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f1990c;

        /* renamed from: d  reason: collision with root package name */
        private int f1991d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f1992e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f1993f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f1994g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f1995h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f1996i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f1997j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f1998k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public float f1999l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public float f2000m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public float f2001n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public String f2002o;

        /* renamed from: p  reason: collision with root package name */
        private List<n> f2003p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public String f2004q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public List<n> f2005r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public String f2006s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public List<n> f2007t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public String f2008u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public List<n> f2009v;

        /* renamed from: w  reason: collision with root package name */
        private String f2010w;

        /* renamed from: x  reason: collision with root package name */
        private List<n> f2011x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public String f2012y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public int f2013z = -1;

        l(h hVar) {
            this.f1987a = hVar;
        }

        /* access modifiers changed from: private */
        public void c0(List<l> list) {
            if (p0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l c02 : this.R) {
                c02.c0(list);
            }
        }

        @TargetApi(21)
        private SpannableString d0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n next : list) {
                    int i3 = e.f1925a[next.f2016c.ordinal()];
                    if (i3 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.f2014a, next.f2015b, 0);
                    } else if (i3 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) next).f1986d)), next.f2014a, next.f2015b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            r2 = r3.K;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean e0() {
            /*
                r3 = this;
                java.lang.String r0 = r3.f2002o
                r1 = 0
                if (r0 != 0) goto L_0x000a
                java.lang.String r2 = r3.K
                if (r2 != 0) goto L_0x000a
                return r1
            L_0x000a:
                if (r0 == 0) goto L_0x0016
                java.lang.String r2 = r3.K
                if (r2 == 0) goto L_0x0016
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0017
            L_0x0016:
                r1 = 1
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.l.e0():boolean");
        }

        /* access modifiers changed from: private */
        public boolean f0() {
            return !Float.isNaN(this.f1999l) && !Float.isNaN(this.G) && this.G != this.f1999l;
        }

        private void g0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (!Matrix.invertM(this.X, 0, this.P, 0)) {
                    Arrays.fill(this.X, 0.0f);
                }
            }
        }

        private l h0(j2.e<l> eVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (eVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public Rect i0() {
            return this.f1988a0;
        }

        /* access modifiers changed from: private */
        public String j0() {
            String str;
            if (p0(i.NAMES_ROUTE) && (str = this.f2002o) != null && !str.isEmpty()) {
                return this.f2002o;
            }
            for (l j02 : this.R) {
                String j03 = j02.j0();
                if (j03 != null && !j03.isEmpty()) {
                    return j03;
                }
            }
            return null;
        }

        private List<n> k0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i3 = byteBuffer.getInt();
            if (i3 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = byteBuffer.getInt();
                int i6 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i7 = e.f1925a[oVar.ordinal()];
                if (i7 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m((a) null);
                    mVar.f2014a = i5;
                    mVar.f2015b = i6;
                    mVar.f2016c = oVar;
                    arrayList.add(mVar);
                } else if (i7 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j((a) null);
                    jVar.f2014a = i5;
                    jVar.f2015b = i6;
                    jVar.f2016c = oVar;
                    jVar.f1986d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public CharSequence l0() {
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : new CharSequence[]{d0(this.f2004q, this.f2005r), d0(this.f2002o, this.f2003p), d0(this.f2010w, this.f2011x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        static /* synthetic */ int m(l lVar, int i3) {
            int i4 = lVar.f1995h + i3;
            lVar.f1995h = i4;
            return i4;
        }

        /* access modifiers changed from: private */
        public boolean m0(g gVar) {
            return (gVar.f1957d & this.D) != 0;
        }

        static /* synthetic */ int n(l lVar, int i3) {
            int i4 = lVar.f1995h - i3;
            lVar.f1995h = i4;
            return i4;
        }

        /* access modifiers changed from: private */
        public boolean n0(i iVar) {
            return (iVar.f1985d & this.C) != 0;
        }

        /* access modifiers changed from: private */
        public boolean o0(g gVar) {
            return (gVar.f1957d & this.f1991d) != 0;
        }

        /* access modifiers changed from: private */
        public boolean p0(i iVar) {
            return (iVar.f1985d & this.f1990c) != 0;
        }

        /* access modifiers changed from: private */
        public l q0(float[] fArr) {
            float f4 = fArr[3];
            float f5 = fArr[0] / f4;
            float f6 = fArr[1] / f4;
            if (f5 < this.L || f5 >= this.N || f6 < this.M || f6 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l next : this.S) {
                if (!next.p0(i.IS_HIDDEN)) {
                    next.g0();
                    Matrix.multiplyMV(fArr2, 0, next.X, 0, fArr, 0);
                    l q02 = next.q0(fArr2);
                    if (q02 != null) {
                        return q02;
                    }
                }
            }
            if (r0()) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r0 = r4.f2002o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r0 = r4.f2004q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r0 = r4.f2010w;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean r0() {
            /*
                r4 = this;
                io.flutter.view.h$i r0 = io.flutter.view.h.i.SCOPES_ROUTE
                boolean r0 = r4.p0(r0)
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_FOCUSABLE
                boolean r0 = r4.p0(r0)
                r2 = 1
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.f1991d
                int r3 = io.flutter.view.h.f1894y
                int r3 = ~r3
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                int r0 = r4.f1990c
                int r3 = io.flutter.view.h.f1895z
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                java.lang.String r0 = r4.f2002o
                if (r0 == 0) goto L_0x0031
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x0031:
                java.lang.String r0 = r4.f2004q
                if (r0 == 0) goto L_0x003b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x003b:
                java.lang.String r0 = r4.f2010w
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0046
            L_0x0045:
                r1 = 1
            L_0x0046:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.l.r0():boolean");
        }

        private float s0(float f4, float f5, float f6, float f7) {
            return Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        }

        private float t0(float f4, float f5, float f6, float f7) {
            return Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        }

        /* access modifiers changed from: private */
        public static boolean u0(l lVar, j2.e<l> eVar) {
            return (lVar == null || lVar.h0(eVar) == null) ? false : true;
        }

        private void v0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f4 = fArr[3];
            fArr[0] = fArr[0] / f4;
            fArr[1] = fArr[1] / f4;
            fArr[2] = fArr[2] / f4;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        public void w0(float[] fArr, Set<l> set, boolean z3) {
            set.add(this);
            if (this.Y) {
                z3 = true;
            }
            if (z3) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.L;
                fArr2[1] = this.M;
                v0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                v0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                v0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                v0(fArr6, this.Z, fArr2);
                if (this.f1988a0 == null) {
                    this.f1988a0 = new Rect();
                }
                this.f1988a0.set(Math.round(t0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(t0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(s0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(s0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i3 = -1;
            for (l next : this.R) {
                next.f2013z = i3;
                i3 = next.f1989b;
                next.w0(this.Z, set, z3);
            }
        }

        /* access modifiers changed from: private */
        public void x0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f2004q;
            this.K = this.f2002o;
            this.C = this.f1990c;
            this.D = this.f1991d;
            this.E = this.f1994g;
            this.F = this.f1995h;
            this.G = this.f1999l;
            this.H = this.f2000m;
            this.I = this.f2001n;
            this.f1990c = byteBuffer.getInt();
            this.f1991d = byteBuffer.getInt();
            this.f1992e = byteBuffer.getInt();
            this.f1993f = byteBuffer.getInt();
            this.f1994g = byteBuffer.getInt();
            this.f1995h = byteBuffer.getInt();
            this.f1996i = byteBuffer.getInt();
            this.f1997j = byteBuffer.getInt();
            this.f1998k = byteBuffer.getInt();
            this.f1999l = byteBuffer.getFloat();
            this.f2000m = byteBuffer.getFloat();
            this.f2001n = byteBuffer.getFloat();
            int i3 = byteBuffer.getInt();
            this.f2002o = i3 == -1 ? null : strArr[i3];
            this.f2003p = k0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.f2004q = i4 == -1 ? null : strArr[i4];
            this.f2005r = k0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.f2006s = i5 == -1 ? null : strArr[i5];
            this.f2007t = k0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f2008u = i6 == -1 ? null : strArr[i6];
            this.f2009v = k0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.f2010w = i7 == -1 ? null : strArr[i7];
            this.f2011x = k0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f2012y = i8 == -1 ? null : strArr[i8];
            this.A = p.a(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i9 = 0; i9 < 16; i9++) {
                this.P[i9] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i10 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i11 = 0; i11 < i10; i11++) {
                l n3 = this.f1987a.z(byteBuffer.getInt());
                n3.Q = this;
                this.R.add(n3);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                l n4 = this.f1987a.z(byteBuffer.getInt());
                n4.Q = this;
                this.S.add(n4);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                this.T = null;
                return;
            }
            List<C0028h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i13);
            } else {
                list.clear();
            }
            for (int i14 = 0; i14 < i13; i14++) {
                C0028h o3 = this.f1987a.y(byteBuffer.getInt());
                if (o3.f1960c == g.TAP.f1957d) {
                    this.U = o3;
                } else if (o3.f1960c == g.LONG_PRESS.f1957d) {
                    this.V = o3;
                } else {
                    this.T.add(o3);
                }
                this.T.add(o3);
            }
        }
    }

    private static class m extends n {
        private m() {
            super((a) null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* renamed from: a  reason: collision with root package name */
        int f2014a;

        /* renamed from: b  reason: collision with root package name */
        int f2015b;

        /* renamed from: c  reason: collision with root package name */
        o f2016c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p a(int i3) {
            return i3 != 1 ? i3 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public h(View view, n1.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.m mVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), mVar);
    }

    public h(View view, n1.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.m mVar) {
        this.f1902g = new HashMap();
        this.f1903h = new HashMap();
        this.f1907l = 0;
        this.f1911p = new ArrayList();
        this.f1912q = 0;
        this.f1913r = 0;
        this.f1915t = false;
        this.f1916u = new a();
        b bVar = new b();
        this.f1917v = bVar;
        c cVar = new c(new Handler());
        this.f1919x = cVar;
        this.f1896a = view;
        this.f1897b = aVar;
        this.f1898c = accessibilityManager;
        this.f1901f = contentResolver;
        this.f1899d = accessibilityViewEmbedder;
        this.f1900e = mVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f1918w = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        mVar.a(this);
    }

    private l A() {
        return this.f1902g.get(0);
    }

    private void B(float f4, float f5) {
        l H;
        if (!this.f1902g.isEmpty() && (H = A().q0(new float[]{f4, f5, 0.0f, 1.0f})) != this.f1910o) {
            if (H != null) {
                P(H.f1989b, 128);
            }
            l lVar = this.f1910o;
            if (lVar != null) {
                P(lVar.f1989b, 256);
            }
            this.f1910o = H;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* access modifiers changed from: private */
    public AccessibilityEvent G(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        obtain.setPackageName(this.f1896a.getContext().getPackageName());
        obtain.setSource(this.f1896a, i3);
        return obtain;
    }

    /* access modifiers changed from: private */
    public void J() {
        l lVar = this.f1910o;
        if (lVar != null) {
            P(lVar.f1989b, 256);
            this.f1910o = null;
        }
    }

    private void K(l lVar) {
        String b02 = lVar.j0();
        if (b02 == null) {
            b02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            T(b02);
            return;
        }
        AccessibilityEvent G = G(lVar.f1989b, 32);
        G.getText().add(b02);
        Q(G);
    }

    @TargetApi(18)
    private boolean L(l lVar, int i3, Bundle bundle, boolean z3) {
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = lVar.f1994g;
        int k3 = lVar.f1995h;
        N(lVar, i4, z3, z4);
        if (!(i5 == lVar.f1994g && k3 == lVar.f1995h)) {
            String q3 = lVar.f2004q != null ? lVar.f2004q : "";
            AccessibilityEvent G = G(lVar.f1989b, 8192);
            G.getText().add(q3);
            G.setFromIndex(lVar.f1994g);
            G.setToIndex(lVar.f1995h);
            G.setItemCount(q3.length());
            Q(G);
        }
        if (i4 == 1) {
            if (z3) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.o0(gVar)) {
                    this.f1897b.c(i3, gVar, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (z3) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.o0(gVar2)) {
                return false;
            }
            this.f1897b.c(i3, gVar2, Boolean.valueOf(z4));
            return true;
        } else if (i4 != 2) {
            return i4 == 4 || i4 == 8 || i4 == 16;
        } else {
            if (z3) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.o0(gVar3)) {
                    this.f1897b.c(i3, gVar3, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (z3) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.o0(gVar4)) {
                return false;
            }
            this.f1897b.c(i3, gVar4, Boolean.valueOf(z4));
            return true;
        }
    }

    @TargetApi(21)
    private boolean M(l lVar, int i3, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f1897b.c(i3, g.SET_TEXT, string);
        String unused = lVar.f2004q = string;
        List unused2 = lVar.f2005r = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        io.flutter.view.h.l.m(r4, r5.start(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void N(io.flutter.view.h.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r4.f1995h
            if (r0 < 0) goto L_0x0111
            int r0 = r4.f1994g
            if (r0 >= 0) goto L_0x000e
            goto L_0x0111
        L_0x000e:
            r0 = 1
            if (r5 == r0) goto L_0x00e9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L_0x0094
            r1 = 4
            if (r5 == r1) goto L_0x0036
            r0 = 8
            if (r5 == r0) goto L_0x0022
            r0 = 16
            if (r5 == r0) goto L_0x0022
            goto L_0x0108
        L_0x0022:
            if (r6 == 0) goto L_0x0031
        L_0x0024:
            java.lang.String r5 = r4.f2004q
            int r5 = r5.length()
        L_0x002c:
            int unused = r4.f1995h = r5
            goto L_0x0108
        L_0x0031:
            int unused = r4.f1995h = r2
            goto L_0x0108
        L_0x0036:
            if (r6 == 0) goto L_0x006b
            int r5 = r4.f1995h
            java.lang.String r1 = r4.f2004q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x006b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f2004q
            int r1 = r4.f1995h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
        L_0x0062:
            int r5 = r5.start(r0)
            io.flutter.view.h.l.m(r4, r5)
            goto L_0x0108
        L_0x006b:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f1995h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f2004q
            int r1 = r4.f1995h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0031
        L_0x008f:
            int r5 = r5.start(r0)
            goto L_0x002c
        L_0x0094:
            if (r6 == 0) goto L_0x00c4
            int r5 = r4.f1995h
            java.lang.String r1 = r4.f2004q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00c4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f2004q
            int r1 = r4.f1995h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
            goto L_0x0062
        L_0x00c4:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f1995h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f2004q
            int r1 = r4.f1995h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0108
            goto L_0x008f
        L_0x00e9:
            if (r6 == 0) goto L_0x00fd
            int r5 = r4.f1995h
            java.lang.String r1 = r4.f2004q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00fd
            io.flutter.view.h.l.m(r4, r0)
            goto L_0x0108
        L_0x00fd:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f1995h
            if (r5 <= 0) goto L_0x0108
            io.flutter.view.h.l.n(r4, r0)
        L_0x0108:
            if (r7 != 0) goto L_0x0111
            int r5 = r4.f1995h
            int unused = r4.f1994g = r5
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.N(io.flutter.view.h$l, int, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    public void P(int i3, int i4) {
        if (this.f1898c.isEnabled()) {
            Q(G(i3, i4));
        }
    }

    /* access modifiers changed from: private */
    public void Q(AccessibilityEvent accessibilityEvent) {
        if (this.f1898c.isEnabled()) {
            this.f1896a.getParent().requestSendAccessibilityEvent(this.f1896a, accessibilityEvent);
        }
    }

    /* access modifiers changed from: private */
    public void R() {
        this.f1897b.f(this.f1907l);
    }

    private void S(int i3) {
        AccessibilityEvent G = G(i3, 2048);
        G.setContentChangeTypes(1);
        Q(G);
    }

    @TargetApi(28)
    private void T(String str) {
        this.f1896a.setAccessibilityPaneTitle(str);
    }

    private boolean V(l lVar) {
        return lVar.f1997j > 0 && (l.u0(this.f1904i, new f(lVar)) || !l.u0(this.f1904i, new g()));
    }

    @TargetApi(19)
    private void Y(l lVar) {
        View c4;
        Integer num;
        l unused = lVar.Q = null;
        if (!(lVar.f1996i == -1 || (num = this.f1905j) == null || this.f1899d.platformViewOfNode(num.intValue()) != this.f1900e.c(lVar.f1996i))) {
            P(this.f1905j.intValue(), 65536);
            this.f1905j = null;
        }
        if (!(lVar.f1996i == -1 || (c4 = this.f1900e.c(lVar.f1996i)) == null)) {
            c4.setImportantForAccessibility(4);
        }
        l lVar2 = this.f1904i;
        if (lVar2 == lVar) {
            P(lVar2.f1989b, 65536);
            this.f1904i = null;
        }
        if (this.f1908m == lVar) {
            this.f1908m = null;
        }
        if (this.f1910o == lVar) {
            this.f1910o = null;
        }
    }

    static /* synthetic */ int e(h hVar, int i3) {
        int i4 = i3 & hVar.f1907l;
        hVar.f1907l = i4;
        return i4;
    }

    static /* synthetic */ int f(h hVar, int i3) {
        int i4 = i3 | hVar.f1907l;
        hVar.f1907l = i4;
        return i4;
    }

    private AccessibilityEvent u(int i3, String str, String str2) {
        AccessibilityEvent G = G(i3, 16);
        G.setBeforeText(str);
        G.getText().add(str2);
        int i4 = 0;
        while (i4 < str.length() && i4 < str2.length() && str.charAt(i4) == str2.charAt(i4)) {
            i4++;
        }
        if (i4 >= str.length() && i4 >= str2.length()) {
            return null;
        }
        G.setFromIndex(i4);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i4 && length2 >= i4 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        G.setRemovedCount((length - i4) + 1);
        G.setAddedCount((length2 - i4) + 1);
        return G;
    }

    @TargetApi(28)
    private boolean v() {
        Activity e4 = j2.i.e(this.f1896a.getContext());
        if (e4 == null || e4.getWindow() == null) {
            return false;
        }
        int i3 = e4.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i3 == 2 || i3 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f1896a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    public C0028h y(int i3) {
        C0028h hVar = this.f1903h.get(Integer.valueOf(i3));
        if (hVar != null) {
            return hVar;
        }
        C0028h hVar2 = new C0028h();
        int unused = hVar2.f1959b = i3;
        int unused2 = hVar2.f1958a = A + i3;
        this.f1903h.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    /* access modifiers changed from: private */
    public l z(int i3) {
        l lVar = this.f1902g.get(Integer.valueOf(i3));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        int unused = lVar2.f1989b = i3;
        this.f1902g.put(Integer.valueOf(i3), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f1898c.isEnabled();
    }

    public boolean D() {
        return this.f1898c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo H(View view, int i3) {
        return AccessibilityNodeInfo.obtain(view, i3);
    }

    public boolean I(MotionEvent motionEvent) {
        if (!this.f1898c.isTouchExplorationEnabled() || this.f1902g.isEmpty()) {
            return false;
        }
        l H = A().q0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (H != null && H.f1996i != -1) {
            return this.f1899d.onAccessibilityHoverEvent(H.f1989b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            J();
        } else {
            b1.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
            return false;
        }
        return true;
    }

    public void O() {
        this.f1915t = true;
        this.f1900e.d();
        U((k) null);
        this.f1898c.removeAccessibilityStateChangeListener(this.f1917v);
        this.f1898c.removeTouchExplorationStateChangeListener(this.f1918w);
        this.f1901f.unregisterContentObserver(this.f1919x);
        this.f1897b.g((a.b) null);
    }

    public void U(k kVar) {
        this.f1914s = kVar;
    }

    /* access modifiers changed from: package-private */
    public void W(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            C0028h y3 = y(byteBuffer.getInt());
            int unused = y3.f1960c = byteBuffer.getInt();
            int i3 = byteBuffer.getInt();
            String str = null;
            String unused2 = y3.f1961d = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            if (i4 != -1) {
                str = strArr[i4];
            }
            String unused3 = y3.f1962e = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.h$l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.h$l r1 = r8.z(r1)
            r1.x0(r9, r10, r11)
            io.flutter.view.h$i r3 = io.flutter.view.h.i.IS_HIDDEN
            boolean r3 = r1.p0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.h$i r3 = io.flutter.view.h.i.IS_FOCUSED
            boolean r3 = r1.p0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f1908m = r1
        L_0x002a:
            boolean r3 = r1.B
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f1996i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.m r3 = r8.f1900e
            int r4 = r1.f1996i
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.m r3 = r8.f1900e
            int r1 = r1.f1996i
            android.view.View r1 = r3.c(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.h$l r10 = r8.A()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.v()
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.f1896a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.f1913r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.Y = r1
            boolean unused = r10.W = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f1913r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.w0(r3, r9, r2)
            r10.c0(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.h$l r5 = (io.flutter.view.h.l) r5
            java.util.List<java.lang.Integer> r6 = r8.f1911p
            int r7 = r5.f1989b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.h$l r4 = (io.flutter.view.h.l) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.f1989b
            int r5 = r8.f1912q
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.f1911p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.f1989b
            r8.f1912q = r10
            r8.K(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.f1911p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.h$l r11 = (io.flutter.view.h.l) r11
            java.util.List<java.lang.Integer> r4 = r8.f1911p
            int r11 = r11.f1989b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.h$l> r10 = r8.f1902g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.h$l r11 = (io.flutter.view.h.l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.Y(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.S(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0340
            java.lang.Object r10 = r9.next()
            io.flutter.view.h$l r10 = (io.flutter.view.h.l) r10
            boolean r11 = r10.f0()
            if (r11 == 0) goto L_0x0232
            int r11 = r10.f1989b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            float r0 = r10.f1999l
            float r4 = r10.f2000m
            float r5 = r10.f2000m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x019c:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x019f:
            float r5 = r10.f2001n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b6
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b4
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01b4:
            float r0 = r0 + r7
            goto L_0x01c0
        L_0x01b6:
            float r5 = r10.f2001n
            float r4 = r4 - r5
            float r5 = r10.f2001n
            float r0 = r0 - r5
        L_0x01c0:
            io.flutter.view.h$g r5 = io.flutter.view.h.g.SCROLL_UP
            boolean r5 = r10.m0(r5)
            if (r5 != 0) goto L_0x01ea
            io.flutter.view.h$g r5 = io.flutter.view.h.g.SCROLL_DOWN
            boolean r5 = r10.m0(r5)
            if (r5 == 0) goto L_0x01d1
            goto L_0x01ea
        L_0x01d1:
            io.flutter.view.h$g r5 = io.flutter.view.h.g.SCROLL_LEFT
            boolean r5 = r10.m0(r5)
            if (r5 != 0) goto L_0x01e1
            io.flutter.view.h$g r5 = io.flutter.view.h.g.SCROLL_RIGHT
            boolean r5 = r10.m0(r5)
            if (r5 == 0) goto L_0x01f2
        L_0x01e1:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01f2
        L_0x01ea:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01f2:
            int r0 = r10.f1997j
            if (r0 <= 0) goto L_0x022f
            int r0 = r10.f1997j
            r11.setItemCount(r0)
            int r0 = r10.f1998k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.S
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r0.next()
            io.flutter.view.h$l r5 = (io.flutter.view.h.l) r5
            io.flutter.view.h$i r6 = io.flutter.view.h.i.IS_HIDDEN
            boolean r5 = r5.p0(r6)
            if (r5 != 0) goto L_0x020f
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0226:
            int r0 = r10.f1998k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x022f:
            r8.Q(r11)
        L_0x0232:
            io.flutter.view.h$i r11 = io.flutter.view.h.i.IS_LIVE_REGION
            boolean r11 = r10.p0(r11)
            if (r11 == 0) goto L_0x0247
            boolean r11 = r10.e0()
            if (r11 == 0) goto L_0x0247
            int r11 = r10.f1989b
            r8.S(r11)
        L_0x0247:
            io.flutter.view.h$l r11 = r8.f1904i
            if (r11 == 0) goto L_0x027a
            int r11 = r11.f1989b
            int r0 = r10.f1989b
            if (r11 != r0) goto L_0x027a
            io.flutter.view.h$i r11 = io.flutter.view.h.i.IS_SELECTED
            boolean r0 = r10.n0(r11)
            if (r0 != 0) goto L_0x027a
            boolean r11 = r10.p0(r11)
            if (r11 == 0) goto L_0x027a
            int r11 = r10.f1989b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f2002o
            r0.add(r4)
            r8.Q(r11)
        L_0x027a:
            io.flutter.view.h$l r11 = r8.f1908m
            if (r11 == 0) goto L_0x02aa
            int r11 = r11.f1989b
            int r0 = r10.f1989b
            if (r11 != r0) goto L_0x02aa
            io.flutter.view.h$l r11 = r8.f1909n
            if (r11 == 0) goto L_0x0298
            int r11 = r11.f1989b
            io.flutter.view.h$l r0 = r8.f1908m
            int r0 = r0.f1989b
            if (r11 == r0) goto L_0x02aa
        L_0x0298:
            io.flutter.view.h$l r11 = r8.f1908m
            r8.f1909n = r11
            int r11 = r10.f1989b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            r8.Q(r11)
            goto L_0x02b0
        L_0x02aa:
            io.flutter.view.h$l r11 = r8.f1908m
            if (r11 != 0) goto L_0x02b0
            r8.f1909n = r3
        L_0x02b0:
            io.flutter.view.h$l r11 = r8.f1908m
            if (r11 == 0) goto L_0x0161
            int r11 = r11.f1989b
            int r0 = r10.f1989b
            if (r11 != r0) goto L_0x0161
            io.flutter.view.h$i r11 = io.flutter.view.h.i.IS_TEXT_FIELD
            boolean r0 = r10.n0(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.p0(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.h$l r11 = r8.f1904i
            if (r11 == 0) goto L_0x02dc
            int r11 = r11.f1989b
            io.flutter.view.h$l r0 = r8.f1908m
            int r0 = r0.f1989b
            if (r11 != r0) goto L_0x0161
        L_0x02dc:
            java.lang.String r11 = r10.J
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e9
            java.lang.String r11 = r10.J
            goto L_0x02ea
        L_0x02e9:
            r11 = r0
        L_0x02ea:
            java.lang.String r4 = r10.f2004q
            if (r4 == 0) goto L_0x02f4
            java.lang.String r0 = r10.f2004q
        L_0x02f4:
            int r4 = r10.f1989b
            android.view.accessibility.AccessibilityEvent r11 = r8.u(r4, r11, r0)
            if (r11 == 0) goto L_0x0301
            r8.Q(r11)
        L_0x0301:
            int r11 = r10.E
            int r4 = r10.f1994g
            if (r11 != r4) goto L_0x0315
            int r11 = r10.F
            int r4 = r10.f1995h
            if (r11 == r4) goto L_0x0161
        L_0x0315:
            int r11 = r10.f1989b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f1994g
            r11.setFromIndex(r4)
            int r10 = r10.f1995h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.Q(r11)
            goto L_0x0161
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.X(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:210:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0447  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            r13 = this;
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r14 < r0) goto L_0x000b
            io.flutter.view.AccessibilityViewEmbedder r0 = r13.f1899d
            android.view.accessibility.AccessibilityNodeInfo r14 = r0.createAccessibilityNodeInfo(r14)
            return r14
        L_0x000b:
            r1 = -1
            r2 = 0
            if (r14 != r1) goto L_0x002c
            android.view.View r14 = r13.f1896a
            android.view.accessibility.AccessibilityNodeInfo r14 = android.view.accessibility.AccessibilityNodeInfo.obtain(r14)
            android.view.View r0 = r13.f1896a
            r0.onInitializeAccessibilityNodeInfo(r14)
            java.util.Map<java.lang.Integer, io.flutter.view.h$l> r0 = r13.f1902g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x002b
            android.view.View r0 = r13.f1896a
            r14.addChild(r0, r2)
        L_0x002b:
            return r14
        L_0x002c:
            java.util.Map<java.lang.Integer, io.flutter.view.h$l> r3 = r13.f1902g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r3 = r3.get(r4)
            io.flutter.view.h$l r3 = (io.flutter.view.h.l) r3
            r4 = 0
            if (r3 != 0) goto L_0x003c
            return r4
        L_0x003c:
            int r5 = r3.f1996i
            if (r5 == r1) goto L_0x006a
            io.flutter.plugin.platform.m r5 = r13.f1900e
            int r6 = r3.f1996i
            boolean r5 = r5.b(r6)
            if (r5 == 0) goto L_0x006a
            io.flutter.plugin.platform.m r14 = r13.f1900e
            int r0 = r3.f1996i
            android.view.View r14 = r14.c(r0)
            if (r14 != 0) goto L_0x005b
            return r4
        L_0x005b:
            android.graphics.Rect r0 = r3.i0()
            io.flutter.view.AccessibilityViewEmbedder r1 = r13.f1899d
            int r2 = r3.f1989b
            android.view.accessibility.AccessibilityNodeInfo r14 = r1.getRootNode(r14, r2, r0)
            return r14
        L_0x006a:
            android.view.View r4 = r13.f1896a
            android.view.accessibility.AccessibilityNodeInfo r4 = r13.H(r4, r14)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = ""
            r4.setViewIdResourceName(r6)
            android.view.View r7 = r13.f1896a
            android.content.Context r7 = r7.getContext()
            java.lang.String r7 = r7.getPackageName()
            r4.setPackageName(r7)
            java.lang.String r7 = "android.view.View"
            r4.setClassName(r7)
            android.view.View r7 = r13.f1896a
            r4.setSource(r7, r14)
            boolean r7 = r3.r0()
            r4.setFocusable(r7)
            io.flutter.view.h$l r7 = r13.f1908m
            r8 = 1
            if (r7 == 0) goto L_0x00a6
            int r7 = r7.f1989b
            if (r7 != r14) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            r4.setFocused(r7)
        L_0x00a6:
            io.flutter.view.h$l r7 = r13.f1904i
            if (r7 == 0) goto L_0x00b6
            int r7 = r7.f1989b
            if (r7 != r14) goto L_0x00b2
            r7 = 1
            goto L_0x00b3
        L_0x00b2:
            r7 = 0
        L_0x00b3:
            r4.setAccessibilityFocused(r7)
        L_0x00b6:
            io.flutter.view.h$i r7 = io.flutter.view.h.i.IS_TEXT_FIELD
            boolean r9 = r3.p0(r7)
            if (r9 == 0) goto L_0x0165
            io.flutter.view.h$i r9 = io.flutter.view.h.i.IS_OBSCURED
            boolean r9 = r3.p0(r9)
            r4.setPassword(r9)
            io.flutter.view.h$i r9 = io.flutter.view.h.i.IS_READ_ONLY
            boolean r10 = r3.p0(r9)
            if (r10 != 0) goto L_0x00d4
            java.lang.String r10 = "android.widget.EditText"
            r4.setClassName(r10)
        L_0x00d4:
            boolean r9 = r3.p0(r9)
            r9 = r9 ^ r8
            r4.setEditable(r9)
            int r9 = r3.f1994g
            if (r9 == r1) goto L_0x00f3
            int r9 = r3.f1995h
            if (r9 == r1) goto L_0x00f3
            int r9 = r3.f1994g
            int r10 = r3.f1995h
            r4.setTextSelection(r9, r10)
        L_0x00f3:
            io.flutter.view.h$l r9 = r13.f1904i
            if (r9 == 0) goto L_0x0100
            int r9 = r9.f1989b
            if (r9 != r14) goto L_0x0100
            r4.setLiveRegion(r8)
        L_0x0100:
            io.flutter.view.h$g r9 = io.flutter.view.h.g.MOVE_CURSOR_FORWARD_BY_CHARACTER
            boolean r9 = r3.o0(r9)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x010f
            r4.addAction(r10)
            r9 = 1
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            io.flutter.view.h$g r11 = io.flutter.view.h.g.MOVE_CURSOR_BACKWARD_BY_CHARACTER
            boolean r11 = r3.o0(r11)
            r12 = 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x011f
            r4.addAction(r12)
            r9 = r9 | 1
        L_0x011f:
            io.flutter.view.h$g r11 = io.flutter.view.h.g.MOVE_CURSOR_FORWARD_BY_WORD
            boolean r11 = r3.o0(r11)
            if (r11 == 0) goto L_0x012c
            r4.addAction(r10)
            r9 = r9 | 2
        L_0x012c:
            io.flutter.view.h$g r10 = io.flutter.view.h.g.MOVE_CURSOR_BACKWARD_BY_WORD
            boolean r10 = r3.o0(r10)
            if (r10 == 0) goto L_0x0139
            r4.addAction(r12)
            r9 = r9 | 2
        L_0x0139:
            r4.setMovementGranularities(r9)
            int r9 = r3.f1992e
            if (r9 < 0) goto L_0x0165
            java.lang.String r9 = r3.f2004q
            if (r9 != 0) goto L_0x014a
            r9 = 0
            goto L_0x0152
        L_0x014a:
            java.lang.String r9 = r3.f2004q
            int r9 = r9.length()
        L_0x0152:
            int unused = r3.f1993f
            int unused = r3.f1992e
            int r10 = r3.f1993f
            int r9 = r9 - r10
            int r10 = r3.f1992e
            int r9 = r9 + r10
            r4.setMaxTextLength(r9)
        L_0x0165:
            io.flutter.view.h$g r9 = io.flutter.view.h.g.SET_SELECTION
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x0172
            r9 = 131072(0x20000, float:1.83671E-40)
            r4.addAction(r9)
        L_0x0172:
            io.flutter.view.h$g r9 = io.flutter.view.h.g.COPY
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x017f
            r9 = 16384(0x4000, float:2.2959E-41)
            r4.addAction(r9)
        L_0x017f:
            io.flutter.view.h$g r9 = io.flutter.view.h.g.CUT
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x018a
            r4.addAction(r0)
        L_0x018a:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.PASTE
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0198
            r0 = 32768(0x8000, float:4.5918E-41)
            r4.addAction(r0)
        L_0x0198:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.SET_TEXT
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x01a5
            r0 = 2097152(0x200000, float:2.938736E-39)
            r4.addAction(r0)
        L_0x01a5:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_BUTTON
            boolean r0 = r3.p0(r0)
            if (r0 != 0) goto L_0x01b5
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_LINK
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x01ba
        L_0x01b5:
            java.lang.String r0 = "android.widget.Button"
            r4.setClassName(r0)
        L_0x01ba:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_IMAGE
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = "android.widget.ImageView"
            r4.setClassName(r0)
        L_0x01c7:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.DISMISS
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x01d7
            r4.setDismissable(r8)
            r0 = 1048576(0x100000, float:1.469368E-39)
            r4.addAction(r0)
        L_0x01d7:
            io.flutter.view.h$l r0 = r3.Q
            if (r0 == 0) goto L_0x01eb
            android.view.View r0 = r13.f1896a
            io.flutter.view.h$l r9 = r3.Q
            int r9 = r9.f1989b
            r4.setParent(r0, r9)
            goto L_0x01f0
        L_0x01eb:
            android.view.View r0 = r13.f1896a
            r4.setParent(r0)
        L_0x01f0:
            int r0 = r3.f2013z
            if (r0 == r1) goto L_0x0203
            r0 = 22
            if (r5 < r0) goto L_0x0203
            android.view.View r0 = r13.f1896a
            int r9 = r3.f2013z
            r4.setTraversalAfter(r0, r9)
        L_0x0203:
            android.graphics.Rect r0 = r3.i0()
            io.flutter.view.h$l r9 = r3.Q
            if (r9 == 0) goto L_0x0227
            io.flutter.view.h$l r9 = r3.Q
            android.graphics.Rect r9 = r9.i0()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r0)
            int r11 = r9.left
            int r11 = -r11
            int r9 = r9.top
            int r9 = -r9
            r10.offset(r11, r9)
            r4.setBoundsInParent(r10)
            goto L_0x022a
        L_0x0227:
            r4.setBoundsInParent(r0)
        L_0x022a:
            android.graphics.Rect r0 = r13.x(r0)
            r4.setBoundsInScreen(r0)
            r4.setVisibleToUser(r8)
            io.flutter.view.h$i r0 = io.flutter.view.h.i.HAS_ENABLED_STATE
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x0247
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_ENABLED
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x0245
            goto L_0x0247
        L_0x0245:
            r0 = 0
            goto L_0x0248
        L_0x0247:
            r0 = 1
        L_0x0248:
            r4.setEnabled(r0)
            io.flutter.view.h$g r0 = io.flutter.view.h.g.TAP
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0272
            io.flutter.view.h$h r0 = r3.U
            r9 = 16
            if (r0 == 0) goto L_0x026c
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.h$h r10 = r3.U
            java.lang.String r10 = r10.f1962e
            r0.<init>(r9, r10)
            r4.addAction(r0)
            goto L_0x026f
        L_0x026c:
            r4.addAction(r9)
        L_0x026f:
            r4.setClickable(r8)
        L_0x0272:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.LONG_PRESS
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0299
            io.flutter.view.h$h r0 = r3.V
            r9 = 32
            if (r0 == 0) goto L_0x0293
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.h$h r10 = r3.V
            java.lang.String r10 = r10.f1962e
            r0.<init>(r9, r10)
            r4.addAction(r0)
            goto L_0x0296
        L_0x0293:
            r4.addAction(r9)
        L_0x0296:
            r4.setLongClickable(r8)
        L_0x0299:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.SCROLL_LEFT
            boolean r9 = r3.o0(r0)
            r10 = 8192(0x2000, float:1.14794E-41)
            r11 = 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x02bd
            io.flutter.view.h$g r9 = io.flutter.view.h.g.SCROLL_UP
            boolean r9 = r3.o0(r9)
            if (r9 != 0) goto L_0x02bd
            io.flutter.view.h$g r9 = io.flutter.view.h.g.SCROLL_RIGHT
            boolean r9 = r3.o0(r9)
            if (r9 != 0) goto L_0x02bd
            io.flutter.view.h$g r9 = io.flutter.view.h.g.SCROLL_DOWN
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x0324
        L_0x02bd:
            r4.setScrollable(r8)
            io.flutter.view.h$i r9 = io.flutter.view.h.i.HAS_IMPLICIT_SCROLLING
            boolean r9 = r3.p0(r9)
            if (r9 == 0) goto L_0x0300
            boolean r9 = r3.o0(r0)
            if (r9 != 0) goto L_0x02e9
            io.flutter.view.h$g r9 = io.flutter.view.h.g.SCROLL_RIGHT
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x02d7
            goto L_0x02e9
        L_0x02d7:
            boolean r9 = r13.V(r3)
            if (r9 == 0) goto L_0x02e6
            int r9 = r3.f1997j
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r9, r2, r2)
            goto L_0x02f7
        L_0x02e6:
            java.lang.String r9 = "android.widget.ScrollView"
            goto L_0x02fd
        L_0x02e9:
            boolean r9 = r13.V(r3)
            if (r9 == 0) goto L_0x02fb
            int r9 = r3.f1997j
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r9, r2)
        L_0x02f7:
            r4.setCollectionInfo(r9)
            goto L_0x0300
        L_0x02fb:
            java.lang.String r9 = "android.widget.HorizontalScrollView"
        L_0x02fd:
            r4.setClassName(r9)
        L_0x0300:
            boolean r0 = r3.o0(r0)
            if (r0 != 0) goto L_0x030e
            io.flutter.view.h$g r0 = io.flutter.view.h.g.SCROLL_UP
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0311
        L_0x030e:
            r4.addAction(r11)
        L_0x0311:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.SCROLL_RIGHT
            boolean r0 = r3.o0(r0)
            if (r0 != 0) goto L_0x0321
            io.flutter.view.h$g r0 = io.flutter.view.h.g.SCROLL_DOWN
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0324
        L_0x0321:
            r4.addAction(r10)
        L_0x0324:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.INCREASE
            boolean r9 = r3.o0(r0)
            if (r9 != 0) goto L_0x0334
            io.flutter.view.h$g r9 = io.flutter.view.h.g.DECREASE
            boolean r9 = r3.o0(r9)
            if (r9 == 0) goto L_0x034d
        L_0x0334:
            java.lang.String r9 = "android.widget.SeekBar"
            r4.setClassName(r9)
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x0342
            r4.addAction(r11)
        L_0x0342:
            io.flutter.view.h$g r0 = io.flutter.view.h.g.DECREASE
            boolean r0 = r3.o0(r0)
            if (r0 == 0) goto L_0x034d
            r4.addAction(r10)
        L_0x034d:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_LIVE_REGION
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x0358
            r4.setLiveRegion(r8)
        L_0x0358:
            boolean r0 = r3.p0(r7)
            r7 = 28
            if (r0 == 0) goto L_0x0368
            java.lang.CharSequence r0 = r3.l0()
            r4.setText(r0)
            goto L_0x039c
        L_0x0368:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.SCOPES_ROUTE
            boolean r0 = r3.p0(r0)
            if (r0 != 0) goto L_0x039c
            java.lang.CharSequence r0 = r3.l0()
            if (r5 >= r7) goto L_0x0397
            java.lang.String r9 = r3.f2012y
            if (r9 == 0) goto L_0x0397
            if (r0 == 0) goto L_0x037f
            r6 = r0
        L_0x037f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "\n"
            r0.append(r6)
            java.lang.String r6 = r3.f2012y
            r0.append(r6)
            java.lang.String r0 = r0.toString()
        L_0x0397:
            if (r0 == 0) goto L_0x039c
            r4.setContentDescription(r0)
        L_0x039c:
            if (r5 < r7) goto L_0x03ab
            java.lang.String r0 = r3.f2012y
            if (r0 == 0) goto L_0x03ab
            java.lang.String r0 = r3.f2012y
            r4.setTooltipText(r0)
        L_0x03ab:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.HAS_CHECKED_STATE
            boolean r0 = r3.p0(r0)
            io.flutter.view.h$i r6 = io.flutter.view.h.i.HAS_TOGGLED_STATE
            boolean r6 = r3.p0(r6)
            if (r0 != 0) goto L_0x03bb
            if (r6 == 0) goto L_0x03bc
        L_0x03bb:
            r2 = 1
        L_0x03bc:
            r4.setCheckable(r2)
            if (r0 == 0) goto L_0x03d8
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_CHECKED
            boolean r0 = r3.p0(r0)
            r4.setChecked(r0)
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP
            boolean r0 = r3.p0(r0)
            if (r0 == 0) goto L_0x03d5
            java.lang.String r0 = "android.widget.RadioButton"
            goto L_0x03e5
        L_0x03d5:
            java.lang.String r0 = "android.widget.CheckBox"
            goto L_0x03e5
        L_0x03d8:
            if (r6 == 0) goto L_0x03e8
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_TOGGLED
            boolean r0 = r3.p0(r0)
            r4.setChecked(r0)
            java.lang.String r0 = "android.widget.Switch"
        L_0x03e5:
            r4.setClassName(r0)
        L_0x03e8:
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_SELECTED
            boolean r0 = r3.p0(r0)
            r4.setSelected(r0)
            if (r5 < r7) goto L_0x03fc
            io.flutter.view.h$i r0 = io.flutter.view.h.i.IS_HEADER
            boolean r0 = r3.p0(r0)
            r4.setHeading(r0)
        L_0x03fc:
            io.flutter.view.h$l r0 = r13.f1904i
            if (r0 == 0) goto L_0x0409
            int r0 = r0.f1989b
            if (r0 != r14) goto L_0x0409
            r14 = 128(0x80, float:1.794E-43)
            goto L_0x040b
        L_0x0409:
            r14 = 64
        L_0x040b:
            r4.addAction(r14)
            java.util.List r14 = r3.T
            if (r14 == 0) goto L_0x0439
            java.util.List r14 = r3.T
            java.util.Iterator r14 = r14.iterator()
        L_0x041c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0439
            java.lang.Object r0 = r14.next()
            io.flutter.view.h$h r0 = (io.flutter.view.h.C0028h) r0
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            int r5 = r0.f1958a
            java.lang.String r0 = r0.f1961d
            r2.<init>(r5, r0)
            r4.addAction(r2)
            goto L_0x041c
        L_0x0439:
            java.util.List r14 = r3.R
            java.util.Iterator r14 = r14.iterator()
        L_0x0441:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0480
            java.lang.Object r0 = r14.next()
            io.flutter.view.h$l r0 = (io.flutter.view.h.l) r0
            io.flutter.view.h$i r2 = io.flutter.view.h.i.IS_HIDDEN
            boolean r2 = r0.p0(r2)
            if (r2 == 0) goto L_0x0456
            goto L_0x0441
        L_0x0456:
            int r2 = r0.f1996i
            if (r2 == r1) goto L_0x0476
            io.flutter.plugin.platform.m r2 = r13.f1900e
            int r3 = r0.f1996i
            android.view.View r2 = r2.c(r3)
            io.flutter.plugin.platform.m r3 = r13.f1900e
            int r5 = r0.f1996i
            boolean r3 = r3.b(r5)
            if (r3 != 0) goto L_0x0476
            r4.addChild(r2)
            goto L_0x0441
        L_0x0476:
            android.view.View r2 = r13.f1896a
            int r0 = r0.f1989b
            r4.addChild(r2, r0)
            goto L_0x0441
        L_0x0480:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r2 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L_0x0007
            r0 = 2
            if (r2 == r0) goto L_0x001d
            goto L_0x0027
        L_0x0007:
            io.flutter.view.h$l r2 = r1.f1908m
            if (r2 == 0) goto L_0x0014
        L_0x000b:
            int r2 = r2.f1989b
        L_0x000f:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L_0x0014:
            java.lang.Integer r2 = r1.f1906k
            if (r2 == 0) goto L_0x001d
        L_0x0018:
            int r2 = r2.intValue()
            goto L_0x000f
        L_0x001d:
            io.flutter.view.h$l r2 = r1.f1904i
            if (r2 == 0) goto L_0x0022
            goto L_0x000b
        L_0x0022:
            java.lang.Integer r2 = r1.f1905j
            if (r2 == 0) goto L_0x0027
            goto L_0x0018
        L_0x0027:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.h.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        int i5;
        if (i3 >= 65536) {
            boolean performAction = this.f1899d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f1905j = null;
            }
            return performAction;
        }
        l lVar = this.f1902g.get(Integer.valueOf(i3));
        boolean z3 = false;
        if (lVar == null) {
            return false;
        }
        switch (i4) {
            case 16:
                this.f1897b.b(i3, g.TAP);
                return true;
            case 32:
                this.f1897b.b(i3, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f1904i == null) {
                    this.f1896a.invalidate();
                }
                this.f1904i = lVar;
                this.f1897b.b(i3, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                P(i3, 32768);
                if (lVar.o0(g.INCREASE) || lVar.o0(g.DECREASE)) {
                    P(i3, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f1904i;
                if (lVar2 != null && lVar2.f1989b == i3) {
                    this.f1904i = null;
                }
                Integer num = this.f1905j;
                if (num != null && num.intValue() == i3) {
                    this.f1905j = null;
                }
                this.f1897b.b(i3, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                P(i3, 65536);
                return true;
            case 256:
                return L(lVar, i3, bundle, true);
            case 512:
                return L(lVar, i3, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.o0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.o0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.o0(gVar)) {
                            return false;
                        }
                        String unused = lVar.f2004q = lVar.f2006s;
                        List unused2 = lVar.f2005r = lVar.f2007t;
                        P(i3, 4);
                    }
                }
                this.f1897b.b(i3, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.o0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.o0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.o0(gVar2)) {
                            return false;
                        }
                        String unused3 = lVar.f2004q = lVar.f2008u;
                        List unused4 = lVar.f2005r = lVar.f2009v;
                        P(i3, 4);
                    }
                }
                this.f1897b.b(i3, gVar2);
                return true;
            case 16384:
                this.f1897b.b(i3, g.COPY);
                return true;
            case 32768:
                this.f1897b.b(i3, g.PASTE);
                return true;
            case 65536:
                this.f1897b.b(i3, g.CUT);
                return true;
            case 131072:
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z3 = true;
                }
                if (z3) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i5 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f1995h));
                    i5 = lVar.f1995h;
                }
                hashMap.put("extent", Integer.valueOf(i5));
                this.f1897b.c(i3, g.SET_SELECTION, hashMap);
                l lVar3 = this.f1902g.get(Integer.valueOf(i3));
                int unused5 = lVar3.f1994g = ((Integer) hashMap.get("base")).intValue();
                int unused6 = lVar3.f1995h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f1897b.b(i3, g.DISMISS);
                return true;
            case 2097152:
                return M(lVar, i3, bundle);
            case 16908342:
                this.f1897b.b(i3, g.SHOW_ON_SCREEN);
                return true;
            default:
                C0028h hVar = this.f1903h.get(Integer.valueOf(i4 - A));
                if (hVar == null) {
                    return false;
                }
                this.f1897b.c(i3, g.CUSTOM_ACTION, Integer.valueOf(hVar.f1959b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f1899d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f1899d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f1906k = recordFlutterId;
            this.f1908m = null;
            return true;
        } else if (eventType == 128) {
            this.f1910o = null;
            return true;
        } else if (eventType == 32768) {
            this.f1905j = recordFlutterId;
            this.f1904i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f1906k = null;
            this.f1905j = null;
            return true;
        }
    }
}
