package i2;

import i2.h;
import java.util.ArrayList;
import java.util.HashMap;
import o1.a;
import o1.c;
import o1.i;

public final /* synthetic */ class g {
    public static i<Object> a() {
        return h.b.f1401d;
    }

    public static /* synthetic */ void b(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.a());
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void c(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.e());
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void d(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.b());
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void e(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.g());
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void f(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.c());
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void g(h.a aVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            h.c cVar = arrayList.get(0) == null ? null : h.c.values()[((Integer) arrayList.get(0)).intValue()];
            if (cVar != null) {
                hashMap.put("result", aVar.d(cVar));
                eVar.a(hashMap);
                return;
            }
            throw new NullPointerException("directoryArg unexpectedly null.");
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", h.b(e4));
        }
    }

    public static void h(c cVar, h.a aVar) {
        a aVar2 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.b());
        if (aVar != null) {
            aVar2.e(new a(aVar));
        } else {
            aVar2.e((a.d) null);
        }
        a aVar3 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.b());
        if (aVar != null) {
            aVar3.e(new b(aVar));
        } else {
            aVar3.e((a.d) null);
        }
        a aVar4 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.b());
        if (aVar != null) {
            aVar4.e(new c(aVar));
        } else {
            aVar4.e((a.d) null);
        }
        a aVar5 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.b());
        if (aVar != null) {
            aVar5.e(new d(aVar));
        } else {
            aVar5.e((a.d) null);
        }
        a aVar6 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.b());
        if (aVar != null) {
            aVar6.e(new e(aVar));
        } else {
            aVar6.e((a.d) null);
        }
        a aVar7 = new a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.b());
        if (aVar != null) {
            aVar7.e(new f(aVar));
        } else {
            aVar7.e((a.d) null);
        }
    }
}
