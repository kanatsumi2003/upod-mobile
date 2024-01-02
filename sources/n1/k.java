package n1;

import androidx.window.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.j;
import o1.k;
import o1.r;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final o1.k f2437a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public g f2438b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f2439c;

    class a implements k.c {
        a() {
        }

        private void c(j jVar, k.d dVar) {
            try {
                k.this.f2438b.e(((Integer) jVar.b()).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        private void d(j jVar, k.d dVar) {
            k.d dVar2 = dVar;
            Map map = (Map) jVar.b();
            boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            if (z3) {
                try {
                    k.this.f2438b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), wrap));
                    dVar2.a((Object) null);
                } catch (IllegalStateException e4) {
                    dVar2.b("error", k.c(e4), (Object) null);
                }
            } else {
                int intValue = ((Integer) map.get("id")).intValue();
                String str = (String) map.get("viewType");
                double d4 = 0.0d;
                double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey("left")) {
                    d4 = ((Double) map.get("left")).doubleValue();
                }
                dVar2.a(Long.valueOf(k.this.f2438b.g(new d(intValue, str, doubleValue, d4, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), wrap))));
            }
        }

        private void e(j jVar, k.d dVar) {
            try {
                k.this.f2438b.i(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf((double) cVar.f2441a));
            hashMap.put("height", Double.valueOf((double) cVar.f2442b));
            dVar.a(hashMap);
        }

        private void g(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f2438b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        private void h(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f2438b.h(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new j(dVar));
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        private void i(j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f2438b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        private void j(j jVar, k.d dVar) {
            try {
                k.this.f2438b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a((Object) null);
            } catch (IllegalStateException e4) {
                dVar.b("error", k.c(e4), (Object) null);
            }
        }

        private void k(j jVar, k.d dVar) {
            k.d dVar2;
            k.d dVar3 = dVar;
            List list = (List) jVar.b();
            f fVar = r2;
            f fVar2 = fVar;
            f fVar3 = new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
            try {
                k.this.f2438b.f(fVar);
                dVar2 = dVar;
                try {
                    dVar2.a((Object) null);
                } catch (IllegalStateException e4) {
                    e = e4;
                }
            } catch (IllegalStateException e5) {
                e = e5;
                dVar2 = dVar;
                dVar2.b("error", k.c(e), (Object) null);
            }
        }

        public void a(j jVar, k.d dVar) {
            if (k.this.f2438b != null) {
                b1.b.e("PlatformViewsChannel", "Received '" + jVar.f2578a + "' message.");
                String str = jVar.f2578a;
                str.hashCode();
                char c4 = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c4 = 3;
                            break;
                        }
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c4 = 5;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c4 = 6;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c4 = 7;
                            break;
                        }
                        break;
                }
                switch (c4) {
                    case 0:
                        d(jVar, dVar);
                        return;
                    case 1:
                        g(jVar, dVar);
                        return;
                    case 2:
                        h(jVar, dVar);
                        return;
                    case 3:
                        c(jVar, dVar);
                        return;
                    case 4:
                        j(jVar, dVar);
                        return;
                    case R.styleable.SplitPairRule_splitMinWidth:
                        k(jVar, dVar);
                        return;
                    case R.styleable.SplitPairRule_splitRatio:
                        i(jVar, dVar);
                        return;
                    case 7:
                        e(jVar, dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2441a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2442b;

        public c(int i3, int i4) {
            this.f2441a = i3;
            this.f2442b = i4;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f2443a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2444b;

        /* renamed from: c  reason: collision with root package name */
        public final double f2445c;

        /* renamed from: d  reason: collision with root package name */
        public final double f2446d;

        /* renamed from: e  reason: collision with root package name */
        public final double f2447e;

        /* renamed from: f  reason: collision with root package name */
        public final double f2448f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2449g;

        /* renamed from: h  reason: collision with root package name */
        public final ByteBuffer f2450h;

        public d(int i3, String str, double d4, double d5, double d6, double d7, int i4, ByteBuffer byteBuffer) {
            this.f2443a = i3;
            this.f2444b = str;
            this.f2447e = d4;
            this.f2448f = d5;
            this.f2445c = d6;
            this.f2446d = d7;
            this.f2449g = i4;
            this.f2450h = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f2451a;

        /* renamed from: b  reason: collision with root package name */
        public final double f2452b;

        /* renamed from: c  reason: collision with root package name */
        public final double f2453c;

        public e(int i3, double d4, double d5) {
            this.f2451a = i3;
            this.f2452b = d4;
            this.f2453c = d5;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f2454a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f2455b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f2456c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2457d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2458e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f2459f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f2460g;

        /* renamed from: h  reason: collision with root package name */
        public final int f2461h;

        /* renamed from: i  reason: collision with root package name */
        public final int f2462i;

        /* renamed from: j  reason: collision with root package name */
        public final float f2463j;

        /* renamed from: k  reason: collision with root package name */
        public final float f2464k;

        /* renamed from: l  reason: collision with root package name */
        public final int f2465l;

        /* renamed from: m  reason: collision with root package name */
        public final int f2466m;

        /* renamed from: n  reason: collision with root package name */
        public final int f2467n;

        /* renamed from: o  reason: collision with root package name */
        public final int f2468o;

        /* renamed from: p  reason: collision with root package name */
        public final long f2469p;

        public f(int i3, Number number, Number number2, int i4, int i5, Object obj, Object obj2, int i6, int i7, float f4, float f5, int i8, int i9, int i10, int i11, long j3) {
            this.f2454a = i3;
            this.f2455b = number;
            this.f2456c = number2;
            this.f2457d = i4;
            this.f2458e = i5;
            this.f2459f = obj;
            this.f2460g = obj2;
            this.f2461h = i6;
            this.f2462i = i7;
            this.f2463j = f4;
            this.f2464k = f5;
            this.f2465l = i8;
            this.f2466m = i9;
            this.f2467n = i10;
            this.f2468o = i11;
            this.f2469p = j3;
        }
    }

    public interface g {
        void a(boolean z3);

        void b(int i3, double d4, double d5);

        void c(int i3, int i4);

        void d(d dVar);

        void e(int i3);

        void f(f fVar);

        long g(d dVar);

        void h(e eVar, b bVar);

        void i(int i3);
    }

    public k(c1.a aVar) {
        a aVar2 = new a();
        this.f2439c = aVar2;
        o1.k kVar = new o1.k(aVar, "flutter/platform_views", r.f2593b);
        this.f2437a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int i3) {
        o1.k kVar = this.f2437a;
        if (kVar != null) {
            kVar.c("viewFocused", Integer.valueOf(i3));
        }
    }

    public void e(g gVar) {
        this.f2438b = gVar;
    }
}
