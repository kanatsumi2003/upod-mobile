package c2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Display;
import android.view.WindowManager;
import n1.i;
import r1.m0;

public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final IntentFilter f683g = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a  reason: collision with root package name */
    private final Activity f684a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f685b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f686c;

    /* renamed from: d  reason: collision with root package name */
    private final int f687d;

    /* renamed from: e  reason: collision with root package name */
    private i.f f688e;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f689f;

    /* renamed from: c2.a$a  reason: collision with other inner class name */
    class C0013a extends BroadcastReceiver {
        C0013a() {
        }

        public void onReceive(Context context, Intent intent) {
            a.this.j();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f691a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                n1.i$f[] r0 = n1.i.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f691a = r0
                n1.i$f r1 = n1.i.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f691a     // Catch:{ NoSuchFieldError -> 0x001d }
                n1.i$f r1 = n1.i.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f691a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n1.i$f r1 = n1.i.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f691a     // Catch:{ NoSuchFieldError -> 0x0033 }
                n1.i$f r1 = n1.i.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.a.b.<clinit>():void");
        }
    }

    private a(Activity activity, m0 m0Var, boolean z3, int i3) {
        this.f684a = activity;
        this.f685b = m0Var;
        this.f686c = z3;
        this.f687d = i3;
    }

    public static a a(Activity activity, m0 m0Var, boolean z3, int i3) {
        return new a(activity, m0Var, z3, i3);
    }

    static void i(i.f fVar, i.f fVar2, m0 m0Var) {
        if (!fVar.equals(fVar2)) {
            m0Var.o(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public Display b() {
        return ((WindowManager) this.f684a.getSystemService("window")).getDefaultDisplay();
    }

    public i.f c() {
        return this.f688e;
    }

    public int d() {
        return e(this.f688e);
    }

    public int e(i.f fVar) {
        if (fVar == null) {
            fVar = f();
        }
        int i3 = b.f691a[fVar.ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            i4 = 90;
        } else if (i3 == 2) {
            i4 = 270;
        } else if (i3 == 3 ? this.f686c : !(i3 != 4 || this.f686c)) {
            i4 = 180;
        }
        return ((i4 + this.f687d) + 270) % 360;
    }

    /* access modifiers changed from: package-private */
    public i.f f() {
        int rotation = b().getRotation();
        int i3 = this.f684a.getResources().getConfiguration().orientation;
        return i3 != 1 ? i3 != 2 ? i.f.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? i.f.LANDSCAPE_LEFT : i.f.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? i.f.PORTRAIT_UP : i.f.PORTRAIT_DOWN;
    }

    public int g() {
        return h(this.f688e);
    }

    public int h(i.f fVar) {
        if (fVar == null) {
            fVar = f();
        }
        int i3 = b.f691a[fVar.ordinal()];
        int i4 = 0;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 180;
            } else if (i3 == 3) {
                i4 = 270;
            } else if (i3 == 4) {
                i4 = 90;
            }
        }
        if (this.f686c) {
            i4 *= -1;
        }
        return ((i4 + this.f687d) + 360) % 360;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i.f f4 = f();
        i(f4, this.f688e, this.f685b);
        this.f688e = f4;
    }

    public void k() {
        if (this.f689f == null) {
            C0013a aVar = new C0013a();
            this.f689f = aVar;
            this.f684a.registerReceiver(aVar, f683g);
            this.f689f.onReceive(this.f684a, (Intent) null);
        }
    }

    public void l() {
        BroadcastReceiver broadcastReceiver = this.f689f;
        if (broadcastReceiver != null) {
            this.f684a.unregisterReceiver(broadcastReceiver);
            this.f689f = null;
        }
    }
}
