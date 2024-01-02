package t;

import android.util.Log;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f3034a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3035b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f3036c;

    public t0(c cVar, Object obj) {
        this.f3036c = cVar;
        this.f3034a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f3034a;
            if (this.f3035b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e4) {
                throw e4;
            }
        }
        synchronized (this) {
            this.f3035b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f3034a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f3036c.f2908r) {
            this.f3036c.f2908r.remove(this);
        }
    }
}
