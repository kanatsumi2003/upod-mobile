package q;

import java.util.Arrays;

final class u extends t {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2646b;

    u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2646b = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] c() {
        return this.f2646b;
    }
}
