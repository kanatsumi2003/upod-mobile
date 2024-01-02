package i;

import android.os.LocaleList;
import java.util.Locale;

final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f1394a;

    g(LocaleList localeList) {
        this.f1394a = localeList;
    }

    public Object a() {
        return this.f1394a;
    }

    public boolean equals(Object obj) {
        return this.f1394a.equals(((f) obj).a());
    }

    public Locale get(int i3) {
        return this.f1394a.get(i3);
    }

    public int hashCode() {
        return this.f1394a.hashCode();
    }

    public String toString() {
        return this.f1394a.toString();
    }
}
