package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    final int[] f230d;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<String> f231e;

    /* renamed from: f  reason: collision with root package name */
    final int[] f232f;

    /* renamed from: g  reason: collision with root package name */
    final int[] f233g;

    /* renamed from: h  reason: collision with root package name */
    final int f234h;

    /* renamed from: i  reason: collision with root package name */
    final int f235i;

    /* renamed from: j  reason: collision with root package name */
    final String f236j;

    /* renamed from: k  reason: collision with root package name */
    final int f237k;

    /* renamed from: l  reason: collision with root package name */
    final int f238l;

    /* renamed from: m  reason: collision with root package name */
    final CharSequence f239m;

    /* renamed from: n  reason: collision with root package name */
    final int f240n;

    /* renamed from: o  reason: collision with root package name */
    final CharSequence f241o;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList<String> f242p;

    /* renamed from: q  reason: collision with root package name */
    final ArrayList<String> f243q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f244r;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i3) {
            return new b[i3];
        }
    }

    public b(Parcel parcel) {
        this.f230d = parcel.createIntArray();
        this.f231e = parcel.createStringArrayList();
        this.f232f = parcel.createIntArray();
        this.f233g = parcel.createIntArray();
        this.f234h = parcel.readInt();
        this.f235i = parcel.readInt();
        this.f236j = parcel.readString();
        this.f237k = parcel.readInt();
        this.f238l = parcel.readInt();
        this.f239m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f240n = parcel.readInt();
        this.f241o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f242p = parcel.createStringArrayList();
        this.f243q = parcel.createStringArrayList();
        this.f244r = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f356a.size();
        this.f230d = new int[(size * 5)];
        if (aVar.f363h) {
            this.f231e = new ArrayList<>(size);
            this.f232f = new int[size];
            this.f233g = new int[size];
            int i3 = 0;
            int i4 = 0;
            while (i3 < size) {
                n.a aVar2 = aVar.f356a.get(i3);
                int i5 = i4 + 1;
                this.f230d[i4] = aVar2.f374a;
                ArrayList<String> arrayList = this.f231e;
                Fragment fragment = aVar2.f375b;
                arrayList.add(fragment != null ? fragment.f184e : null);
                int[] iArr = this.f230d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f376c;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f377d;
                int i8 = i7 + 1;
                iArr[i7] = aVar2.f378e;
                iArr[i8] = aVar2.f379f;
                this.f232f[i3] = aVar2.f380g.ordinal();
                this.f233g[i3] = aVar2.f381h.ordinal();
                i3++;
                i4 = i8 + 1;
            }
            this.f234h = aVar.f361f;
            this.f235i = aVar.f362g;
            this.f236j = aVar.f365j;
            this.f237k = aVar.f229u;
            this.f238l = aVar.f366k;
            this.f239m = aVar.f367l;
            this.f240n = aVar.f368m;
            this.f241o = aVar.f369n;
            this.f242p = aVar.f370o;
            this.f243q = aVar.f371p;
            this.f244r = aVar.f372q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(j jVar) {
        a aVar = new a(jVar);
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f230d.length) {
            n.a aVar2 = new n.a();
            int i5 = i3 + 1;
            aVar2.f374a = this.f230d[i3];
            if (j.H) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + this.f230d[i5]);
            }
            String str = this.f231e.get(i4);
            aVar2.f375b = str != null ? jVar.f279g.get(str) : null;
            aVar2.f380g = d.b.values()[this.f232f[i4]];
            aVar2.f381h = d.b.values()[this.f233g[i4]];
            int[] iArr = this.f230d;
            int i6 = i5 + 1;
            int i7 = iArr[i5];
            aVar2.f376c = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f377d = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar2.f378e = i11;
            int i12 = iArr[i10];
            aVar2.f379f = i12;
            aVar.f357b = i7;
            aVar.f358c = i9;
            aVar.f359d = i11;
            aVar.f360e = i12;
            aVar.c(aVar2);
            i4++;
            i3 = i10 + 1;
        }
        aVar.f361f = this.f234h;
        aVar.f362g = this.f235i;
        aVar.f365j = this.f236j;
        aVar.f229u = this.f237k;
        aVar.f363h = true;
        aVar.f366k = this.f238l;
        aVar.f367l = this.f239m;
        aVar.f368m = this.f240n;
        aVar.f369n = this.f241o;
        aVar.f370o = this.f242p;
        aVar.f371p = this.f243q;
        aVar.f372q = this.f244r;
        aVar.h(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f230d);
        parcel.writeStringList(this.f231e);
        parcel.writeIntArray(this.f232f);
        parcel.writeIntArray(this.f233g);
        parcel.writeInt(this.f234h);
        parcel.writeInt(this.f235i);
        parcel.writeString(this.f236j);
        parcel.writeInt(this.f237k);
        parcel.writeInt(this.f238l);
        TextUtils.writeToParcel(this.f239m, parcel, 0);
        parcel.writeInt(this.f240n);
        TextUtils.writeToParcel(this.f241o, parcel, 0);
        parcel.writeStringList(this.f242p);
        parcel.writeStringList(this.f243q);
        parcel.writeInt(this.f244r ? 1 : 0);
    }
}
