package s0;

import java.util.Iterator;
import java.util.Set;
import l0.d;
import l0.e;
import l0.r;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f2876a;

    /* renamed from: b  reason: collision with root package name */
    private final d f2877b;

    c(Set<f> set, d dVar) {
        this.f2876a = e(set);
        this.f2877b = dVar;
    }

    public static d<i> c() {
        return d.c(i.class).b(r.j(f.class)).d(new b()).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(e eVar) {
        return new c(eVar.b(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.f2877b.b().isEmpty()) {
            return this.f2876a;
        }
        return this.f2876a + ' ' + e(this.f2877b.b());
    }
}
