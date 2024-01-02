package b1;

import e1.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f564e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f565f;

    /* renamed from: a  reason: collision with root package name */
    private d f566a;

    /* renamed from: b  reason: collision with root package name */
    private d1.a f567b;

    /* renamed from: c  reason: collision with root package name */
    private FlutterJNI.c f568c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f569d;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f570a;

        /* renamed from: b  reason: collision with root package name */
        private d1.a f571b;

        /* renamed from: c  reason: collision with root package name */
        private FlutterJNI.c f572c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f573d;

        /* renamed from: b1.a$b$a  reason: collision with other inner class name */
        private class C0008a implements ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            private int f574a;

            private C0008a() {
                this.f574a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i3 = this.f574a;
                this.f574a = i3 + 1;
                sb.append(i3);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f572c == null) {
                this.f572c = new FlutterJNI.c();
            }
            if (this.f573d == null) {
                this.f573d = Executors.newCachedThreadPool(new C0008a());
            }
            if (this.f570a == null) {
                this.f570a = new d(this.f572c.a(), this.f573d);
            }
        }

        public a a() {
            b();
            return new a(this.f570a, this.f571b, this.f572c, this.f573d);
        }
    }

    private a(d dVar, d1.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f566a = dVar;
        this.f567b = aVar;
        this.f568c = cVar;
        this.f569d = executorService;
    }

    public static a e() {
        f565f = true;
        if (f564e == null) {
            f564e = new b().a();
        }
        return f564e;
    }

    public d1.a a() {
        return this.f567b;
    }

    public ExecutorService b() {
        return this.f569d;
    }

    public d c() {
        return this.f566a;
    }

    public FlutterJNI.c d() {
        return this.f568c;
    }
}
