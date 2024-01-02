package l0;

import java.util.Set;
import q0.b;

abstract class a implements e {
    a() {
    }

    public <T> T a(Class<T> cls) {
        b<T> c4 = c(cls);
        if (c4 == null) {
            return null;
        }
        return c4.get();
    }

    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
