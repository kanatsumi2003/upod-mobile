package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f356a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f357b;

    /* renamed from: c  reason: collision with root package name */
    int f358c;

    /* renamed from: d  reason: collision with root package name */
    int f359d;

    /* renamed from: e  reason: collision with root package name */
    int f360e;

    /* renamed from: f  reason: collision with root package name */
    int f361f;

    /* renamed from: g  reason: collision with root package name */
    int f362g;

    /* renamed from: h  reason: collision with root package name */
    boolean f363h;

    /* renamed from: i  reason: collision with root package name */
    boolean f364i = true;

    /* renamed from: j  reason: collision with root package name */
    String f365j;

    /* renamed from: k  reason: collision with root package name */
    int f366k;

    /* renamed from: l  reason: collision with root package name */
    CharSequence f367l;

    /* renamed from: m  reason: collision with root package name */
    int f368m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f369n;

    /* renamed from: o  reason: collision with root package name */
    ArrayList<String> f370o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f371p;

    /* renamed from: q  reason: collision with root package name */
    boolean f372q = false;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<Runnable> f373r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f374a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f375b;

        /* renamed from: c  reason: collision with root package name */
        int f376c;

        /* renamed from: d  reason: collision with root package name */
        int f377d;

        /* renamed from: e  reason: collision with root package name */
        int f378e;

        /* renamed from: f  reason: collision with root package name */
        int f379f;

        /* renamed from: g  reason: collision with root package name */
        d.b f380g;

        /* renamed from: h  reason: collision with root package name */
        d.b f381h;

        a() {
        }

        a(int i3, Fragment fragment) {
            this.f374a = i3;
            this.f375b = fragment;
            d.b bVar = d.b.RESUMED;
            this.f380g = bVar;
            this.f381h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        this.f356a.add(aVar);
        aVar.f376c = this.f357b;
        aVar.f377d = this.f358c;
        aVar.f378e = this.f359d;
        aVar.f379f = this.f360e;
    }

    public abstract int d();

    public abstract int e();

    /* access modifiers changed from: package-private */
    public void f(int i3, Fragment fragment, String str, int i4) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f203x;
            if (str2 == null || str.equals(str2)) {
                fragment.f203x = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f203x + " now " + str);
            }
        }
        if (i3 != 0) {
            if (i3 != -1) {
                int i5 = fragment.f201v;
                if (i5 == 0 || i5 == i3) {
                    fragment.f201v = i3;
                    fragment.f202w = i3;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f201v + " now " + i3);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        c(new a(i4, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
