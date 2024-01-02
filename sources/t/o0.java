package t;

import android.os.IBinder;
import android.os.Parcel;

final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3016a;

    o0(IBinder iBinder) {
        this.f3016a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f3016a;
    }

    public final void d(k kVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                b1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3016a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
