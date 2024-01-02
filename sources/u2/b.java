package u2;

import java.util.Random;
import kotlin.jvm.internal.i;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    private final a f3110f = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random c() {
        Object obj = this.f3110f.get();
        i.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
