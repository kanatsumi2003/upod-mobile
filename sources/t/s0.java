package t;

import android.os.Looper;
import android.os.Message;
import b0.e;

final class s0 extends e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f3033a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s0(c cVar, Looper looper) {
        super(looper);
        this.f3033a = cVar;
    }

    private static final void a(Message message) {
        t0 t0Var = (t0) message.obj;
        t0Var.b();
        t0Var.e();
    }

    private static final boolean b(Message message) {
        int i3 = message.what;
        return i3 == 2 || i3 == 1 || i3 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            t.c r0 = r7.f3033a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.C
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            t.c r0 = r7.f3033a
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            t.c r0 = r7.f3033a
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            t.c r0 = r7.f3033a
            q.a r1 = new q.a
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f2916z = r1
            t.c r8 = r7.f3033a
            boolean r8 = t.c.f0(r8)
            if (r8 == 0) goto L_0x005f
            t.c r8 = r7.f3033a
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.g0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            t.c r8 = r7.f3033a
            q.a r0 = r8.f2916z
            if (r0 == 0) goto L_0x006c
            q.a r8 = r8.f2916z
            goto L_0x0071
        L_0x006c:
            q.a r8 = new q.a
            r8.<init>(r4)
        L_0x0071:
            t.c r0 = r7.f3033a
            t.c$c r0 = r0.f2906p
            r0.a(r8)
            t.c r0 = r7.f3033a
            r0.K(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            t.c r8 = r7.f3033a
            q.a r0 = r8.f2916z
            if (r0 == 0) goto L_0x008d
            q.a r8 = r8.f2916z
            goto L_0x0092
        L_0x008d:
            q.a r8 = new q.a
            r8.<init>(r4)
        L_0x0092:
            t.c r0 = r7.f3033a
            t.c$c r0 = r0.f2906p
            r0.a(r8)
            t.c r0 = r7.f3033a
            r0.K(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            q.a r0 = new q.a
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            t.c r8 = r7.f3033a
            t.c$c r8 = r8.f2906p
            r8.a(r0)
            t.c r8 = r7.f3033a
            r8.K(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            t.c r0 = r7.f3033a
            r0.g0(r3, (android.os.IInterface) null)
            t.c r0 = r7.f3033a
            t.c$a r1 = r0.f2911u
            if (r1 == 0) goto L_0x00d7
            t.c$a r0 = r0.f2911u
            int r1 = r8.arg2
            r0.a(r1)
        L_0x00d7:
            t.c r0 = r7.f3033a
            int r8 = r8.arg2
            r0.L(r8)
            t.c r8 = r7.f3033a
            t.c.e0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            t.c r0 = r7.f3033a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            a(r8)
            return
        L_0x00f4:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            t.t0 r8 = (t.t0) r8
            r8.c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.s0.handleMessage(android.os.Message):void");
    }
}
