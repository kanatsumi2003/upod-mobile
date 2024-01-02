package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.q;

public class l {

    public interface b {
        void d(String str, Boolean bool, h<Void> hVar);

        void e(String str, Boolean bool, h<Void> hVar);

        void g(String str, h<Void> hVar);
    }

    private static class c extends q {

        /* renamed from: d  reason: collision with root package name */
        public static final c f1829d = new c();

        private c() {
        }
    }

    public interface d {
        void a(String str, f fVar, h<g> hVar);

        void b(h<List<g>> hVar);

        void c(h<f> hVar);
    }

    private static class e extends q {

        /* renamed from: d  reason: collision with root package name */
        public static final e f1830d = new e();

        private e() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b4, ByteBuffer byteBuffer) {
            return b4 != Byte.MIN_VALUE ? b4 != -127 ? super.g(b4, byteBuffer) : g.a((Map) f(byteBuffer)) : f.a((Map) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f4;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f4 = ((f) obj).w();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(129);
                f4 = ((g) obj).f();
            } else {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            p(byteArrayOutputStream, f4);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private String f1831a;

        /* renamed from: b  reason: collision with root package name */
        private String f1832b;

        /* renamed from: c  reason: collision with root package name */
        private String f1833c;

        /* renamed from: d  reason: collision with root package name */
        private String f1834d;

        /* renamed from: e  reason: collision with root package name */
        private String f1835e;

        /* renamed from: f  reason: collision with root package name */
        private String f1836f;

        /* renamed from: g  reason: collision with root package name */
        private String f1837g;

        /* renamed from: h  reason: collision with root package name */
        private String f1838h;

        /* renamed from: i  reason: collision with root package name */
        private String f1839i;

        /* renamed from: j  reason: collision with root package name */
        private String f1840j;

        /* renamed from: k  reason: collision with root package name */
        private String f1841k;

        /* renamed from: l  reason: collision with root package name */
        private String f1842l;

        /* renamed from: m  reason: collision with root package name */
        private String f1843m;

        /* renamed from: n  reason: collision with root package name */
        private String f1844n;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f1845a;

            /* renamed from: b  reason: collision with root package name */
            private String f1846b;

            /* renamed from: c  reason: collision with root package name */
            private String f1847c;

            /* renamed from: d  reason: collision with root package name */
            private String f1848d;

            /* renamed from: e  reason: collision with root package name */
            private String f1849e;

            /* renamed from: f  reason: collision with root package name */
            private String f1850f;

            /* renamed from: g  reason: collision with root package name */
            private String f1851g;

            /* renamed from: h  reason: collision with root package name */
            private String f1852h;

            /* renamed from: i  reason: collision with root package name */
            private String f1853i;

            /* renamed from: j  reason: collision with root package name */
            private String f1854j;

            /* renamed from: k  reason: collision with root package name */
            private String f1855k;

            /* renamed from: l  reason: collision with root package name */
            private String f1856l;

            /* renamed from: m  reason: collision with root package name */
            private String f1857m;

            /* renamed from: n  reason: collision with root package name */
            private String f1858n;

            public f a() {
                f fVar = new f();
                fVar.j(this.f1845a);
                fVar.l(this.f1846b);
                fVar.s(this.f1847c);
                fVar.t(this.f1848d);
                fVar.m(this.f1849e);
                fVar.n(this.f1850f);
                fVar.u(this.f1851g);
                fVar.r(this.f1852h);
                fVar.v(this.f1853i);
                fVar.o(this.f1854j);
                fVar.i(this.f1855k);
                fVar.q(this.f1856l);
                fVar.p(this.f1857m);
                fVar.k(this.f1858n);
                return fVar;
            }

            public a b(String str) {
                this.f1845a = str;
                return this;
            }

            public a c(String str) {
                this.f1846b = str;
                return this;
            }

            public a d(String str) {
                this.f1850f = str;
                return this;
            }

            public a e(String str) {
                this.f1847c = str;
                return this;
            }

            public a f(String str) {
                this.f1848d = str;
                return this;
            }

            public a g(String str) {
                this.f1851g = str;
                return this;
            }

            public a h(String str) {
                this.f1853i = str;
                return this;
            }
        }

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.j((String) map.get("apiKey"));
            fVar.l((String) map.get("appId"));
            fVar.s((String) map.get("messagingSenderId"));
            fVar.t((String) map.get("projectId"));
            fVar.m((String) map.get("authDomain"));
            fVar.n((String) map.get("databaseURL"));
            fVar.u((String) map.get("storageBucket"));
            fVar.r((String) map.get("measurementId"));
            fVar.v((String) map.get("trackingId"));
            fVar.o((String) map.get("deepLinkURLScheme"));
            fVar.i((String) map.get("androidClientId"));
            fVar.q((String) map.get("iosClientId"));
            fVar.p((String) map.get("iosBundleId"));
            fVar.k((String) map.get("appGroupId"));
            return fVar;
        }

