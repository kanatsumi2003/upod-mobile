package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.c0;
import n1.d;

public class w implements c0.d {

    /* renamed from: a  reason: collision with root package name */
    private final d f1564a;

    /* renamed from: b  reason: collision with root package name */
    private final c0.b f1565b = new c0.b();

    public w(d dVar) {
        this.f1564a = dVar;
    }

    public void a(KeyEvent keyEvent, c0.d.a aVar) {
        int action = keyEvent.getAction();
        boolean z3 = false;
        if (action == 0 || action == 1) {
            d.b bVar = new d.b(keyEvent, this.f1565b.a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z3 = true;
            }
            this.f1564a.e(bVar, z3, new v(aVar));
            return;
        }
        aVar.a(false);
    }
}
