package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.window.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private b.a<f, b> f485b = new b.a<>();

    /* renamed from: c  reason: collision with root package name */
    private d.b f486c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<g> f487d;

    /* renamed from: e  reason: collision with root package name */
    private int f488e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f489f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f490g = false;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<d.b> f491h = new ArrayList<>();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f492a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f493b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.d$b[] r0 = androidx.lifecycle.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f493b = r0
                r1 = 1
                androidx.lifecycle.d$b r2 = androidx.lifecycle.d.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f493b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$b r3 = androidx.lifecycle.d.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f493b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$b r4 = androidx.lifecycle.d.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f493b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.d$b r5 = androidx.lifecycle.d.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f493b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.d$b r6 = androidx.lifecycle.d.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.d$a[] r5 = androidx.lifecycle.d.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f492a = r5
                androidx.lifecycle.d$a r6 = androidx.lifecycle.d.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f492a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.d$a r5 = androidx.lifecycle.d.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f492a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.d.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f492a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.d.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f492a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.d.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f492a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.d.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f492a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.d.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.a.<clinit>():void");
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        d.b f494a;

        /* renamed from: b  reason: collision with root package name */
        e f495b;

        b(f fVar, d.b bVar) {
            this.f495b = j.f(fVar);
            this.f494a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, d.a aVar) {
            d.b h3 = h.h(aVar);
            this.f494a = h.l(this.f494a, h3);
            this.f495b.d(gVar, aVar);
            this.f494a = h3;
        }
    }

    public h(g gVar) {
        this.f487d = new WeakReference<>(gVar);
        this.f486c = d.b.INITIALIZED;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> descendingIterator = this.f485b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f490g) {
            Map.Entry next = descendingIterator.next();
            b bVar = (b) next.getValue();
            while (bVar.f494a.compareTo(this.f486c) > 0 && !this.f490g && this.f485b.contains(next.getKey())) {
                d.a f4 = f(bVar.f494a);
                o(h(f4));
                bVar.a(gVar, f4);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> g3 = this.f485b.g(fVar);
        d.b bVar = null;
        d.b bVar2 = g3 != null ? g3.getValue().f494a : null;
        if (!this.f491h.isEmpty()) {
            ArrayList<d.b> arrayList = this.f491h;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f486c, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int i3 = a.f493b[bVar.ordinal()];
        if (i3 == 1) {
            throw new IllegalArgumentException();
        } else if (i3 == 2) {
            return d.a.ON_DESTROY;
        } else {
            if (i3 == 3) {
                return d.a.ON_STOP;
            }
            if (i3 == 4) {
                return d.a.ON_PAUSE;
            }
            if (i3 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(g gVar) {
        b.b<K, V>.d c4 = this.f485b.c();
        while (c4.hasNext() && !this.f490g) {
            Map.Entry entry = (Map.Entry) c4.next();
            b bVar = (b) entry.getValue();
            while (bVar.f494a.compareTo(this.f486c) < 0 && !this.f490g && this.f485b.contains(entry.getKey())) {
                o(bVar.f494a);
                bVar.a(gVar, r(bVar.f494a));
                n();
            }
        }
    }

    static d.b h(d.a aVar) {
        switch (a.f492a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                return d.b.RESUMED;
            case R.styleable.SplitPairRule_splitRatio /*6*/:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f485b.size() == 0) {
            return true;
        }
        d.b bVar = this.f485b.a().getValue().f494a;
        d.b bVar2 = this.f485b.d().getValue().f494a;
        return bVar == bVar2 && this.f486c == bVar2;
    }

    static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.f486c != bVar) {
            this.f486c = bVar;
            if (this.f489f || this.f488e != 0) {
                this.f490g = true;
                return;
            }
            this.f489f = true;
            q();
            this.f489f = false;
        }
    }

    private void n() {
        ArrayList<d.b> arrayList = this.f491h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(d.b bVar) {
        this.f491h.add(bVar);
    }

    private void q() {
        g gVar = this.f487d.get();
        if (gVar != null) {
            while (true) {
                boolean j3 = j();
                this.f490g = false;
                if (!j3) {
                    if (this.f486c.compareTo(this.f485b.a().getValue().f494a) < 0) {
                        d(gVar);
                    }
                    Map.Entry<f, b> d4 = this.f485b.d();
                    if (!this.f490g && d4 != null && this.f486c.compareTo(d4.getValue().f494a) > 0) {
                        g(gVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private static d.a r(d.b bVar) {
        int i3 = a.f493b[bVar.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return d.a.ON_START;
            }
            if (i3 == 3) {
                return d.a.ON_RESUME;
            }
            if (i3 == 4) {
                throw new IllegalArgumentException();
            } else if (i3 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f486c;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.f485b.h(fVar, bVar3) == null && (gVar = this.f487d.get()) != null) {
            boolean z3 = this.f488e != 0 || this.f489f;
            d.b e4 = e(fVar);
            this.f488e++;
            while (bVar3.f494a.compareTo(e4) < 0 && this.f485b.contains(fVar)) {
                o(bVar3.f494a);
                bVar3.a(gVar, r(bVar3.f494a));
                n();
                e4 = e(fVar);
            }
            if (!z3) {
                q();
            }
            this.f488e--;
        }
    }

    public d.b b() {
        return this.f486c;
    }

    public void c(f fVar) {
        this.f485b.f(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}
