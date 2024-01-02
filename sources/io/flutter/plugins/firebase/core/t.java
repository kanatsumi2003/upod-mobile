package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.a;
import o1.i;

public final /* synthetic */ class t {

    class a implements l.h<l.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1880b;

        a(Map map, a.e eVar) {
            this.f1879a = map;
            this.f1880b = eVar;
        }

        public void b(Throwable th) {
            this.f1879a.put("error", l.b(th));
            this.f1880b.a(this.f1879a);
        }

        /* renamed from: c */
        public void a(l.g gVar) {
            this.f1879a.put("result", gVar);
            this.f1880b.a(this.f1879a);
        }
    }

    class b implements l.h<List<l.g>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1882b;

        b(Map map, a.e eVar) {
            this.f1881a = map;
            this.f1882b = eVar;
        }

        public void b(Throwable th) {
            this.f1881a.put("error", l.b(th));
            this.f1882b.a(this.f1881a);
        }

        /* renamed from: c */
        public void a(List<l.g> list) {
            this.f1881a.put("result", list);
            this.f1882b.a(this.f1881a);
        }
    }

    class c implements l.h<l.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f1883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f1884b;

        c(Map map, a.e eVar) {
            this.f1883a = map;
            this.f1884b = eVar;
        }

        public void b(Throwable th) {
            this.f1883a.put("error", l.b(th));
            this.f1884b.a(this.f1883a);
        }

        /* renamed from: c */
        public void a(l.f fVar) {
            this.f1883a.put("result", fVar);
            this.f1884b.a(this.f1883a);
        }
    }

    public static i<Object> a() {
        return l.e.f1830d;
    }

    public static /* synthetic */ void b(l.d dVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str != null) {
                l.f fVar = (l.f) arrayList.get(1);
                if (fVar != null) {
                    dVar.a(str, fVar, new a(hashMap, eVar));
                    return;
                }
                throw new NullPointerException("initializeAppRequestArg unexpectedly null.");
            }
            throw new NullPointerException("appNameArg unexpectedly null.");
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void c(l.d dVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            dVar.b(new b(hashMap, eVar));
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void d(l.d dVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            dVar.c(new c(hashMap, eVar));
        } catch (Error | RuntimeException e4) {
            hashMap.put("error", l.b(e4));
            eVar.a(hashMap);
        }
    }

    public static void e(o1.c cVar, l.d dVar) {
        o1.a aVar = new o1.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
        if (dVar != null) {
            aVar.e(new q(dVar));
        } else {
            aVar.e((a.d) null);
        }
        o1.a aVar2 = new o1.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
        if (dVar != null) {
            aVar2.e(new r(dVar));
        } else {
            aVar2.e((a.d) null);
        }
        o1.a aVar3 = new o1.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
        if (dVar != null) {
            aVar3.e(new s(dVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
