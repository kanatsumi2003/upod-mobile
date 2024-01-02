package b2;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import r1.d0;

public class b extends s1.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private Size f576b;

    /* renamed from: c  reason: collision with root package name */
    private Size f577c;

    /* renamed from: d  reason: collision with root package name */
    private CamcorderProfile f578d;

    /* renamed from: e  reason: collision with root package name */
    private EncoderProfiles f579e;

    /* renamed from: f  reason: collision with root package name */
    private c f580f;

    /* renamed from: g  reason: collision with root package name */
    private int f581g;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f582a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                b2.c[] r0 = b2.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f582a = r0
                b2.c r1 = b2.c.max     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f582a     // Catch:{ NoSuchFieldError -> 0x001d }
                b2.c r1 = b2.c.ultraHigh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f582a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b2.c r1 = b2.c.veryHigh     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f582a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b2.c r1 = b2.c.high     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f582a     // Catch:{ NoSuchFieldError -> 0x003e }
                b2.c r1 = b2.c.medium     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f582a     // Catch:{ NoSuchFieldError -> 0x0049 }
                b2.c r1 = b2.c.low     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.b.a.<clinit>():void");
        }
    }

    public b(d0 d0Var, c cVar, String str) {
        super(d0Var);
        this.f580f = cVar;
        try {
            int parseInt = Integer.parseInt(str, 10);
            this.f581g = parseInt;
            e(cVar, parseInt);
        } catch (NumberFormatException unused) {
            this.f581g = -1;
        }
    }

    static Size d(int i3, c cVar) {
        int ordinal = cVar.ordinal();
        c cVar2 = c.high;
        if (ordinal > cVar2.ordinal()) {
            cVar = cVar2;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles.VideoProfile videoProfile = f(i3, cVar).getVideoProfiles().get(0);
            return new Size(videoProfile.getWidth(), videoProfile.getHeight());
        }
        CamcorderProfile g3 = g(i3, cVar);
        return new Size(g3.videoFrameWidth, g3.videoFrameHeight);
    }

    private void e(c cVar, int i3) {
        if (c()) {
            if (Build.VERSION.SDK_INT >= 31) {
                EncoderProfiles f4 = f(i3, cVar);
                this.f579e = f4;
                EncoderProfiles.VideoProfile videoProfile = f4.getVideoProfiles().get(0);
                this.f576b = new Size(videoProfile.getWidth(), videoProfile.getHeight());
            } else {
                this.f578d = g(i3, cVar);
                CamcorderProfile camcorderProfile = this.f578d;
                this.f576b = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            this.f577c = d(i3, cVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        return android.media.CamcorderProfile.getAll(r0, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 6) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return android.media.CamcorderProfile.getAll(r0, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 5) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return android.media.CamcorderProfile.getAll(r0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 4) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return android.media.CamcorderProfile.getAll(r0, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 7) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        return android.media.CamcorderProfile.getAll(r0, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 0) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return android.media.CamcorderProfile.getAll(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        throw new java.lang.IllegalArgumentException("No capture session available for current capture session.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (android.media.CamcorderProfile.hasProfile(r2, 8) == false) goto L_0x002b;
     */
    @android.annotation.TargetApi(31)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.EncoderProfiles f(int r2, b2.c r3) {
        /*
            if (r2 < 0) goto L_0x006f
            java.lang.String r0 = java.lang.Integer.toString(r2)
            int[] r1 = b2.b.a.f582a
            int r3 = r3.ordinal()
            r3 = r1[r3]
            switch(r3) {
                case 1: goto L_0x0012;
                case 2: goto L_0x001e;
                case 3: goto L_0x002b;
                case 4: goto L_0x0037;
                case 5: goto L_0x0043;
                case 6: goto L_0x004f;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x005b
        L_0x0012:
            r3 = 1
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x001e
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x001e:
            r3 = 8
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x002b
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x002b:
            r3 = 6
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x0037
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x0037:
            r3 = 5
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x0043
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x0043:
            r3 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x004f
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x004f:
            r3 = 7
            boolean r1 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r1 == 0) goto L_0x005b
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x005b:
            r3 = 0
            boolean r2 = android.media.CamcorderProfile.hasProfile(r2, r3)
            if (r2 == 0) goto L_0x0067
            android.media.EncoderProfiles r2 = android.media.CamcorderProfile.getAll(r0, r3)
            return r2
        L_0x0067:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No capture session available for current capture session."
            r2.<init>(r3)
            throw r2
        L_0x006f:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.f(int, b2.c):android.media.EncoderProfiles");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return android.media.CamcorderProfile.get(r1, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 6) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return android.media.CamcorderProfile.get(r1, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 5) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        return android.media.CamcorderProfile.get(r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 4) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return android.media.CamcorderProfile.get(r1, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 7) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return android.media.CamcorderProfile.get(r1, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 0) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        return android.media.CamcorderProfile.get(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        throw new java.lang.IllegalArgumentException("No capture session available for current capture session.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (android.media.CamcorderProfile.hasProfile(r1, 8) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.CamcorderProfile g(int r1, b2.c r2) {
        /*
            if (r1 < 0) goto L_0x006b
            int[] r0 = b2.b.a.f582a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L_0x000e;
                case 2: goto L_0x001a;
                case 3: goto L_0x0027;
                case 4: goto L_0x0033;
                case 5: goto L_0x003f;
                case 6: goto L_0x004b;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0057
        L_0x000e:
            r2 = 1
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x001a
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x001a:
            r2 = 8
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x0027
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x0027:
            r2 = 6
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x0033
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x0033:
            r2 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x003f
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x003f:
            r2 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x004b
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x004b:
            r2 = 7
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x0057
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x0057:
            r2 = 0
            boolean r0 = android.media.CamcorderProfile.hasProfile(r1, r2)
            if (r0 == 0) goto L_0x0063
            android.media.CamcorderProfile r1 = android.media.CamcorderProfile.get(r1, r2)
            return r1
        L_0x0063:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No capture session available for current capture session."
            r1.<init>(r2)
            throw r1
        L_0x006b:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.g(int, b2.c):android.media.CamcorderProfile");
    }

    public String a() {
        return "ResolutionFeature";
    }

    public void b(CaptureRequest.Builder builder) {
    }

    public boolean c() {
        return this.f581g >= 0;
    }

    public Size h() {
        return this.f576b;
    }

    public Size i() {
        return this.f577c;
    }

    public EncoderProfiles j() {
        return this.f579e;
    }

    public CamcorderProfile k() {
        return this.f578d;
    }
}