        public String b() {
            return this.f1831a;
        }

        public String c() {
            return this.f1832b;
        }

        public String d() {
            return this.f1836f;
        }

        public String e() {
            return this.f1833c;
        }

        public String f() {
            return this.f1834d;
        }

        public String g() {
            return this.f1837g;
        }

        public String h() {
            return this.f1839i;
        }

        public void i(String str) {
            this.f1841k = str;
        }

        public void j(String str) {
            if (str != null) {
                this.f1831a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void k(String str) {
            this.f1844n = str;
        }

        public void l(String str) {
            if (str != null) {
                this.f1832b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void m(String str) {
            this.f1835e = str;
        }

        public void n(String str) {
            this.f1836f = str;
        }

        public void o(String str) {
            this.f1840j = str;
        }

        public void p(String str) {
            this.f1843m = str;
        }

        public void q(String str) {
            this.f1842l = str;
        }

        public void r(String str) {
            this.f1838h = str;
        }

        public void s(String str) {
            if (str != null) {
                this.f1833c = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void t(String str) {
            if (str != null) {
                this.f1834d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void u(String str) {
            this.f1837g = str;
        }

        public void v(String str) {
            this.f1839i = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> w() {
            HashMap hashMap = new HashMap();
            hashMap.put("apiKey", this.f1831a);
            hashMap.put("appId", this.f1832b);
            hashMap.put("messagingSenderId", this.f1833c);
            hashMap.put("projectId", this.f1834d);
            hashMap.put("authDomain", this.f1835e);
            hashMap.put("databaseURL", this.f1836f);
            hashMap.put("storageBucket", this.f1837g);
            hashMap.put("measurementId", this.f1838h);
            hashMap.put("trackingId", this.f1839i);
            hashMap.put("deepLinkURLScheme", this.f1840j);
            hashMap.put("androidClientId", this.f1841k);
            hashMap.put("iosClientId", this.f1842l);
            hashMap.put("iosBundleId", this.f1843m);
            hashMap.put("appGroupId", this.f1844n);
            return hashMap;
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private String f1859a;

        /* renamed from: b  reason: collision with root package name */
        private f f1860b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f1861c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f1862d;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f1863a;

            /* renamed from: b  reason: collision with root package name */
            private f f1864b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f1865c;

            /* renamed from: d  reason: collision with root package name */
            private Map<String, Object> f1866d;

            public g a() {
                g gVar = new g();
                gVar.c(this.f1863a);
                gVar.d(this.f1864b);
                gVar.b(this.f1865c);
                gVar.e(this.f1866d);
                return gVar;
            }

            public a b(Boolean bool) {
                this.f1865c = bool;
                return this;
            }

            public a c(String str) {
                this.f1863a = str;
                return this;
            }

            public a d(f fVar) {
                this.f1864b = fVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f1866d = map;
                return this;
            }
        }

        private g() {
        }

        static g a(Map<String, Object> map) {
            g gVar = new g();
            gVar.c((String) map.get("name"));
            Object obj = map.get("options");
            gVar.d(obj == null ? null : f.a((Map) obj));
            gVar.b((Boolean) map.get("isAutomaticDataCollectionEnabled"));
            gVar.e((Map) map.get("pluginConstants"));
            return gVar;
        }

        public void b(Boolean bool) {
            this.f1861c = bool;
        }

        public void c(String str) {
            if (str != null) {
                this.f1859a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void d(f fVar) {
            if (fVar != null) {
                this.f1860b = fVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void e(Map<String, Object> map) {
            if (map != null) {
                this.f1862d = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f1859a);
            f fVar = this.f1860b;
            hashMap.put("options", fVar == null ? null : fVar.w());
            hashMap.put("isAutomaticDataCollectionEnabled", this.f1861c);
            hashMap.put("pluginConstants", this.f1862d);
            return hashMap;
        }
    }

    public interface h<T> {
        void a(T t3);

        void b(Throwable th);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
