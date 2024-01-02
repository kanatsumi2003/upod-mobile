package x;

import t.n;

public final class a {
    public static boolean a(int[] iArr, int i3) {
        if (iArr == null) {
            return false;
        }
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t3) {
        int length = tArr != null ? tArr.length : 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            } else if (!n.a(tArr[i3], t3)) {
                i3++;
            } else if (i3 >= 0) {
                return true;
            }
        }
        return false;
    }
}
