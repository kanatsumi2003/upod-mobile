package t;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import b0.a;
import b0.c;

public final class l1 extends a implements i {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account h() {
        Parcel a4 = a(2, b());
        Account account = (Account) c.a(a4, Account.CREATOR);
        a4.recycle();
        return account;
    }
}
