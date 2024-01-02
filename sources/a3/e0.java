package a3;

import kotlinx.coroutines.scheduling.b;
import m2.d;
import m2.e;
import m2.g;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f52a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals("") != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.y.d(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            f52a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.e0.<clinit>():void");
    }

    public static final f0 a() {
        return f52a ? b.f2192k : w.f117f;
    }

    public static final String b(g gVar) {
        return null;
    }

    public static final g c(i0 i0Var, g gVar) {
        g plus = i0Var.c().plus(gVar);
        return (plus == s0.a() || plus.get(e.f2354c) != null) ? plus : plus.plus(s0.a());
    }

    public static final d2<?> d(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof o0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof d2) {
                return (d2) eVar;
            }
        }
        return null;
    }

    public static final d2<?> e(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.get(e2.f54d) != null)) {
            return null;
        }
        d2<?> d4 = d((kotlin.coroutines.jvm.internal.e) dVar);
        if (d4 != null) {
            d4.y0(gVar, obj);
        }
        return d4;
    }
}
