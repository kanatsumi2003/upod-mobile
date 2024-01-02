package s0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f2878b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f2879a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f2878b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f2878b;
                if (dVar == null) {
                    dVar = new d();
                    f2878b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f2879a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f2879a);
        }
        return unmodifiableSet;
    }
}
