package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import c.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f505c = false;

    /* renamed from: a  reason: collision with root package name */
    private final g f506a;

    /* renamed from: b  reason: collision with root package name */
    private final C0005b f507b;

    public static class a<D> extends l<D> {

        /* renamed from: k  reason: collision with root package name */
        private final int f508k;

        /* renamed from: l  reason: collision with root package name */
        private final Bundle f509l;

        /* renamed from: m  reason: collision with root package name */
        private g f510m;

        /* access modifiers changed from: protected */
        public void d() {
            if (b.f505c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (b.f505c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.f510m = null;
        }

        public void g(D d4) {
            super.g(d4);
        }

        /* access modifiers changed from: package-private */
        public l.a<D> h(boolean z3) {
            if (b.f505c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f508k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f509l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void j() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f508k);
            sb.append(" : ");
            j.b.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    static class C0005b extends q {

        /* renamed from: e  reason: collision with root package name */
        private static final r.a f511e = new a();

        /* renamed from: c  reason: collision with root package name */
        private f<a> f512c = new f<>();

        /* renamed from: d  reason: collision with root package name */
        private boolean f513d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements r.a {
            a() {
            }

            public <T extends q> T a(Class<T> cls) {
                return new C0005b();
            }
        }

        C0005b() {
        }

        static C0005b e(s sVar) {
            return (C0005b) new r(sVar, f511e).a(C0005b.class);
        }

        /* access modifiers changed from: protected */
        public void c() {
            super.c();
            int j3 = this.f512c.j();
            for (int i3 = 0; i3 < j3; i3++) {
                this.f512c.k(i3).h(true);
            }
            this.f512c.a();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f512c.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i3 = 0; i3 < this.f512c.j(); i3++) {
                    a k3 = this.f512c.k(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f512c.g(i3));
                    printWriter.print(": ");
                    printWriter.println(k3.toString());
                    k3.i(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            int j3 = this.f512c.j();
            for (int i3 = 0; i3 < j3; i3++) {
                this.f512c.k(i3).j();
            }
        }
    }

    b(g gVar, s sVar) {
        this.f506a = gVar;
        this.f507b = C0005b.e(sVar);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f507b.d(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f507b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        j.b.a(this.f506a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
