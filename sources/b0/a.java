package b0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f560a;

    /* renamed from: b  reason: collision with root package name */
    private final String f561b;

    protected a(IBinder iBinder, String str) {
        this.f560a = iBinder;
        this.f561b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i3, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f560a.transact(i3, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f560a;
    }

    /* access modifiers changed from: protected */
    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f561b);
        return obtain;
    }
}
