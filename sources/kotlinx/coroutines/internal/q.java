package kotlinx.coroutines.internal;

import a3.u1;
import java.util.List;
import k2.d;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f2153a = true;

    private static final r a(Throwable th, String str) {
        if (f2153a) {
            return new r(th, str);
        }
        if (th == null) {
            c();
            throw new d();
        }
        throw th;
    }

    static /* synthetic */ r b(Throwable th, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final Void c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final u1 d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
