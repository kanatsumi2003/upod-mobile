package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class l extends q {

    /* renamed from: i  reason: collision with root package name */
    private static final r.a f335i = new a();

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<Fragment> f336c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, l> f337d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, s> f338e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f339f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f340g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f341h = false;

    static class a implements r.a {
        a() {
        }

        public <T extends q> T a(Class<T> cls) {
            return new l(true);
        }
    }

    l(boolean z3) {
        this.f339f = z3;
    }

    static l g(s sVar) {
        return (l) new r(sVar, f335i).a(l.class);
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (j.H) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f340g = true;
    }

    /* access modifiers changed from: package-private */
    public boolean d(Fragment fragment) {
        return this.f336c.add(fragment);
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (j.H) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f337d.get(fragment.f184e);
        if (lVar != null) {
            lVar.c();
            this.f337d.remove(fragment.f184e);
        }
        s sVar = this.f338e.get(fragment.f184e);
        if (sVar != null) {
            sVar.a();
            this.f338e.remove(fragment.f184e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f336c.equals(lVar.f336c) && this.f337d.equals(lVar.f337d) && this.f338e.equals(lVar.f338e);
    }

    /* access modifiers changed from: package-private */
    public l f(Fragment fragment) {
        l lVar = this.f337d.get(fragment.f184e);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f339f);
        this.f337d.put(fragment.f184e, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> h() {
        return this.f336c;
    }

    public int hashCode() {
        return (((this.f336c.hashCode() * 31) + this.f337d.hashCode()) * 31) + this.f338e.hashCode();
    }

    /* access modifiers changed from: package-private */
    public s i(Fragment fragment) {
        s sVar = this.f338e.get(fragment.f184e);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s();
        this.f338e.put(fragment.f184e, sVar2);
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f340g;
    }

    /* access modifiers changed from: package-private */
    public boolean k(Fragment fragment) {
        return this.f336c.remove(fragment);
    }

    /* access modifiers changed from: package-private */
    public boolean l(Fragment fragment) {
        if (!this.f336c.contains(fragment)) {
            return true;
        }
        return this.f339f ? this.f340g : !this.f341h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f336c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f337d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f338e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
