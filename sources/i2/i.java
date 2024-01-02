package i2;

import android.content.Context;
import android.util.Log;
import androidx.window.R;
import g1.a;
import i2.h;
import j2.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class i implements g1.a, h.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f1415a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1416a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i2.h$c[] r0 = i2.h.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1416a = r0
                i2.h$c r1 = i2.h.c.root     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x001d }
                i2.h$c r1 = i2.h.c.music     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i2.h$c r1 = i2.h.c.podcasts     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i2.h$c r1 = i2.h.c.ringtones     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x003e }
                i2.h$c r1 = i2.h.c.alarms     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i2.h$c r1 = i2.h.c.notifications     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0054 }
                i2.h$c r1 = i2.h.c.pictures     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0060 }
                i2.h$c r1 = i2.h.c.movies     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x006c }
                i2.h$c r1 = i2.h.c.downloads     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0078 }
                i2.h$c r1 = i2.h.c.dcim     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f1416a     // Catch:{ NoSuchFieldError -> 0x0084 }
                i2.h$c r1 = i2.h.c.documents     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i2.i.a.<clinit>():void");
        }
    }

    private String i() {
        return c.d(this.f1415a);
    }

    private String j() {
        return c.c(this.f1415a);
    }

    private List<String> k() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f1415a.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> l(h.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f1415a.getExternalFilesDirs(o(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String m() {
        File externalFilesDir = this.f1415a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String n() {
        return this.f1415a.getCacheDir().getPath();
    }

    private String o(h.c cVar) {
        switch (a.f1416a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case R.styleable.SplitPairRule_splitMinWidth:
                return "alarms";
            case R.styleable.SplitPairRule_splitRatio:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void p(o1.c cVar, Context context) {
        cVar.b();
        try {
            g.h(cVar, this);
        } catch (Exception e4) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f1415a = context;
    }

    public String a() {
        return n();
    }

    public String b() {
        return j();
    }

    public List<String> c() {
        return k();
    }

    public List<String> d(h.c cVar) {
        return l(cVar);
    }

    public String e() {
        return i();
    }

    public void f(a.b bVar) {
        g.h(bVar.b(), (h.a) null);
    }

    public String g() {
        return m();
    }

    public void h(a.b bVar) {
        p(bVar.b(), bVar.a());
    }
}
