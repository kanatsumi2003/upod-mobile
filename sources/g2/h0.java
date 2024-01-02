package g2;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.storage.a0;
import com.google.firebase.storage.c;
import com.google.firebase.storage.k;
import com.google.firebase.storage.l;
import com.google.firebase.storage.s;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class h0 {

    /* renamed from: l  reason: collision with root package name */
    static final SparseArray<h0> f1325l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private static final Executor f1326m = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    private final a f1327a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1328b;

    /* renamed from: c  reason: collision with root package name */
    private final l f1329c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f1330d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f1331e;

    /* renamed from: f  reason: collision with root package name */
    private final k f1332f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f1333g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Object f1334h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Object f1335i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private s<?> f1336j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f1337k = Boolean.FALSE;

    private enum a {
        FILE,
        BYTES,
        DOWNLOAD
    }

    private h0(a aVar, int i3, l lVar, byte[] bArr, Uri uri, k kVar) {
        this.f1327a = aVar;
        this.f1328b = i3;
        this.f1329c = lVar;
        this.f1330d = bArr;
        this.f1331e = uri;
        this.f1332f = kVar;
        f1325l.put(i3, this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(o1.k kVar, s.a aVar) {
        kVar.c("Task#onProgress", t(aVar, (Exception) null));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(o1.k kVar, s.a aVar) {
        if (!this.f1337k.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new x(this, kVar, aVar));
            synchronized (this.f1334h) {
                this.f1334h.notifyAll();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(o1.k kVar, s.a aVar) {
        kVar.c("Task#onPaused", t(aVar, (Exception) null));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(o1.k kVar, s.a aVar) {
        if (!this.f1337k.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new w(this, kVar, aVar));
            synchronized (this.f1333g) {
                this.f1333g.notifyAll();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(o1.k kVar, s.a aVar) {
        kVar.c("Task#onSuccess", t(aVar, (Exception) null));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(o1.k kVar, s.a aVar) {
        if (!this.f1337k.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new g0(this, kVar, aVar));
            p();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(o1.k kVar) {
        kVar.c("Task#onCanceled", t((Object) null, (Exception) null));
        p();
    }

    public static Map<String, Object> H(c.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", aVar.b().m());
        hashMap.put("bytesTransferred", Long.valueOf(aVar.c().n() ? aVar.e() : aVar.d()));
        hashMap.put("totalBytes", Long.valueOf(aVar.e()));
        return hashMap;
    }

    static Map<String, Object> I(Object obj) {
        return obj instanceof c.a ? H((c.a) obj) : J((a0.b) obj);
    }

    public static Map<String, Object> J(a0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", bVar.b().m());
        hashMap.put("bytesTransferred", Long.valueOf(bVar.d()));
        hashMap.put("totalBytes", Long.valueOf(bVar.f()));
        if (bVar.e() != null) {
            hashMap.put("metadata", t.U(bVar.e()));
        }
        return hashMap;
    }

    public static h0 N(int i3, l lVar, byte[] bArr, k kVar) {
        return new h0(a.BYTES, i3, lVar, bArr, (Uri) null, kVar);
    }

    public static h0 O(int i3, l lVar, Uri uri, k kVar) {
        return new h0(a.FILE, i3, lVar, (byte[]) null, uri, kVar);
    }

    static void o() {
        synchronized (f1325l) {
            int i3 = 0;
            while (true) {
                SparseArray<h0> sparseArray = f1325l;
                if (i3 < sparseArray.size()) {
                    h0 h0Var = null;
                    try {
                        h0Var = sparseArray.valueAt(i3);
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                    if (h0Var != null) {
                        h0Var.p();
                    }
                    i3++;
                } else {
                    sparseArray.clear();
                }
            }
        }
    }

    public static h0 q(int i3, l lVar, File file) {
        return new h0(a.DOWNLOAD, i3, lVar, (byte[]) null, Uri.fromFile(file), (k) null);
    }

    static h0 r(int i3) {
        h0 h0Var;
        SparseArray<h0> sparseArray = f1325l;
        synchronized (sparseArray) {
            h0Var = sparseArray.get(i3);
        }
        return h0Var;
    }

    private Map<String, Object> t(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("handle", Integer.valueOf(this.f1328b));
        hashMap.put("appName", this.f1329c.o().a().p());
        hashMap.put("bucket", this.f1329c.f());
        if (obj != null) {
            hashMap.put("snapshot", I(obj));
        }
        if (exc != null) {
            hashMap.put("error", t.v(exc));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(f0.l lVar) {
        lVar.c(Boolean.valueOf(this.f1336j.E()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(f0.l lVar) {
        synchronized (this.f1333g) {
            if (!this.f1336j.e0()) {
                lVar.c(Boolean.FALSE);
                return;
            }
            try {
                this.f1333g.wait();
                lVar.c(Boolean.TRUE);
            } catch (InterruptedException unused) {
                lVar.c(Boolean.FALSE);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(f0.l lVar) {
        synchronized (this.f1334h) {
            if (!this.f1336j.h0()) {
                lVar.c(Boolean.FALSE);
                return;
            }
            try {
                this.f1334h.wait();
                lVar.c(Boolean.TRUE);
            } catch (InterruptedException unused) {
                lVar.c(Boolean.FALSE);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(o1.k kVar) {
        if (!this.f1337k.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new f0(this, kVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(o1.k kVar, Exception exc) {
        kVar.c("Task#onFailure", t((Object) null, exc));
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(o1.k kVar, Exception exc) {
        if (!this.f1337k.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new v(this, kVar, exc));
        }
    }

    /* access modifiers changed from: package-private */
    public f0.k<Boolean> K() {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, lVar));
        return lVar.a();
    }

    /* access modifiers changed from: package-private */
    public f0.k<Boolean> L() {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new y(this, lVar));
        return lVar.a();
    }

    /* access modifiers changed from: package-private */
    public void M(o1.k kVar) {
        Uri uri;
        s<?> i3;
        Uri uri2;
        byte[] bArr;
        a aVar = this.f1327a;
        if (aVar == a.BYTES && (bArr = this.f1330d) != null) {
            k kVar2 = this.f1332f;
            i3 = kVar2 == null ? this.f1329c.u(bArr) : this.f1329c.v(bArr, kVar2);
        } else if (aVar == a.FILE && (uri2 = this.f1331e) != null) {
            k kVar3 = this.f1332f;
            i3 = kVar3 == null ? this.f1329c.w(uri2) : this.f1329c.x(uri2, kVar3);
        } else if (aVar != a.DOWNLOAD || (uri = this.f1331e) == null) {
            throw new Exception("Unable to start task. Some arguments have no been initialized.");
        } else {
            i3 = this.f1329c.i(uri);
        }
        this.f1336j = i3;
        s<?> sVar = this.f1336j;
        Executor executor = f1326m;
        sVar.B(executor, new z(this, kVar));
        this.f1336j.A(executor, new a0(this, kVar));
        this.f1336j.h(executor, new b0(this, kVar));
        this.f1336j.b(executor, new c0(this, kVar));
        this.f1336j.f(executor, new d0(this, kVar));
    }

    /* access modifiers changed from: package-private */
    public f0.k<Boolean> n() {
        f0.l lVar = new f0.l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e0(this, lVar));
        return lVar.a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    void p() {
        /*
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.f1337k = r0
            android.util.SparseArray<g2.h0> r0 = f1325l
            monitor-enter(r0)
            com.google.firebase.storage.s<?> r1 = r2.f1336j     // Catch:{ all -> 0x0047 }
            boolean r1 = r1.Q()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0017
            com.google.firebase.storage.s<?> r1 = r2.f1336j     // Catch:{ all -> 0x0047 }
            boolean r1 = r1.R()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x001c
        L_0x0017:
            com.google.firebase.storage.s<?> r1 = r2.f1336j     // Catch:{ all -> 0x0047 }
            r1.E()     // Catch:{ all -> 0x0047 }
        L_0x001c:
            int r1 = r2.f1328b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0021 }
            r0.remove(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0021 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r2.f1335i
            monitor-enter(r1)
            java.lang.Object r0 = r2.f1335i     // Catch:{ all -> 0x0044 }
            r0.notifyAll()     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r2.f1333g
            monitor-enter(r0)
            java.lang.Object r1 = r2.f1333g     // Catch:{ all -> 0x0041 }
            r1.notifyAll()     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r2.f1334h
            monitor-enter(r1)
            java.lang.Object r0 = r2.f1334h     // Catch:{ all -> 0x003e }
            r0.notifyAll()     // Catch:{ all -> 0x003e }
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        L_0x0044:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.h0.p():void");
    }

    public Object s() {
        return this.f1336j.L();
    }
}
