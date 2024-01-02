package f2;

import android.os.SystemClock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f1248a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1249b = SystemClock.elapsedRealtime();

    private c(long j3) {
        this.f1248a = j3;
    }

    public static c a(long j3) {
        return new c(j3);
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f1249b > this.f1248a;
    }
}
