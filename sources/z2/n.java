package z2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k2.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l2.v;
import t2.p;
import w2.c;

class n extends m {

    static final class a extends j implements p<CharSequence, Integer, l<? extends Integer, ? extends Integer>> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<String> f3281d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3282e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z3) {
            super(2);
            this.f3281d = list;
            this.f3282e = z3;
        }

        public final l<Integer, Integer> a(CharSequence charSequence, int i3) {
            i.e(charSequence, "$this$$receiver");
            l p3 = n.s(charSequence, this.f3281d, i3, this.f3282e, false);
            if (p3 != null) {
                return k2.p.a(p3.c(), Integer.valueOf(((String) p3.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends j implements t2.l<c, String> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CharSequence f3283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f3283d = charSequence;
        }

        /* renamed from: a */
        public final String invoke(c cVar) {
            i.e(cVar, "it");
            return n.P(this.f3283d, cVar);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return w(charSequence, str, i3, z3);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        boolean z4;
        i.e(charSequence, "<this>");
        i.e(cArr, "chars");
        if (z3 || cArr.length != 1 || !(charSequence instanceof String)) {
            v d4 = new c(f.a(i3, 0), u(charSequence)).iterator();
            while (d4.hasNext()) {
                int nextInt = d4.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z4 = false;
                        continue;
                        break;
                    } else if (b.d(cArr[i4], charAt, z3)) {
                        z4 = true;
                        continue;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z4) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(e.f(cArr), i3);
    }

    public static final int C(CharSequence charSequence, char c4, int i3, boolean z3) {
        i.e(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c4, i3);
        }
        return G(charSequence, new char[]{c4}, i3, z3);
    }

    public static final int D(CharSequence charSequence, String str, int i3, boolean z3) {
        i.e(charSequence, "<this>");
        i.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? x(charSequence, str, i3, 0, z3, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c4, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = u(charSequence);
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return C(charSequence, c4, i3, z3);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = u(charSequence);
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return D(charSequence, str, i3, z3);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        i.e(charSequence, "<this>");
        i.e(cArr, "chars");
        if (z3 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c4 = f.c(i3, u(charSequence)); -1 < c4; c4--) {
                char charAt = charSequence.charAt(c4);
                int length = cArr.length;
                boolean z4 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (b.d(cArr[i4], charAt, z3)) {
                        z4 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z4) {
                    return c4;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(e.f(cArr), i3);
    }

    public static final y2.b<String> H(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return O(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> I(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return h.e(H(charSequence));
    }

    private static final y2.b<c> J(CharSequence charSequence, String[] strArr, int i3, boolean z3, int i4) {
        M(i4);
        return new c(charSequence, i3, i4, new a(d.a(strArr), z3));
    }

    static /* synthetic */ y2.b K(CharSequence charSequence, String[] strArr, int i3, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return J(charSequence, strArr, i3, z3, i4);
    }

    public static final boolean L(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!b.d(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z3)) {
                return false;
            }
        }
        return true;
    }

    public static final void M(int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3).toString());
        }
    }

    public static final y2.b<String> N(CharSequence charSequence, String[] strArr, boolean z3, int i3) {
        i.e(charSequence, "<this>");
        i.e(strArr, "delimiters");
        return h.c(K(charSequence, strArr, 0, z3, i3, 2, (Object) null), new b(charSequence));
    }

    public static /* synthetic */ y2.b O(CharSequence charSequence, String[] strArr, boolean z3, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return N(charSequence, strArr, z3, i3);
    }

    public static final String P(CharSequence charSequence, c cVar) {
        i.e(charSequence, "<this>");
        i.e(cVar, "range");
        return charSequence.subSequence(cVar.h().intValue(), cVar.g().intValue() + 1).toString();
    }

    public static final String Q(String str, char c4, String str2) {
        i.e(str, "<this>");
        i.e(str2, "missingDelimiterValue");
        int z3 = z(str, c4, 0, false, 6, (Object) null);
        if (z3 == -1) {
            return str2;
        }
        String substring = str.substring(z3 + 1, str.length());
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String R(String str, String str2, String str3) {
        i.e(str, "<this>");
        i.e(str2, "delimiter");
        i.e(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, (Object) null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(A + str2.length(), str.length());
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String S(String str, char c4, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return Q(str, c4, str2);
    }

    public static /* synthetic */ String T(String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str3 = str;
        }
        return R(str, str2, str3);
    }

    public static final String U(String str, char c4, String str2) {
        i.e(str, "<this>");
        i.e(str2, "missingDelimiterValue");
        int E = E(str, c4, 0, false, 6, (Object) null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String V(String str, char c4, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return U(str, c4, str2);
    }

    public static final String W(String str, char c4, String str2) {
        i.e(str, "<this>");
        i.e(str2, "missingDelimiterValue");
        int z3 = z(str, c4, 0, false, 6, (Object) null);
        if (z3 == -1) {
            return str2;
        }
        String substring = str.substring(0, z3);
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String X(String str, String str2, String str3) {
        i.e(str, "<this>");
        i.e(str2, "delimiter");
        i.e(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, (Object) null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(0, A);
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Y(String str, char c4, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return W(str, c4, str2);
    }

    public static /* synthetic */ String Z(String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str3 = str;
        }
        return X(str, str2, str3);
    }

    public static CharSequence a0(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean c4 = a.c(charSequence.charAt(!z3 ? i3 : length));
            if (!z3) {
                if (!c4) {
                    z3 = true;
                } else {
                    i3++;
                }
            } else if (!c4) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }

    public static final boolean q(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (A(charSequence, (String) charSequence2, 0, z3, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (y(charSequence, charSequence2, 0, charSequence.length(), z3, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return q(charSequence, charSequence2, z3);
    }

    /* access modifiers changed from: private */
    public static final l<Integer, String> s(CharSequence charSequence, Collection<String> collection, int i3, boolean z3, boolean z4) {
        int i4;
        T t3;
        String str;
        T t4;
        if (z3 || collection.size() != 1) {
            w2.a cVar = !z4 ? new c(f.a(i3, 0), charSequence.length()) : f.f(f.c(i3, u(charSequence)), 0);
            if (charSequence instanceof String) {
                i4 = cVar.a();
                int b4 = cVar.b();
                int c4 = cVar.c();
                if ((c4 > 0 && i4 <= b4) || (c4 < 0 && b4 <= i4)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t4 = null;
                                break;
                            }
                            t4 = it.next();
                            String str2 = (String) t4;
                            if (m.m(str2, 0, (String) charSequence, i4, str2.length(), z3)) {
                                break;
                            }
                        }
                        str = (String) t4;
                        if (str == null) {
                            if (i4 == b4) {
                                break;
                            }
                            i4 += c4;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int a4 = cVar.a();
            int b5 = cVar.b();
            int c5 = cVar.c();
            if ((c5 > 0 && a4 <= b5) || (c5 < 0 && b5 <= a4)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        String str3 = (String) t3;
                        if (L(str3, 0, charSequence, i4, str3.length(), z3)) {
                            break;
                        }
                    }
                    str = (String) t3;
                    if (str == null) {
                        if (i4 == b5) {
                            break;
                        }
                        a4 = i4 + c5;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return k2.p.a(Integer.valueOf(i4), str);
        }
        String str4 = (String) q.n(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i5 = i3;
        int A = !z4 ? A(charSequence2, str5, i5, false, 4, (Object) null) : F(charSequence2, str5, i5, false, 4, (Object) null);
        if (A < 0) {
            return null;
        }
        return k2.p.a(Integer.valueOf(A), str4);
    }

    public static final c t(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return new c(0, charSequence.length() - 1);
    }

    public static final int u(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c4, int i3, boolean z3) {
        i.e(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c4, i3);
        }
        return B(charSequence, new char[]{c4}, i3, z3);
    }

    public static final int w(CharSequence charSequence, String str, int i3, boolean z3) {
        i.e(charSequence, "<this>");
        i.e(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        return y(charSequence, str, i3, charSequence.length(), z3, false, 16, (Object) null);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3, boolean z4) {
        w2.a cVar = !z4 ? new c(f.a(i3, 0), f.c(i4, charSequence.length())) : f.f(f.c(i3, u(charSequence)), f.a(i4, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a4 = cVar.a();
            int b4 = cVar.b();
            int c4 = cVar.c();
            if ((c4 <= 0 || a4 > b4) && (c4 >= 0 || b4 > a4)) {
                return -1;
            }
            while (true) {
                if (L(charSequence2, 0, charSequence, a4, charSequence2.length(), z3)) {
                    return a4;
                }
                if (a4 == b4) {
                    return -1;
                }
                a4 += c4;
            }
        } else {
            int a5 = cVar.a();
            int b5 = cVar.b();
            int c5 = cVar.c();
            if ((c5 <= 0 || a5 > b5) && (c5 >= 0 || b5 > a5)) {
                return -1;
            }
            while (true) {
                if (m.m((String) charSequence2, 0, (String) charSequence, a5, charSequence2.length(), z3)) {
                    return a5;
                }
                if (a5 == b5) {
                    return -1;
                }
                a5 += c5;
            }
        }
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3, boolean z4, int i5, Object obj) {
        return x(charSequence, charSequence2, i3, i4, z3, (i5 & 16) != 0 ? false : z4);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c4, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return v(charSequence, c4, i3, z3);
    }
}
