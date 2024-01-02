package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o1.a;
import o1.i;

public final /* synthetic */ class p {

    class a implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1871b;

        a(Map map, a.e eVar) {
            this.f1870a = map;
            this.f1871b = eVar;
        }

        public void b(Throwable th) {
            this.f1870a.put("error", l.b(th));
            this.f1871b.a(this.f1870a);
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f1870a.put("result", (Object) null);
            this.f1871b.a(this.f1870a);
        }
    }

    class b implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1873b;

        b(Map map, a.e eVar) {
            this.f1872a = map;
            this.f1873b = eVar;
        }

        public void b(Throwable th) {
            this.f1872a.put("error", l.b(th));
            this.f1873b.a(this.f1872a);
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f1872a.put("result", (Object) null);
            this.f1873b.a(this.f1872a);
        }
    }

    class c implements l.h<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1875b;

        c(Map map, a.e eVar) {
            this.f1874a = map;
            this.f1875b = eVar;
        }

        public void b(Throwable th) {
            this.f1874a.put("error", l.b(th));
            this.f1875b.a(this.f1874a);
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f1874a.put("result", (Object) null);
            this.f1875b.a(this.f1874a);
        }
    }

    public static i<Object> a() {
        return l.c.f1829d;
    }

    public static /* synthetic */ void b(l.b bVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    bVar.d(str, bool, new a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void c(l.b bVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    bVar.e(str, bool, new b(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void d(l.b bVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str != null) {
                bVar.g(str, new c(hashMap, eVar));
                return;
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static void e(o1.c cVar, l.b bVar) {
        o1.a aVar = new o1.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
        if (bVar != null) {
            aVar.e(new m(bVar));
        } else {
            aVar.e((a.d) null);
        }
        o1.a aVar2 = new o1.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
        if (bVar != null) {
            aVar2.e(new n(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        o1.a aVar3 = new o1.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
        if (bVar != null) {
            aVar3.e(new o(bVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
