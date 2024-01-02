package t;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.window.R;
import com.google.android.gms.common.api.Scope;
import u.b;
import u.c;

public final class b1 implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, fVar.f2957d);
        c.f(parcel, 2, fVar.f2958e);
        c.f(parcel, 3, fVar.f2959f);
        c.j(parcel, 4, fVar.f2960g, false);
        c.e(parcel, 5, fVar.f2961h, false);
        c.l(parcel, 6, fVar.f2962i, i3, false);
        c.d(parcel, 7, fVar.f2963j, false);
        c.i(parcel, 8, fVar.f2964k, i3, false);
        c.l(parcel, 10, fVar.f2965l, i3, false);
        c.l(parcel, 11, fVar.f2966m, i3, false);
        c.c(parcel, 12, fVar.f2967n);
        c.f(parcel, 13, fVar.f2968o);
        c.c(parcel, 14, fVar.f2969p);
        c.j(parcel, 15, fVar.b(), false);
        c.b(parcel, a4);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q3 = b.q(parcel);
        Scope[] scopeArr = f.f2955r;
        Bundle bundle = new Bundle();
        q.c[] cVarArr = f.f2956s;
        q.c[] cVarArr2 = cVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            switch (b.i(k3)) {
                case 1:
                    i3 = b.m(parcel2, k3);
                    break;
                case 2:
                    i4 = b.m(parcel2, k3);
                    break;
                case 3:
                    i5 = b.m(parcel2, k3);
                    break;
                case 4:
                    str = b.d(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth:
                    iBinder = b.l(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitRatio:
                    scopeArr = (Scope[]) b.f(parcel2, k3, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, k3);
                    break;
                case 8:
                    account = (Account) b.c(parcel2, k3, Account.CREATOR);
                    break;
                case 10:
                    cVarArr = (q.c[]) b.f(parcel2, k3, q.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (q.c[]) b.f(parcel2, k3, q.c.CREATOR);
                    break;
                case 12:
                    z3 = b.j(parcel2, k3);
                    break;
                case 13:
                    i6 = b.m(parcel2, k3);
                    break;
                case 14:
                    z4 = b.j(parcel2, k3);
                    break;
                case 15:
                    str2 = b.d(parcel2, k3);
                    break;
                default:
                    b.p(parcel2, k3);
                    break;
            }
        }
        b.h(parcel2, q3);
        return new f(i3, i4, i5, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z3, i6, z4, str2);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new f[i3];
    }
}
