package r;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import r.a.d;
import r.f;
import s.h;
import t.c;
import t.i;
import t.o;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final C0047a<?, O> f2661a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f2662b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2663c;

    /* renamed from: r.a$a  reason: collision with other inner class name */
    public static abstract class C0047a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, t.d dVar, O o3, f.a aVar, f.b bVar) {
            return b(context, looper, dVar, o3, aVar, bVar);
        }

        public T b(Context context, Looper looper, t.d dVar, O o3, s.c cVar, h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: r.a$d$a  reason: collision with other inner class name */
        public interface C0048a extends d {
            Account a();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        Set<Scope> b();

        void c(String str);

        void d(i iVar, Set<Scope> set);

        boolean e();

        int f();

        boolean g();

        q.c[] h();

        String i();

        void j(c.C0050c cVar);

        String l();

        void m(c.e eVar);

        void n();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0047a<C, O> aVar, g<C> gVar) {
        o.i(aVar, "Cannot construct an Api with a null ClientBuilder");
        o.i(gVar, "Cannot construct an Api with a null ClientKey");
        this.f2663c = str;
        this.f2661a = aVar;
        this.f2662b = gVar;
    }

    public final C0047a<?, O> a() {
        return this.f2661a;
    }

    public final String b() {
        return this.f2663c;
    }
}
