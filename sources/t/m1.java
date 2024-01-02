package t;

import android.os.Parcel;
import b0.b;
import b0.c;
import z.a;

public abstract class m1 extends b implements n1 {
    public m1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 1) {
            a e4 = e();
            parcel2.writeNoException();
            c.c(parcel2, e4);
        } else if (i3 != 2) {
            return false;
        } else {
            int i5 = i();
            parcel2.writeNoException();
            parcel2.writeInt(i5);
        }
        return true;
    }
}
