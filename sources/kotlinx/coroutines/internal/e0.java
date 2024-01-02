package kotlinx.coroutines.internal;

import a3.a2;
import kotlin.jvm.internal.i;
import m2.g;

final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f2120a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f2121b;

    /* renamed from: c  reason: collision with root package name */
    private final a2<Object>[] f2122c;

    /* renamed from: d  reason: collision with root package name */
    private int f2123d;

    public e0(g gVar, int i3) {
        this.f2120a = gVar;
        this.f2121b = new Object[i3];
        this.f2122c = new a2[i3];
    }

    public final void a(a2<?> a2Var, Object obj) {
        Object[] objArr = this.f2121b;
        int i3 = this.f2123d;
        objArr[i3] = obj;
        a2<Object>[] a2VarArr = this.f2122c;
        this.f2123d = i3 + 1;
        a2VarArr[i3] = a2Var;
    }

    public final void b(g gVar) {
        int length = this.f2122c.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                a2<Object> a2Var = this.f2122c[length];
                i.b(a2Var);
                a2Var.o(gVar, this.f2121b[length]);
                if (i3 >= 0) {
                    length = i3;
                } else {
                    return;
                }
            }
        }
    }
}
