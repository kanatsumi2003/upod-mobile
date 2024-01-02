package androidx.window.java.layout;

import a3.i0;
import d3.b;
import j.a;
import k2.n;
import k2.s;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import m2.d;
import t2.p;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends k implements p<i0, d<? super s>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    public final d<s> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(i0 i0Var, d<? super s> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(i0Var, dVar)).invokeSuspend(s.f2081a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c4 = d.c();
        int i3 = this.label;
        if (i3 == 0) {
            n.b(obj);
            b<T> bVar = this.$flow;
            WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(this.$consumer);
            this.label = 1;
            if (bVar.a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c4) {
                return c4;
            }
        } else if (i3 == 1) {
            n.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return s.f2081a;
    }
}
