package t;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.window.R;
import u.b;

public final class a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q3 = b.q(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        while (parcel.dataPosition() < q3) {
            int k3 = b.k(parcel);
            switch (b.i(k3)) {
                case 1:
                    qVar = (q) b.c(parcel, k3, q.CREATOR);
                    break;
                case 2:
                    z3 = b.j(parcel, k3);
                    break;
                case 3:
                    z4 = b.j(parcel, k3);
                    break;
                case 4:
                    iArr = b.b(parcel, k3);
                    break;
                case R.styleable.SplitPairRule_splitMinWidth:
                    i3 = b.m(parcel, k3);
                    break;
                case R.styleable.SplitPairRule_splitRatio:
                    iArr2 = b.b(parcel, k3);
                    break;
                default:
                    b.p(parcel, k3);
                    break;
            }
        }
        b.h(parcel, q3);
        return new e(qVar, z3, z4, iArr, i3, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i3) {
        return new e[i3];
    }
}
