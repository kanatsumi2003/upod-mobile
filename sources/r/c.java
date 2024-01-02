package r;

import android.text.TextUtils;
import c.a;
import java.util.ArrayList;
import s.b;
import t.o;

public class c extends Exception {

    /* renamed from: d  reason: collision with root package name */
    private final a<b<?>, q.a> f2665d;

    public c(a<b<?>, q.a> aVar) {
        this.f2665d = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        for (b next : this.f2665d.keySet()) {
            q.a aVar = (q.a) o.h(this.f2665d.get(next));
            z3 &= !aVar.f();
            String b4 = next.b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b4).length() + 2 + valueOf.length());
            sb.append(b4);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z3 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
