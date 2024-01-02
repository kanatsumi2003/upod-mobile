package n1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o1.g;
import o1.j;
import o1.k;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final k f2375a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f2376b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f2377c;

    class a implements k.c {
        a() {
        }

        public void a(j jVar, k.d dVar) {
            if (f.this.f2376b != null) {
                String str = jVar.f2578a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.b();
                try {
                    dVar.a(f.this.f2376b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e4) {
                    dVar.b("error", e4.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public f(c1.a aVar) {
        a aVar2 = new a();
        this.f2377c = aVar2;
        k kVar = new k(aVar, "flutter/localization", g.f2577a);
        this.f2375a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        b1.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            b1.b.e("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(next.getScript());
            arrayList.add(next.getVariant());
        }
        this.f2375a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f2376b = bVar;
    }
}
