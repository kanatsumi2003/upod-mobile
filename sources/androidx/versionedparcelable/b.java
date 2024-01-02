package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c.a;
import java.lang.reflect.Method;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f526d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f527e;

    /* renamed from: f  reason: collision with root package name */
    private final int f528f;

    /* renamed from: g  reason: collision with root package name */
    private final int f529g;

    /* renamed from: h  reason: collision with root package name */
    private final String f530h;

    /* renamed from: i  reason: collision with root package name */
    private int f531i;

    /* renamed from: j  reason: collision with root package name */
    private int f532j;

    /* renamed from: k  reason: collision with root package name */
    private int f533k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    private b(Parcel parcel, int i3, int i4, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f526d = new SparseIntArray();
        this.f531i = -1;
        this.f533k = -1;
        this.f527e = parcel;
        this.f528f = i3;
        this.f529g = i4;
        this.f532j = i3;
        this.f530h = str;
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f527e.writeInt(bArr.length);
            this.f527e.writeByteArray(bArr);
            return;
        }
        this.f527e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f527e, 0);
    }

    public void E(int i3) {
        this.f527e.writeInt(i3);
    }

    public void G(Parcelable parcelable) {
        this.f527e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f527e.writeString(str);
    }

    public void a() {
        int i3 = this.f531i;
        if (i3 >= 0) {
            int i4 = this.f526d.get(i3);
            int dataPosition = this.f527e.dataPosition();
            this.f527e.setDataPosition(i4);
            this.f527e.writeInt(dataPosition - i4);
            this.f527e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f527e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f532j;
        if (i3 == this.f528f) {
            i3 = this.f529g;
        }
        int i4 = i3;
        return new b(parcel, dataPosition, i4, this.f530h + "  ", this.f523a, this.f524b, this.f525c);
    }

    public boolean g() {
        return this.f527e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f527e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f527e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f527e);
    }

    public boolean m(int i3) {
        while (this.f532j < this.f529g) {
            int i4 = this.f533k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            this.f527e.setDataPosition(this.f532j);
            int readInt = this.f527e.readInt();
            this.f533k = this.f527e.readInt();
            this.f532j += readInt;
        }
        return this.f533k == i3;
    }

    public int o() {
        return this.f527e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f527e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f527e.readString();
    }

    public void w(int i3) {
        a();
        this.f531i = i3;
        this.f526d.put(i3, this.f527e.dataPosition());
        E(0);
        E(i3);
    }

    public void y(boolean z3) {
        this.f527e.writeInt(z3 ? 1 : 0);
    }
}
