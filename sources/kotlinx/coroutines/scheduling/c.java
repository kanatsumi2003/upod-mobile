package kotlinx.coroutines.scheduling;

import a3.b1;
import a3.n0;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.e;
import m2.g;

public class c extends b1 {

    /* renamed from: f  reason: collision with root package name */
    private final int f2194f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2195g;

    /* renamed from: h  reason: collision with root package name */
    private final long f2196h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2197i;

    /* renamed from: j  reason: collision with root package name */
    private a f2198j;

    public c(int i3, int i4, long j3, String str) {
        this.f2194f = i3;
        this.f2195g = i4;
        this.f2196h = j3;
        this.f2197i = str;
        this.f2198j = k();
    }

    public c(int i3, int i4, String str) {
        this(i3, i4, l.f2215e, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i4, String str, int i5, e eVar) {
        this((i5 & 1) != 0 ? l.f2213c : i3, (i5 & 2) != 0 ? l.f2214d : i4, (i5 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a k() {
        return new a(this.f2194f, this.f2195g, this.f2196h, this.f2197i);
    }

    public void f(g gVar, Runnable runnable) {
        try {
            a.f(this.f2198j, runnable, (j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            n0.f81j.f(gVar, runnable);
        }
    }

    public final void p(Runnable runnable, j jVar, boolean z3) {
        try {
            this.f2198j.e(runnable, jVar, z3);
        } catch (RejectedExecutionException unused) {
            n0.f81j.E(this.f2198j.c(runnable, jVar));
        }
    }
}
