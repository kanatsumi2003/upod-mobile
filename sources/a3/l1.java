package a3;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;

public final class l1 extends CancellationException {

    /* renamed from: d  reason: collision with root package name */
    public final k1 f74d;

    public l1(String str, Throwable th, k1 k1Var) {
        super(str);
        this.f74d = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                if (!i.a(l1Var.getMessage(), getMessage()) || !i.a(l1Var.f74d, this.f74d) || !i.a(l1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        i.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f74d.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f74d;
    }
}
