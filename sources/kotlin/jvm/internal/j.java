package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class j<R> implements f<R>, Serializable {
    private final int arity;

    public j(int i3) {
        this.arity = i3;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e4 = l.e(this);
        i.d(e4, "renderLambdaToString(this)");
        return e4;
    }
}
