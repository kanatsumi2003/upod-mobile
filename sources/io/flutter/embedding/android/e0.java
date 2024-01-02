package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    private static e0 f1486c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f1487a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Long> f1488b = new PriorityQueue<>();

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicLong f1489b = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f1490a;

        private a(long j3) {
            this.f1490a = j3;
        }

        public static a b() {
            return c(f1489b.incrementAndGet());
        }

        public static a c(long j3) {
            return new a(j3);
        }

        public long d() {
            return this.f1490a;
        }
    }

    private e0() {
    }

    public static e0 a() {
        if (f1486c == null) {
            f1486c = new e0();
        }
        return f1486c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f1488b.isEmpty() && this.f1488b.peek().longValue() < aVar.f1490a) {
            this.f1487a.remove(this.f1488b.poll().longValue());
        }
        if (!this.f1488b.isEmpty() && this.f1488b.peek().longValue() == aVar.f1490a) {
            this.f1488b.poll();
        }
        MotionEvent motionEvent = this.f1487a.get(aVar.f1490a);
        this.f1487a.remove(aVar.f1490a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b4 = a.b();
        this.f1487a.put(b4.f1490a, MotionEvent.obtain(motionEvent));
        this.f1488b.add(Long.valueOf(b4.f1490a));
        return b4;
    }
}
