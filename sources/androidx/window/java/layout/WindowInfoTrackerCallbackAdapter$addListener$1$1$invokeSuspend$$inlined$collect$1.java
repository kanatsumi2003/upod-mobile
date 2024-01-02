package androidx.window.java.layout;

import d3.c;
import j.a;
import k2.s;
import m2.d;

public final class WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 implements c<T> {
    final /* synthetic */ a $consumer$inlined;

    public WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1(a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t3, d<? super s> dVar) {
        this.$consumer$inlined.accept(t3);
        return s.f2081a;
    }
}
