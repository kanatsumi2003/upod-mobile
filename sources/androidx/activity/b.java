package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f159a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f160b = new CopyOnWriteArrayList<>();

    public b(boolean z3) {
        this.f159a = z3;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f160b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f159a;
    }

    public final void d() {
        Iterator<a> it = this.f160b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f160b.remove(aVar);
    }

    public final void f(boolean z3) {
        this.f159a = z3;
    }
}
