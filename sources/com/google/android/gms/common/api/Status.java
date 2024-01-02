package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r.d;
import r.j;
import t.n;
import u.a;
import u.c;

public final class Status extends a implements j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final Status f750i = new Status(-1);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f751j = new Status(0);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f752k = new Status(14);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f753l = new Status(8);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f754m = new Status(15);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f755n = new Status(16);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f756o = new Status(18);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f757p = new Status(17);

    /* renamed from: d  reason: collision with root package name */
    final int f758d;

    /* renamed from: e  reason: collision with root package name */
    private final int f759e;

    /* renamed from: f  reason: collision with root package name */
    private final String f760f;

    /* renamed from: g  reason: collision with root package name */
    private final PendingIntent f761g;

    /* renamed from: h  reason: collision with root package name */
    private final q.a f762h;

    public Status(int i3) {
        this(i3, (String) null);
    }

    Status(int i3, int i4, String str, PendingIntent pendingIntent, q.a aVar) {
        this.f758d = i3;
        this.f759e = i4;
        this.f760f = str;
        this.f761g = pendingIntent;
        this.f762h = aVar;
    }

    public Status(int i3, String str) {
        this(1, i3, str, (PendingIntent) null, (q.a) null);
    }

    public Status(q.a aVar, String str) {
        this(aVar, str, 17);
    }

    @Deprecated
    public Status(q.a aVar, String str, int i3) {
        this(1, i3, str, aVar.d(), aVar);
    }

    public Status a() {
        return this;
    }

    public q.a b() {
        return this.f762h;
    }

    public int c() {
        return this.f759e;
    }

    public String d() {
        return this.f760f;
    }

    public boolean e() {
        return this.f761g != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f758d == status.f758d && this.f759e == status.f759e && n.a(this.f760f, status.f760f) && n.a(this.f761g, status.f761g) && n.a(this.f762h, status.f762h);
    }

    public boolean f() {
        return this.f759e == 16;
    }

    public boolean g() {
        return this.f759e <= 0;
    }

    public final String h() {
        String str = this.f760f;
        return str != null ? str : d.a(this.f759e);
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f758d), Integer.valueOf(this.f759e), this.f760f, this.f761g, this.f762h);
    }

    public String toString() {
        n.a c4 = n.c(this);
        c4.a("statusCode", h());
        c4.a("resolution", this.f761g);
        return c4.toString();
    }

    public void writeToParcel(Parcel parcel, int i3) {
        int a4 = c.a(parcel);
        c.f(parcel, 1, c());
        c.j(parcel, 2, d(), false);
        c.i(parcel, 3, this.f761g, i3, false);
        c.i(parcel, 4, b(), i3, false);
        c.f(parcel, 1000, this.f758d);
        c.b(parcel, a4);
    }
}
