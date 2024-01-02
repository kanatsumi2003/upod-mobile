package t;

import android.accounts.Account;
import android.view.View;
import c.b;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f2926a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f2927b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f2928c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<r.a<?>, z> f2929d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2930e;

    /* renamed from: f  reason: collision with root package name */
    private final View f2931f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2932g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2933h;

    /* renamed from: i  reason: collision with root package name */
    private final d0.a f2934i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f2935j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f2936a;

        /* renamed from: b  reason: collision with root package name */
        private b<Scope> f2937b;

        /* renamed from: c  reason: collision with root package name */
        private String f2938c;

        /* renamed from: d  reason: collision with root package name */
        private String f2939d;

        /* renamed from: e  reason: collision with root package name */
        private d0.a f2940e = d0.a.f1036j;

        public d a() {
            return new d(this.f2936a, this.f2937b, (Map<r.a<?>, z>) null, 0, (View) null, this.f2938c, this.f2939d, this.f2940e, false);
        }

        public a b(String str) {
            this.f2938c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f2937b == null) {
                this.f2937b = new b<>();
            }
            this.f2937b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f2936a = account;
            return this;
        }

        public final a e(String str) {
            this.f2939d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<r.a<?>, z> map, int i3, View view, String str, String str2, d0.a aVar, boolean z3) {
        this.f2926a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f2927b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f2929d = map;
        this.f2931f = view;
        this.f2930e = i3;
        this.f2932g = str;
        this.f2933h = str2;
        this.f2934i = aVar == null ? d0.a.f1036j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (z zVar : map.values()) {
            hashSet.addAll(zVar.f3051a);
        }
        this.f2928c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f2926a;
    }

    public Account b() {
        Account account = this.f2926a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f2928c;
    }

    public String d() {
        return this.f2932g;
    }

    public Set<Scope> e() {
        return this.f2927b;
    }

    public final d0.a f() {
        return this.f2934i;
    }

    public final Integer g() {
        return this.f2935j;
    }

    public final String h() {
        return this.f2933h;
    }

    public final void i(Integer num) {
        this.f2935j = num;
    }
}
