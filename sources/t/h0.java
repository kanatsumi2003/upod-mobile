package t;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.window.R;
import u.b;

public final class h0 implements Parcelable.Creator<m> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int q3 = b.q(parcel);
        String str = null;
        String str2 = null;
        long j3 = 0;
        long j4 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
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
                    j3 = b.n(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth:
                    j4 = b.n(parcel2, k3);
                    break;
                case R.styleable.SplitPairRule_splitRatio:
                    str = b.d(parcel2, k3);
                    break;
                case 7:
                    str2 = b.d(parcel2, k3);
                    break;
                case 8:
                    i6 = b.m(parcel2, k3);
                    break;
                case 9:
                    i7 = b.m(parcel2, k3);
                    break;
                default:
                    b.p(parcel2, k3);
                    break;
            }
        }
        b.h(parcel2, q3);
        return new m(i3, i4, i5, j3, j4, str, str2, i6, i7);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new m[i3];
    }
}
