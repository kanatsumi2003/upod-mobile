package q;

import java.lang.ref.WeakReference;

abstract class v extends t {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f2647c = new WeakReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f2648b = f2647c;

    v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f2648b.get();
            if (bArr == null) {
                bArr = l();
                this.f2648b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] l();
}
