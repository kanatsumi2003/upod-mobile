package a3;

import k2.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import t2.l;

final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f127a;

    /* renamed from: b  reason: collision with root package name */
    public final i f128b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, s> f129c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f130d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f131e;

    public y(Object obj, i iVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        this.f127a = obj;
        this.f128b = iVar;
        this.f129c = lVar;
        this.f130d = obj2;
        this.f131e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, i iVar, l lVar, Object obj2, Throwable th, int i3, e eVar) {
        this(obj, (i3 & 2) != 0 ? null : iVar, (i3 & 4) != 0 ? null : lVar, (i3 & 8) != 0 ? null : obj2, (i3 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ y b(y yVar, Object obj, i iVar, l<Throwable, s> lVar, Object obj2, Throwable th, int i3, Object obj3) {
        if ((i3 & 1) != 0) {
            obj = yVar.f127a;
        }
        if ((i3 & 2) != 0) {
            iVar = yVar.f128b;
        }
        i iVar2 = iVar;
        if ((i3 & 4) != 0) {
            lVar = yVar.f129c;
        }
        l<Throwable, s> lVar2 = lVar;
        if ((i3 & 8) != 0) {
            obj2 = yVar.f130d;
        }
        Object obj4 = obj2;
        if ((i3 & 16) != 0) {
            th = yVar.f131e;
        }
        return yVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final y a(Object obj, i iVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        return new y(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f131e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        i iVar = this.f128b;
        if (iVar != null) {
            mVar.l(iVar, th);
        }
        l<Throwable, s> lVar = this.f129c;
        if (lVar != null) {
            mVar.n(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return i.a(this.f127a, yVar.f127a) && i.a(this.f128b, yVar.f128b) && i.a(this.f129c, yVar.f129c) && i.a(this.f130d, yVar.f130d) && i.a(this.f131e, yVar.f131e);
    }

    public int hashCode() {
        Object obj = this.f127a;
        int i3 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f128b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l<Throwable, s> lVar = this.f129c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f130d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f131e;
        if (th != null) {
            i3 = th.hashCode();
        }
        return hashCode4 + i3;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f127a + ", cancelHandler=" + this.f128b + ", onCancellation=" + this.f129c + ", idempotentResume=" + this.f130d + ", cancelCause=" + this.f131e + ')';
    }
}
