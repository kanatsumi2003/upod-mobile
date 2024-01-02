package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import j.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f268a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f269b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f270c;

    /* renamed from: d  reason: collision with root package name */
    private final int f271d;

    /* renamed from: e  reason: collision with root package name */
    final j f272e;

    h(Activity activity, Context context, Handler handler, int i3) {
        this.f272e = new j();
        this.f268a = activity;
        this.f269b = (Context) d.b(context, "context == null");
        this.f270c = (Handler) d.b(handler, "handler == null");
        this.f271d = i3;
    }

    h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    public View c(int i3) {
        return null;
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity f() {
        return this.f268a;
    }

    /* access modifiers changed from: package-private */
    public Context g() {
        return this.f269b;
    }

    /* access modifiers changed from: package-private */
    public Handler j() {
        return this.f270c;
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f269b);
    }

    public int o() {
        return this.f271d;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i3, Bundle bundle) {
        if (i3 == -1) {
            this.f269b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void s() {
    }
}
