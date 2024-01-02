package a3;

import kotlinx.coroutines.scheduling.i;
import m2.d;

public abstract class p0<T> extends i {

    /* renamed from: f  reason: collision with root package name */
    public int f86f;

    public p0(int i3) {
        this.f86f = i3;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable d(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f133a;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            kotlin.jvm.internal.i.b(th);
            h0.a(c().getContext(), new l0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r4.x0() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r4.x0() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.j r0 = r10.f2209e
            m2.d r1 = r10.c()     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.f) r1     // Catch:{ all -> 0x00a9 }
            m2.d<T> r2 = r1.f2126h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = r1.f2128j     // Catch:{ all -> 0x00a9 }
            m2.g r3 = r2.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = kotlinx.coroutines.internal.b0.c(r3, r1)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.x r4 = kotlinx.coroutines.internal.b0.f2109a     // Catch:{ all -> 0x00a9 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            a3.d2 r4 = a3.e0.e(r2, r3, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            m2.g r6 = r2.getContext()     // Catch:{ all -> 0x009c }
            java.lang.Object r7 = r10.i()     // Catch:{ all -> 0x009c }
            java.lang.Throwable r8 = r10.d(r7)     // Catch:{ all -> 0x009c }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f86f     // Catch:{ all -> 0x009c }
            boolean r9 = a3.q0.b(r9)     // Catch:{ all -> 0x009c }
            if (r9 == 0) goto L_0x003e
            a3.k1$b r9 = a3.k1.f72a     // Catch:{ all -> 0x009c }
            m2.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x009c }
            a3.k1 r6 = (a3.k1) r6     // Catch:{ all -> 0x009c }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.b()     // Catch:{ all -> 0x009c }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.m()     // Catch:{ all -> 0x009c }
            r10.b(r7, r6)     // Catch:{ all -> 0x009c }
            k2.m$a r7 = k2.m.f2075d     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = k2.n.a(r6)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = k2.m.a(r6)     // Catch:{ all -> 0x009c }
        L_0x0058:
            r2.resumeWith(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0072
        L_0x005c:
            if (r8 == 0) goto L_0x0069
            k2.m$a r6 = k2.m.f2075d     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = k2.n.a(r8)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = k2.m.a(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0058
        L_0x0069:
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x009c }
            java.lang.Object r6 = k2.m.a(r6)     // Catch:{ all -> 0x009c }
            goto L_0x0058
        L_0x0072:
            k2.s r2 = k2.s.f2081a     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x007c
            boolean r2 = r4.x0()     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x007f
        L_0x007c:
            kotlinx.coroutines.internal.b0.a(r3, r1)     // Catch:{ all -> 0x00a9 }
        L_0x007f:
            r0.a()     // Catch:{ all -> 0x0089 }
            k2.s r0 = k2.s.f2081a     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = k2.m.a(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0094
        L_0x0089:
            r0 = move-exception
            k2.m$a r1 = k2.m.f2075d
            java.lang.Object r0 = k2.n.a(r0)
            java.lang.Object r0 = k2.m.a(r0)
        L_0x0094:
            java.lang.Throwable r0 = k2.m.b(r0)
            r10.h(r5, r0)
            goto L_0x00c8
        L_0x009c:
            r2 = move-exception
            if (r4 == 0) goto L_0x00a5
            boolean r4 = r4.x0()     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x00a8
        L_0x00a5:
            kotlinx.coroutines.internal.b0.a(r3, r1)     // Catch:{ all -> 0x00a9 }
        L_0x00a8:
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            k2.m$a r2 = k2.m.f2075d     // Catch:{ all -> 0x00b6 }
            r0.a()     // Catch:{ all -> 0x00b6 }
            k2.s r0 = k2.s.f2081a     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = k2.m.a(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x00c1
        L_0x00b6:
            r0 = move-exception
            k2.m$a r2 = k2.m.f2075d
            java.lang.Object r0 = k2.n.a(r0)
            java.lang.Object r0 = k2.m.a(r0)
        L_0x00c1:
            java.lang.Throwable r0 = k2.m.b(r0)
            r10.h(r1, r0)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.p0.run():void");
    }
}
