package t;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import b0.b;

public interface i extends IInterface {

    public static abstract class a extends b implements i {
        public static i b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof i ? (i) queryLocalInterface : new l1(iBinder);
        }
    }

    Account h();
}
