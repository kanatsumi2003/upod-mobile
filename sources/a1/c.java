package a1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.k;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f16a;

    /* renamed from: b  reason: collision with root package name */
    final a f17b = new a();

    /* renamed from: c  reason: collision with root package name */
    final boolean f18c;

    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        Object f19a;

        /* renamed from: b  reason: collision with root package name */
        String f20b;

        /* renamed from: c  reason: collision with root package name */
        String f21c;

        /* renamed from: d  reason: collision with root package name */
        Object f22d;

        public a() {
        }

        public void a(Object obj) {
            this.f19a = obj;
        }

        public void b(String str, String str2, Object obj) {
            this.f20b = str;
            this.f21c = str2;
            this.f22d = obj;
        }
    }

    public c(Map<String, Object> map, boolean z3) {
        this.f16a = map;
        this.f18c = z3;
    }

    public <T> T c(String str) {
        return this.f16a.get(str);
    }

    public boolean e() {
        return this.f18c;
    }

    public g k() {
        return this.f17b;
    }

    public String l() {
        return (String) this.f16a.get("method");
    }

    public Map<String, Object> m() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f17b.f20b);
        hashMap2.put("message", this.f17b.f21c);
        hashMap2.put("data", this.f17b.f22d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f17b.f19a);
        return hashMap;
    }

    public void o(k.d dVar) {
        a aVar = this.f17b;
        dVar.b(aVar.f20b, aVar.f21c, aVar.f22d);
    }

    public void p(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(m());
        }
    }

    public void q(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(n());
        }
    }
}
