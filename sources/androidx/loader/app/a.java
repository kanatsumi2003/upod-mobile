package androidx.loader.app;

import androidx.lifecycle.g;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends g & t> a b(T t3) {
        return new b(t3, ((t) t3).d());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
