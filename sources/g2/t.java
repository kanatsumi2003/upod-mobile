package g2;

import android.net.Uri;
import android.util.Base64;
import androidx.window.R;
import com.google.firebase.storage.d;
import com.google.firebase.storage.h;
import com.google.firebase.storage.j;
import com.google.firebase.storage.k;
import f0.l;
import f0.n;
import g1.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o1.c;
import o1.k;

public class t implements FlutterFirebasePlugin, k.c, a {

    /* renamed from: a  reason: collision with root package name */
    private k f1369a;

    /* access modifiers changed from: private */
    public static /* synthetic */ void A(l lVar) {
        h0.o();
        lVar.c(null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void C(k.d dVar, f0.k kVar) {
        if (kVar.n()) {
            dVar.a(kVar.k());
            return;
        }
        Exception j3 = kVar.j();
        dVar.b("firebase_storage", j3 != null ? j3.getMessage() : null, v(j3));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(Map map, l lVar) {
        try {
            n.a(x(map).d());
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(Map map, l lVar) {
        Object obj = map.get("maxSize");
        Objects.requireNonNull(obj);
        Integer num = (Integer) obj;
        try {
            lVar.c((byte[]) n.a(x(map).g((long) num.intValue())));
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(Map map, l lVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("downloadURL", ((Uri) n.a(x(map).h())).toString());
            lVar.c(hashMap);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(Map map, l lVar) {
        try {
            lVar.c(U((com.google.firebase.storage.k) n.a(x(map).j())));
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(Map map, l lVar) {
        f0.k kVar;
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("options");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("maxResults");
        Objects.requireNonNull(obj2);
        int intValue = ((Integer) obj2).intValue();
        if (map2.get("pageToken") != null) {
            Object obj3 = map2.get("pageToken");
            Objects.requireNonNull(obj3);
            kVar = x3.r(intValue, (String) obj3);
        } else {
            kVar = x3.q(intValue);
        }
        try {
            lVar.c(S((h) n.a(kVar)));
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(Map map, l lVar) {
        try {
            lVar.c(S((h) n.a(x(map).s())));
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(Map map, l lVar) {
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("metadata");
        Objects.requireNonNull(obj);
        try {
            lVar.c(U((com.google.firebase.storage.k) n.a(x3.y(T((Map) obj)))));
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K(Map map, l lVar) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r3 = h0.r(((Integer) obj).intValue());
        if (r3 == null) {
            lVar.b(new Exception("Cancel operation was called on a task which does not exist."));
            return;
        }
        try {
            boolean booleanValue = ((Boolean) n.a(r3.n())).booleanValue();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r3.s()));
            }
            lVar.c(hashMap);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void L(Map map, l lVar) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r3 = h0.r(((Integer) obj).intValue());
        if (r3 == null) {
            lVar.b(new Exception("Pause operation was called on a task which does not exist."));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            boolean booleanValue = ((Boolean) n.a(r3.K())).booleanValue();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r3.s()));
            }
            lVar.c(hashMap);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Map map, l lVar) {
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("data");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.N(((Integer) obj2).intValue(), x3, (byte[]) obj, T((Map) map.get("metadata"))).M(this.f1369a);
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(Map map, l lVar) {
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("filePath");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.O(((Integer) obj2).intValue(), x3, Uri.fromFile(new File((String) obj)), T((Map) map.get("metadata"))).M(this.f1369a);
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(Map map, l lVar) {
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("data");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("format");
        Objects.requireNonNull(obj2);
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = map.get("handle");
        Objects.requireNonNull(obj3);
        try {
            h0.N(((Integer) obj3).intValue(), x3, c0((String) obj, intValue), T((Map) map.get("metadata"))).M(this.f1369a);
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void P(Map map, l lVar) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r3 = h0.r(((Integer) obj).intValue());
        if (r3 == null) {
            lVar.b(new Exception("Resume operation was called on a task which does not exist."));
            return;
        }
        try {
            boolean booleanValue = ((Boolean) n.a(r3.L())).booleanValue();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r3.s()));
            }
            lVar.c(hashMap);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q(Map map, l lVar) {
        com.google.firebase.storage.l x3 = x(map);
        Object obj = map.get("filePath");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.q(((Integer) obj2).intValue(), x3, new File((String) obj)).M(this.f1369a);
            lVar.c(null);
        } catch (Exception e4) {
            lVar.b(e4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R(Map map, l lVar) {
        d y3 = y(map);
        Object obj = map.get("host");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("port");
        Objects.requireNonNull(obj2);
        y3.s((String) obj, ((Integer) obj2).intValue());
        lVar.c(null);
    }

    private Map<String, Object> S(h hVar) {
        HashMap hashMap = new HashMap();
        if (hVar.c() != null) {
            hashMap.put("nextPageToken", hVar.c());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.storage.l m3 : hVar.b()) {
            arrayList.add(m3.m());
        }
        for (com.google.firebase.storage.l m4 : hVar.d()) {
            arrayList2.add(m4.m());
        }
        hashMap.put("items", arrayList);
        hashMap.put("prefixes", arrayList2);
        return hashMap;
    }

    private com.google.firebase.storage.k T(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        k.b bVar = new k.b();
        if (map.get("cacheControl") != null) {
            bVar.d((String) map.get("cacheControl"));
        }
        if (map.get("contentDisposition") != null) {
            bVar.e((String) map.get("contentDisposition"));
        }
        if (map.get("contentEncoding") != null) {
            bVar.f((String) map.get("contentEncoding"));
        }
        if (map.get("contentLanguage") != null) {
            bVar.g((String) map.get("contentLanguage"));
        }
        if (map.get("contentType") != null) {
            bVar.h((String) map.get("contentType"));
        }
        if (map.get("customMetadata") != null) {
            Object obj = map.get("customMetadata");
            Objects.requireNonNull(obj);
            Map map2 = (Map) obj;
            for (String str : map2.keySet()) {
                bVar.i(str, (String) map2.get(str));
            }
        }
        return bVar.a();
    }

    static Map<String, Object> U(com.google.firebase.storage.k kVar) {
        String str;
        if (kVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (kVar.D() != null) {
            hashMap.put("name", kVar.D());
        }
        if (kVar.r() != null) {
            hashMap.put("bucket", kVar.r());
        }
        if (kVar.A() != null) {
            hashMap.put("generation", kVar.A());
        }
        if (kVar.C() != null) {
            hashMap.put("metadataGeneration", kVar.C());
        }
        hashMap.put("fullPath", kVar.E());
        hashMap.put("size", Long.valueOf(kVar.F()));
        hashMap.put("creationTimeMillis", Long.valueOf(kVar.x()));
        hashMap.put("updatedTimeMillis", Long.valueOf(kVar.G()));
        if (kVar.B() != null) {
            hashMap.put("md5Hash", kVar.B());
        }
        if (kVar.s() != null) {
            hashMap.put("cacheControl", kVar.s());
        }
        if (kVar.t() != null) {
            hashMap.put("contentDisposition", kVar.t());
        }
        if (kVar.u() != null) {
            hashMap.put("contentEncoding", kVar.u());
        }
        if (kVar.v() != null) {
            hashMap.put("contentLanguage", kVar.v());
        }
        if (kVar.w() != null) {
            hashMap.put("contentType", kVar.w());
        }
        HashMap hashMap2 = new HashMap();
        for (String next : kVar.z()) {
            if (kVar.y(next) == null) {
                str = "";
            } else {
                str = kVar.y(next);
                Objects.requireNonNull(str);
            }
            hashMap2.put(next, str);
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    private f0.k<Void> V(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, map, lVar));
        return lVar.a();
    }

    private f0.k<byte[]> W(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new r(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> X(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> Y(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> Z(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> a0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> b0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, map, lVar));
        return lVar.a();
    }

    private byte[] c0(String str, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = 0;
        } else if (i3 != 2) {
            return null;
        } else {
            i4 = 8;
        }
        return Base64.decode(str, i4);
    }

    private f0.k<Map<String, Object>> d0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o(map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> e0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(map, lVar));
        return lVar.a();
    }

    private f0.k<Void> f0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Void> g0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new p(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Void> h0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Map<String, Object>> i0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(map, lVar));
        return lVar.a();
    }

    private f0.k<Void> j0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new n(this, map, lVar));
        return lVar.a();
    }

    private f0.k<Void> k0(Map<String, Object> map) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, map, lVar));
        return lVar.a();
    }

    static Map<String, String> v(Exception exc) {
        a aVar;
        HashMap hashMap = new HashMap();
        if (exc instanceof j) {
            aVar = new a(exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof j)) {
            aVar = null;
        } else {
            j jVar = (j) exc.getCause();
            Throwable cause = exc.getCause().getCause();
            Throwable cause2 = exc.getCause();
            if (cause != null) {
                cause2 = cause2.getCause();
            }
            aVar = new a(jVar, cause2);
        }
        if (aVar != null) {
            hashMap.put("code", aVar.a());
            hashMap.put("message", aVar.getMessage());
        }
        return hashMap;
    }

    private Long w(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : 0);
    }

    private com.google.firebase.storage.l x(Map<String, Object> map) {
        Object obj = map.get("path");
        Objects.requireNonNull(obj);
        return y(map).o((String) obj);
    }

    private d y(Map<String, Object> map) {
        d dVar;
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        g0.d o3 = g0.d.o((String) obj);
        String str = (String) map.get("bucket");
        if (str == null) {
            dVar = d.f(o3);
        } else {
            dVar = d.g(o3, "gs://" + str);
        }
        Object obj2 = map.get("maxOperationRetryTime");
        if (obj2 != null) {
            dVar.q(w(obj2).longValue());
        }
        Object obj3 = map.get("maxDownloadRetryTime");
        if (obj3 != null) {
            dVar.p(w(obj3).longValue());
        }
        Object obj4 = map.get("maxUploadRetryTime");
        if (obj4 != null) {
            dVar.r(w(obj4).longValue());
        }
        return dVar;
    }

    private void z(c cVar) {
        o1.k kVar = new o1.k(cVar, "plugins.flutter.io/firebase_storage");
        this.f1369a = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
    }

    public void a(o1.j jVar, k.d dVar) {
        f0.k kVar;
        String str = jVar.f2578a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1816321956:
                if (str.equals("Task#startPutString")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1707714184:
                if (str.equals("Task#writeToFile")) {
                    c4 = 1;
                    break;
                }
                break;
            case -598660204:
                if (str.equals("Storage#useEmulator")) {
                    c4 = 2;
                    break;
                }
                break;
            case -487339152:
                if (str.equals("Reference#updateMetadata")) {
                    c4 = 3;
                    break;
                }
                break;
            case 524582600:
                if (str.equals("Reference#getData")) {
                    c4 = 4;
                    break;
                }
                break;
            case 762112515:
                if (str.equals("Reference#delete")) {
                    c4 = 5;
                    break;
                }
                break;
            case 782125771:
                if (str.equals("Reference#listAll")) {
                    c4 = 6;
                    break;
                }
                break;
            case 1007699637:
                if (str.equals("Task#startPutData")) {
                    c4 = 7;
                    break;
                }
                break;
            case 1007766663:
                if (str.equals("Task#startPutFile")) {
                    c4 = 8;
                    break;
                }
                break;
            case 1337346806:
                if (str.equals("Reference#list")) {
                    c4 = 9;
                    break;
                }
                break;
            case 1384794957:
                if (str.equals("Reference#getMetadata")) {
                    c4 = 10;
                    break;
                }
                break;
            case 1521380120:
                if (str.equals("Task#cancel")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1536042729:
                if (str.equals("Reference#getDownloadURL")) {
                    c4 = 12;
                    break;
                }
                break;
            case 1585110424:
                if (str.equals("Task#pause")) {
                    c4 = 13;
                    break;
                }
                break;
            case 1954677963:
                if (str.equals("Task#resume")) {
                    c4 = 14;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                kVar = h0((Map) jVar.b());
                break;
            case 1:
                kVar = j0((Map) jVar.b());
                break;
            case 2:
                kVar = k0((Map) jVar.b());
                break;
            case 3:
                kVar = b0((Map) jVar.b());
                break;
            case 4:
                kVar = W((Map) jVar.b());
                break;
            case R.styleable.SplitPairRule_splitMinWidth:
                kVar = V((Map) jVar.b());
                break;
            case R.styleable.SplitPairRule_splitRatio:
                kVar = a0((Map) jVar.b());
                break;
            case 7:
                kVar = f0((Map) jVar.b());
                break;
            case 8:
                kVar = g0((Map) jVar.b());
                break;
            case 9:
                kVar = Z((Map) jVar.b());
                break;
            case 10:
                kVar = Y((Map) jVar.b());
                break;
            case 11:
                kVar = d0((Map) jVar.b());
                break;
            case 12:
                kVar = X((Map) jVar.b());
                break;
            case 13:
                kVar = e0((Map) jVar.b());
                break;
            case 14:
                kVar = i0((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        kVar.c(new l(dVar));
    }

    public f0.k<Void> didReinitializeFirebaseCore() {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(lVar));
        return lVar.a();
    }

    public void f(a.b bVar) {
        h0.o();
        this.f1369a.e((k.c) null);
        this.f1369a = null;
    }

    public f0.k<Map<String, Object>> getPluginConstantsForFirebaseApp(g0.d dVar) {
        l lVar = new l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(lVar));
        return lVar.a();
    }

    public void h(a.b bVar) {
        z(bVar.b());
    }
}
