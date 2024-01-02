package t;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import u.a;
import u.c;

public final class i0 extends a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: d  reason: collision with root package name */
    final int f2987d;

    /* renamed from: e  reason: collision with root package name */
    private final Account f2988e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2989f;

    /* renamed from: g  reason: collision with root package name */
    private final GoogleSignInAccount f2990g;

    i0(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f2987d = i3;
        this.f2988e = account;
        this.f2989f = i4;
        this.f2990g = googleSignInAccount;
    }

    public i0(Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i3, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f2987d);
        c.i(parcel, 2, this.f2988e, i3, false);
        c.f(parcel, 3, this.f2989f);
        c.i(parcel, 4, this.f2990g, i3, false);
        c.b(parcel, a4);
    }
}
