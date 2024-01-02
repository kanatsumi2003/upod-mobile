package t1;

import android.hardware.camera2.CaptureRequest;
import r1.d0;

public class a extends s1.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f3071b = b.auto;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3072c;

    /* renamed from: t1.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0051a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3073a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                t1.b[] r0 = t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3073a = r0
                t1.b r1 = t1.b.locked     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3073a     // Catch:{ NoSuchFieldError -> 0x001d }
                t1.b r1 = t1.b.auto     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.a.C0051a.<clinit>():void");
        }
    }

    public a(d0 d0Var, boolean z3) {
        super(d0Var);
        this.f3072c = z3;
    }

    public String a() {
        return "AutoFocusFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        CaptureRequest.Key key;
        if (c()) {
            int i3 = C0051a.f3073a[this.f3071b.ordinal()];
            int i4 = 1;
            if (i3 == 1) {
                key = CaptureRequest.CONTROL_AF_MODE;
            } else if (i3 == 2) {
                key = CaptureRequest.CONTROL_AF_MODE;
                i4 = this.f3072c ? 3 : 4;
            } else {
                return;
            }
            builder.set(key, Integer.valueOf(i4));
        }
    }

    public boolean c() {
        int[] i3 = this.f2882a.i();
        Float k3 = this.f2882a.k();
        if ((k3 == null || k3.floatValue() == 0.0f) || i3.length == 0) {
            return false;
        }
        return (i3.length == 1 && i3[0] == 0) ? false : true;
    }

    public b d() {
        return this.f3071b;
    }

    public void e(b bVar) {
        this.f3071b = bVar;
    }
}
