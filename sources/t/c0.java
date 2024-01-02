package t;

import android.content.Intent;
import s.e;

final class c0 extends d0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f2918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f2919b;

    c0(Intent intent, e eVar, int i3) {
        this.f2918a = intent;
        this.f2919b = eVar;
    }

    public final void a() {
        Intent intent = this.f2918a;
        if (intent != null) {
            this.f2919b.startActivityForResult(intent, 2);
        }
    }
}
