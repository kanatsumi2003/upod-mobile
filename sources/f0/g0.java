package f0;

import java.util.concurrent.Executor;

final class g0 implements Executor {
    g0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
