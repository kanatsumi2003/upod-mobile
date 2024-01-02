package com.google.android.gms.common.api.internal;

import f0.l;
import r.a;
import r.a.b;
import s.i;
import s.z;
import t.o;

public abstract class c<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final q.c[] f811a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f812b;

    /* renamed from: c  reason: collision with root package name */
    private final int f813c;

    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i<A, l<ResultT>> f814a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f815b = true;

        /* renamed from: c  reason: collision with root package name */
        private q.c[] f816c;

        /* renamed from: d  reason: collision with root package name */
        private int f817d = 0;

        /* synthetic */ a(z zVar) {
        }

        public c<A, ResultT> a() {
            o.b(this.f814a != null, "execute parameter required");
            return new s(this, this.f816c, this.f815b, this.f817d);
        }

        public a<A, ResultT> b(i<A, l<ResultT>> iVar) {
            this.f814a = iVar;
            return this;
        }

        public a<A, ResultT> c(boolean z3) {
            this.f815b = z3;
            return this;
        }

        public a<A, ResultT> d(q.c... cVarArr) {
            this.f816c = cVarArr;
            return this;
        }
    }

    protected c(q.c[] cVarArr, boolean z3, int i3) {
        this.f811a = cVarArr;
        boolean z4 = false;
        if (cVarArr != null && z3) {
            z4 = true;
        }
        this.f812b = z4;
        this.f813c = i3;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((z) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a4, l<ResultT> lVar);

    public boolean c() {
        return this.f812b;
    }

    public final int d() {
        return this.f813c;
    }

    public final q.c[] e() {
        return this.f811a;
    }
}
