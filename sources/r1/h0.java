package r1;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import n1.i;

public final class h0 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2701a;

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
                f2701a = r0
                n1.i$f r1 = n1.i.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2701a     // Catch:{ NoSuchFieldError -> 0x001d }
                n1.i$f r1 = n1.i.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2701a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n1.i$f r1 = n1.i.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2701a     // Catch:{ NoSuchFieldError -> 0x0033 }
                n1.i$f r1 = n1.i.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.h0.a.<clinit>():void");
        }
    }

    static class b {
        public static MeteringRectangle a(int i3, int i4, int i5, int i6, int i7) {
            return new MeteringRectangle(i3, i4, i5, i6, i7);
        }
    }

    static class c {
        public static Size a(int i3, int i4) {
            return new Size(i3, i4);
        }
    }

    public static MeteringRectangle b(Size size, double d4, double d5, i.f fVar) {
        int i3 = a.f2701a[fVar.ordinal()];
        if (i3 == 1) {
            double d6 = 1.0d - d4;
            d4 = d5;
            d5 = d6;
        } else if (i3 == 2) {
            double d7 = 1.0d - d5;
            d5 = d4;
            d4 = d7;
        } else if (i3 == 4) {
            d4 = 1.0d - d4;
            d5 = 1.0d - d5;
        }
        int round = (int) Math.round(d4 * ((double) (size.getWidth() - 1)));
        int round2 = (int) Math.round(d5 * ((double) (size.getHeight() - 1)));
        int round3 = (int) Math.round(((double) size.getWidth()) / 10.0d);
        int round4 = (int) Math.round(((double) size.getHeight()) / 10.0d);
        int i4 = round - (round3 / 2);
        int i5 = round2 - (round4 / 2);
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int width = (size.getWidth() - 1) - round3;
        int height = (size.getHeight() - 1) - round4;
        if (i4 > width) {
            i4 = width;
        }
        if (i5 > height) {
            i5 = height;
        }
        return b.a(i4, i5, round3, round4, 1);
    }

    public static Size c(d0 d0Var, CaptureRequest.Builder builder) {
        if (Build.VERSION.SDK_INT < 28 || !e(d0Var)) {
            return d0Var.m();
        }
        Integer num = (Integer) builder.get(CaptureRequest.DISTORTION_CORRECTION_MODE);
        Rect l3 = (num == null || num.intValue() == 0) ? d0Var.l() : d0Var.g();
        return c.a(l3.width(), l3.height());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(int i3) {
        return i3 != 0;
    }

    @TargetApi(28)
    private static boolean e(d0 d0Var) {
        int[] j3 = d0Var.j();
        if (j3 == null) {
            j3 = new int[0];
        }
        return Arrays.stream(j3).filter(new g0()).count() > 0;
    }
}
