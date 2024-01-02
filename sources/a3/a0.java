package a3;

import k2.s;
import kotlin.jvm.internal.i;
import t2.l;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, s> f42b;

    public a0(Object obj, l<? super Throwable, s> lVar) {
        this.f41a = obj;
        this.f42b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return i.a(this.f41a, a0Var.f41a) && i.a(this.f42b, a0Var.f42b);
    }

    public int hashCode() {
        Object obj = this.f41a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f42b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f41a + ", onCancellation=" + this.f42b + ')';
    }
}
