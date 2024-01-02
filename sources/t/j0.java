package t;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import u.b;

public final class j0 implements Parcelable.Creator<i0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            int i5 = b.i(k3);
            if (i5 == 1) {
                i3 = b.m(parcel, k3);
            } else if (i5 == 2) {
                account = (Account) b.c(parcel, k3, Account.CREATOR);
            } else if (i5 == 3) {
                i4 = b.m(parcel, k3);
            } else if (i5 != 4) {
                b.p(parcel, k3);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.c(parcel, k3, GoogleSignInAccount.CREATOR);
            }
        }
        b.h(parcel, q3);
        return new i0(i3, account, i4, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new i0[i3];
    }
}
