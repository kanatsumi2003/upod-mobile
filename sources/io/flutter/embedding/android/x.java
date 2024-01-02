package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class x {

    /* renamed from: a  reason: collision with root package name */
    long f1566a;

    /* renamed from: b  reason: collision with root package name */
    a f1567b;

    /* renamed from: c  reason: collision with root package name */
    long f1568c;

    /* renamed from: d  reason: collision with root package name */
    long f1569d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1570e;

    /* renamed from: f  reason: collision with root package name */
    String f1571f;

    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: d  reason: collision with root package name */
        private long f1576d;

        private a(long j3) {
            this.f1576d = j3;
        }

        public long a() {
            return this.f1576d;
        }
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer a() {
        try {
            String str = this.f1571f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) length);
            allocateDirect.putLong(this.f1566a);
            allocateDirect.putLong(this.f1567b.a());
            allocateDirect.putLong(this.f1568c);
            allocateDirect.putLong(this.f1569d);
            allocateDirect.putLong(this.f1570e ? 1 : 0);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
