package z2;

import kotlin.jvm.internal.i;

class p extends o {
    public static final String b0(String str, int i3) {
        i.e(str, "<this>");
        if (i3 >= 0) {
            String substring = str.substring(f.c(i3, str.length()));
            i.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i3 + " is less than zero.").toString());
    }
}
