package o1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class s implements i<String> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f2595a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final s f2596b = new s();

    private s() {
    }

    /* renamed from: c */
    public String b(ByteBuffer byteBuffer) {
        int i3;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i3 = 0;
        }
        return new String(bArr, i3, remaining, f2595a);
    }

    /* renamed from: d */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f2595a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
