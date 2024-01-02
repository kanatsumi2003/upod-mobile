package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.t;
import j.d;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f266a;

    private f(h<?> hVar) {
        this.f266a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) d.b(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f266a;
        hVar.f272e.o(hVar, hVar, fragment);
    }

    public void c() {
        this.f266a.f272e.x();
    }

    public void d(Configuration configuration) {
        this.f266a.f272e.y(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f266a.f272e.z(menuItem);
    }

    public void f() {
        this.f266a.f272e.A();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f266a.f272e.B(menu, menuInflater);
    }

    public void h() {
        this.f266a.f272e.C();
    }

    public void i() {
        this.f266a.f272e.E();
    }

    public void j(boolean z3) {
        this.f266a.f272e.F(z3);
    }

    public boolean k(MenuItem menuItem) {
        return this.f266a.f272e.U(menuItem);
    }

    public void l(Menu menu) {
        this.f266a.f272e.V(menu);
    }

    public void m() {
        this.f266a.f272e.X();
    }

    public void n(boolean z3) {
        this.f266a.f272e.Y(z3);
    }

    public boolean o(Menu menu) {
        return this.f266a.f272e.Z(menu);
    }

    public void p() {
        this.f266a.f272e.b0();
    }

    public void q() {
        this.f266a.f272e.c0();
    }

    public void r() {
        this.f266a.f272e.e0();
    }

    public boolean s() {
        return this.f266a.f272e.k0();
    }

    public Fragment t(String str) {
        return this.f266a.f272e.p0(str);
    }

    public i u() {
        return this.f266a.f272e;
    }

    public void v() {
        this.f266a.f272e.R0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f266a.f272e.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f266a;
        if (hVar instanceof t) {
            hVar.f272e.b1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.f266a.f272e.d1();
    }
}
