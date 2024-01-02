package c;

class c {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f608a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    static final long[] f609b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    static final Object[] f610c = new Object[0];

    static int a(int[] iArr, int i3, int i4) {
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else if (i8 <= i4) {
                return i7;
            } else {
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int c(int i3) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                return i5;
            }
        }
        return i3;
    }

    public static int d(int i3) {
        return c(i3 * 4) / 4;
    }
}
