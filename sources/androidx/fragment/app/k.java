package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<m> f330d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f331e;

    /* renamed from: f  reason: collision with root package name */
    b[] f332f;

    /* renamed from: g  reason: collision with root package name */
    String f333g = null;

    /* renamed from: h  reason: collision with root package name */
    int f334h;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i3) {
            return new k[i3];
        }
    }

    public k() {
    }

    public k(Parcel parcel) {
        this.f330d = parcel.createTypedArrayList(m.CREATOR);
        this.f331e = parcel.createStringArrayList();
        this.f332f = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f333g = parcel.readString();
        this.f334h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeTypedList(this.f330d);
        parcel.writeStringList(this.f331e);
        parcel.writeTypedArray(this.f332f, i3);
        parcel.writeString(this.f333g);
        parcel.writeInt(this.f334h);
    }
}
