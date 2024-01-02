package b3;

import a3.o1;
import a3.s0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k2.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import m2.g;

public final class a extends b {
    private volatile a _immediate;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f590e;

    /* renamed from: f  reason: collision with root package name */
    private final String f591f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f592g;

    /* renamed from: h  reason: collision with root package name */
    private final a f593h;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Handler handler, String str, int i3, e eVar) {
        this(handler, (i3 & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Handler handler, String str, boolean z3) {
        super((e) null);
        a aVar = null;
        this.f590e = handler;
        this.f591f = str;
        this.f592g = z3;
        this._immediate = z3 ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
            s sVar = s.f2081a;
        }
        this.f593h = aVar2;
    }

    private final void q(g gVar, Runnable runnable) {
        o1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        s0.b().f(gVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f590e == this.f590e;
    }

    public void f(g gVar, Runnable runnable) {
        if (!this.f590e.post(runnable)) {
            q(gVar, runnable);
        }
    }

    public boolean g(g gVar) {
        return !this.f592g || !i.a(Looper.myLooper(), this.f590e.getLooper());
    }

    public int hashCode() {
        return System.identityHashCode(this.f590e);
    }

    /* renamed from: s */
    public a k() {
        return this.f593h;
    }

    public String toString() {
        String p3 = p();
        if (p3 != null) {
            return p3;
        }
        String str = this.f591f;
        if (str == null) {
            str = this.f590e.toString();
        }
        return this.f592g ? i.j(str, ".immediate") : str;
    }
}
