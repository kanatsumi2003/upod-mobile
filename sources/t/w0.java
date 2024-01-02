package t;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import q.a;

public final class w0 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f3044g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f3045h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(c cVar, int i3, IBinder iBinder, Bundle bundle) {
        super(cVar, i3, bundle);
        this.f3045h = cVar;
        this.f3044g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (this.f3045h.f2912v != null) {
            this.f3045h.f2912v.b(aVar);
        }
        this.f3045h.K(aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f3044g;
            o.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f3045h.D().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f3045h.D() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface r3 = this.f3045h.r(this.f3044g);
            if (r3 == null || (!c.e0(this.f3045h, 2, 4, r3) && !c.e0(this.f3045h, 3, 4, r3))) {
                return false;
            }
            this.f3045h.f2916z = null;
            Bundle w3 = this.f3045h.w();
            c cVar = this.f3045h;
            if (cVar.f2911u == null) {
                return true;
            }
            cVar.f2911u.c(w3);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
