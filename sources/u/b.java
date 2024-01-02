package u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i3) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o3);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i3) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o3);
        return createIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i3, Parcelable.Creator<T> creator) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        T t3 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o3);
        return t3;
    }

    public static String d(Parcel parcel, int i3) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o3);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i3) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o3);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i3, Parcelable.Creator<T> creator) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o3);
        return createTypedArray;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i3, Parcelable.Creator<T> creator) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + o3);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new a("Overread allowed size end=" + i3, parcel);
        }
    }

    public static int i(int i3) {
        return (char) i3;
    }

    public static boolean j(Parcel parcel, int i3) {
        r(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static int k(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder l(Parcel parcel, int i3) {
        int o3 = o(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (o3 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o3);
        return readStrongBinder;
    }

    public static int m(Parcel parcel, int i3) {
        r(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long n(Parcel parcel, int i3) {
        r(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int o(Parcel parcel, int i3) {
        return (i3 & -65536) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void p(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + o(parcel, i3));
    }

    public static int q(Parcel parcel) {
        int k3 = k(parcel);
        int o3 = o(parcel, k3);
        int dataPosition = parcel.dataPosition();
        if (i(k3) == 20293) {
            int i3 = o3 + dataPosition;
            if (i3 >= dataPosition && i3 <= parcel.dataSize()) {
                return i3;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i3, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(k3))), parcel);
    }

    private static void r(Parcel parcel, int i3, int i4) {
        int o3 = o(parcel, i3);
        if (o3 != i4) {
            String hexString = Integer.toHexString(o3);
            throw new a("Expected size " + i4 + " got " + o3 + " (0x" + hexString + ")", parcel);
        }
    }
}
