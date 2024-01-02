package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import s.d;
import s.e;
import s.e0;
import s.g0;
import t.o;

public class LifecycleCallback {

    /* renamed from: a  reason: collision with root package name */
    protected final e f778a;

    protected LifecycleCallback(e eVar) {
        this.f778a = eVar;
    }

    public static e c(Activity activity) {
        return d(new d(activity));
    }

    protected static e d(d dVar) {
        if (dVar.d()) {
            return g0.r1(dVar.b());
        }
        if (dVar.c()) {
            return e0.f(dVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static e getChimeraLifecycleFragmentImpl(d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity e4 = this.f778a.e();
        o.h(e4);
        return e4;
    }

    public void e(int i3, int i4, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
