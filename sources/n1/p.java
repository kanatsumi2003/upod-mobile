package n1;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o1.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final k f2492a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f f2493b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f2494c;

    class a implements k.c {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
            r2.a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(o1.j r18, o1.k.d r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r3 = "data"
                n1.p r4 = n1.p.this
                n1.p$f r4 = r4.f2493b
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r4 = r0.f2578a
                java.lang.Object r0 = r0.f2579b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Received '"
                r5.append(r6)
                r5.append(r4)
                java.lang.String r6 = "' message."
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "TextInputChannel"
                b1.b.e(r6, r5)
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                r7 = 1
                r8 = 0
                switch(r6) {
                    case -1779068172: goto L_0x00a8;
                    case -1015421462: goto L_0x009d;
                    case -37561188: goto L_0x0092;
                    case 270476819: goto L_0x0087;
                    case 270803918: goto L_0x007c;
                    case 649192816: goto L_0x0071;
                    case 1204752139: goto L_0x0066;
                    case 1727570905: goto L_0x005b;
                    case 1904427655: goto L_0x004d;
                    case 2113369584: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00b2
            L_0x003f:
                java.lang.String r6 = "TextInput.requestAutofill"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0049
                goto L_0x00b2
            L_0x0049:
                r5 = 9
                goto L_0x00b2
            L_0x004d:
                java.lang.String r6 = "TextInput.clearClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0057
                goto L_0x00b2
            L_0x0057:
                r5 = 8
                goto L_0x00b2
            L_0x005b:
                java.lang.String r6 = "TextInput.finishAutofillContext"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0064
                goto L_0x00b2
            L_0x0064:
                r5 = 7
                goto L_0x00b2
            L_0x0066:
                java.lang.String r6 = "TextInput.setEditableSizeAndTransform"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x006f
                goto L_0x00b2
            L_0x006f:
                r5 = 6
                goto L_0x00b2
            L_0x0071:
                java.lang.String r6 = "TextInput.sendAppPrivateCommand"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x007a
                goto L_0x00b2
            L_0x007a:
                r5 = 5
                goto L_0x00b2
            L_0x007c:
                java.lang.String r6 = "TextInput.show"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0085
                goto L_0x00b2
            L_0x0085:
                r5 = 4
                goto L_0x00b2
            L_0x0087:
                java.lang.String r6 = "TextInput.hide"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0090
                goto L_0x00b2
            L_0x0090:
                r5 = 3
                goto L_0x00b2
            L_0x0092:
                java.lang.String r6 = "TextInput.setClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x009b
                goto L_0x00b2
            L_0x009b:
                r5 = 2
                goto L_0x00b2
            L_0x009d:
                java.lang.String r6 = "TextInput.setEditingState"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00b2
            L_0x00a6:
                r5 = 1
                goto L_0x00b2
            L_0x00a8:
                java.lang.String r6 = "TextInput.setPlatformViewClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r5 = 0
            L_0x00b2:
                java.lang.String r4 = "error"
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x018f;
                    case 1: goto L_0x017c;
                    case 2: goto L_0x0156;
                    case 3: goto L_0x014c;
                    case 4: goto L_0x013f;
                    case 5: goto L_0x0114;
                    case 6: goto L_0x00e3;
                    case 7: goto L_0x00d3;
                    case 8: goto L_0x00c8;
                    case 9: goto L_0x00bd;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                r19.c()
                goto L_0x01a9
            L_0x00bd:
                n1.p r0 = n1.p.this
                n1.p$f r0 = r0.f2493b
                r0.h()
                goto L_0x0148
            L_0x00c8:
                n1.p r0 = n1.p.this
                n1.p$f r0 = r0.f2493b
                r0.a()
                goto L_0x0148
            L_0x00d3:
                n1.p r3 = n1.p.this
                n1.p$f r3 = r3.f2493b
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r3.i(r0)
                goto L_0x0148
            L_0x00e3:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r3 = "width"
                double r10 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r3 = "height"
                double r12 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r3 = "transform"
                org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x0173 }
                r3 = 16
                double[] r14 = new double[r3]     // Catch:{ JSONException -> 0x0173 }
            L_0x00fb:
                if (r8 >= r3) goto L_0x0106
                double r15 = r0.getDouble(r8)     // Catch:{ JSONException -> 0x0173 }
                r14[r8] = r15     // Catch:{ JSONException -> 0x0173 }
                int r8 = r8 + 1
                goto L_0x00fb
            L_0x0106:
                n1.p r0 = n1.p.this     // Catch:{ JSONException -> 0x0173 }
                n1.p$f r9 = r0.f2493b     // Catch:{ JSONException -> 0x0173 }
                r9.g(r10, r12, r14)     // Catch:{ JSONException -> 0x0173 }
                r2.a(r6)     // Catch:{ JSONException -> 0x0173 }
                goto L_0x01a9
            L_0x0114:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r5 = "action"
                java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x0173 }
                if (r0 == 0) goto L_0x0131
                boolean r7 = r0.isEmpty()     // Catch:{ JSONException -> 0x0173 }
                if (r7 != 0) goto L_0x0131
                android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0173 }
                r7.<init>()     // Catch:{ JSONException -> 0x0173 }
                r7.putString(r3, r0)     // Catch:{ JSONException -> 0x0173 }
                goto L_0x0132
            L_0x0131:
                r7 = r6
            L_0x0132:
                n1.p r0 = n1.p.this     // Catch:{ JSONException -> 0x0173 }
                n1.p$f r0 = r0.f2493b     // Catch:{ JSONException -> 0x0173 }
                r0.d(r5, r7)     // Catch:{ JSONException -> 0x0173 }
                r2.a(r6)     // Catch:{ JSONException -> 0x0173 }
                goto L_0x01a9
            L_0x013f:
                n1.p r0 = n1.p.this
                n1.p$f r0 = r0.f2493b
                r0.b()
            L_0x0148:
                r2.a(r6)
                goto L_0x01a9
            L_0x014c:
                n1.p r0 = n1.p.this
                n1.p$f r0 = r0.f2493b
                r0.j()
                goto L_0x0148
            L_0x0156:
                org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ NoSuchFieldException -> 0x0171 }
                int r3 = r0.getInt(r8)     // Catch:{ NoSuchFieldException -> 0x0171 }
                org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ NoSuchFieldException -> 0x0171 }
                n1.p r5 = n1.p.this     // Catch:{ NoSuchFieldException -> 0x0171 }
                n1.p$f r5 = r5.f2493b     // Catch:{ NoSuchFieldException -> 0x0171 }
                n1.p$b r0 = n1.p.b.a(r0)     // Catch:{ NoSuchFieldException -> 0x0171 }
                r5.e(r3, r0)     // Catch:{ NoSuchFieldException -> 0x0171 }
                r2.a(r6)     // Catch:{ NoSuchFieldException -> 0x0171 }
                goto L_0x01a9
            L_0x0171:
                r0 = move-exception
                goto L_0x0174
            L_0x0173:
                r0 = move-exception
            L_0x0174:
                java.lang.String r0 = r0.getMessage()
                r2.b(r4, r0, r6)
                goto L_0x01a9
            L_0x017c:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0173 }
                n1.p r3 = n1.p.this     // Catch:{ JSONException -> 0x0173 }
                n1.p$f r3 = r3.f2493b     // Catch:{ JSONException -> 0x0173 }
                n1.p$e r0 = n1.p.e.a(r0)     // Catch:{ JSONException -> 0x0173 }
                r3.c(r0)     // Catch:{ JSONException -> 0x0173 }
                r2.a(r6)     // Catch:{ JSONException -> 0x0173 }
                goto L_0x01a9
            L_0x018f:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r3 = "platformViewId"
                int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x0173 }
                java.lang.String r5 = "usesVirtualDisplay"
                boolean r0 = r0.optBoolean(r5, r8)     // Catch:{ JSONException -> 0x0173 }
                n1.p r5 = n1.p.this     // Catch:{ JSONException -> 0x0173 }
                n1.p$f r5 = r5.f2493b     // Catch:{ JSONException -> 0x0173 }
                r5.f(r3, r0)     // Catch:{ JSONException -> 0x0173 }
                r2.a(r6)     // Catch:{ JSONException -> 0x0173 }
            L_0x01a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.p.a.a(o1.j, o1.k$d):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2496a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2497b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2498c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2499d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f2500e;

        /* renamed from: f  reason: collision with root package name */
        public final d f2501f;

        /* renamed from: g  reason: collision with root package name */
        public final c f2502g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f2503h;

        /* renamed from: i  reason: collision with root package name */
        public final String f2504i;

        /* renamed from: j  reason: collision with root package name */
        public final a f2505j;

        /* renamed from: k  reason: collision with root package name */
        public final b[] f2506k;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f2507a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f2508b;

            /* renamed from: c  reason: collision with root package name */
            public final e f2509c;

            /* renamed from: d  reason: collision with root package name */
            public final String f2510d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f2507a = str;
                this.f2508b = strArr;
                this.f2510d = str2;
                this.f2509c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr[i3] = b(jSONArray.getString(i3));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: n1.p.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, d dVar, c cVar, Integer num, String str, a aVar, b[] bVarArr) {
            this.f2496a = z3;
            this.f2497b = z4;
            this.f2498c = z5;
            this.f2499d = z6;
            this.f2500e = z7;
            this.f2501f = dVar;
            this.f2502g = cVar;
            this.f2503h = num;
            this.f2504i = str;
            this.f2505j = aVar;
            this.f2506k = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        bVarArr2[i3] = a(jSONArray.getJSONObject(i3));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b4 = b(string);
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                d a4 = d.a(jSONObject2.getString("textCapitalization"));
                c a5 = c.a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = a.a(jSONObject2.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a4, a5, b4, string2, aVar, bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.p.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f2511a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2512b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2513c;

        public c(g gVar, boolean z3, boolean z4) {
            this.f2511a = gVar;
            this.f2512b = z3;
            this.f2513c = z4;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.a(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f2519d;

        private d(String str) {
            this.f2519d = str;
        }

        static d a(String str) {
            for (d dVar : values()) {
                if (dVar.f2519d.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f2520a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2521b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2522c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2523d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2524e;

        public e(String str, int i3, int i4, int i5, int i6) {
            if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
            } else if (i6 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
            } else if (i3 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
            } else if (i4 <= str.length()) {
                this.f2520a = str;
                this.f2521b = i3;
                this.f2522c = i4;
                this.f2523d = i5;
                this.f2524e = i6;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i3 = this.f2523d;
            return i3 >= 0 && this.f2524e > i3;
        }

        public boolean c() {
            return this.f2521b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(e eVar);

        void d(String str, Bundle bundle);

        void e(int i3, b bVar);

        void f(int i3, boolean z3);

        void g(double d4, double d5, double[] dArr);

        void h();

        void i(boolean z3);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f2537d;

        private g(String str) {
            this.f2537d = str;
        }

        static g a(String str) {
            for (g gVar : values()) {
                if (gVar.f2537d.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public p(c1.a aVar) {
        a aVar2 = new a();
        this.f2494c = aVar2;
        k kVar = new k(aVar, "flutter/textinput", o1.g.f2577a);
        this.f2492a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> b(ArrayList<io.flutter.plugin.editing.g> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.g> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> c(String str, int i3, int i4, int i5, int i6) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    public void d(int i3) {
        b1.b.e("TextInputChannel", "Sending 'done' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.done"}));
    }

    public void e(int i3) {
        b1.b.e("TextInputChannel", "Sending 'go' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.go"}));
    }

    public void f(int i3) {
        b1.b.e("TextInputChannel", "Sending 'newline' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.newline"}));
    }

    public void g(int i3) {
        b1.b.e("TextInputChannel", "Sending 'next' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.next"}));
    }

    public void h(int i3, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof byte[]) {
                    hashMap2.put(next, bundle.getByteArray(next));
                } else if (obj instanceof Byte) {
                    hashMap2.put(next, Byte.valueOf(bundle.getByte(next)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(next, bundle.getCharArray(next));
                } else if (obj instanceof Character) {
                    hashMap2.put(next, Character.valueOf(bundle.getChar(next)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(next, bundle.getCharSequenceArray(next));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(next, bundle.getCharSequence(next));
                } else if (obj instanceof float[]) {
                    hashMap2.put(next, bundle.getFloatArray(next));
                } else if (obj instanceof Float) {
                    hashMap2.put(next, Float.valueOf(bundle.getFloat(next)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f2492a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i3), hashMap}));
    }

    public void i(int i3) {
        b1.b.e("TextInputChannel", "Sending 'previous' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.previous"}));
    }

    public void j() {
        this.f2492a.c("TextInputClient.requestExistingInputState", (Object) null);
    }

    public void k(int i3) {
        b1.b.e("TextInputChannel", "Sending 'search' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.search"}));
    }

    public void l(int i3) {
        b1.b.e("TextInputChannel", "Sending 'send' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.send"}));
    }

    public void m(f fVar) {
        this.f2493b = fVar;
    }

    public void n(int i3) {
        b1.b.e("TextInputChannel", "Sending 'unspecified' message.");
        this.f2492a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i3), "TextInputAction.unspecified"}));
    }

    public void o(int i3, String str, int i4, int i5, int i6, int i7) {
        b1.b.e("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i4 + "\nSelection end: " + i5 + "\nComposing start: " + i6 + "\nComposing end: " + i7);
        HashMap<Object, Object> c4 = c(str, i4, i5, i6, i7);
        this.f2492a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i3), c4}));
    }

    public void p(int i3, ArrayList<io.flutter.plugin.editing.g> arrayList) {
        b1.b.e("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> b4 = b(arrayList);
        this.f2492a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i3), b4}));
    }

    public void q(int i3, HashMap<String, e> hashMap) {
        b1.b.e("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            e eVar = (e) next.getValue();
            hashMap2.put((String) next.getKey(), c(eVar.f2520a, eVar.f2521b, eVar.f2522c, -1, -1));
        }
        this.f2492a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i3), hashMap2}));
    }
}
