package kotlinx.coroutines.internal;

import m2.d;
import t2.l;

public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final x f2129a = new x("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final x f2130b = new x("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.x0() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(m2.d<? super T> r6, java.lang.Object r7, t2.l<? super java.lang.Throwable, k2.s> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.f
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.f r6 = (kotlinx.coroutines.internal.f) r6
            java.lang.Object r8 = a3.d0.c(r7, r8)
            a3.f0 r0 = r6.f2125g
            m2.g r1 = r6.getContext()
            boolean r0 = r0.g(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f2127i = r8
            r6.f86f = r1
            a3.f0 r7 = r6.f2125g
            m2.g r8 = r6.getContext()
            r7.f(r8, r6)
            goto L_0x00b9
        L_0x0026:
            a3.b2 r0 = a3.b2.f45a
            a3.v0 r0 = r0.a()
            boolean r2 = r0.v()
            if (r2 == 0) goto L_0x003b
            r6.f2127i = r8
            r6.f86f = r1
            r0.q(r6)
            goto L_0x00b9
        L_0x003b:
            r0.t(r1)
            r2 = 0
            m2.g r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            a3.k1$b r4 = a3.k1.f72a     // Catch:{ all -> 0x00a9 }
            m2.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            a3.k1 r3 = (a3.k1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.b()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.m()     // Catch:{ all -> 0x00a9 }
            r6.b(r8, r3)     // Catch:{ all -> 0x00a9 }
            k2.m$a r8 = k2.m.f2075d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = k2.n.a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = k2.m.a(r8)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            m2.d<T> r8 = r6.f2126h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f2128j     // Catch:{ all -> 0x00a9 }
            m2.g r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.b0.c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.x r5 = kotlinx.coroutines.internal.b0.f2109a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            a3.d2 r8 = a3.e0.e(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            m2.d<T> r5 = r6.f2126h     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            k2.s r7 = k2.s.f2081a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.x0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.b0.a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.x0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.b0.a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.x()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.h(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.k(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.k(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.b(m2.d, java.lang.Object, t2.l):void");
    }

    public static /* synthetic */ void c(d dVar, Object obj, l lVar, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
