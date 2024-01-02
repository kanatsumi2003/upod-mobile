package e3;

import a3.k1;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.internal.v;
import m2.g;
import t2.p;

public final class e {

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c<?> f1182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f1182d = cVar;
        }

        public final Integer a(int i3, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVar2 = this.f1182d.f1175e.get(key);
            if (key != k1.f72a) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i3 + 1);
            }
            k1 k1Var = (k1) bVar2;
            k1 b4 = e.b((k1) bVar, k1Var);
            if (b4 == k1Var) {
                if (k1Var != null) {
                    i3++;
                }
                return Integer.valueOf(i3);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b4 + ", expected child of " + k1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.fold(0, new a(cVar))).intValue() != cVar.f1176f) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f1175e + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final k1 b(k1 k1Var, k1 k1Var2) {
        while (k1Var != null) {
            if (k1Var == k1Var2 || !(k1Var instanceof v)) {
                return k1Var;
            }
            k1Var = ((v) k1Var).w0();
        }
        return null;
    }
}
