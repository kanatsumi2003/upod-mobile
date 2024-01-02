package e1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.v;
import j2.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1150a;

    /* renamed from: b  reason: collision with root package name */
    private c f1151b;

    /* renamed from: c  reason: collision with root package name */
    private long f1152c;

    /* renamed from: d  reason: collision with root package name */
    private b f1153d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f1154e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f1155f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f1156g;

    class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f1157a;

        a(Context context) {
            this.f1157a = context;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f1154e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public b call() {
            f.a("FlutterLoader initTask");
            try {
                e unused = d.this.g(this.f1157a);
                d.this.f1154e.loadLibrary();
                d.this.f1154e.updateRefreshRate();
                d.this.f1155f.execute(new c(this));
                return new b(j2.c.d(this.f1157a), j2.c.a(this.f1157a), j2.c.c(this.f1157a), (a) null);
            } finally {
                f.b();
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f1159a;

        /* renamed from: b  reason: collision with root package name */
        final String f1160b;

        /* renamed from: c  reason: collision with root package name */
        final String f1161c;

        private b(String str, String str2, String str3) {
            this.f1159a = str;
            this.f1160b = str2;
            this.f1161c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f1162a;

        public String a() {
            return this.f1162a;
        }
    }

    public d() {
        this(b1.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, b1.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f1150a = false;
        this.f1154e = flutterJNI;
        this.f1155f = executorService;
    }

    /* access modifiers changed from: private */
    public e g(Context context) {
        return null;
    }

    private static boolean h(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean d() {
        return this.f1153d.f1148g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0191 A[Catch:{ Exception -> 0x01ce, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0194 A[Catch:{ Exception -> 0x01ce, all -> 0x01cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.content.Context r10, java.lang.String[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "--aot-shared-library-name="
            boolean r1 = r9.f1150a
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L_0x01e8
            e1.d$c r1 = r9.f1151b
            if (r1 == 0) goto L_0x01e0
            java.lang.String r1 = "FlutterLoader#ensureInitializationComplete"
            j2.f.a(r1)
            java.util.concurrent.Future<e1.d$b> r1 = r9.f1156g     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x01ce }
            e1.d$b r1 = (e1.d.b) r1     // Catch:{ Exception -> 0x01ce }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x01ce }
            r2.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = "--icu-symbol-prefix=_binary_icudtl_dat"
            r2.add(r3)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r3.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = "--icu-native-lib-path="
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            e1.b r4 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.f1147f     // Catch:{ Exception -> 0x01ce }
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x01ce }
            r3.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "libflutter.so"
            r3.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r3)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x0053
            java.util.Collections.addAll(r2, r11)     // Catch:{ Exception -> 0x01ce }
        L_0x0053:
            r3 = 0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            e1.b r5 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r5.f1142a     // Catch:{ Exception -> 0x01ce }
            r11.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            e1.b r0 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f1147f     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            r11.append(r4)     // Catch:{ Exception -> 0x01ce }
            e1.b r0 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f1142a     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--cache-dir-path="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r1.f1160b     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            e1.b r11 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.f1146e     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x00be
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--domain-network-policy="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            e1.b r0 = r9.f1153d     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.f1146e     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
        L_0x00be:
            e1.d$c r11 = r9.f1151b     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.a()     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x00e0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "--log-tag="
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            e1.d$c r0 = r9.f1151b     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r0.a()     // Catch:{ Exception -> 0x01ce }
            r11.append(r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
        L_0x00e0:
            android.content.pm.PackageManager r11 = r10.getPackageManager()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ Exception -> 0x01ce }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r0, r4)     // Catch:{ Exception -> 0x01ce }
            android.os.Bundle r11 = r11.metaData     // Catch:{ Exception -> 0x01ce }
            r0 = 0
            if (r11 == 0) goto L_0x00fa
            java.lang.String r4 = "io.flutter.embedding.android.OldGenHeapSize"
            int r4 = r11.getInt(r4)     // Catch:{ Exception -> 0x01ce }
            goto L_0x00fb
        L_0x00fa:
            r4 = 0
        L_0x00fb:
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r10.getSystemService(r4)     // Catch:{ Exception -> 0x01ce }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x01ce }
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            r4.getMemoryInfo(r5)     // Catch:{ Exception -> 0x01ce }
            long r4 = r5.totalMem     // Catch:{ Exception -> 0x01ce }
            double r4 = (double) r4     // Catch:{ Exception -> 0x01ce }
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x01ce }
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--old-gen-heap-size="
            r5.append(r6)     // Catch:{ Exception -> 0x01ce }
            r5.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            android.content.res.Resources r4 = r10.getResources()     // Catch:{ Exception -> 0x01ce }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ Exception -> 0x01ce }
            int r5 = r4.widthPixels     // Catch:{ Exception -> 0x01ce }
            int r4 = r4.heightPixels     // Catch:{ Exception -> 0x01ce }
            int r5 = r5 * r4
            int r5 = r5 * 12
            int r5 = r5 * 4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--resource-cache-max-bytes-threshold="
            r4.append(r6)     // Catch:{ Exception -> 0x01ce }
            r4.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = "--prefetched-default-font-manager"
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            r8 = 1
            if (r11 == 0) goto L_0x0167
            java.lang.String r4 = "io.flutter.embedding.android.EnableSkParagraph"
            boolean r4 = r11.getBoolean(r4, r8)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r4 = 0
            goto L_0x0168
        L_0x0167:
            r4 = 1
        L_0x0168:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = "--enable-skparagraph="
            r5.append(r6)     // Catch:{ Exception -> 0x01ce }
            r5.append(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x018b
            java.lang.String r4 = "io.flutter.embedding.android.EnableImpeller"
            boolean r4 = r11.getBoolean(r4, r0)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x018b
            java.lang.String r4 = "--enable-impeller"
            r2.add(r4)     // Catch:{ Exception -> 0x01ce }
        L_0x018b:
            boolean r11 = h(r11)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x0194
            java.lang.String r11 = "true"
            goto L_0x0196
        L_0x0194:
            java.lang.String r11 = "false"
        L_0x0196:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "--leak-vm="
            r4.append(r5)     // Catch:{ Exception -> 0x01ce }
            r4.append(r11)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r2.add(r11)     // Catch:{ Exception -> 0x01ce }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x01ce }
            long r6 = r9.f1152c     // Catch:{ Exception -> 0x01ce }
            long r6 = r4 - r6
            io.flutter.embedding.engine.FlutterJNI r11 = r9.f1154e     // Catch:{ Exception -> 0x01ce }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01ce }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ Exception -> 0x01ce }
            r2 = r0
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r1.f1159a     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r1.f1160b     // Catch:{ Exception -> 0x01ce }
            r0 = r11
            r1 = r10
            r0.init(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01ce }
            r9.f1150a = r8     // Catch:{ Exception -> 0x01ce }
            j2.f.b()
            return
        L_0x01cc:
            r10 = move-exception
            goto L_0x01dc
        L_0x01ce:
            r10 = move-exception
            java.lang.String r11 = "FlutterLoader"
            java.lang.String r0 = "Flutter initialization failed."
            b1.b.c(r11, r0, r10)     // Catch:{ all -> 0x01cc }
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x01cc }
            r11.<init>(r10)     // Catch:{ all -> 0x01cc }
            throw r11     // Catch:{ all -> 0x01cc }
        L_0x01dc:
            j2.f.b()
            throw r10
        L_0x01e0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called after startInitialization"
            r10.<init>(r11)
            throw r10
        L_0x01e8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called on the main thread"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.e(android.content.Context, java.lang.String[]):void");
    }

    public String f() {
        return this.f1153d.f1145d;
    }

    public void i(Context context) {
        j(context, new c());
    }

    public void j(Context context, c cVar) {
        if (this.f1151b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                f.a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f1151b = cVar;
                    this.f1152c = SystemClock.uptimeMillis();
                    this.f1153d = a.e(applicationContext);
                    v.d((DisplayManager) applicationContext.getSystemService("display"), this.f1154e).e();
                    this.f1156g = this.f1155f.submit(new a(applicationContext));
                } finally {
                    f.b();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}
