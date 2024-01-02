package n1;

import o1.g;
import o1.j;
import o1.k;
import org.json.JSONArray;
import org.json.JSONException;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final k f2487a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f2488b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f2489c;

    class a implements k.c {
        a() {
        }

        public void a(j jVar, k.d dVar) {
            if (n.this.f2488b == null) {
                b1.b.e("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f2578a;
            Object obj = jVar.f2579b;
            b1.b.e("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                JSONArray jSONArray = (JSONArray) obj;
                n.this.f2488b.a(jSONArray.getString(0), jSONArray.getString(1), dVar);
            } catch (JSONException e4) {
                dVar.b("error", e4.getMessage(), (Object) null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public n(c1.a aVar) {
        a aVar2 = new a();
        this.f2489c = aVar2;
        k kVar = new k(aVar, "flutter/spellcheck", g.f2577a);
        this.f2487a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f2488b = bVar;
    }
}
