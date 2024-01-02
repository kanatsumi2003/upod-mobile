package c1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o1.c;

class c implements o1.c, f {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f657a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f658b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<b>> f659c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f660d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f661e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, c.b> f662f;

    /* renamed from: g  reason: collision with root package name */
    private int f663g;

    /* renamed from: h  reason: collision with root package name */
    private final d f664h;

    /* renamed from: i  reason: collision with root package name */
    private WeakHashMap<c.C0041c, d> f665i;

    /* renamed from: j  reason: collision with root package name */
    private i f666j;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f667a;

        /* renamed from: b  reason: collision with root package name */
        int f668b;

        /* renamed from: c  reason: collision with root package name */
        long f669c;

        b(ByteBuffer byteBuffer, int i3, long j3) {
            this.f667a = byteBuffer;
            this.f668b = i3;
            this.f669c = j3;
        }
    }

    /* renamed from: c1.c$c  reason: collision with other inner class name */
    static class C0012c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f670a;

        C0012c(ExecutorService executorService) {
            this.f670a = executorService;
        }

        public void a(Runnable runnable) {
            this.f670a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        ExecutorService f671a = b1.a.e().b();

        e() {
        }

        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f671a) : new C0012c(this.f671a);
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f672a;

        /* renamed from: b  reason: collision with root package name */
        public final d f673b;

        f(c.a aVar, d dVar) {
            this.f672a = aVar;
            this.f673b = dVar;
        }
    }

    static class g implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f674a;

        /* renamed from: b  reason: collision with root package name */
        private final int f675b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f676c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i3) {
            this.f674a = flutterJNI;
            this.f675b = i3;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f676c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f674a.invokePlatformMessageEmptyResponseCallback(this.f675b);
            } else {
                this.f674a.invokePlatformMessageResponseCallback(this.f675b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f677a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f678b = new ConcurrentLinkedQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f679c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f677a = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void f() {
            if (this.f679c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f678b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f679c.set(false);
                    if (!this.f678b.isEmpty()) {
                        this.f677a.execute(new e(this));
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            this.f678b.add(runnable);
            this.f677a.execute(new d(this));
        }
    }

    interface i {
        d a(c.d dVar);
    }

    private static class j implements c.C0041c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f658b = new HashMap();
        this.f659c = new HashMap();
        this.f660d = new Object();
        this.f661e = new AtomicBoolean(false);
        this.f662f = new HashMap();
        this.f663g = 1;
        this.f664h = new g();
        this.f665i = new WeakHashMap<>();
        this.f657a = flutterJNI;
        this.f666j = iVar;
    }

    private void j(String str, f fVar, ByteBuffer byteBuffer, int i3, long j3) {
        f fVar2 = fVar;
        d dVar = fVar2 != null ? fVar2.f673b : null;
        b bVar = new b(this, str, fVar, byteBuffer, i3, j3);
        if (dVar == null) {
            dVar = this.f664h;
        }
        dVar.a(bVar);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i3) {
        if (fVar != null) {
            try {
                b1.b.e("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f672a.a(byteBuffer, new g(this.f657a, i3));
            } catch (Exception e4) {
                b1.b.c("DartMessenger", "Uncaught exception in binary message listener", e4);
            } catch (Error e5) {
                k(e5);
            }
        } else {
            b1.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f657a.invokePlatformMessageEmptyResponseCallback(i3);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(String str, f fVar, ByteBuffer byteBuffer, int i3, long j3) {
        j2.f.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i3);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f657a.cleanupMessageData(j3);
            j2.f.b();
        }
    }

    public c.C0041c a(c.d dVar) {
        d a4 = this.f666j.a(dVar);
        j jVar = new j();
        this.f665i.put(jVar, a4);
        return jVar;
    }

    public /* synthetic */ c.C0041c b() {
        return o1.b.a(this);
    }

    public void c(String str, c.a aVar) {
        d(str, aVar, (c.C0041c) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (c1.c.b) r10.next();
        j(r9, r8.f658b.get(r9), r11.f667a, r11.f668b, r11.f669c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.lang.String r9, o1.c.a r10, o1.c.C0041c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            b1.b.e(r10, r11)
            java.lang.Object r0 = r8.f660d
            monitor-enter(r0)
            java.util.Map<java.lang.String, c1.c$f> r10 = r8.f658b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<o1.c$c, c1.c$d> r0 = r8.f665i
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            c1.c$d r0 = (c1.c.d) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b1.b.e(r11, r1)
            java.lang.Object r11 = r8.f660d
            monitor-enter(r11)
            java.util.Map<java.lang.String, c1.c$f> r1 = r8.f658b     // Catch:{ all -> 0x009c }
            c1.c$f r2 = new c1.c$f     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<c1.c$b>> r10 = r8.f659c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            c1.c$b r11 = (c1.c.b) r11
            java.util.Map<java.lang.String, c1.c$f> r0 = r8.f658b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            c1.c$f r3 = (c1.c.f) r3
            java.nio.ByteBuffer r4 = r11.f667a
            int r5 = r11.f668b
            long r6 = r11.f669c
            r1 = r8
            r2 = r9
            r1.j(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.c.d(java.lang.String, o1.c$a, o1.c$c):void");
    }

    public void e(String str, ByteBuffer byteBuffer) {
        b1.b.e("DartMessenger", "Sending message over channel '" + str + "'");
        f(str, byteBuffer, (c.b) null);
    }

    public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
        j2.f.a("DartMessenger#send on " + str);
        try {
            b1.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i3 = this.f663g;
            this.f663g = i3 + 1;
            if (bVar != null) {
                this.f662f.put(Integer.valueOf(i3), bVar);
            }
            if (byteBuffer == null) {
                this.f657a.dispatchEmptyPlatformMessage(str, i3);
            } else {
                this.f657a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
        } finally {
            j2.f.b();
        }
    }

    public void g(int i3, ByteBuffer byteBuffer) {
        b1.b.e("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f662f.remove(Integer.valueOf(i3));
        if (remove != null) {
            try {
                b1.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e4) {
                b1.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e4);
            } catch (Error e5) {
                k(e5);
            }
        }
    }

    public void h(String str, ByteBuffer byteBuffer, int i3, long j3) {
        f fVar;
        boolean z3;
        b1.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f660d) {
            fVar = this.f658b.get(str);
            z3 = this.f661e.get() && fVar == null;
            if (z3) {
                if (!this.f659c.containsKey(str)) {
                    this.f659c.put(str, new LinkedList());
                }
                this.f659c.get(str).add(new b(byteBuffer, i3, j3));
            }
        }
        if (!z3) {
            j(str, fVar, byteBuffer, i3, j3);
        }
    }
}
