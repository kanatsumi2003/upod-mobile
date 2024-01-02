package l0;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o0.a;
import o0.b;
import o0.c;
import o0.d;

class v implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f2286a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<a<?>> f2287b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2288c;

    v(Executor executor) {
        this.f2288c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> d(a<?> aVar) {
        Map map;
        map = this.f2286a.get(aVar.a());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new l0.u(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = d(r5).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(o0.a<?> r5) {
        /*
            r4 = this;
            l0.d0.b(r5)
            monitor-enter(r4)
            java.util.Queue<o0.a<?>> r0 = r4.f2287b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.d(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            l0.u r3 = new l0.u
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v.a(o0.a):void");
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.f2287b;
            if (queue != null) {
                this.f2287b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a<?> a4 : queue) {
                a(a4);
            }
        }
    }
}
