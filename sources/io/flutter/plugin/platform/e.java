package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.io.FileNotFoundException;
import java.util.List;
import k.h;
import n1.i;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f1722a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f1723b;

    /* renamed from: c  reason: collision with root package name */
    private final d f1724c;

    /* renamed from: d  reason: collision with root package name */
    private i.j f1725d;

    /* renamed from: e  reason: collision with root package name */
    private int f1726e = 1280;

    /* renamed from: f  reason: collision with root package name */
    final i.h f1727f;

    class a implements i.h {
        a() {
        }

        public void a(i.c cVar) {
            e.this.u(cVar);
        }

        public void b() {
            e.this.r();
        }

        public void c(i.j jVar) {
            e.this.z(jVar);
        }

        public CharSequence d(i.e eVar) {
            return e.this.p(eVar);
        }

        public void e(i.C0038i iVar) {
            e.this.q(iVar);
        }

        public void f(List<i.l> list) {
            e.this.x(list);
        }

        public void g() {
            e.this.v();
        }

        public void h() {
            e.this.s();
        }

        public void i(String str) {
            e.this.t(str);
        }

        public void j(int i3) {
            e.this.y(i3);
        }

        public void k(i.g gVar) {
            e.this.B(gVar);
        }

        public boolean l() {
            return e.this.n();
        }

        public void m(i.k kVar) {
            e.this.w(kVar);
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        public void onSystemUiVisibilityChange(int i3) {
            i iVar;
            boolean z3;
            if ((i3 & 4) == 0) {
                iVar = e.this.f1723b;
                z3 = false;
            } else {
                iVar = e.this.f1723b;
                z3 = true;
            }
            iVar.m(z3);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1730a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1731b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f1732c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                n1.i$d[] r0 = n1.i.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1732c = r0
                r1 = 1
                n1.i$d r2 = n1.i.d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1732c     // Catch:{ NoSuchFieldError -> 0x001d }
                n1.i$d r3 = n1.i.d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                n1.i$l[] r2 = n1.i.l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f1731b = r2
                n1.i$l r3 = n1.i.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f1731b     // Catch:{ NoSuchFieldError -> 0x0038 }
                n1.i$l r3 = n1.i.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                n1.i$g[] r2 = n1.i.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f1730a = r2
                n1.i$g r3 = n1.i.g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f1730a     // Catch:{ NoSuchFieldError -> 0x0053 }
                n1.i$g r2 = n1.i.g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f1730a     // Catch:{ NoSuchFieldError -> 0x005e }
                n1.i$g r1 = n1.i.g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f1730a     // Catch:{ NoSuchFieldError -> 0x0069 }
                n1.i$g r1 = n1.i.g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f1730a     // Catch:{ NoSuchFieldError -> 0x0074 }
                n1.i$g r1 = n1.i.g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.e.c.<clinit>():void");
        }
    }

    public interface d {
        boolean b();
    }

    public e(Activity activity, i iVar, d dVar) {
        a aVar = new a();
        this.f1727f = aVar;
        this.f1722a = activity;
        this.f1723b = iVar;
        iVar.l(aVar);
        this.f1724c = dVar;
    }

    /* access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f1722a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f1722a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null) {
                if (eVar != i.e.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f1722a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.f1722a);
        } catch (SecurityException e4) {
            b1.b.g("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e4);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void q(i.C0038i iVar) {
        if (iVar == i.C0038i.CLICK) {
            this.f1722a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    public void r() {
        d dVar = this.f1724c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f1722a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).h().c();
            } else {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public void s() {
        A();
    }

    /* access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f1722a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    public void u(i.c cVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 && i3 > 21) {
            this.f1722a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f2394b, (Bitmap) null, cVar.f2393a));
        }
        if (i3 >= 28) {
            this.f1722a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f2394b, 0, cVar.f2393a));
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        this.f1722a.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
    }

    /* access modifiers changed from: private */
    public void w(i.k kVar) {
        int i3;
        if (kVar == i.k.LEAN_BACK) {
            i3 = 1798;
        } else if (kVar == i.k.IMMERSIVE) {
            i3 = 3846;
        } else if (kVar == i.k.IMMERSIVE_STICKY) {
            i3 = 5894;
        } else if (kVar == i.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i3 = 1792;
        } else {
            return;
        }
        this.f1726e = i3;
        A();
    }

    /* access modifiers changed from: private */
    public void x(List<i.l> list) {
        int i3 = list.size() == 0 ? 5894 : 1798;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = c.f1731b[list.get(i4).ordinal()];
            if (i5 == 1) {
                i3 &= -5;
            } else if (i5 == 2) {
                i3 = i3 & -513 & -3;
            }
        }
        this.f1726e = i3;
        A();
    }

    /* access modifiers changed from: private */
    public void y(int i3) {
        this.f1722a.setRequestedOrientation(i3);
    }

    /* access modifiers changed from: private */
    @TargetApi(21)
    public void z(i.j jVar) {
        Window window = this.f1722a.getWindow();
        h hVar = new h(window, window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i3 >= 23) {
            i.d dVar = jVar.f2420b;
            if (dVar != null) {
                int i4 = c.f1732c[dVar.ordinal()];
                if (i4 == 1) {
                    hVar.b(true);
                } else if (i4 == 2) {
                    hVar.b(false);
                }
            }
            Integer num = jVar.f2419a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f2421c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            i.d dVar2 = jVar.f2423e;
            if (dVar2 != null) {
                int i5 = c.f1732c[dVar2.ordinal()];
                if (i5 == 1) {
                    hVar.a(true);
                } else if (i5 == 2) {
                    hVar.a(false);
                }
            }
            Integer num2 = jVar.f2422d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f2424f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f2425g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f1725d = jVar;
    }

    public void A() {
        this.f1722a.getWindow().getDecorView().setSystemUiVisibility(this.f1726e);
        i.j jVar = this.f1725d;
        if (jVar != null) {
            z(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(i.g gVar) {
        int i3;
        View decorView = this.f1722a.getWindow().getDecorView();
        int i4 = c.f1730a[gVar.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 != 4) {
                        if (i4 != 5) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        i3 = 6;
                    } else {
                        return;
                    }
                }
            }
            decorView.performHapticFeedback(i5);
            return;
        }
        i3 = 0;
        decorView.performHapticFeedback(i3);
    }

    public void o() {
        this.f1723b.l((i.h) null);
    }
}
