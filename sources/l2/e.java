package l2;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

class e extends d {
    public static char f(char[] cArr) {
        i.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T g(T[] tArr) {
        i.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
