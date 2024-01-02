package z2;

import kotlin.jvm.internal.i;

class m extends l {
    public static final boolean j(String str, String str2, boolean z3) {
        i.e(str, "<this>");
        i.e(str2, "suffix");
        if (!z3) {
            return str.endsWith(str2);
        }
        return m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return j(str, str2, z3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.i.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            w2.c r0 = z2.n.t(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            l2.v r3 = (l2.v) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = z2.a.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.m.l(java.lang.CharSequence):boolean");
    }

    public static final boolean m(String str, int i3, String str2, int i4, int i5, boolean z3) {
        i.e(str, "<this>");
        i.e(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static final boolean n(String str, String str2, boolean z3) {
        i.e(str, "<this>");
        i.e(str2, "prefix");
        if (!z3) {
            return str.startsWith(str2);
        }
        return m(str, 0, str2, 0, str2.length(), z3);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return n(str, str2, z3);
    }
}
