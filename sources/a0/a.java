package a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f10a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11b;

    protected a(IBinder iBinder, String str) {
        this.f10a = iBinder;
        this.f11b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f10a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i3, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10a.transact(i3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i3, Parcel parcel) {
        try {
            this.f10a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
