package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import f0.f;
import f0.k;
import s.b;
import t.c;
import t.e;
import t.m;
import t.p;
import x.a;

final class q<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b f856a;

    /* renamed from: b  reason: collision with root package name */
    private final int f857b;

    /* renamed from: c  reason: collision with root package name */
    private final b<?> f858c;

    /* renamed from: d  reason: collision with root package name */
    private final long f859d;

    /* renamed from: e  reason: collision with root package name */
    private final long f860e;

    q(b bVar, int i3, b<?> bVar2, long j3, long j4, String str, String str2) {
        this.f856a = bVar;
        this.f857b = i3;
        this.f858c = bVar2;
        this.f859d = j3;
        this.f860e = j4;
    }

    static <T> q<T> b(b bVar, int i3, b<?> bVar2) {
        boolean z3;
        if (!bVar.f()) {
            return null;
        }
        t.q a4 = p.b().a();
        if (a4 == null) {
            z3 = true;
        } else if (!a4.d()) {
            return null;
        } else {
            z3 = a4.e();
            m w3 = bVar.w(bVar2);
            if (w3 != null) {
                if (!(w3.v() instanceof c)) {
                    return null;
                }
                c cVar = (c) w3.v();
                if (cVar.I() && !cVar.g()) {
                    e c4 = c(w3, cVar, i3);
                    if (c4 == null) {
                        return null;
                    }
                    w3.G();
                    z3 = c4.f();
                }
            }
        }
        return new q(bVar, i3, bVar2, z3 ? System.currentTimeMillis() : 0, z3 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static e c(m<?> mVar, c<?> cVar, int i3) {
        int[] c4;
        int[] d4;
        e G = cVar.G();
        if (G == null || !G.e() || ((c4 = G.c()) != null ? !a.a(c4, i3) : !((d4 = G.d()) == null || !a.a(d4, i3))) || mVar.s() >= G.b()) {
            return null;
        }
        return G;
    }

    public final void a(k<T> kVar) {
        m w3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j3;
        long j4;
        if (this.f856a.f()) {
            t.q a4 = p.b().a();
            if ((a4 == null || a4.d()) && (w3 = this.f856a.w(this.f858c)) != null && (w3.v() instanceof c)) {
                c cVar = (c) w3.v();
                boolean z3 = true;
                boolean z4 = this.f859d > 0;
                int y3 = cVar.y();
                if (a4 != null) {
                    boolean e4 = z4 & a4.e();
                    int b4 = a4.b();
                    int c4 = a4.c();
                    i5 = a4.f();
                    if (cVar.I() && !cVar.g()) {
                        e c5 = c(w3, cVar, this.f857b);
                        if (c5 != null) {
                            if (!c5.f() || this.f859d <= 0) {
                                z3 = false;
                            }
                            c4 = c5.b();
                            e4 = z3;
                        } else {
                            return;
                        }
                    }
                    i4 = b4;
                    i3 = c4;
                } else {
                    i5 = 0;
                    i4 = 5000;
                    i3 = 100;
                }
                b bVar = this.f856a;
                if (kVar.n()) {
                    i7 = 0;
                    i6 = 0;
                } else {
                    if (kVar.l()) {
                        i7 = 100;
                    } else {
                        Exception j5 = kVar.j();
                        if (j5 instanceof r.b) {
                            Status a5 = ((r.b) j5).a();
                            int c6 = a5.c();
                            q.a b5 = a5.b();
                            i6 = b5 == null ? -1 : b5.b();
                            i7 = c6;
                        } else {
                            i7 = 101;
                        }
                    }
                    i6 = -1;
                }
                if (z4) {
                    long j6 = this.f859d;
                    j3 = System.currentTimeMillis();
                    j4 = j6;
                    i8 = (int) (SystemClock.elapsedRealtime() - this.f860e);
                } else {
                    j4 = 0;
                    j3 = 0;
                    i8 = -1;
                }
                bVar.E(new m(this.f857b, i7, i6, j4, j3, (String) null, (String) null, y3, i8), i5, (long) i4, i3);
            }
        }
    }
}
