package r;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.m;
import f0.k;
import f0.l;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r.a;
import r.a.d;
import s.b;
import s.j;
import s.n;
import s.y;
import t.d;
import t.o;
import x.g;

public abstract class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2666a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2667b;

    /* renamed from: c  reason: collision with root package name */
    private final a<O> f2668c;

    /* renamed from: d  reason: collision with root package name */
    private final O f2669d;

    /* renamed from: e  reason: collision with root package name */
    private final b<O> f2670e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f2671f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2672g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    private final f f2673h;

    /* renamed from: i  reason: collision with root package name */
    private final j f2674i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f2675j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f2676c = new C0049a().a();

        /* renamed from: a  reason: collision with root package name */
        public final j f2677a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f2678b;

        /* renamed from: r.e$a$a  reason: collision with other inner class name */
        public static class C0049a {

            /* renamed from: a  reason: collision with root package name */
            private j f2679a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f2680b;

            public a a() {
                if (this.f2679a == null) {
                    this.f2679a = new s.a();
                }
                if (this.f2680b == null) {
                    this.f2680b = Looper.getMainLooper();
                }
                return new a(this.f2679a, this.f2680b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f2677a = jVar;
            this.f2678b = looper;
        }
    }

    private e(Context context, Activity activity, a<O> aVar, O o3, a aVar2) {
        o.i(context, "Null context is not permitted.");
        o.i(aVar, "Api must not be null.");
        o.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2666a = context.getApplicationContext();
        String str = null;
        if (g.i()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f2667b = str;
        this.f2668c = aVar;
        this.f2669d = o3;
        this.f2671f = aVar2.f2678b;
        b<O> a4 = b.a(aVar, o3, str);
        this.f2670e = a4;
        this.f2673h = new n(this);
        com.google.android.gms.common.api.internal.b x3 = com.google.android.gms.common.api.internal.b.x(this.f2666a);
        this.f2675j = x3;
        this.f2672g = x3.m();
        this.f2674i = aVar2.f2677a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            f.u(activity, x3, a4);
        }
        x3.b(this);
    }

    public e(Context context, a<O> aVar, O o3, a aVar2) {
        this(context, (Activity) null, aVar, o3, aVar2);
    }

    private final <TResult, A extends a.b> k<TResult> i(int i3, c<A, TResult> cVar) {
        l lVar = new l();
        this.f2675j.D(this, i3, cVar, lVar, this.f2674i);
        return lVar.a();
    }

    /* access modifiers changed from: protected */
    public d.a b() {
        Account account;
        GoogleSignInAccount b4;
        GoogleSignInAccount b5;
        d.a aVar = new d.a();
        O o3 = this.f2669d;
        if (!(o3 instanceof a.d.b) || (b5 = ((a.d.b) o3).b()) == null) {
            O o4 = this.f2669d;
            account = o4 instanceof a.d.C0048a ? ((a.d.C0048a) o4).a() : null;
        } else {
            account = b5.b();
        }
        aVar.d(account);
        O o5 = this.f2669d;
        aVar.c((!(o5 instanceof a.d.b) || (b4 = ((a.d.b) o5).b()) == null) ? Collections.emptySet() : b4.j());
        aVar.e(this.f2666a.getClass().getName());
        aVar.b(this.f2666a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> k<TResult> c(c<A, TResult> cVar) {
        return i(2, cVar);
    }

    public final b<O> d() {
        return this.f2670e;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return this.f2667b;
    }

    public final int f() {
        return this.f2672g;
    }

    public final a.f g(Looper looper, m<O> mVar) {
        Looper looper2 = looper;
        a.f a4 = ((a.C0047a) o.h(this.f2668c.a())).a(this.f2666a, looper2, b().a(), this.f2669d, mVar, mVar);
        String e4 = e();
        if (e4 != null && (a4 instanceof t.c)) {
            ((t.c) a4).O(e4);
        }
        if (e4 != null && (a4 instanceof s.g)) {
            ((s.g) a4).r(e4);
        }
        return a4;
    }

    public final y h(Context context, Handler handler) {
        return new y(context, handler, b().a());
    }
}
