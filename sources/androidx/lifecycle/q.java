package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f500a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f501b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f501b = true;
        Map<String, Object> map = this.f500a;
        if (map != null) {
            synchronized (map) {
                for (Object b4 : this.f500a.values()) {
                    b(b4);
                }
            }
        }
        c();
    }

    /* access modifiers changed from: protected */
    public void c() {
    }
}
