package n1;

import java.util.HashMap;
import java.util.Map;
import o1.f;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final o1.a<Object> f2480a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final o1.a<Object> f2481a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f2482b = new HashMap();

        a(o1.a<Object> aVar) {
            this.f2481a = aVar;
        }

        public void a() {
            b1.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f2482b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f2482b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f2482b.get("platformBrightness"));
            this.f2481a.c(this.f2482b);
        }

        public a b(boolean z3) {
            this.f2482b.put("brieflyShowPassword", Boolean.valueOf(z3));
            return this;
        }

        public a c(boolean z3) {
            this.f2482b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
            return this;
        }

        public a d(b bVar) {
            this.f2482b.put("platformBrightness", bVar.f2486d);
            return this;
        }

        public a e(float f4) {
            this.f2482b.put("textScaleFactor", Float.valueOf(f4));
            return this;
        }

        public a f(boolean z3) {
            this.f2482b.put("alwaysUse24HourFormat", Boolean.valueOf(z3));
            return this;
        }
    }

    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: d  reason: collision with root package name */
        public String f2486d;

        private b(String str) {
            this.f2486d = str;
        }
    }

    public m(c1.a aVar) {
        this.f2480a = new o1.a<>(aVar, "flutter/settings", f.f2576a);
    }

    public a a() {
        return new a(this.f2480a);
    }
}
