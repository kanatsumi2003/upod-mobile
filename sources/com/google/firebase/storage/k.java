package com.google.firebase.storage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import t.o;
import u0.i;

public class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f943a;

    /* renamed from: b  reason: collision with root package name */
    private d f944b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public l f945c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f946d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f947e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c<String> f948f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f949g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f950h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f951i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public long f952j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f953k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public c<String> f954l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public c<String> f955m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public c<String> f956n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public c<String> f957o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public c<Map<String, String>> f958p;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        k f959a;

        /* renamed from: b  reason: collision with root package name */
        boolean f960b;

        public b() {
            this.f959a = new k();
        }

        b(JSONObject jSONObject) {
            this.f959a = new k();
            if (jSONObject != null) {
                c(jSONObject);
                this.f960b = true;
            }
        }

        b(JSONObject jSONObject, l lVar) {
            this(jSONObject);
            l unused = this.f959a.f945c = lVar;
        }

        private String b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        private void c(JSONObject jSONObject) {
            String unused = this.f959a.f947e = jSONObject.optString("generation");
            String unused2 = this.f959a.f943a = jSONObject.optString("name");
            String unused3 = this.f959a.f946d = jSONObject.optString("bucket");
            String unused4 = this.f959a.f949g = jSONObject.optString("metageneration");
            String unused5 = this.f959a.f950h = jSONObject.optString("timeCreated");
            String unused6 = this.f959a.f951i = jSONObject.optString("updated");
            long unused7 = this.f959a.f952j = jSONObject.optLong("size");
            String unused8 = this.f959a.f953k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    i(next, jSONObject2.getString(next));
                }
            }
            String b4 = b(jSONObject, "contentType");
            if (b4 != null) {
                h(b4);
            }
            String b5 = b(jSONObject, "cacheControl");
            if (b5 != null) {
                d(b5);
            }
            String b6 = b(jSONObject, "contentDisposition");
            if (b6 != null) {
                e(b6);
            }
            String b7 = b(jSONObject, "contentEncoding");
            if (b7 != null) {
                f(b7);
            }
            String b8 = b(jSONObject, "contentLanguage");
            if (b8 != null) {
                g(b8);
            }
        }

        public k a() {
            return new k(this.f960b);
        }

        public b d(String str) {
            c unused = this.f959a.f954l = c.d(str);
            return this;
        }

        public b e(String str) {
            c unused = this.f959a.f955m = c.d(str);
            return this;
        }

        public b f(String str) {
            c unused = this.f959a.f956n = c.d(str);
            return this;
        }

        public b g(String str) {
            c unused = this.f959a.f957o = c.d(str);
            return this;
        }

        public b h(String str) {
            c unused = this.f959a.f948f = c.d(str);
            return this;
        }

        public b i(String str, String str2) {
            if (!this.f959a.f958p.b()) {
                c unused = this.f959a.f958p = c.d(new HashMap());
            }
            ((Map) this.f959a.f958p.a()).put(str, str2);
            return this;
        }
    }

    private static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f961a;

        /* renamed from: b  reason: collision with root package name */
        private final T f962b;

        c(T t3, boolean z3) {
            this.f961a = z3;
            this.f962b = t3;
        }

        static <T> c<T> c(T t3) {
            return new c<>(t3, false);
        }

        static <T> c<T> d(T t3) {
            return new c<>(t3, true);
        }

        /* access modifiers changed from: package-private */
        public T a() {
            return this.f962b;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f961a;
        }
    }

    public k() {
        this.f943a = null;
        this.f944b = null;
        this.f945c = null;
        this.f946d = null;
        this.f947e = null;
        this.f948f = c.c("");
        this.f949g = null;
        this.f950h = null;
        this.f951i = null;
        this.f953k = null;
        this.f954l = c.c("");
        this.f955m = c.c("");
        this.f956n = c.c("");
        this.f957o = c.c("");
        this.f958p = c.c(Collections.emptyMap());
    }

    private k(k kVar, boolean z3) {
        this.f943a = null;
        this.f944b = null;
        this.f945c = null;
        this.f946d = null;
        this.f947e = null;
        this.f948f = c.c("");
        this.f949g = null;
        this.f950h = null;
        this.f951i = null;
        this.f953k = null;
        this.f954l = c.c("");
        this.f955m = c.c("");
        this.f956n = c.c("");
        this.f957o = c.c("");
        this.f958p = c.c(Collections.emptyMap());
        o.h(kVar);
        this.f943a = kVar.f943a;
        this.f944b = kVar.f944b;
        this.f945c = kVar.f945c;
        this.f946d = kVar.f946d;
        this.f948f = kVar.f948f;
        this.f954l = kVar.f954l;
        this.f955m = kVar.f955m;
        this.f956n = kVar.f956n;
        this.f957o = kVar.f957o;
        this.f958p = kVar.f958p;
        if (z3) {
            this.f953k = kVar.f953k;
            this.f952j = kVar.f952j;
            this.f951i = kVar.f951i;
            this.f950h = kVar.f950h;
            this.f949g = kVar.f949g;
            this.f947e = kVar.f947e;
        }
    }

    public String A() {
        return this.f947e;
    }

    public String B() {
        return this.f953k;
    }

    public String C() {
        return this.f949g;
    }

    public String D() {
        String E = E();
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        int lastIndexOf = E.lastIndexOf(47);
        return lastIndexOf != -1 ? E.substring(lastIndexOf + 1) : E;
    }

    public String E() {
        String str = this.f943a;
        return str != null ? str : "";
    }

    public long F() {
        return this.f952j;
    }

    public long G() {
        return i.e(this.f951i);
    }

    /* access modifiers changed from: package-private */
    public JSONObject q() {
        HashMap hashMap = new HashMap();
        if (this.f948f.b()) {
            hashMap.put("contentType", w());
        }
        if (this.f958p.b()) {
            hashMap.put("metadata", new JSONObject(this.f958p.a()));
        }
        if (this.f954l.b()) {
            hashMap.put("cacheControl", s());
        }
        if (this.f955m.b()) {
            hashMap.put("contentDisposition", t());
        }
        if (this.f956n.b()) {
            hashMap.put("contentEncoding", u());
        }
        if (this.f957o.b()) {
            hashMap.put("contentLanguage", v());
        }
        return new JSONObject(hashMap);
    }

    public String r() {
        return this.f946d;
    }

    public String s() {
        return this.f954l.a();
    }

    public String t() {
        return this.f955m.a();
    }

    public String u() {
        return this.f956n.a();
    }

    public String v() {
        return this.f957o.a();
    }

    public String w() {
        return this.f948f.a();
    }

    public long x() {
        return i.e(this.f950h);
    }

    public String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) this.f958p.a().get(str);
    }

    public Set<String> z() {
        return this.f958p.a().keySet();
    }
}
