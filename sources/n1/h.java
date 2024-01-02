package n1;

import b1.b;
import o1.g;
import o1.j;
import o1.k;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final k f2383a;

    /* renamed from: b  reason: collision with root package name */
    private final k.c f2384b;

    class a implements k.c {
        a() {
        }

        public void a(j jVar, k.d dVar) {
            dVar.a((Object) null);
        }
    }

    public h(c1.a aVar) {
        a aVar2 = new a();
        this.f2384b = aVar2;
        k kVar = new k(aVar, "flutter/navigation", g.f2577a);
        this.f2383a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        b.e("NavigationChannel", "Sending message to pop route.");
        this.f2383a.c("popRoute", (Object) null);
    }

    public void b(String str) {
        b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f2383a.c("pushRoute", str);
    }

    public void c(String str) {
        b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f2383a.c("setInitialRoute", str);
    }
}
