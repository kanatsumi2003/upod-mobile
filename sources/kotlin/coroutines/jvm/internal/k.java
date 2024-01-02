package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import m2.d;

public abstract class k extends d implements f<Object> {
    private final int arity;

    public k(int i3) {
        this(i3, (d<Object>) null);
    }

    public k(int i3, d<Object> dVar) {
        super(dVar);
        this.arity = i3;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d4 = l.d(this);
        i.d(d4, "renderLambdaToString(this)");
        return d4;
    }
}
