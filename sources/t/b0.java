package t;

import android.app.Activity;
import android.content.Intent;

final class b0 extends d0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f2888a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f2889b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2890c;

    b0(Intent intent, Activity activity, int i3) {
        this.f2888a = intent;
        this.f2889b = activity;
        this.f2890c = i3;
    }

    public final void a() {
        Intent intent = this.f2888a;
        if (intent != null) {
            this.f2889b.startActivityForResult(intent, this.f2890c);
        }
    }
}
