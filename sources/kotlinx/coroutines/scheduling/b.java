package kotlinx.coroutines.scheduling;

import a3.f0;
import kotlin.jvm.internal.e;
import kotlinx.coroutines.internal.y;

public final class b extends c {

    /* renamed from: k  reason: collision with root package name */
    public static final b f2192k;

    /* renamed from: l  reason: collision with root package name */
    private static final f0 f2193l;

    static {
        b bVar = new b();
        f2192k = bVar;
        f2193l = new e(bVar, a0.d("kotlinx.coroutines.io.parallelism", f.a(64, y.a()), 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, (String) null, 7, (e) null);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final f0 q() {
        return f2193l;
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
