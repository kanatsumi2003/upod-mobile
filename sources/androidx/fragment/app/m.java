package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

@SuppressLint({"BanParcelableUsage"})
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    final String f342d;

    /* renamed from: e  reason: collision with root package name */
    final String f343e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f344f;

    /* renamed from: g  reason: collision with root package name */
    final int f345g;

    /* renamed from: h  reason: collision with root package name */
    final int f346h;

    /* renamed from: i  reason: collision with root package name */
    final String f347i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f348j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f349k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f350l;

    /* renamed from: m  reason: collision with root package name */
    final Bundle f351m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f352n;

    /* renamed from: o  reason: collision with root package name */
    final int f353o;

    /* renamed from: p  reason: collision with root package name */
    Bundle f354p;

    /* renamed from: q  reason: collision with root package name */
    Fragment f355q;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i3) {
            return new m[i3];
        }
    }

    m(Parcel parcel) {
        this.f342d = parcel.readString();
        this.f343e = parcel.readString();
        boolean z3 = true;
        this.f344f = parcel.readInt() != 0;
        this.f345g = parcel.readInt();
        this.f346h = parcel.readInt();
        this.f347i = parcel.readString();
        this.f348j = parcel.readInt() != 0;
        this.f349k = parcel.readInt() != 0;
        this.f350l = parcel.readInt() != 0;
        this.f351m = parcel.readBundle();
        this.f352n = parcel.readInt() == 0 ? false : z3;
        this.f354p = parcel.readBundle();
        this.f353o = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f342d = fragment.getClass().getName();
        this.f343e = fragment.f184e;
        this.f344f = fragment.f192m;
        this.f345g = fragment.f201v;
        this.f346h = fragment.f202w;
        this.f347i = fragment.f203x;
        this.f348j = fragment.A;
        this.f349k = fragment.f191l;
        this.f350l = fragment.f205z;
        this.f351m = fragment.f185f;
        this.f352n = fragment.f204y;
        this.f353o = fragment.R.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Bundle bundle;
        Fragment fragment;
        if (this.f355q == null) {
            Bundle bundle2 = this.f351m;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a4 = gVar.a(classLoader, this.f342d);
            this.f355q = a4;
            a4.h1(this.f351m);
            Bundle bundle3 = this.f354p;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f355q;
                bundle = this.f354p;
            } else {
                fragment = this.f355q;
                bundle = new Bundle();
            }
            fragment.f181b = bundle;
            Fragment fragment2 = this.f355q;
            fragment2.f184e = this.f343e;
            fragment2.f192m = this.f344f;
            fragment2.f194o = true;
            fragment2.f201v = this.f345g;
            fragment2.f202w = this.f346h;
            fragment2.f203x = this.f347i;
            fragment2.A = this.f348j;
            fragment2.f191l = this.f349k;
            fragment2.f205z = this.f350l;
            fragment2.f204y = this.f352n;
            fragment2.R = d.b.values()[this.f353o];
            if (j.H) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f355q);
            }
        }
        return this.f355q;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f342d);
        sb.append(" (");
        sb.append(this.f343e);
        sb.append(")}:");
        if (this.f344f) {
            sb.append(" fromLayout");
        }
        if (this.f346h != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f346h));
        }
        String str = this.f347i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f347i);
        }
        if (this.f348j) {
            sb.append(" retainInstance");
        }
        if (this.f349k) {
            sb.append(" removing");
        }
        if (this.f350l) {
            sb.append(" detached");
        }
        if (this.f352n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f342d);
        parcel.writeString(this.f343e);
        parcel.writeInt(this.f344f ? 1 : 0);
        parcel.writeInt(this.f345g);
        parcel.writeInt(this.f346h);
        parcel.writeString(this.f347i);
        parcel.writeInt(this.f348j ? 1 : 0);
        parcel.writeInt(this.f349k ? 1 : 0);
        parcel.writeInt(this.f350l ? 1 : 0);
        parcel.writeBundle(this.f351m);
        parcel.writeInt(this.f352n ? 1 : 0);
        parcel.writeBundle(this.f354p);
        parcel.writeInt(this.f353o);
    }
}
