package kotlinx.coroutines.internal;

import a3.m0;

public abstract class t {
    public abstract c<?> a();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r7.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(kotlinx.coroutines.internal.t r7) {
        /*
            r6 = this;
            kotlinx.coroutines.internal.c r0 = r6.a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlinx.coroutines.internal.c r7 = r7.a()
            if (r7 != 0) goto L_0x000f
            return r1
        L_0x000f:
            long r2 = r0.f()
            long r4 = r7.f()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.t.b(kotlinx.coroutines.internal.t):boolean");
    }

    public abstract Object c(Object obj);

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
