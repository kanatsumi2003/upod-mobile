package n1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o1.k;
import org.json.JSONArray;
import org.json.JSONObject;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final o1.k f2386a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public h f2387b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f2388c;

    class a implements k.c {
        a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            r7.a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r7.b("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fe */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x011f A[Catch:{ JSONException -> 0x0216 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(o1.j r6, o1.k.d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                n1.i r1 = n1.i.this
                n1.i$h r1 = r1.f2387b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f2578a
                java.lang.Object r6 = r6.f2579b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                b1.b.e(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0216 }
                switch(r4) {
                    case -766342101: goto L_0x00b4;
                    case -720677196: goto L_0x00a9;
                    case -577225884: goto L_0x009f;
                    case -548468504: goto L_0x0095;
                    case -247230243: goto L_0x008b;
                    case -215273374: goto L_0x0081;
                    case 241845679: goto L_0x0077;
                    case 875995648: goto L_0x006c;
                    case 1128339786: goto L_0x0062;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0216 }
            L_0x0033:
                goto L_0x00be
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 2
                goto L_0x00be
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 4
                goto L_0x00be
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 10
                goto L_0x00be
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 8
                goto L_0x00be
            L_0x0062:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 5
                goto L_0x00be
            L_0x006c:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 12
                goto L_0x00be
            L_0x0077:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 7
                goto L_0x00be
            L_0x0081:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 0
                goto L_0x00be
            L_0x008b:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 1
                goto L_0x00be
            L_0x0095:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 3
                goto L_0x00be
            L_0x009f:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 6
                goto L_0x00be
            L_0x00a9:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 11
                goto L_0x00be
            L_0x00b4:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 9
            L_0x00be:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x01fc;
                    case 1: goto L_0x01e2;
                    case 2: goto L_0x01c4;
                    case 3: goto L_0x01a8;
                    case 4: goto L_0x018a;
                    case 5: goto L_0x016c;
                    case 6: goto L_0x0162;
                    case 7: goto L_0x0158;
                    case 8: goto L_0x0136;
                    case 9: goto L_0x012c;
                    case 10: goto L_0x00f5;
                    case 11: goto L_0x00e1;
                    case 12: goto L_0x00c8;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                r7.c()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00c8:
                n1.i r6 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r6 = r6.f2387b     // Catch:{ JSONException -> 0x0216 }
                boolean r6 = r6.l()     // Catch:{ JSONException -> 0x0216 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r1.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.a(r1)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00e1:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0216 }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x0216 }
                r1.i(r6)     // Catch:{ JSONException -> 0x0216 }
            L_0x00f0:
                r7.a(r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00f5:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x0112
                n1.i$e r6 = n1.i.e.a(r6)     // Catch:{ NoSuchFieldException -> 0x00fe }
                goto L_0x0113
            L_0x00fe:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0216 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0216 }
                r7.b(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
            L_0x0112:
                r6 = r3
            L_0x0113:
                n1.i r2 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r2 = r2.f2387b     // Catch:{ JSONException -> 0x0216 }
                java.lang.CharSequence r6 = r2.d(r6)     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x00f0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.a(r2)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x012c:
                n1.i r6 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r6 = r6.f2387b     // Catch:{ JSONException -> 0x0216 }
                r6.b()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0136:
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                n1.i$j r6 = r1.i(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r1.c(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r7.a(r3)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                goto L_0x022f
            L_0x014c:
                r6 = move-exception
                goto L_0x014f
            L_0x014e:
                r6 = move-exception
            L_0x014f:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
            L_0x0153:
                r7.b(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x0158:
                n1.i r6 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r6 = r6.f2387b     // Catch:{ JSONException -> 0x0216 }
                r6.h()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0162:
                n1.i r6 = n1.i.this     // Catch:{ JSONException -> 0x0216 }
                n1.i$h r6 = r6.f2387b     // Catch:{ JSONException -> 0x0216 }
                r6.g()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x016c:
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                n1.i$k r6 = r1.j(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r1.m(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r7.a(r3)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                goto L_0x022f
            L_0x0182:
                r6 = move-exception
                goto L_0x0185
            L_0x0184:
                r6 = move-exception
            L_0x0185:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x018a:
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                java.util.List r6 = r1.k(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r1.f(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r7.a(r3)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                goto L_0x022f
            L_0x01a0:
                r6 = move-exception
                goto L_0x01a3
            L_0x01a2:
                r6 = move-exception
            L_0x01a3:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01a8:
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01be }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01be }
                n1.i$c r6 = r1.g(r6)     // Catch:{ JSONException -> 0x01be }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01be }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x01be }
                r1.a(r6)     // Catch:{ JSONException -> 0x01be }
                r7.a(r3)     // Catch:{ JSONException -> 0x01be }
                goto L_0x022f
            L_0x01be:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01c4:
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                int r6 = r1.h(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                n1.i r1 = n1.i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                n1.i$h r1 = r1.f2387b     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r1.j(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r7.a(r3)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                goto L_0x022f
            L_0x01d9:
                r6 = move-exception
                goto L_0x01dc
            L_0x01db:
                r6 = move-exception
            L_0x01dc:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01e2:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01f5 }
                n1.i$g r6 = n1.i.g.a(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                n1.i r1 = n1.i.this     // Catch:{ NoSuchFieldException -> 0x01f5 }
                n1.i$h r1 = r1.f2387b     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r1.k(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r7.a(r3)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                goto L_0x022f
            L_0x01f5:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01fc:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x020f }
                n1.i$i r6 = n1.i.C0038i.a(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                n1.i r1 = n1.i.this     // Catch:{ NoSuchFieldException -> 0x020f }
                n1.i$h r1 = r1.f2387b     // Catch:{ NoSuchFieldException -> 0x020f }
                r1.e(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                r7.a(r3)     // Catch:{ NoSuchFieldException -> 0x020f }
                goto L_0x022f
            L_0x020f:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x0216:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.b(r0, r6, r3)
            L_0x022f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.i.a.a(o1.j, o1.k$d):void");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2390a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2391b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f2392c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                n1.i$k[] r0 = n1.i.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2392c = r0
                r1 = 1
                n1.i$k r2 = n1.i.k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2392c     // Catch:{ NoSuchFieldError -> 0x001d }
                n1.i$k r3 = n1.i.k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2392c     // Catch:{ NoSuchFieldError -> 0x0028 }
                n1.i$k r4 = n1.i.k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2392c     // Catch:{ NoSuchFieldError -> 0x0033 }
                n1.i$k r5 = n1.i.k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                n1.i$l[] r4 = n1.i.l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2391b = r4
                n1.i$l r5 = n1.i.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f2391b     // Catch:{ NoSuchFieldError -> 0x004e }
                n1.i$l r5 = n1.i.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                n1.i$f[] r4 = n1.i.f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2390a = r4
                n1.i$f r5 = n1.i.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f2390a     // Catch:{ NoSuchFieldError -> 0x0069 }
                n1.i$f r4 = n1.i.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f2390a     // Catch:{ NoSuchFieldError -> 0x0073 }
                n1.i$f r1 = n1.i.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f2390a     // Catch:{ NoSuchFieldError -> 0x007d }
                n1.i$f r1 = n1.i.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.i.b.<clinit>():void");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2393a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2394b;

        public c(int i3, String str) {
            this.f2393a = i3;
            this.f2394b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: d  reason: collision with root package name */
        private String f2398d;

        private d(String str) {
            this.f2398d = str;
        }

        static d a(String str) {
            for (d dVar : values()) {
                if (dVar.f2398d.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: d  reason: collision with root package name */
        private String f2401d;

        private e(String str) {
            this.f2401d = str;
        }

        static e a(String str) {
            for (e eVar : values()) {
                if (eVar.f2401d.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: d  reason: collision with root package name */
        private String f2407d;

        private f(String str) {
            this.f2407d = str;
        }

        static f a(String str) {
            for (f fVar : values()) {
                if (fVar.f2407d.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f2414d;

        private g(String str) {
            this.f2414d = str;
        }

        static g a(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f2414d;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a(c cVar);

        void b();

        void c(j jVar);

        CharSequence d(e eVar);

        void e(C0038i iVar);

        void f(List<l> list);

        void g();

        void h();

        void i(String str);

        void j(int i3);

        void k(g gVar);

        boolean l();

        void m(k kVar);
    }

    /* renamed from: n1.i$i  reason: collision with other inner class name */
    public enum C0038i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f2418d;

        private C0038i(String str) {
            this.f2418d = str;
        }

        static C0038i a(String str) {
            for (C0038i iVar : values()) {
                if (iVar.f2418d.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f2419a;

        /* renamed from: b  reason: collision with root package name */
        public final d f2420b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f2421c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f2422d;

        /* renamed from: e  reason: collision with root package name */
        public final d f2423e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f2424f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f2425g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f2419a = num;
            this.f2420b = dVar;
            this.f2421c = bool;
            this.f2422d = num2;
            this.f2423e = dVar2;
            this.f2424f = num3;
            this.f2425g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: d  reason: collision with root package name */
        private String f2431d;

        private k(String str) {
            this.f2431d = str;
        }

        static k a(String str) {
            for (k kVar : values()) {
                if (kVar.f2431d.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: d  reason: collision with root package name */
        private String f2435d;

        private l(String str) {
            this.f2435d = str;
        }

        static l a(String str) {
            for (l lVar : values()) {
                if (lVar.f2435d.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(c1.a aVar) {
        a aVar2 = new a();
        this.f2388c = aVar2;
        o1.k kVar = new o1.k(aVar, "flutter/platform", o1.g.f2577a);
        this.f2386a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i3 = jSONObject.getInt("primaryColor");
        if (i3 != 0) {
            i3 |= -16777216;
        }
        return new c(i3, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            n1.i$f r4 = n1.i.f.a(r4)
            int[] r8 = n1.i.b.f2390a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        d a4 = !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d a5 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new j(valueOf, a4, valueOf2, valueOf3, a5, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    public k j(String str) {
        int i3 = b.f2392c[k.a(str).ordinal()];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            int i4 = b.f2391b[l.a(jSONArray.getString(i3)).ordinal()];
            if (i4 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i4 != 2) {
            } else {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f2387b = hVar;
    }

    public void m(boolean z3) {
        b1.b.e("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f2386a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z3)}));
    }
}
