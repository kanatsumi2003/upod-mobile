package x1;

import android.hardware.camera2.CaptureRequest;
import r1.d0;

public class a extends s1.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f3172b = b.auto;

    /* renamed from: x1.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0054a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3173a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                x1.b[] r0 = x1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3173a = r0
                x1.b r1 = x1.b.off     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3173a     // Catch:{ NoSuchFieldError -> 0x001d }
                x1.b r1 = x1.b.always     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3173a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x1.b r1 = x1.b.torch     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3173a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x1.b r1 = x1.b.auto     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.a.C0054a.<clinit>():void");
        }
    }

    public a(d0 d0Var) {
        super(d0Var);
    }

    public String a() {
        return "FlashFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        int i3;
        CaptureRequest.Key key;
        int i4;
        CaptureRequest.Key key2;
        if (c()) {
            int i5 = C0054a.f3173a[this.f3172b.ordinal()];
            if (i5 == 1) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i4 = 1;
            } else if (i5 == 2) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i4 = 3;
            } else if (i5 == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                key = CaptureRequest.FLASH_MODE;
                i3 = 2;
                builder.set(key, i3);
            } else if (i5 == 4) {
                key2 = CaptureRequest.CONTROL_AE_MODE;
                i4 = 2;
            } else {
                return;
            }
            builder.set(key2, i4);
            key = CaptureRequest.FLASH_MODE;
            i3 = 0;
            builder.set(key, i3);
        }
    }

    public boolean c() {
        Boolean f4 = this.f2882a.f();
        return f4 != null && f4.booleanValue();
    }

    public void d(b bVar) {
        this.f3172b = bVar;
    }
}
