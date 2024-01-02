package x0;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import l0.d;
import l0.e;
import l0.j;

public class b implements j {
    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, d dVar, e eVar) {
        try {
            c.b(str);
            return dVar.f().a(eVar);
        } finally {
            c.a();
        }
    }

    public List<d<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (d next : componentRegistrar.getComponents()) {
            String g3 = next.g();
            if (g3 != null) {
                next = next.r(new a(g3, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
