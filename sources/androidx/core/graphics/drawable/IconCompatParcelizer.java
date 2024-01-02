package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f170a = aVar.p(iconCompat.f170a, 1);
        iconCompat.f172c = aVar.j(iconCompat.f172c, 2);
        iconCompat.f173d = aVar.r(iconCompat.f173d, 3);
        iconCompat.f174e = aVar.p(iconCompat.f174e, 4);
        iconCompat.f175f = aVar.p(iconCompat.f175f, 5);
        iconCompat.f176g = (ColorStateList) aVar.r(iconCompat.f176g, 6);
        iconCompat.f178i = aVar.t(iconCompat.f178i, 7);
        iconCompat.f179j = aVar.t(iconCompat.f179j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i3 = iconCompat.f170a;
        if (-1 != i3) {
            aVar.F(i3, 1);
        }
        byte[] bArr = iconCompat.f172c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f173d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i4 = iconCompat.f174e;
        if (i4 != 0) {
            aVar.F(i4, 4);
        }
        int i5 = iconCompat.f175f;
        if (i5 != 0) {
            aVar.F(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f176g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f178i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f179j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
