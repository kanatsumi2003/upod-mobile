package d3;

import k2.s;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

public abstract class a<T> implements b<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: d3.a$a  reason: collision with other inner class name */
    static final class C0016a extends d {

        /* renamed from: d  reason: collision with root package name */
        Object f1058d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f1059e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<T> f1060f;

        /* renamed from: g  reason: collision with root package name */
        int f1061g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0016a(a<T> aVar, m2.d<? super C0016a> dVar) {
            super(dVar);
            this.f1060f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1059e = obj;
            this.f1061g |= Integer.MIN_VALUE;
            return this.f1060f.a((c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(d3.c<? super T> r6, m2.d<? super k2.s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d3.a.C0016a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            d3.a$a r0 = (d3.a.C0016a) r0
            int r1 = r0.f1061g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1061g = r1
            goto L_0x0018
        L_0x0013:
            d3.a$a r0 = new d3.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1059e
            java.lang.Object r1 = n2.d.c()
            int r2 = r0.f1061g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f1058d
            e3.c r6 = (e3.c) r6
            k2.n.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            k2.n.b(r7)
            e3.c r7 = new e3.c
            m2.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f1058d = r7     // Catch:{ all -> 0x0055 }
            r0.f1061g = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            k2.s r6 = k2.s.f2081a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.a.a(d3.c, m2.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, m2.d<? super s> dVar);
}
