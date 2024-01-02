package kotlinx.coroutines.internal;

import a3.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;

public class m {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f2135d;

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f2136e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2137f;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends c<m> {

        /* renamed from: b  reason: collision with root package name */
        public final m f2138b;

        /* renamed from: c  reason: collision with root package name */
        public m f2139c;

        public a(m mVar) {
            this.f2138b = mVar;
        }

        /* renamed from: h */
        public void d(m mVar, Object obj) {
            boolean z3 = obj == null;
            m mVar2 = z3 ? this.f2138b : this.f2139c;
            if (mVar2 != null && l.a(m.f2135d, mVar, this, mVar2) && z3) {
                m mVar3 = this.f2138b;
                m mVar4 = this.f2139c;
                i.b(mVar4);
                mVar3.n(mVar4);
            }
        }
    }

    public static final class b extends t {
    }

    static {
        Class<Object> cls = Object.class;
        Class<m> cls2 = m.class;
        f2135d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f2136e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f2137f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.m} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (a3.l.a(f2135d, r3, r2, ((kotlinx.coroutines.internal.u) r4).f2159a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.m l(kotlinx.coroutines.internal.t r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.m r0 = (kotlinx.coroutines.internal.m) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2136e
            boolean r0 = a3.l.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.t()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.t
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.t) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.t r4 = (kotlinx.coroutines.internal.t) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f2135d
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            kotlinx.coroutines.internal.m r4 = r4.f2159a
            boolean r2 = a3.l.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.m r2 = (kotlinx.coroutines.internal.m) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.m r3 = (kotlinx.coroutines.internal.m) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.l(kotlinx.coroutines.internal.t):kotlinx.coroutines.internal.m");
    }

    private final m m(m mVar) {
        while (mVar.t()) {
            mVar = (m) mVar._prev;
        }
        return mVar;
    }

    /* access modifiers changed from: private */
    public final void n(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (o() != mVar) {
                return;
            }
        } while (!l.a(f2136e, mVar, mVar2, this));
        if (t()) {
            mVar.l((t) null);
        }
    }

    private final u w() {
        u uVar = (u) this._removedRef;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        f2137f.lazySet(this, uVar2);
        return uVar2;
    }

    public final boolean j(m mVar, m mVar2) {
        f2136e.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2135d;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        if (!l.a(atomicReferenceFieldUpdater, this, mVar2, mVar)) {
            return false;
        }
        mVar.n(mVar2);
        return true;
    }

    public final boolean k(m mVar) {
        f2136e.lazySet(mVar, this);
        f2135d.lazySet(mVar, this);
        while (o() == this) {
            if (l.a(f2135d, this, this, mVar)) {
                mVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public final m p() {
        return l.b(o());
    }

    public final m q() {
        m l3 = l((t) null);
        return l3 == null ? m((m) this._prev) : l3;
    }

    public final void r() {
        ((u) o()).f2159a.s();
    }

    public final void s() {
        m mVar = this;
        while (true) {
            Object o3 = mVar.o();
            if (!(o3 instanceof u)) {
                mVar.l((t) null);
                return;
            }
            mVar = ((u) o3).f2159a;
        }
    }

    public boolean t() {
        return o() instanceof u;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public boolean u() {
        return v() == null;
    }

    public final m v() {
        Object o3;
        m mVar;
        do {
            o3 = o();
            if (o3 instanceof u) {
                return ((u) o3).f2159a;
            }
            if (o3 == this) {
                return (m) o3;
            }
            mVar = (m) o3;
        } while (!l.a(f2135d, this, o3, mVar.w()));
        mVar.l((t) null);
        return null;
    }

    public final int x(m mVar, m mVar2, a aVar) {
        f2136e.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2135d;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        aVar.f2139c = mVar2;
        if (!l.a(atomicReferenceFieldUpdater, this, mVar2, aVar)) {
            return 0;
        }
        return aVar.c(this) == null ? 1 : 2;
    }
}
