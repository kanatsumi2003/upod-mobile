package e3;

import a3.o1;
import k2.m;
import k2.s;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.j;
import m2.g;
import m2.h;
import t2.p;

public final class c<T> extends d implements d3.c<T> {

    /* renamed from: d  reason: collision with root package name */
    public final d3.c<T> f1174d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1175e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1176f;

    /* renamed from: g  reason: collision with root package name */
    private g f1177g;

    /* renamed from: h  reason: collision with root package name */
    private m2.d<? super s> f1178h;

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: d  reason: collision with root package name */
        public static final a f1179d = new a();

        a() {
            super(2);
        }

        public final Integer a(int i3, g.b bVar) {
            return Integer.valueOf(i3 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public c(d3.c<? super T> cVar, g gVar) {
        super(b.f1172d, h.f2357d);
        this.f1174d = cVar;
        this.f1175e = gVar;
        this.f1176f = ((Number) gVar.fold(0, a.f1179d)).intValue();
    }

    private final void b(g gVar, g gVar2, T t3) {
        if (gVar2 instanceof a) {
            e((a) gVar2, t3);
        }
        e.a(this, gVar);
        this.f1177g = gVar;
    }

    private final Object c(m2.d<? super s> dVar, T t3) {
        g context = dVar.getContext();
        o1.e(context);
        g gVar = this.f1177g;
        if (gVar != context) {
            b(context, gVar, t3);
        }
        this.f1178h = dVar;
        return d.f1180a.d(this.f1174d, t3, this);
    }

    private final void e(a aVar, Object obj) {
        throw new IllegalStateException(f.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f1170d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t3, m2.d<? super s> dVar) {
        try {
            Object c4 = c(dVar, t3);
            if (c4 == d.c()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return c4 == d.c() ? c4 : s.f2081a;
        } catch (Throwable th) {
            this.f1177g = new a(th);
            throw th;
        }
    }

    public e getCallerFrame() {
        m2.d<? super s> dVar = this.f1178h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        m2.d<? super s> dVar = this.f1178h;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f2357d : context;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b4 = m.b(obj);
        if (b4 != null) {
            this.f1177g = new a(b4);
        }
        m2.d<? super s> dVar = this.f1178h;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return d.c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
