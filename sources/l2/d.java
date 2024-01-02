package l2;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;

class d extends c {
    public static <T> List<T> a(T[] tArr) {
        i.e(tArr, "<this>");
        List<T> a4 = f.a(tArr);
        i.d(a4, "asList(this)");
        return a4;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i3, int i4, int i5) {
        i.e(tArr, "<this>");
        i.e(tArr2, "destination");
        System.arraycopy(tArr, i4, tArr2, i3, i5 - i4);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = objArr.length;
        }
        return b(objArr, objArr2, i3, i4, i5);
    }

    public static <T> void d(T[] tArr, T t3, int i3, int i4) {
        i.e(tArr, "<this>");
        Arrays.fill(tArr, i3, i4, t3);
    }

    public static /* synthetic */ void e(Object[] objArr, Object obj, int i3, int i4, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = objArr.length;
        }
        d(objArr, obj, i3, i4);
    }
}
