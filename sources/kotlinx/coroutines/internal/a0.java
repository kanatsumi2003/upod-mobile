package kotlinx.coroutines.internal;

final /* synthetic */ class a0 {
    public static final int a(String str, int i3, int i4, int i5) {
        return (int) y.c(str, (long) i3, (long) i4, (long) i5);
    }

    public static final long b(String str, long j3, long j4, long j5) {
        String d4 = y.d(str);
        if (d4 == null) {
            return j3;
        }
        Long h3 = l.h(d4);
        if (h3 != null) {
            long longValue = h3.longValue();
            boolean z3 = false;
            if (j4 <= longValue && longValue <= j5) {
                z3 = true;
            }
            if (z3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d4 + '\'').toString());
    }

    public static final boolean c(String str, boolean z3) {
        String d4 = y.d(str);
        return d4 == null ? z3 : Boolean.parseBoolean(d4);
    }

    public static /* synthetic */ int d(String str, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return y.b(str, i3, i4, i5);
    }

    public static /* synthetic */ long e(String str, long j3, long j4, long j5, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j4 = 1;
        }
        long j6 = j4;
        if ((i3 & 8) != 0) {
            j5 = Long.MAX_VALUE;
        }
        return y.c(str, j3, j6, j5);
    }
}
