package v2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

public final class a extends u2.a {
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
