package a3;

import java.io.Closeable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import m2.b;
import m2.g;
import t2.l;

public abstract class b1 extends f0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f43e = new a((e) null);

    public static final class a extends b<f0, b1> {

        /* renamed from: a3.b1$a$a  reason: collision with other inner class name */
        static final class C0001a extends j implements l<g.b, b1> {

            /* renamed from: d  reason: collision with root package name */
            public static final C0001a f44d = new C0001a();

            C0001a() {
                super(1);
            }

            /* renamed from: a */
            public final b1 invoke(g.b bVar) {
                if (bVar instanceof b1) {
                    return (b1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(f0.f56d, C0001a.f44d);
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }
}
