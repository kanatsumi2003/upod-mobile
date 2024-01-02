package kotlinx.coroutines;

import m2.g;

public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2102b = a.f2103d;

    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ a f2103d = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
