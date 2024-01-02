package kotlinx.coroutines.internal;

import a3.a2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m2.g;
import t2.p;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x f2109a = new x("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, g.b, Object> f2110b = a.f2113d;

    /* renamed from: c  reason: collision with root package name */
    private static final p<a2<?>, g.b, a2<?>> f2111c = b.f2114d;

    /* renamed from: d  reason: collision with root package name */
    private static final p<e0, g.b, e0> f2112d = c.f2115d;

    static final class a extends j implements p<Object, g.b, Object> {

        /* renamed from: d  reason: collision with root package name */
        public static final a f2113d = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof a2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends j implements p<a2<?>, g.b, a2<?>> {

        /* renamed from: d  reason: collision with root package name */
        public static final b f2114d = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final a2<?> invoke(a2<?> a2Var, g.b bVar) {
            if (a2Var != null) {
                return a2Var;
            }
            if (bVar instanceof a2) {
                return (a2) bVar;
            }
            return null;
        }
    }

    static final class c extends j implements p<e0, g.b, e0> {

        /* renamed from: d  reason: collision with root package name */
        public static final c f2115d = new c();

        c() {
            super(2);
        }

        /* renamed from: a */
        public final e0 invoke(e0 e0Var, g.b bVar) {
            if (bVar instanceof a2) {
                a2 a2Var = (a2) bVar;
                e0Var.a(a2Var, a2Var.l(e0Var.f2120a));
            }
            return e0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f2109a) {
            if (obj instanceof e0) {
                ((e0) obj).b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f2111c);
            if (fold != null) {
                ((a2) fold).o(gVar, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(g gVar) {
        Object fold = gVar.fold(0, f2110b);
        i.b(fold);
        return fold;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f2109a : obj instanceof Integer ? gVar.fold(new e0(gVar, ((Number) obj).intValue()), f2112d) : ((a2) obj).l(gVar);
    }
}
