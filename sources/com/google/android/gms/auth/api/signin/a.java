package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.window.R;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import u.b;

public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q3 = b.q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j3 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            switch (b.i(k3)) {
                case 1:
                    i3 = b.m(parcel2, k3);
                    break;
                case 2:
                    str = b.d(parcel2, k3);
                    break;
                case 3:
                    str2 = b.d(parcel2, k3);
                    break;
                case 4:
                    str3 = b.d(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth:
                    str4 = b.d(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitRatio:
                    uri = (Uri) b.c(parcel2, k3, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel2, k3);
                    break;
                case 8:
                    j3 = b.n(parcel2, k3);
                    break;
                case 9:
                    str6 = b.d(parcel2, k3);
                    break;
                case 10:
                    arrayList = b.g(parcel2, k3, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel2, k3);
                    break;
                case 12:
                    str8 = b.d(parcel2, k3);
                    break;
                default:
                    b.p(parcel2, k3);
                    break;
            }
        }
        b.h(parcel2, q3);
        return new GoogleSignInAccount(i3, str, str2, str3, str4, uri, str5, j3, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new GoogleSignInAccount[i3];
    }
}
