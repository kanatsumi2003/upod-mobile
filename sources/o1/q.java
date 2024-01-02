package o1;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public class q implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f2590a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f2591b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f2592c = Charset.forName("UTF8");

    static final class a extends ByteArrayOutputStream {
        a() {
        }

        /* access modifiers changed from: package-private */
        public byte[] a() {
            return this.buf;
        }
    }

    protected static final void c(ByteBuffer byteBuffer, int i3) {
        int position = byteBuffer.position() % i3;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - position);
        }
    }

    protected static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b4 = byteBuffer.get() & 255;
            return b4 < 254 ? b4 : b4 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    protected static final void h(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        int size = byteArrayOutputStream.size() % i3;
        if (size != 0) {
            for (int i4 = 0; i4 < i3 - size; i4++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void j(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (f2591b) {
            byteArrayOutputStream.write(i3);
            i3 >>>= 8;
        } else {
            byteArrayOutputStream.write(i3 >>> 8);
        }
        byteArrayOutputStream.write(i3);
    }

    protected static final void k(ByteArrayOutputStream byteArrayOutputStream, double d4) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d4));
    }

    protected static final void l(ByteArrayOutputStream byteArrayOutputStream, float f4) {
        m(byteArrayOutputStream, Float.floatToIntBits(f4));
    }

    protected static final void m(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (f2591b) {
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(i3 >>> 8);
            byteArrayOutputStream.write(i3 >>> 16);
            i3 >>>= 24;
        } else {
            byteArrayOutputStream.write(i3 >>> 24);
            byteArrayOutputStream.write(i3 >>> 16);
            byteArrayOutputStream.write(i3 >>> 8);
        }
        byteArrayOutputStream.write(i3);
    }

    protected static final void n(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        if (f2591b) {
            byteArrayOutputStream.write((byte) ((int) j3));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 48)));
            j3 >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 56)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j3 >>> 8)));
        }
        byteArrayOutputStream.write((byte) ((int) j3));
    }

    protected static final void o(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (i3 < 254) {
            byteArrayOutputStream.write(i3);
        } else if (i3 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i3);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i3);
        }
    }

    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f4 = f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f4;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* access modifiers changed from: protected */
    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        r6.position(r6.position() + (r5 * 8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        r6.position(r6.position() + (r5 * 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(byte r5, java.nio.ByteBuffer r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 4
            r2 = 8
            switch(r5) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00da;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00a9;
                case 7: goto L_0x009d;
                case 8: goto L_0x0098;
                case 9: goto L_0x007d;
                case 10: goto L_0x0062;
                case 11: goto L_0x0051;
                case 12: goto L_0x0039;
                case 13: goto L_0x0020;
                case 14: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Message corrupted"
            r5.<init>(r6)
            throw r5
        L_0x000f:
            int r5 = e(r6)
            float[] r0 = new float[r5]
            c(r6, r1)
            java.nio.FloatBuffer r2 = r6.asFloatBuffer()
            r2.get(r0)
            goto L_0x008d
        L_0x0020:
            int r5 = e(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0029:
            if (r0 >= r5) goto L_0x004e
            java.lang.Object r2 = r4.f(r6)
            java.lang.Object r3 = r4.f(r6)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0039:
            int r5 = e(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0042:
            if (r0 >= r5) goto L_0x004e
            java.lang.Object r2 = r4.f(r6)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x0042
        L_0x004e:
            r0 = r1
            goto L_0x00e1
        L_0x0051:
            int r5 = e(r6)
            double[] r0 = new double[r5]
            c(r6, r2)
            java.nio.DoubleBuffer r1 = r6.asDoubleBuffer()
            r1.get(r0)
            goto L_0x0072
        L_0x0062:
            int r5 = e(r6)
            long[] r0 = new long[r5]
            c(r6, r2)
            java.nio.LongBuffer r1 = r6.asLongBuffer()
            r1.get(r0)
        L_0x0072:
            int r1 = r6.position()
            int r5 = r5 * 8
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00e1
        L_0x007d:
            int r5 = e(r6)
            int[] r0 = new int[r5]
            c(r6, r1)
            java.nio.IntBuffer r2 = r6.asIntBuffer()
            r2.get(r0)
        L_0x008d:
            int r2 = r6.position()
            int r5 = r5 * 4
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00e1
        L_0x0098:
            byte[] r0 = d(r6)
            goto L_0x00e1
        L_0x009d:
            byte[] r5 = d(r6)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r6 = f2592c
            r0.<init>(r5, r6)
            goto L_0x00e1
        L_0x00a9:
            c(r6, r2)
            double r5 = r6.getDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x00e1
        L_0x00b5:
            byte[] r5 = d(r6)
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r1 = f2592c
            r6.<init>(r5, r1)
            r5 = 16
            r0.<init>(r6, r5)
            goto L_0x00e1
        L_0x00c8:
            long r5 = r6.getLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x00e1
        L_0x00d1:
            int r5 = r6.getInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x00e1
        L_0x00da:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00e1
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.q.g(byte, java.nio.ByteBuffer):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i3 = 0;
        if (obj == null || obj.equals((Object) null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f2592c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f2592c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i3 < length) {
                m(byteArrayOutputStream, iArr[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i3 < length2) {
                n(byteArrayOutputStream, jArr[i3]);
                i3++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i3 < length3) {
                k(byteArrayOutputStream, dArr[i3]);
                i3++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            o(byteArrayOutputStream, list.size());
            for (Object p3 : list) {
                p(byteArrayOutputStream, p3);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            o(byteArrayOutputStream, fArr.length);
            h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i3 < length4) {
                l(byteArrayOutputStream, fArr[i3]);
                i3++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }
}
