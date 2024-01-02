package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f151a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f152b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, a {

        /* renamed from: a  reason: collision with root package name */
        private final d f153a;

        /* renamed from: b  reason: collision with root package name */
        private final b f154b;

        /* renamed from: c  reason: collision with root package name */
        private a f155c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f153a = dVar;
            this.f154b = bVar;
            dVar.a(this);
        }

        public void cancel() {
            this.f153a.c(this);
            this.f154b.e(this);
            a aVar = this.f155c;
            if (aVar != null) {
                aVar.cancel();
                this.f155c = null;
            }
        }

        public void d(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f155c = OnBackPressedDispatcher.this.b(this.f154b);
            } else if (aVar == d.a.ON_STOP) {
                a aVar2 = this.f155c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == d.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private class a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final b f157a;

        a(b bVar) {
            this.f157a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f152b.remove(this.f157a);
            this.f157a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f151a = runnable;
    }

    public void a(g gVar, b bVar) {
        d a4 = gVar.a();
        if (a4.b() != d.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a4, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    public a b(b bVar) {
        this.f152b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f152b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f151a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
