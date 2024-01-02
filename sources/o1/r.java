package o1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o1.q;

public final class r implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final r f2593b = new r(q.f2590a);

    /* renamed from: a  reason: collision with root package name */
    private final q f2594a;

    public r(q qVar) {
        this.f2594a = qVar;
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public ByteBuffer a(Object obj) {
        q.a aVar = new q.a();
        aVar.write(0);
        this.f2594a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer b(j jVar) {
        q.a aVar = new q.a();
        this.f2594a.p(aVar, jVar.f2578a);
        this.f2594a.p(aVar, jVar.f2579b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer c(String str, String str2, Object obj, String str3) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f2594a.p(aVar, str);
        this.f2594a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f2594a.p(aVar, g((Throwable) obj));
        } else {
            this.f2594a.p(aVar, obj);
        }
        this.f2594a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public ByteBuffer d(String str, String str2, Object obj) {
        q.a aVar = new q.a();
        aVar.write(1);
        this.f2594a.p(aVar, str);
        this.f2594a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f2594a.p(aVar, g((Throwable) obj));
        } else {
            this.f2594a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f4 = this.f2594a.f(byteBuffer);
        Object f5 = this.f2594a.f(byteBuffer);
        if ((f4 instanceof String) && !byteBuffer.hasRemaining()) {
            return new j((String) f4, f5);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x004a
            goto L_0x001e
        L_0x0011:
            o1.q r0 = r4.f2594a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            o1.q r0 = r4.f2594a
            java.lang.Object r0 = r0.f(r5)
            o1.q r1 = r4.f2594a
            java.lang.Object r1 = r1.f(r5)
            o1.q r2 = r4.f2594a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x003a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x004a
        L_0x003a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x004a
            o1.e r5 = new o1.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L_0x004a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
