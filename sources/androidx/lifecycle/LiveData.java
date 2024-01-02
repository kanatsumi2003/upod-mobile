package androidx.lifecycle;

import androidx.lifecycle.d;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    static final Object f451j = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f452a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private b.b<m<? super T>, LiveData<T>.b> f453b = new b.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f454c = 0;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f455d;

    /* renamed from: e  reason: collision with root package name */
    volatile Object f456e;

    /* renamed from: f  reason: collision with root package name */
    private int f457f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f458g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f459h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f460i;

    class LifecycleBoundObserver extends LiveData<T>.b implements e {

        /* renamed from: e  reason: collision with root package name */
        final g f461e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LiveData f462f;

        public void d(g gVar, d.a aVar) {
            if (this.f461e.a().b() == d.b.DESTROYED) {
                this.f462f.f(this.f464a);
            } else {
                h(j());
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f461e.a().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f461e.a().b().a(d.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f452a) {
                obj = LiveData.this.f456e;
                LiveData.this.f456e = LiveData.f451j;
            }
            LiveData.this.g(obj);
        }
    }

    private abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final m<? super T> f464a;

        /* renamed from: b  reason: collision with root package name */
        boolean f465b;

        /* renamed from: c  reason: collision with root package name */
        int f466c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveData f467d;

        /* access modifiers changed from: package-private */
        public void h(boolean z3) {
            if (z3 != this.f465b) {
                this.f465b = z3;
                LiveData liveData = this.f467d;
                int i3 = liveData.f454c;
                int i4 = 1;
                boolean z4 = i3 == 0;
                if (!z3) {
                    i4 = -1;
                }
                liveData.f454c = i3 + i4;
                if (z4 && z3) {
                    liveData.d();
                }
                LiveData liveData2 = this.f467d;
                if (liveData2.f454c == 0 && !this.f465b) {
                    liveData2.e();
                }
                if (this.f465b) {
                    this.f467d.c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean j();
    }

    public LiveData() {
        Object obj = f451j;
        this.f455d = obj;
        this.f456e = obj;
        this.f457f = -1;
        this.f460i = new a();
    }

    private static void a(String str) {
        if (!a.a.d().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f465b) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i3 = bVar.f466c;
            int i4 = this.f457f;
            if (i3 < i4) {
                bVar.f466c = i4;
                bVar.f464a.a(this.f455d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(LiveData<T>.b bVar) {
        if (this.f458g) {
            this.f459h = true;
            return;
        }
        this.f458g = true;
        do {
            this.f459h = false;
            if (bVar == null) {
                b.b<K, V>.d c4 = this.f453b.c();
                while (c4.hasNext()) {
                    b((b) ((Map.Entry) c4.next()).getValue());
                    if (this.f459h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.f459h);
        this.f458g = false;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        b f4 = this.f453b.f(mVar);
        if (f4 != null) {
            f4.i();
            f4.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void g(T t3) {
        a("setValue");
        this.f457f++;
        this.f455d = t3;
        c((LiveData<T>.b) null);
    }
}
