package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    static final g f273b = new g();

    /* renamed from: a  reason: collision with root package name */
    private g f274a = null;

    public interface a {
        void onBackStackChanged();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(String str);

    public g d() {
        if (this.f274a == null) {
            this.f274a = f273b;
        }
        return this.f274a;
    }

    public abstract List<Fragment> e();

    public abstract void f(int i3, int i4);

    public abstract boolean g();

    public void h(g gVar) {
        this.f274a = gVar;
    }
}
