package z2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k2.l;
import kotlin.jvm.internal.i;
import t2.p;
import y2.b;

final class c implements b<w2.c> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f3269a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f3270b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f3271c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, l<Integer, Integer>> f3272d;

    public static final class a implements Iterator<w2.c> {

        /* renamed from: d  reason: collision with root package name */
        private int f3273d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f3274e;

        /* renamed from: f  reason: collision with root package name */
        private int f3275f;

        /* renamed from: g  reason: collision with root package name */
        private w2.c f3276g;

        /* renamed from: h  reason: collision with root package name */
        private int f3277h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f3278i;

        a(c cVar) {
            this.f3278i = cVar;
            int e4 = f.e(cVar.f3270b, 0, cVar.f3269a.length());
            this.f3274e = e4;
            this.f3275f = e4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < z2.c.c(r6.f3278i)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f3275f
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f3273d = r1
                r0 = 0
                r6.f3276g = r0
                goto L_0x0099
            L_0x000c:
                z2.c r0 = r6.f3278i
                int r0 = r0.f3271c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f3277h
                int r0 = r0 + r3
                r6.f3277h = r0
                z2.c r4 = r6.f3278i
                int r4 = r4.f3271c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f3275f
                z2.c r4 = r6.f3278i
                java.lang.CharSequence r4 = r4.f3269a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                w2.c r0 = new w2.c
                int r1 = r6.f3274e
                z2.c r4 = r6.f3278i
                java.lang.CharSequence r4 = r4.f3269a
                int r4 = z2.n.u(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f3276g = r0
            L_0x0044:
                r6.f3275f = r2
                goto L_0x0097
            L_0x0047:
                z2.c r0 = r6.f3278i
                t2.p r0 = r0.f3272d
                z2.c r4 = r6.f3278i
                java.lang.CharSequence r4 = r4.f3269a
                int r5 = r6.f3275f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                k2.l r0 = (k2.l) r0
                if (r0 != 0) goto L_0x0073
                w2.c r0 = new w2.c
                int r1 = r6.f3274e
                z2.c r4 = r6.f3278i
                java.lang.CharSequence r4 = r4.f3269a
                int r4 = z2.n.u(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f3274e
                w2.c r4 = w2.f.g(r4, r2)
                r6.f3276g = r4
                int r2 = r2 + r0
                r6.f3274e = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f3273d = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.c.a.a():void");
        }

        /* renamed from: b */
        public w2.c next() {
            if (this.f3273d == -1) {
                a();
            }
            if (this.f3273d != 0) {
                w2.c cVar = this.f3276g;
                i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f3276g = null;
                this.f3273d = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f3273d == -1) {
                a();
            }
            return this.f3273d == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(CharSequence charSequence, int i3, int i4, p<? super CharSequence, ? super Integer, l<Integer, Integer>> pVar) {
        i.e(charSequence, "input");
        i.e(pVar, "getNextMatch");
        this.f3269a = charSequence;
        this.f3270b = i3;
        this.f3271c = i4;
        this.f3272d = pVar;
    }

    public Iterator<w2.c> iterator() {
        return new a(this);
    }
}
