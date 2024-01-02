package n1;

import java.util.HashMap;
import java.util.Map;
import o1.j;
import o1.k;
import o1.r;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2471b;

    /* renamed from: c  reason: collision with root package name */
    private k f2472c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k.d f2473d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f2474e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f2475f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f2476g;

    class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f2477a;

        a(byte[] bArr) {
            this.f2477a = bArr;
        }

        public void a(Object obj) {
            byte[] unused = l.this.f2471b = this.f2477a;
        }

        public void b(String str, String str2, Object obj) {
            b1.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void c() {
        }
    }

    class b implements k.c {
        b() {
        }

        public void a(j jVar, k.d dVar) {
            Map e4;
            String str = jVar.f2578a;
            Object obj = jVar.f2579b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = l.this.f2475f = true;
                if (!l.this.f2474e) {
                    l lVar = l.this;
                    if (lVar.f2470a) {
                        k.d unused2 = lVar.f2473d = dVar;
                        return;
                    }
                }
                l lVar2 = l.this;
                e4 = lVar2.i(lVar2.f2471b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                byte[] unused3 = l.this.f2471b = (byte[]) obj;
                e4 = null;
            }
            dVar.a(e4);
        }
    }

    public l(c1.a aVar, boolean z3) {
        this(new k(aVar, "flutter/restoration", r.f2593b), z3);
    }

    l(k kVar, boolean z3) {
        this.f2474e = false;
        this.f2475f = false;
        b bVar = new b();
        this.f2476g = bVar;
        this.f2472c = kVar;
        this.f2470a = z3;
        kVar.e(bVar);
    }

    /* access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f2471b = null;
    }

    public byte[] h() {
        return this.f2471b;
    }

    public void j(byte[] bArr) {
        this.f2474e = true;
        k.d dVar = this.f2473d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f2473d = null;
        } else if (this.f2475f) {
            this.f2472c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f2471b = bArr;
    }
}
