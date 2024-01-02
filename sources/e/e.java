package e;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public class e {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1069a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1070b;

        /* renamed from: c  reason: collision with root package name */
        private final z[] f1071c;

        /* renamed from: d  reason: collision with root package name */
        private final z[] f1072d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1073e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1074f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1075g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1076h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f1077i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1078j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1079k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i3 != 0 ? IconCompat.b((Resources) null, "", i3) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (z[]) null, (z[]) null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, z[] zVarArr, z[] zVarArr2, boolean z3, int i3, boolean z4, boolean z5) {
            this.f1074f = true;
            this.f1070b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f1077i = iconCompat.c();
            }
            this.f1078j = d.d(charSequence);
            this.f1079k = pendingIntent;
            this.f1069a = bundle == null ? new Bundle() : bundle;
            this.f1071c = zVarArr;
            this.f1072d = zVarArr2;
            this.f1073e = z3;
            this.f1075g = i3;
            this.f1074f = z4;
            this.f1076h = z5;
        }

        public PendingIntent a() {
            return this.f1079k;
        }

        public boolean b() {
            return this.f1073e;
        }

        public Bundle c() {
            return this.f1069a;
        }

        public IconCompat d() {
            int i3;
            if (this.f1070b == null && (i3 = this.f1077i) != 0) {
                this.f1070b = IconCompat.b((Resources) null, "", i3);
            }
            return this.f1070b;
        }

        public z[] e() {
            return this.f1071c;
        }

        public int f() {
            return this.f1075g;
        }

        public boolean g() {
            return this.f1074f;
        }

        public CharSequence h() {
            return this.f1078j;
        }

        public boolean i() {
            return this.f1076h;
        }
    }

    public static class b extends C0018e {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1080e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(d dVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(dVar.a()).setBigContentTitle(this.f1108b).bigText(this.f1080e);
            if (this.f1110d) {
                bigText.setSummaryText(this.f1109c);
            }
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f1080e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        boolean P;
        Notification Q;
        boolean R;
        Icon S;
        @Deprecated
        public ArrayList<String> T;

        /* renamed from: a  reason: collision with root package name */
        public Context f1081a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1082b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<y> f1083c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1084d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1085e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1086f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1087g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1088h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f1089i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f1090j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f1091k;

        /* renamed from: l  reason: collision with root package name */
        int f1092l;

        /* renamed from: m  reason: collision with root package name */
        int f1093m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1094n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1095o;

        /* renamed from: p  reason: collision with root package name */
        C0018e f1096p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f1097q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f1098r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f1099s;

        /* renamed from: t  reason: collision with root package name */
        int f1100t;

        /* renamed from: u  reason: collision with root package name */
        int f1101u;

        /* renamed from: v  reason: collision with root package name */
        boolean f1102v;

        /* renamed from: w  reason: collision with root package name */
        String f1103w;

        /* renamed from: x  reason: collision with root package name */
        boolean f1104x;

        /* renamed from: y  reason: collision with root package name */
        String f1105y;

        /* renamed from: z  reason: collision with root package name */
        boolean f1106z;

        @Deprecated
        public d(Context context) {
            this(context, (String) null);
        }

        public d(Context context, String str) {
            this.f1082b = new ArrayList<>();
            this.f1083c = new ArrayList<>();
            this.f1084d = new ArrayList<>();
            this.f1094n = true;
            this.f1106z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            Notification notification = new Notification();
            this.Q = notification;
            this.f1081a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.Q.audioStreamType = -1;
            this.f1093m = 0;
            this.T = new ArrayList<>();
            this.P = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i3, boolean z3) {
            Notification notification;
            int i4;
            if (z3) {
                notification = this.Q;
                i4 = i3 | notification.flags;
            } else {
                notification = this.Q;
                i4 = (~i3) & notification.flags;
            }
            notification.flags = i4;
        }

        public d a(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1082b.add(new a(i3, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new w(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z3) {
            j(16, z3);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f1087g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f1086f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f1085e = d(charSequence);
            return this;
        }

        public d k(boolean z3) {
            this.f1106z = z3;
            return this;
        }

        public d l(int i3) {
            this.f1093m = i3;
            return this;
        }

        public d m(int i3) {
            this.Q.icon = i3;
            return this;
        }

        public d n(C0018e eVar) {
            if (this.f1096p != eVar) {
                this.f1096p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.Q.tickerText = d(charSequence);
            return this;
        }

        public d p(long j3) {
            this.Q.when = j3;
            return this;
        }
    }

    /* renamed from: e.e$e  reason: collision with other inner class name */
    public static abstract class C0018e {

        /* renamed from: a  reason: collision with root package name */
        protected d f1107a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1108b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1109c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1110d = false;

        public void a(Bundle bundle) {
            if (this.f1110d) {
                bundle.putCharSequence("android.summaryText", this.f1109c);
            }
            CharSequence charSequence = this.f1108b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c4 = c();
            if (c4 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c4);
            }
        }

        public abstract void b(d dVar);

        /* access modifiers changed from: protected */
        public abstract String c();

        public RemoteViews d(d dVar) {
            return null;
        }

        public RemoteViews e(d dVar) {
            return null;
        }

        public RemoteViews f(d dVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f1107a != dVar) {
                this.f1107a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
