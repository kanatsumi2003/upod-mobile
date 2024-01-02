package u0;

import android.util.Log;
import java.io.InputStream;

public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final Runtime f3085f = Runtime.getRuntime();

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f3086a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f3087b;

    /* renamed from: c  reason: collision with root package name */
    private int f3088c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3089d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3090e = true;

    public b(InputStream inputStream, int i3) {
        this.f3086a = inputStream;
        this.f3087b = new byte[i3];
    }

    private int g(int i3) {
        int max = Math.max(this.f3087b.length * 2, i3);
        Runtime runtime = f3085f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f3090e || ((long) max) >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f3087b, 0, bArr, 0, this.f3088c);
                this.f3087b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f3090e = false;
            }
        }
        return this.f3087b.length;
    }

    public int a(int i3) {
        int i4 = this.f3088c;
        int i5 = 0;
        if (i3 <= i4) {
            int i6 = i4 - i3;
            this.f3088c = i6;
            byte[] bArr = this.f3087b;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            return i3;
        }
        this.f3088c = 0;
        while (i5 < i3) {
            int skip = (int) this.f3086a.skip((long) (i3 - i5));
            if (skip > 0) {
                i5 += skip;
            } else if (skip != 0) {
                continue;
            } else if (this.f3086a.read() == -1) {
                break;
            } else {
                i5++;
            }
        }
        return i5;
    }

    public int b() {
        return this.f3088c;
    }

    public void c() {
        this.f3086a.close();
    }

    public int d(int i3) {
        if (i3 > this.f3087b.length) {
            i3 = Math.min(i3, g(i3));
        }
        while (true) {
            int i4 = this.f3088c;
            if (i4 >= i3) {
                break;
            }
            int read = this.f3086a.read(this.f3087b, i4, i3 - i4);
            if (read == -1) {
                this.f3089d = true;
                break;
            }
            this.f3088c += read;
        }
        return this.f3088c;
    }

    public byte[] e() {
        return this.f3087b;
    }

    public boolean f() {
        return this.f3089d;
    }
}
