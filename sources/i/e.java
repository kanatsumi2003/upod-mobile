package i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class e implements f {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f1388c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f1389d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f1390e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f1391f = d.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f1392a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1393b;

    e(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f1392a = f1388c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i3 = 0;
            while (i3 < localeArr.length) {
                Locale locale = localeArr[i3];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        b(sb2, locale2);
                        if (i3 < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i3++;
                } else {
                    throw new NullPointerException("list[" + i3 + "] is null");
                }
            }
            this.f1392a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb = sb2.toString();
        }
        this.f1393b = sb;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Locale[] localeArr = ((e) obj).f1392a;
        if (this.f1392a.length != localeArr.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1392a;
            if (i3 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
            i3++;
        }
    }

    public Locale get(int i3) {
        if (i3 >= 0) {
            Locale[] localeArr = this.f1392a;
            if (i3 < localeArr.length) {
                return localeArr[i3];
            }
        }
        return null;
    }

    public int hashCode() {
        int i3 = 1;
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f1392a;
            if (i4 >= localeArr.length) {
                return i3;
            }
            i3 = (i3 * 31) + localeArr[i4].hashCode();
            i4++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f1392a;
            if (i3 < localeArr.length) {
                sb.append(localeArr[i3]);
                if (i3 < this.f1392a.length - 1) {
                    sb.append(',');
                }
                i3++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
