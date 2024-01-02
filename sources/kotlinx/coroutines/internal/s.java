package kotlinx.coroutines.internal;

import a3.h0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m2.g;
import t2.l;

public final class s {

    static final class a extends j implements l<Throwable, k2.s> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l<E, k2.s> f2156d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ E f2157e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f2158f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super E, k2.s> lVar, E e4, g gVar) {
            super(1);
            this.f2156d = lVar;
            this.f2157e = e4;
            this.f2158f = gVar;
        }

        public final void a(Throwable th) {
            s.b(this.f2156d, this.f2157e, this.f2158f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return k2.s.f2081a;
        }
    }

    public static final <E> l<Throwable, k2.s> a(l<? super E, k2.s> lVar, E e4, g gVar) {
        return new a(lVar, e4, gVar);
    }

    public static final <E> void b(l<? super E, k2.s> lVar, E e4, g gVar) {
        f0 c4 = c(lVar, e4, (f0) null);
        if (c4 != null) {
            h0.a(gVar, c4);
        }
    }

    public static final <E> f0 c(l<? super E, k2.s> lVar, E e4, f0 f0Var) {
        try {
            lVar.invoke(e4);
        } catch (Throwable th) {
            if (f0Var == null || f0Var.getCause() == th) {
                return new f0(i.j("Exception in undelivered element handler for ", e4), th);
            }
            b.a(f0Var, th);
        }
        return f0Var;
    }

    public static /* synthetic */ f0 d(l lVar, Object obj, f0 f0Var, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            f0Var = null;
        }
        return c(lVar, obj, f0Var);
    }
}
