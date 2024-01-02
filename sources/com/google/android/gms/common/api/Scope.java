package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t.o;
import u.a;
import u.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    final int f748d;

    /* renamed from: e  reason: collision with root package name */
    private final String f749e;

    Scope(int i3, String str) {
        o.e(str, "scopeUri must not be null or empty");
        this.f748d = i3;
        this.f749e = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String b() {
        return this.f749e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f749e.equals(((Scope) obj).f749e);
    }

    public int hashCode() {
        return this.f749e.hashCode();
    }

    public String toString() {
        return this.f749e;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, this.f748d);
        c.j(parcel, 2, b(), false);
        c.b(parcel, a4);
    }
}
