package kotlinx.coroutines.internal;

import a3.u1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f2150a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f2151b = y.e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c  reason: collision with root package name */
    public static final u1 f2152c;

    static {
        p pVar = new p();
        f2150a = pVar;
        f2152c = pVar.a();
    }

    private p() {
    }

    private final u1 a() {
        T t3;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            List<MainDispatcherFactory> c4 = f2151b ? h.f2131a.c() : h.e(f.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = c4.iterator();
            if (!it.hasNext()) {
                t3 = null;
            } else {
                t3 = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) t3).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t3 = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t3;
            return mainDispatcherFactory == null ? q.b((Throwable) null, (String) null, 3, (Object) null) : q.d(mainDispatcherFactory, c4);
        } catch (Throwable th) {
            return q.b(th, (String) null, 2, (Object) null);
        }
    }
}
