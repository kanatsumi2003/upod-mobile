package androidx.lifecycle;

import java.util.HashMap;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, q> f504a = new HashMap<>();

    public final void a() {
        for (q a4 : this.f504a.values()) {
            a4.a();
        }
        this.f504a.clear();
    }

    /* access modifiers changed from: package-private */
    public final q b(String str) {
        return this.f504a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final void c(String str, q qVar) {
        q put = this.f504a.put(str, qVar);
        if (put != null) {
            put.c();
        }
    }
}
