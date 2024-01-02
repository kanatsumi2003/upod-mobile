package kotlin.jvm.internal;

import t2.a;
import t2.b;
import t2.c;
import t2.d;
import t2.e;
import t2.f;
import t2.g;
import t2.h;
import t2.i;
import t2.j;
import t2.k;
import t2.l;
import t2.m;
import t2.o;
import t2.p;
import t2.q;
import t2.r;
import t2.s;
import t2.t;
import t2.u;
import t2.v;
import t2.w;

public class n {
    public static Object a(Object obj, int i3) {
        if (obj != null && !c(obj, i3)) {
            f(obj, "kotlin.jvm.functions.Function" + i3);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).getArity();
        }
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof t2.n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean c(Object obj, int i3) {
        return (obj instanceof k2.c) && b(obj) == i3;
    }

    private static <T extends Throwable> T d(T t3) {
        return i.i(t3, n.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
