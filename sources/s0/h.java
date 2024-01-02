package s0;

import android.content.Context;
import l0.d;
import l0.r;

public class h {

    public interface a<T> {
        String a(T t3);
    }

    public static d<?> b(String str, String str2) {
        return d.j(f.a(str, str2), f.class);
    }

    public static d<?> c(String str, a<Context> aVar) {
        return d.k(f.class).b(r.h(Context.class)).d(new g(str, aVar)).c();
    }
}
