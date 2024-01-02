package b3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k2.m;
import k2.n;
import kotlin.jvm.internal.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f594a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        b bVar = null;
        try {
            m.a aVar = m.f2075d;
            obj = m.a(new a(a(Looper.getMainLooper(), true), (String) null, 2, (e) null));
        } catch (Throwable th) {
            m.a aVar2 = m.f2075d;
            obj = m.a(n.a(th));
        }
        if (!m.c(obj)) {
            bVar = obj;
        }
        f594a = bVar;
    }

    public static final Handler a(Looper looper, boolean z3) {
        if (!z3) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
