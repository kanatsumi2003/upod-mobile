package s;

import c.a;
import f0.l;
import java.util.Map;
import java.util.Set;
import r.c;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final a<b<?>, q.a> f2815a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b<?>, String> f2816b;

    /* renamed from: c  reason: collision with root package name */
    private final l<Map<b<?>, String>> f2817c;

    /* renamed from: d  reason: collision with root package name */
    private int f2818d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2819e;

    public final Set<b<?>> a() {
        return this.f2815a.keySet();
    }

    public final void b(b<?> bVar, q.a aVar, String str) {
        this.f2815a.put(bVar, aVar);
        this.f2816b.put(bVar, str);
        this.f2818d--;
        if (!aVar.f()) {
            this.f2819e = true;
        }
        if (this.f2818d != 0) {
            return;
        }
        if (this.f2819e) {
            this.f2817c.b(new c(this.f2815a));
            return;
        }
        this.f2817c.c(this.f2816b);
    }
}
