package n1;

import b1.b;
import o1.a;
import o1.s;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final a<String> f2374a;

    public e(c1.a aVar) {
        this.f2374a = new a<>(aVar, "flutter/lifecycle", s.f2596b);
    }

    public void a() {
        b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f2374a.c("AppLifecycleState.detached");
    }

    public void b() {
        b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f2374a.c("AppLifecycleState.inactive");
    }

    public void c() {
        b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f2374a.c("AppLifecycleState.paused");
    }

    public void d() {
        b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f2374a.c("AppLifecycleState.resumed");
    }
}
