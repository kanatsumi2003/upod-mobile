package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f520a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f521b = new SavedStateRegistry();

    private a(b bVar) {
        this.f520a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f521b;
    }

    public void c(Bundle bundle) {
        d a4 = this.f520a.a();
        if (a4.b() == d.b.INITIALIZED) {
            a4.a(new Recreator(this.f520a));
            this.f521b.b(a4, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f521b.c(bundle);
    }
}
