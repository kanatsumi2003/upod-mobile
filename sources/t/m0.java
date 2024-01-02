package t;

import android.os.Bundle;
import q.a;

abstract class m0 extends t0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f3011d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f3012e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f3013f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected m0(c cVar, int i3, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f3013f = cVar;
        this.f3011d = i3;
        this.f3012e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f3011d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            t.c r3 = r2.f3013f
            r3.g0(r0, (android.os.IInterface) null)
            q.a r3 = new q.a
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            t.c r3 = r2.f3013f
            r3.g0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f3012e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            q.a r3 = new q.a
            int r0 = r2.f3011d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m0.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(a aVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
