package kotlinx.coroutines.internal;

import a3.u1;
import k2.d;
import kotlin.jvm.internal.i;
import m2.g;

final class r extends u1 {

    /* renamed from: e  reason: collision with root package name */
    private final Throwable f2154e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2155f;

    public r(Throwable th, String str) {
        this.f2154e = th;
        this.f2155f = str;
    }

    private final Void s() {
        String j3;
        if (this.f2154e != null) {
            String str = this.f2155f;
            String str2 = "";
            if (!(str == null || (j3 = i.j(". ", str)) == null)) {
                str2 = j3;
            }
            throw new IllegalStateException(i.j("Module with the Main dispatcher had failed to initialize", str2), this.f2154e);
        }
        q.c();
        throw new d();
    }

    public boolean g(g gVar) {
        s();
        throw new d();
    }

    public u1 k() {
        return this;
    }

    /* renamed from: q */
    public Void f(g gVar, Runnable runnable) {
        s();
        throw new d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f2154e;
        sb.append(th != null ? i.j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
