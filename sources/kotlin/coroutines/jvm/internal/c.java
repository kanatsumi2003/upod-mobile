package kotlin.coroutines.jvm.internal;

import m2.d;
import m2.g;

public final class c implements d<Object> {

    /* renamed from: d  reason: collision with root package name */
    public static final c f2082d = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
