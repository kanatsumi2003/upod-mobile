package n1;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import java.util.HashMap;
import o1.a;
import o1.q;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final o1.a<Object> f2360a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f2361b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f2362c;

    /* renamed from: d  reason: collision with root package name */
    final a.d<Object> f2363d;

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    class C0037a implements a.d<Object> {
        C0037a() {
        }

        public void a(Object obj, a.e<Object> eVar) {
            if (a.this.f2362c == null) {
                eVar.a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            b1.b.e("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f2362c.d(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f2362c.a(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f2362c.f(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f2362c.e(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i3);

        void f(int i3);
    }

    public a(c1.a aVar, FlutterJNI flutterJNI) {
        C0037a aVar2 = new C0037a();
        this.f2363d = aVar2;
        o1.a<Object> aVar3 = new o1.a<>(aVar, "flutter/accessibility", q.f2590a);
        this.f2360a = aVar3;
        aVar3.e(aVar2);
        this.f2361b = flutterJNI;
    }

    public void b(int i3, h.g gVar) {
        this.f2361b.dispatchSemanticsAction(i3, gVar);
    }

    public void c(int i3, h.g gVar, Object obj) {
        this.f2361b.dispatchSemanticsAction(i3, gVar, obj);
    }

    public void d() {
        this.f2361b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f2361b.setSemanticsEnabled(true);
    }

    public void f(int i3) {
        this.f2361b.setAccessibilityFeatures(i3);
    }

    public void g(b bVar) {
        this.f2362c = bVar;
        this.f2361b.setAccessibilityDelegate(bVar);
    }
}
