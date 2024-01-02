package u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    public static int a(Parcel parcel) {
        return n(parcel, 20293);
    }

    public static void b(Parcel parcel, int i3) {
        o(parcel, i3);
    }

    public static void c(Parcel parcel, int i3, boolean z3) {
        p(parcel, i3, 4);
        parcel.writeInt(z3 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i3, Bundle bundle, boolean z3) {
        if (bundle != null) {
            int n3 = n(parcel, i3);
            parcel.writeBundle(bundle);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static void e(Parcel parcel, int i3, IBinder iBinder, boolean z3) {
        if (iBinder != null) {
            int n3 = n(parcel, i3);
            parcel.writeStrongBinder(iBinder);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static void f(Parcel parcel, int i3, int i4) {
        p(parcel, i3, 4);
        parcel.writeInt(i4);
    }

    public static void g(Parcel parcel, int i3, int[] iArr, boolean z3) {
        if (iArr != null) {
            int n3 = n(parcel, i3);
            parcel.writeIntArray(iArr);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static void h(Parcel parcel, int i3, long j3) {
        p(parcel, i3, 8);
        parcel.writeLong(j3);
    }

    public static void i(Parcel parcel, int i3, Parcelable parcelable, int i4, boolean z3) {
        if (parcelable != null) {
            int n3 = n(parcel, i3);
            parcelable.writeToParcel(parcel, i4);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static void j(Parcel parcel, int i3, String str, boolean z3) {
        if (str != null) {
            int n3 = n(parcel, i3);
            parcel.writeString(str);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static void k(Parcel parcel, int i3, List<String> list, boolean z3) {
        if (list != null) {
            int n3 = n(parcel, i3);
            parcel.writeStringList(list);
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static <T extends Parcelable> void l(Parcel parcel, int i3, T[] tArr, int i4, boolean z3) {
        if (tArr != null) {
            int n3 = n(parcel, i3);
            parcel.writeInt(r7);
            for (T t3 : tArr) {
                if (t3 == null) {
                    parcel.writeInt(0);
                } else {
                    q(parcel, t3, i4);
                }
            }
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    public static <T extends Parcelable> void m(Parcel parcel, int i3, List<T> list, boolean z3) {
        if (list != null) {
            int n3 = n(parcel, i3);
            int size = list.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                Parcelable parcelable = (Parcelable) list.get(i4);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    q(parcel, parcelable, 0);
                }
            }
            o(parcel, n3);
        } else if (z3) {
            p(parcel, i3, 0);
        }
    }

    private static int n(Parcel parcel, int i3) {
        parcel.writeInt(i3 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void o(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    private static void p(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    private static void q(Parcel parcel, Parcelable parcelable, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i3);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
