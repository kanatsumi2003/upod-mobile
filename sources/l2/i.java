package l2;

import java.util.List;

class i extends h {
    public static <T> List<T> b() {
        return s.f2295d;
    }

    public static <T> int c(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> d(T... tArr) {
        kotlin.jvm.internal.i.e(tArr, "elements");
        return tArr.length > 0 ? d.a(tArr) : b();
    }

    public static <T> List<T> e(List<? extends T> list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : h.a(list.get(0)) : b();
    }

    public static void f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
