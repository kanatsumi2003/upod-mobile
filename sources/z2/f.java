package z2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t2.l;

class f extends e {

    static final class a extends j implements l<String, String> {

        /* renamed from: d  reason: collision with root package name */
        public static final a f3279d = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            i.e(str, "line");
            return str;
        }
    }

    static final class b extends j implements l<String, String> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f3280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f3280d = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            i.e(str, "line");
            return this.f3280d + str;
        }
    }

    private static final l<String, String> b(String str) {
        return str.length() == 0 ? a.f3279d : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (!a.c(str.charAt(i3))) {
                break;
            } else {
                i3++;
            }
        }
        return i3 == -1 ? str.length() : i3;
    }

    public static final String d(String str, String str2) {
        String invoke;
        i.e(str, "<this>");
        i.e(str2, "newIndent");
        List<String> I = n.I(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : I) {
            if (!m.l((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(j.g(arrayList, 10));
        for (String c4 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c4)));
        }
        Integer num = (Integer) q.m(arrayList2);
        int i3 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * I.size());
        l<String, String> b4 = b(str2);
        int c5 = i.c(I);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : I) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i.f();
            }
            String str3 = (String) next2;
            if ((i3 == 0 || i3 == c5) && m.l(str3)) {
                str3 = null;
            } else {
                String b02 = p.b0(str3, intValue);
                if (!(b02 == null || (invoke = b4.invoke(b02)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i3 = i4;
        }
        String sb = ((StringBuilder) q.j(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        i.d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        i.e(str, "<this>");
        return d(str, "");
    }
}
