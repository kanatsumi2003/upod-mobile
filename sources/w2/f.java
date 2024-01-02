package w2;

class f extends e {
    public static int a(int i3, int i4) {
        return i3 < i4 ? i4 : i3;
    }

    public static long b(long j3, long j4) {
        return j3 < j4 ? j4 : j3;
    }

    public static int c(int i3, int i4) {
        return i3 > i4 ? i4 : i3;
    }

    public static long d(long j3, long j4) {
        return j3 > j4 ? j4 : j3;
    }

    public static int e(int i3, int i4, int i5) {
        if (i4 <= i5) {
            return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    public static a f(int i3, int i4) {
        return a.f3152g.a(i3, i4, -1);
    }

    public static c g(int i3, int i4) {
        return i4 <= Integer.MIN_VALUE ? c.f3160h.a() : new c(i3, i4 - 1);
    }
}
