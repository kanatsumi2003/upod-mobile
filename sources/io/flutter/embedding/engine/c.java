package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import e1.d;
import g1.a;
import h1.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j2.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o1.m;
import o1.n;
import o1.o;
import o1.p;

class c implements g1.b, h1.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends g1.a>, g1.a> f1605a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f1606b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f1607c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends g1.a>, h1.a> f1608d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f1609e;

    /* renamed from: f  reason: collision with root package name */
    private C0026c f1610f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1611g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends g1.a>, k1.a> f1612h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Service f1613i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<? extends g1.a>, i1.a> f1614j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private BroadcastReceiver f1615k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<? extends g1.a>, j1.a> f1616l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private ContentProvider f1617m;

    private static class b implements a.C0023a {

        /* renamed from: a  reason: collision with root package name */
        final d f1618a;

        private b(d dVar) {
            this.f1618a = dVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c  reason: collision with other inner class name */
    private static class C0026c implements h1.c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f1619a;

        /* renamed from: b  reason: collision with root package name */
        private final HiddenLifecycleReference f1620b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<o> f1621c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f1622d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<n> f1623e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<p> f1624f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<c.a> f1625g = new HashSet();

        public C0026c(Activity activity, androidx.lifecycle.d dVar) {
            this.f1619a = activity;
            this.f1620b = new HiddenLifecycleReference(dVar);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i3, int i4, Intent intent) {
            Iterator it = new HashSet(this.f1622d).iterator();
            while (true) {
                boolean z3 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z3;
                    }
                    if (((m) it.next()).a(i3, i4, intent) || z3) {
                        z3 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(Intent intent) {
            for (n b4 : this.f1623e) {
                b4.b(intent);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i3, String[] strArr, int[] iArr) {
            Iterator<o> it = this.f1621c.iterator();
            while (true) {
                boolean z3 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z3;
                    }
                    if (it.next().onRequestPermissionsResult(i3, strArr, iArr) || z3) {
                        z3 = true;
                    }
                }
            }
        }

        public Activity d() {
            return this.f1619a;
        }

        public void e(o oVar) {
            this.f1621c.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public void f(Bundle bundle) {
            for (c.a c4 : this.f1625g) {
                c4.c(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(Bundle bundle) {
            for (c.a d4 : this.f1625g) {
                d4.d(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            for (p e4 : this.f1624f) {
                e4.e();
            }
        }
    }

    c(Context context, a aVar, d dVar) {
        this.f1606b = aVar;
        this.f1607c = new a.b(context, aVar, aVar.h(), aVar.p(), aVar.n().N(), new b(dVar));
    }

    private void j(Activity activity, androidx.lifecycle.d dVar) {
        this.f1610f = new C0026c(activity, dVar);
        this.f1606b.n().f0(activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.f1606b.n().z(activity, this.f1606b.p(), this.f1606b.h());
        for (h1.a next : this.f1608d.values()) {
            if (this.f1611g) {
                next.b(this.f1610f);
            } else {
                next.a(this.f1610f);
            }
        }
        this.f1611g = false;
    }

    private void l() {
        this.f1606b.n().H();
        this.f1609e = null;
        this.f1610f = null;
    }

    private void m() {
        if (r()) {
            i();
        } else if (u()) {
            p();
        } else if (s()) {
            n();
        } else if (t()) {
            o();
        }
    }

    private boolean r() {
        return this.f1609e != null;
    }

    private boolean s() {
        return this.f1615k != null;
    }

    private boolean t() {
        return this.f1617m != null;
    }

    private boolean u() {
        return this.f1613i != null;
    }

    public boolean a(int i3, int i4, Intent intent) {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f1610f.a(i3, i4, intent);
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public void b(Intent intent) {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f1610f.b(intent);
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public void c(Bundle bundle) {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f1610f.f(bundle);
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    public void d(Bundle bundle) {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f1610f.g(bundle);
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    public void e() {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f1610f.h();
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void f(g1.a aVar) {
        f.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (q(aVar.getClass())) {
                b1.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f1606b + ").");
                return;
            }
            b1.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f1605a.put(aVar.getClass(), aVar);
            aVar.h(this.f1607c);
            if (aVar instanceof h1.a) {
                h1.a aVar2 = (h1.a) aVar;
                this.f1608d.put(aVar.getClass(), aVar2);
                if (r()) {
                    aVar2.a(this.f1610f);
                }
            }
            if (aVar instanceof k1.a) {
                k1.a aVar3 = (k1.a) aVar;
                this.f1612h.put(aVar.getClass(), aVar3);
                if (u()) {
                    aVar3.b((k1.b) null);
                }
            }
            if (aVar instanceof i1.a) {
                i1.a aVar4 = (i1.a) aVar;
                this.f1614j.put(aVar.getClass(), aVar4);
                if (s()) {
                    aVar4.a((i1.b) null);
                }
            }
            if (aVar instanceof j1.a) {
                j1.a aVar5 = (j1.a) aVar;
                this.f1616l.put(aVar.getClass(), aVar5);
                if (t()) {
                    aVar5.b((j1.b) null);
                }
            }
            f.b();
        } finally {
            f.b();
        }
    }

    public void g(io.flutter.embedding.android.c<Activity> cVar, androidx.lifecycle.d dVar) {
        f.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f1609e;
            if (cVar2 != null) {
                cVar2.e();
            }
            m();
            this.f1609e = cVar;
            j(cVar.f(), dVar);
        } finally {
            f.b();
        }
    }

    public void h() {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f1611g = true;
                for (h1.a d4 : this.f1608d.values()) {
                    d4.d();
                }
                l();
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void i() {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (h1.a c4 : this.f1608d.values()) {
                    c4.c();
                }
                l();
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void k() {
        b1.b.e("FlutterEngineCxnRegstry", "Destroying.");
        m();
        x();
    }

    public void n() {
        if (s()) {
            f.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (i1.a b4 : this.f1614j.values()) {
                    b4.b();
                }
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void o() {
        if (t()) {
            f.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (j1.a a4 : this.f1616l.values()) {
                    a4.a();
                }
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (r()) {
            f.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f1610f.c(i3, strArr, iArr);
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void p() {
        if (u()) {
            f.a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (k1.a a4 : this.f1612h.values()) {
                    a4.a();
                }
                this.f1613i = null;
            } finally {
                f.b();
            }
        } else {
            b1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public boolean q(Class<? extends g1.a> cls) {
        return this.f1605a.containsKey(cls);
    }

    public void v(Class<? extends g1.a> cls) {
        g1.a aVar = this.f1605a.get(cls);
        if (aVar != null) {
            f.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof h1.a) {
                    if (r()) {
                        ((h1.a) aVar).c();
                    }
                    this.f1608d.remove(cls);
                }
                if (aVar instanceof k1.a) {
                    if (u()) {
                        ((k1.a) aVar).a();
                    }
                    this.f1612h.remove(cls);
                }
                if (aVar instanceof i1.a) {
                    if (s()) {
                        ((i1.a) aVar).b();
                    }
                    this.f1614j.remove(cls);
                }
                if (aVar instanceof j1.a) {
                    if (t()) {
                        ((j1.a) aVar).a();
                    }
                    this.f1616l.remove(cls);
                }
                aVar.f(this.f1607c);
                this.f1605a.remove(cls);
            } finally {
                f.b();
            }
        }
    }

    public void w(Set<Class<? extends g1.a>> set) {
        for (Class<? extends g1.a> v3 : set) {
            v(v3);
        }
    }

    public void x() {
        w(new HashSet(this.f1605a.keySet()));
        this.f1605a.clear();
    }
}
