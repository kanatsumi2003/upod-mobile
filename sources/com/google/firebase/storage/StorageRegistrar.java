package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g0.d;
import i0.b;
import java.util.Arrays;
import java.util.List;
import k0.a;
import l0.e;
import l0.r;
import s0.h;

@Keep
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";

    /* access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(e eVar) {
        return new e((d) eVar.a(d.class), eVar.c(a.class), eVar.c(b.class));
    }

    public List<l0.d<?>> getComponents() {
        return Arrays.asList(new l0.d[]{l0.d.c(e.class).f(LIBRARY_NAME).b(r.h(d.class)).b(r.g(a.class)).b(r.g(b.class)).d(new t0.e()).c(), h.b(LIBRARY_NAME, "20.1.0")});
    }
}
