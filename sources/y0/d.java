package y0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import androidx.window.R;
import g1.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.j;
import o1.k;
import o1.r;

public class d implements g1.a, k.c {

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, Integer> f3200c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3201d = false;

    /* renamed from: e  reason: collision with root package name */
    private static int f3202e = 0;

    /* renamed from: f  reason: collision with root package name */
    static int f3203f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3204g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Object f3205h = new Object();

    /* renamed from: i  reason: collision with root package name */
    static String f3206i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static int f3207j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static HandlerThread f3208k;

    /* renamed from: l  reason: collision with root package name */
    private static Handler f3209l;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: m  reason: collision with root package name */
    static final Map<Integer, b> f3210m = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private Context f3211a;

    /* renamed from: b  reason: collision with root package name */
    private k f3212b;

    class a implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f3213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.d f3214e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f3215f;

        a(j jVar, k.d dVar, b bVar) {
            this.f3213d = jVar;
            this.f3214e = dVar;
            this.f3215f = bVar;
        }

        public void run() {
            boolean unused = d.this.P(this.f3215f, new a1.e(this.f3213d, this.f3214e));
        }
    }

    class b implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f3217d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.d f3218e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f3219f;

        b(j jVar, k.d dVar, b bVar) {
            this.f3217d = jVar;
            this.f3218e = dVar;
            this.f3219f = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
            r6.q(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
            r6.p(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                a1.e r0 = new a1.e
                o1.j r1 = r9.f3217d
                o1.k$d r2 = r9.f3218e
                r0.<init>(r1, r2)
                boolean r1 = r0.e()
                boolean r0 = r0.h()
                o1.j r2 = r9.f3217d
                java.lang.String r3 = "operations"
                java.lang.Object r2 = r2.a(r3)
                java.util.List r2 = (java.util.List) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0024:
                boolean r4 = r2.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x00ea
                java.lang.Object r4 = r2.next()
                java.util.Map r4 = (java.util.Map) r4
                a1.c r6 = new a1.c
                r6.<init>(r4, r1)
                java.lang.String r4 = r6.l()
                r4.hashCode()
                r7 = -1
                int r8 = r4.hashCode()
                switch(r8) {
                    case -1319569547: goto L_0x0067;
                    case -1183792455: goto L_0x005c;
                    case -838846263: goto L_0x0051;
                    case 107944136: goto L_0x0046;
                    default: goto L_0x0045;
                }
            L_0x0045:
                goto L_0x0071
            L_0x0046:
                java.lang.String r8 = "query"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x004f
                goto L_0x0071
            L_0x004f:
                r7 = 3
                goto L_0x0071
            L_0x0051:
                java.lang.String r8 = "update"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x005a
                goto L_0x0071
            L_0x005a:
                r7 = 2
                goto L_0x0071
            L_0x005c:
                java.lang.String r8 = "insert"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x0065
                goto L_0x0071
            L_0x0065:
                r7 = 1
                goto L_0x0071
            L_0x0067:
                java.lang.String r8 = "execute"
                boolean r8 = r4.equals(r8)
                if (r8 != 0) goto L_0x0070
                goto L_0x0071
            L_0x0070:
                r7 = 0
            L_0x0071:
                switch(r7) {
                    case 0: goto L_0x00ce;
                    case 1: goto L_0x00ba;
                    case 2: goto L_0x00a6;
                    case 3: goto L_0x0092;
                    default: goto L_0x0074;
                }
            L_0x0074:
                o1.k$d r0 = r9.f3218e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Batch method '"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = "' not supported"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "bad_param"
                r0.b(r2, r1, r5)
                return
            L_0x0092:
                y0.d r4 = y0.d.this
                y0.b r5 = r9.f3219f
                boolean r4 = r4.P(r5, r6)
                if (r4 == 0) goto L_0x009d
                goto L_0x00d8
            L_0x009d:
                if (r0 == 0) goto L_0x00a0
                goto L_0x00c7
            L_0x00a0:
                o1.k$d r0 = r9.f3218e
                r6.o(r0)
                return
            L_0x00a6:
                y0.d r4 = y0.d.this
                y0.b r5 = r9.f3219f
                boolean r4 = r4.R(r5, r6)
                if (r4 == 0) goto L_0x00b1
                goto L_0x00d8
            L_0x00b1:
                if (r0 == 0) goto L_0x00b4
                goto L_0x00c7
            L_0x00b4:
                o1.k$d r0 = r9.f3218e
                r6.o(r0)
                return
            L_0x00ba:
                y0.d r4 = y0.d.this
                y0.b r5 = r9.f3219f
                boolean r4 = r4.z(r5, r6)
                if (r4 == 0) goto L_0x00c5
                goto L_0x00d8
            L_0x00c5:
                if (r0 == 0) goto L_0x00c8
            L_0x00c7:
                goto L_0x00df
            L_0x00c8:
                o1.k$d r0 = r9.f3218e
                r6.o(r0)
                return
            L_0x00ce:
                y0.d r4 = y0.d.this
                y0.b r5 = r9.f3219f
                boolean r4 = r4.r(r5, r6)
                if (r4 == 0) goto L_0x00dd
            L_0x00d8:
                r6.q(r3)
                goto L_0x0024
            L_0x00dd:
                if (r0 == 0) goto L_0x00e4
            L_0x00df:
                r6.p(r3)
                goto L_0x0024
            L_0x00e4:
                o1.k$d r0 = r9.f3218e
                r6.o(r0)
                return
            L_0x00ea:
                o1.k$d r0 = r9.f3218e
                if (r1 == 0) goto L_0x00f2
                r0.a(r5)
                goto L_0x00f5
            L_0x00f2:
                r0.a(r3)
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.d.b.run():void");
        }
    }

    class c implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f3221a;

        c(e eVar) {
            this.f3221a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f3221a.a(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: y0.d$d  reason: collision with other inner class name */
    class C0055d implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f3223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.d f3224e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f3225f;

        C0055d(j jVar, k.d dVar, b bVar) {
            this.f3223d = jVar;
            this.f3224e = dVar;
            this.f3225f = bVar;
        }

        public void run() {
            boolean unused = d.this.z(this.f3225f, new a1.e(this.f3223d, this.f3224e));
        }
    }

    class e implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f3227d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f3228e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k.d f3229f;

        e(b bVar, j jVar, k.d dVar) {
            this.f3227d = bVar;
            this.f3228e = jVar;
            this.f3229f = dVar;
        }

        public void run() {
            if (d.this.s(this.f3227d, this.f3228e, this.f3229f) != null) {
                this.f3229f.a((Object) null);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f3231d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.d f3232e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f3233f;

        f(j jVar, k.d dVar, b bVar) {
            this.f3231d = jVar;
            this.f3232e = dVar;
            this.f3233f = bVar;
        }

        public void run() {
            boolean unused = d.this.R(this.f3233f, new a1.e(this.f3231d, this.f3232e));
        }
    }

    class g implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3235d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f3236e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k.d f3237f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Boolean f3238g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f3239h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f3240i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f3241j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f3242k;

        g(boolean z3, String str, k.d dVar, Boolean bool, b bVar, j jVar, boolean z4, int i3) {
            this.f3235d = z3;
            this.f3236e = str;
            this.f3237f = dVar;
            this.f3238g = bool;
            this.f3239h = bVar;
            this.f3240i = jVar;
            this.f3241j = z4;
            this.f3242k = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
            r5.f3237f.a(y0.d.B(r5.f3242k, false, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
            y0.d.j(r5.f3243l, r1, new a1.e(r5.f3240i, r5.f3237f), r5.f3239h);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Object r0 = y0.d.f3205h
                monitor-enter(r0)
                boolean r1 = r5.f3235d     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r5.f3236e     // Catch:{ all -> 0x00da }
                r1.<init>(r2)     // Catch:{ all -> 0x00da }
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00da }
                java.lang.String r1 = r1.getParent()     // Catch:{ all -> 0x00da }
                r2.<init>(r1)     // Catch:{ all -> 0x00da }
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00da }
                if (r1 != 0) goto L_0x0048
                o1.k$d r1 = r5.f3237f     // Catch:{ all -> 0x00da }
                java.lang.String r2 = "sqlite_error"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
                r3.<init>()     // Catch:{ all -> 0x00da }
                java.lang.String r4 = "open_failed "
                r3.append(r4)     // Catch:{ all -> 0x00da }
                java.lang.String r4 = r5.f3236e     // Catch:{ all -> 0x00da }
                r3.append(r4)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00da }
                r4 = 0
                r1.b(r2, r3, r4)     // Catch:{ all -> 0x00da }
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                return
            L_0x0048:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c7 }
                java.lang.Boolean r2 = r5.f3238g     // Catch:{ Exception -> 0x00c7 }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00c7 }
                if (r1 == 0) goto L_0x0058
                y0.b r1 = r5.f3239h     // Catch:{ Exception -> 0x00c7 }
                r1.i()     // Catch:{ Exception -> 0x00c7 }
                goto L_0x005d
            L_0x0058:
                y0.b r1 = r5.f3239h     // Catch:{ Exception -> 0x00c7 }
                r1.h()     // Catch:{ Exception -> 0x00c7 }
            L_0x005d:
                java.lang.Object r1 = y0.d.f3204g     // Catch:{ all -> 0x00da }
                monitor-enter(r1)     // Catch:{ all -> 0x00da }
                boolean r2 = r5.f3241j     // Catch:{ all -> 0x00c4 }
                if (r2 == 0) goto L_0x0073
                java.util.Map<java.lang.String, java.lang.Integer> r2 = y0.d.f3200c     // Catch:{ all -> 0x00c4 }
                java.lang.String r3 = r5.f3236e     // Catch:{ all -> 0x00c4 }
                int r4 = r5.f3242k     // Catch:{ all -> 0x00c4 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00c4 }
                r2.put(r3, r4)     // Catch:{ all -> 0x00c4 }
            L_0x0073:
                java.util.Map<java.lang.Integer, y0.b> r2 = y0.d.f3210m     // Catch:{ all -> 0x00c4 }
                int r3 = r5.f3242k     // Catch:{ all -> 0x00c4 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c4 }
                y0.b r4 = r5.f3239h     // Catch:{ all -> 0x00c4 }
                r2.put(r3, r4)     // Catch:{ all -> 0x00c4 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                y0.b r1 = r5.f3239h     // Catch:{ all -> 0x00da }
                int r1 = r1.f3195d     // Catch:{ all -> 0x00da }
                boolean r1 = y0.c.b(r1)     // Catch:{ all -> 0x00da }
                if (r1 == 0) goto L_0x00b6
                java.lang.String r1 = "Sqflite"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
                r2.<init>()     // Catch:{ all -> 0x00da }
                y0.b r3 = r5.f3239h     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r3.e()     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = "opened "
                r2.append(r3)     // Catch:{ all -> 0x00da }
                int r3 = r5.f3242k     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = " "
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r3 = r5.f3236e     // Catch:{ all -> 0x00da }
                r2.append(r3)     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00da }
                android.util.Log.d(r1, r2)     // Catch:{ all -> 0x00da }
            L_0x00b6:
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                o1.k$d r0 = r5.f3237f
                int r1 = r5.f3242k
                r2 = 0
                java.util.Map r1 = y0.d.B(r1, r2, r2)
                r0.a(r1)
                return
            L_0x00c4:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
                throw r2     // Catch:{ all -> 0x00da }
            L_0x00c7:
                r1 = move-exception
                a1.e r2 = new a1.e     // Catch:{ all -> 0x00da }
                o1.j r3 = r5.f3240i     // Catch:{ all -> 0x00da }
                o1.k$d r4 = r5.f3237f     // Catch:{ all -> 0x00da }
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00da }
                y0.d r3 = y0.d.this     // Catch:{ all -> 0x00da }
                y0.b r4 = r5.f3239h     // Catch:{ all -> 0x00da }
                r3.y(r1, r2, r4)     // Catch:{ all -> 0x00da }
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                return
            L_0x00da:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.d.g.run():void");
        }
    }

    class h implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f3244d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.d f3245e;

        h(b bVar, k.d dVar) {
            this.f3244d = bVar;
            this.f3245e = dVar;
        }

        public void run() {
            synchronized (d.f3205h) {
                d.this.n(this.f3244d);
            }
            this.f3245e.a((Object) null);
        }
    }

    class i implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f3247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f3248e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k.d f3249f;

        i(b bVar, String str, k.d dVar) {
            this.f3247d = bVar;
            this.f3248e = str;
            this.f3249f = dVar;
        }

        public void run() {
            synchronized (d.f3205h) {
                b bVar = this.f3247d;
                if (bVar != null) {
                    d.this.n(bVar);
                }
                try {
                    if (c.c(d.f3203f)) {
                        Log.d("Sqflite", "delete database " + this.f3248e);
                    }
                    b.c(this.f3248e);
                } catch (Exception e4) {
                    Log.e("Sqflite", "error " + e4 + " while closing database " + d.f3207j);
                }
            }
            this.f3249f.a((Object) null);
        }
    }

    static boolean A(String str) {
        return str == null || str.equals(":memory:");
    }

    static Map B(int i3, boolean z3, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i3));
        if (z3) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z4) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void C(Context context, o1.c cVar) {
        this.f3211a = context;
        k kVar = new k(cVar, "com.tekartik.sqflite", r.f2593b, cVar.b());
        this.f3212b = kVar;
        kVar.e(this);
    }

    private void D(j jVar, k.d dVar) {
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            f3209l.post(new b(jVar, dVar, w3));
        }
    }

    private void E(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            if (c.b(w3.f3195d)) {
                Log.d("Sqflite", w3.e() + "closing " + intValue + " " + w3.f3193b);
            }
            String str = w3.f3193b;
            synchronized (f3204g) {
                f3210m.remove(Integer.valueOf(intValue));
                if (w3.f3192a) {
                    f3200c.remove(str);
                }
            }
            f3209l.post(new h(w3, dVar));
        }
    }

    private void F(j jVar, k.d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.a("cmd"))) {
            int i3 = f3203f;
            if (i3 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i3));
            }
            Map<Integer, b> map = f3210m;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    b bVar = (b) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", bVar.f3193b);
                    hashMap3.put("singleInstance", Boolean.valueOf(bVar.f3192a));
                    int i4 = bVar.f3195d;
                    if (i4 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i4));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.a(hashMap);
    }

    private void G(j jVar, k.d dVar) {
        z0.a.f3264a = Boolean.TRUE.equals(jVar.b());
        z0.a.f3266c = z0.a.f3265b && z0.a.f3264a;
        if (!z0.a.f3264a) {
            f3203f = 0;
        } else if (z0.a.f3266c) {
            f3203f = 2;
        } else if (z0.a.f3264a) {
            f3203f = 1;
        }
        dVar.a((Object) null);
    }

    private void H(j jVar, k.d dVar) {
        b bVar;
        Map<Integer, b> map;
        String str = (String) jVar.a("path");
        synchronized (f3204g) {
            if (c.c(f3203f)) {
                Log.d("Sqflite", "Look for " + str + " in " + f3200c.keySet());
            }
            Map<String, Integer> map2 = f3200c;
            Integer num = map2.get(str);
            if (num == null || (bVar = map.get(num)) == null || !bVar.f3197f.isOpen()) {
                bVar = null;
            } else {
                if (c.c(f3203f)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar.e());
                    sb.append("found single instance ");
                    sb.append(bVar.f3198g ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                (map = f3210m).remove(num);
                map2.remove(str);
            }
        }
        i iVar = new i(bVar, str, dVar);
        Handler handler = f3209l;
        if (handler != null) {
            handler.post(iVar);
        } else {
            iVar.run();
        }
    }

    private void I(j jVar, k.d dVar) {
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            f3209l.post(new e(w3, jVar, dVar));
        }
    }

    private void K(j jVar, k.d dVar) {
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            f3209l.post(new C0055d(jVar, dVar, w3));
        }
    }

    private void L(j jVar, k.d dVar) {
        int i3;
        b bVar;
        j jVar2 = jVar;
        String str = (String) jVar2.a("path");
        Boolean bool = (Boolean) jVar2.a("readOnly");
        boolean A = A(str);
        boolean z3 = !Boolean.FALSE.equals(jVar2.a("singleInstance")) && !A;
        if (z3) {
            synchronized (f3204g) {
                if (c.c(f3203f)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f3200c.keySet());
                }
                Integer num = f3200c.get(str);
                if (!(num == null || (bVar = f3210m.get(num)) == null)) {
                    if (bVar.f3197f.isOpen()) {
                        if (c.c(f3203f)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.e());
                            sb.append("re-opened single instance ");
                            sb.append(bVar.f3198g ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.a(B(num.intValue(), true, bVar.f3198g));
                        return;
                    } else if (c.c(f3203f)) {
                        Log.d("Sqflite", bVar.e() + "single instance database of " + str + " not opened");
                    }
                }
                k.d dVar2 = dVar;
            }
        } else {
            k.d dVar3 = dVar;
        }
        Object obj = f3204g;
        synchronized (obj) {
            i3 = f3207j + 1;
            f3207j = i3;
        }
        b bVar2 = new b(this.f3211a, str, i3, z3, f3203f);
        synchronized (obj) {
            if (f3209l == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f3202e);
                f3208k = handlerThread;
                handlerThread.start();
                f3209l = new Handler(f3208k.getLooper());
                if (c.b(bVar2.f3195d)) {
                    Log.d("Sqflite", bVar2.e() + "starting thread" + f3208k + " priority " + f3202e);
                }
            }
            if (c.b(bVar2.f3195d)) {
                Log.d("Sqflite", bVar2.e() + "opened " + i3 + " " + str);
            }
            g gVar = r1;
            g gVar2 = new g(A, str, dVar, bool, bVar2, jVar, z3, i3);
            f3209l.post(gVar);
        }
    }

    private void N(j jVar, k.d dVar) {
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            f3209l.post(new a(jVar, dVar, w3));
        }
    }

    private void O(j jVar, k.d dVar) {
        b w3 = w(jVar, dVar);
        if (w3 != null) {
            f3209l.post(new f(jVar, dVar, w3));
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r5 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        r5 = new java.util.ArrayList();
        r6 = new java.util.HashMap();
        r7 = r0.getColumnCount();
        r6.put("columns", java.util.Arrays.asList(r0.getColumnNames()));
        r6.put("rows", r5);
        r11 = r6;
        r6 = r5;
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r6.add(o(r0, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (r5 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        r5 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r14.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0042, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(y0.b r13, a1.f r14) {
        /*
            r12 = this;
            y0.e r0 = r14.d()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r13.f3195d
            boolean r2 = y0.c.b(r2)
            java.lang.String r3 = "Sqflite"
            if (r2 == 0) goto L_0x0029
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r13.e()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L_0x0029:
            boolean r2 = f3201d
            r4 = 0
            r5 = 0
            android.database.sqlite.SQLiteDatabase r6 = r13.d()     // Catch:{ Exception -> 0x00be }
            y0.d$c r7 = new y0.d$c     // Catch:{ Exception -> 0x00be }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00be }
            java.lang.String r0 = r0.c()     // Catch:{ Exception -> 0x00be }
            java.lang.String[] r8 = y0.a.f3190a     // Catch:{ Exception -> 0x00be }
            android.database.Cursor r0 = r6.rawQueryWithFactory(r7, r0, r8, r5)     // Catch:{ Exception -> 0x00be }
            r6 = r5
            r7 = 0
        L_0x0042:
            boolean r8 = r0.moveToNext()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            if (r8 == 0) goto L_0x00a1
            if (r2 == 0) goto L_0x0074
            java.util.Map r8 = p(r0)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            int r9 = r13.f3195d     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            boolean r9 = y0.c.b(r9)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            if (r9 == 0) goto L_0x0070
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r9.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r10 = r13.e()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r9.append(r10)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r10 = Q(r8)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r9.append(r10)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            android.util.Log.d(r3, r9)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
        L_0x0070:
            r1.add(r8)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            goto L_0x0042
        L_0x0074:
            if (r5 != 0) goto L_0x0099
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r5.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r6.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            int r7 = r0.getColumnCount()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r8 = "columns"
            java.lang.String[] r9 = r0.getColumnNames()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r6.put(r8, r9)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r8 = "rows"
            r6.put(r8, r5)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r11 = r6
            r6 = r5
            r5 = r11
        L_0x0099:
            java.util.List r8 = o(r0, r7)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r6.add(r8)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            goto L_0x0042
        L_0x00a1:
            if (r2 == 0) goto L_0x00a7
            r14.a(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            goto L_0x00b1
        L_0x00a7:
            if (r5 != 0) goto L_0x00ae
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r5.<init>()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
        L_0x00ae:
            r14.a(r5)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
        L_0x00b1:
            r13 = 1
            r0.close()
            return r13
        L_0x00b6:
            r13 = move-exception
            r5 = r0
            goto L_0x00c8
        L_0x00b9:
            r1 = move-exception
            r5 = r0
            goto L_0x00bf
        L_0x00bc:
            r13 = move-exception
            goto L_0x00c8
        L_0x00be:
            r1 = move-exception
        L_0x00bf:
            r12.y(r1, r14, r13)     // Catch:{ all -> 0x00bc }
            if (r5 == 0) goto L_0x00c7
            r5.close()
        L_0x00c7:
            return r4
        L_0x00c8:
            if (r5 == 0) goto L_0x00cd
            r5.close()
        L_0x00cd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.P(y0.b, a1.f):boolean");
    }

    private static String Q(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? u((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : (byte[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList.toString();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean R(y0.b r8, a1.f r9) {
        /*
            r7 = this;
            boolean r0 = r7.t(r8, r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r9.e()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r9.a(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r8.g()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0066
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 <= 0) goto L_0x0066
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0066
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r5 = r8.f3195d     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r5 = y0.c.b(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r8.e()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r9.a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r0.close()
            return r2
        L_0x0060:
            r8 = move-exception
            r3 = r0
            goto L_0x0093
        L_0x0063:
            r2 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r8.e()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r9.a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 == 0) goto L_0x0086
            r0.close()
        L_0x0086:
            return r2
        L_0x0087:
            r8 = move-exception
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            r7.y(r2, r9, r8)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            return r1
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r3.close()
        L_0x0098:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.R(y0.b, a1.f):boolean");
    }

    /* access modifiers changed from: private */
    public void n(b bVar) {
        try {
            if (c.b(bVar.f3195d)) {
                Log.d("Sqflite", bVar.e() + "closing database " + f3208k);
            }
            bVar.b();
        } catch (Exception e4) {
            Log.e("Sqflite", "error " + e4 + " while closing database " + f3207j);
        }
        synchronized (f3204g) {
            if (f3210m.isEmpty() && f3209l != null) {
                if (c.b(bVar.f3195d)) {
                    Log.d("Sqflite", bVar.e() + "stopping thread" + f3208k);
                }
                f3208k.quit();
                f3208k = null;
                f3209l = null;
            }
        }
    }

    private static List<Object> o(Cursor cursor, int i3) {
        String str;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            Object q3 = q(cursor, i4);
            if (z0.a.f3266c) {
                String str2 = null;
                if (q3 != null) {
                    if (q3.getClass().isArray()) {
                        str2 = "array(" + q3.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = q3.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i4);
                sb.append(" ");
                sb.append(cursor.getType(i4));
                sb.append(": ");
                sb.append(q3);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(q3);
        }
        return arrayList;
    }

    private static Map<String, Object> p(Cursor cursor) {
        Object obj;
        String str;
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (z0.a.f3266c) {
                Log.d("Sqflite", "column " + i3 + " " + cursor.getType(i3));
            }
            int type = cursor.getType(i3);
            if (type == 0) {
                str = columnNames[i3];
                obj = null;
            } else if (type == 1) {
                str = columnNames[i3];
                obj = Long.valueOf(cursor.getLong(i3));
            } else if (type == 2) {
                str = columnNames[i3];
                obj = Double.valueOf(cursor.getDouble(i3));
            } else if (type != 3) {
                if (type == 4) {
                    hashMap.put(columnNames[i3], cursor.getBlob(i3));
                }
            } else {
                str = columnNames[i3];
                obj = cursor.getString(i3);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    private static Object q(Cursor cursor, int i3) {
        int type = cursor.getType(i3);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i3));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i3));
        }
        if (type == 3) {
            return cursor.getString(i3);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i3);
    }

    /* access modifiers changed from: private */
    public boolean r(b bVar, a1.f fVar) {
        if (!t(bVar, fVar)) {
            return false;
        }
        fVar.a((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public b s(b bVar, j jVar, k.d dVar) {
        if (t(bVar, new a1.d(dVar, x(jVar), (Boolean) jVar.a("inTransaction")))) {
            return bVar;
        }
        return null;
    }

    private boolean t(b bVar, a1.f fVar) {
        e d4 = fVar.d();
        if (c.b(bVar.f3195d)) {
            Log.d("Sqflite", bVar.e() + d4);
        }
        Boolean f4 = fVar.f();
        try {
            bVar.g().execSQL(d4.c(), d4.d());
            if (Boolean.TRUE.equals(f4)) {
                bVar.f3198g = true;
            }
            if (Boolean.FALSE.equals(f4)) {
                bVar.f3198g = false;
            }
            return true;
        } catch (Exception e4) {
            y(e4, fVar, bVar);
            if (Boolean.FALSE.equals(f4)) {
                bVar.f3198g = false;
            }
            return false;
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(f4)) {
                bVar.f3198g = false;
            }
            throw th;
        }
    }

    private static Map<String, Object> u(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            hashMap.put(Q(next.getKey()), value instanceof Map ? u((Map) value) : Q(value));
        }
        return hashMap;
    }

    private b v(int i3) {
        return f3210m.get(Integer.valueOf(i3));
    }

    private b w(j jVar, k.d dVar) {
        int intValue = ((Integer) jVar.a("id")).intValue();
        b v3 = v(intValue);
        if (v3 != null) {
            return v3;
        }
        dVar.b("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    private e x(j jVar) {
        return new e((String) jVar.a("sql"), (List) jVar.a("arguments"));
    }

    /* access modifiers changed from: private */
    public void y(Exception exc, a1.f fVar, b bVar) {
        String message;
        Map<String, Object> a4;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + bVar.f3193b;
            a4 = null;
        } else {
            boolean z3 = exc instanceof SQLException;
            message = exc.getMessage();
            a4 = a1.h.a(fVar);
        }
        fVar.b("sqlite_error", message, a4);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean z(y0.b r10, a1.f r11) {
        /*
            r9 = this;
            boolean r0 = r9.t(r10, r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r11.e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r11.a(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.g()     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0099 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0099 }
            if (r5 != 0) goto L_0x0067
            int r5 = r10.f3195d     // Catch:{ Exception -> 0x0099 }
            boolean r5 = y0.c.b(r5)     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r10.e()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0099 }
        L_0x0060:
            r11.a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0067:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            int r2 = r10.f3195d     // Catch:{ Exception -> 0x0099 }
            boolean r2 = y0.c.b(r2)     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = r10.e()     // Catch:{ Exception -> 0x0099 }
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            r2.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0099 }
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0099 }
            r11.a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0099:
            r2 = move-exception
            goto L_0x00c2
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r10.e()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r11.a(r2)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r10 = move-exception
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c2:
            r9.y(r2, r11, r10)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            r10 = move-exception
            r2 = r0
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.z(y0.b, a1.f):boolean");
    }

    /* access modifiers changed from: package-private */
    public void J(j jVar, k.d dVar) {
        if (f3206i == null) {
            f3206i = this.f3211a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f3206i);
    }

    /* access modifiers changed from: package-private */
    public void M(j jVar, k.d dVar) {
        Object a4 = jVar.a("queryAsMapList");
        if (a4 != null) {
            f3201d = Boolean.TRUE.equals(a4);
        }
        Object a5 = jVar.a("androidThreadPriority");
        if (a5 != null) {
            f3202e = ((Integer) a5).intValue();
        }
        Integer a6 = c.a(jVar);
        if (a6 != null) {
            f3203f = a6.intValue();
        }
        dVar.a((Object) null);
    }

    public void a(j jVar, k.d dVar) {
        String str = jVar.f2578a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c4 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c4 = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c4 = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c4 = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c4 = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c4 = 8;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c4 = 9;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c4 = 10;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c4 = 12;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                I(jVar, dVar);
                return;
            case 1:
                E(jVar, dVar);
                return;
            case 2:
                M(jVar, dVar);
                return;
            case 3:
                K(jVar, dVar);
                return;
            case 4:
                O(jVar, dVar);
                return;
            case R.styleable.SplitPairRule_splitMinWidth:
                H(jVar, dVar);
                return;
            case R.styleable.SplitPairRule_splitRatio:
                G(jVar, dVar);
                return;
            case 7:
                L(jVar, dVar);
                return;
            case 8:
                D(jVar, dVar);
                return;
            case 9:
                F(jVar, dVar);
                return;
            case 10:
                N(jVar, dVar);
                return;
            case 11:
                dVar.a("Android " + Build.VERSION.RELEASE);
                return;
            case 12:
                J(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public void f(a.b bVar) {
        this.f3211a = null;
        this.f3212b.e((k.c) null);
        this.f3212b = null;
    }

    public void h(a.b bVar) {
        C(bVar.a(), bVar.b());
    }
}
