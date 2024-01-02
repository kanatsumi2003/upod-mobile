package n2;

import k2.n;
import k2.s;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.i;
import m2.d;
import m2.g;
import t2.p;

class c {

    public static final class a extends j {

        /* renamed from: d  reason: collision with root package name */
        private int f2542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f2543e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f2544f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f2543e = pVar;
            this.f2544f = obj;
            i.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i3 = this.f2542d;
            if (i3 == 0) {
                this.f2542d = 1;
                n.b(obj);
                i.c(this.f2543e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) kotlin.jvm.internal.n.a(this.f2543e, 2)).invoke(this.f2544f, this);
            } else if (i3 == 1) {
                this.f2542d = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: d  reason: collision with root package name */
        private int f2545d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f2546e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f2547f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f2546e = pVar;
            this.f2547f = obj;
            i.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i3 = this.f2545d;
            if (i3 == 0) {
                this.f2545d = 1;
                n.b(obj);
                i.c(this.f2546e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) kotlin.jvm.internal.n.a(this.f2546e, 2)).invoke(this.f2547f, this);
            } else if (i3 == 1) {
                this.f2545d = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<s> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r3, d<? super T> dVar) {
        i.e(pVar, "<this>");
        i.e(dVar, "completion");
        d<? super T> a4 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r3, a4);
        }
        g context = a4.getContext();
        return context == m2.h.f2357d ? new a(a4, pVar, r3) : new b(a4, context, pVar, r3);
    }

    public static <T> d<T> b(d<? super T> dVar) {
        d<Object> intercepted;
        i.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
