package e;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import c.b;
import e.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class w implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1111a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f1112b;

    /* renamed from: c  reason: collision with root package name */
    private final e.d f1113c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1114d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f1115e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f1116f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1117g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f1118h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f1119i;

    w(e.d dVar) {
        Icon icon;
        this.f1113c = dVar;
        this.f1111a = dVar.f1081a;
        this.f1112b = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(dVar.f1081a, dVar.K) : new Notification.Builder(dVar.f1081a);
        Notification notification = dVar.Q;
        this.f1112b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1089i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1085e).setContentText(dVar.f1086f).setContentInfo(dVar.f1091k).setContentIntent(dVar.f1087g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1088h, (notification.flags & 128) != 0).setLargeIcon(dVar.f1090j).setNumber(dVar.f1092l).setProgress(dVar.f1100t, dVar.f1101u, dVar.f1102v);
        this.f1112b.setSubText(dVar.f1097q).setUsesChronometer(dVar.f1095o).setPriority(dVar.f1093m);
        Iterator<e.a> it = dVar.f1082b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.f1117g.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f1114d = dVar.H;
        this.f1115e = dVar.I;
        this.f1112b.setShowWhen(dVar.f1094n);
        this.f1112b.setLocalOnly(dVar.f1106z).setGroup(dVar.f1103w).setGroupSummary(dVar.f1104x).setSortKey(dVar.f1105y);
        this.f1118h = dVar.O;
        this.f1112b.setCategory(dVar.C).setColor(dVar.E).setVisibility(dVar.F).setPublicVersion(dVar.G).setSound(notification.sound, notification.audioAttributes);
        List<String> e4 = i3 < 28 ? e(f(dVar.f1083c), dVar.T) : dVar.T;
        if (e4 != null && !e4.isEmpty()) {
            for (String addPerson : e4) {
                this.f1112b.addPerson(addPerson);
            }
        }
        this.f1119i = dVar.J;
        if (dVar.f1084d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < dVar.f1084d.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), x.a(dVar.f1084d.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1117g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = dVar.S) != null) {
            Notification.Builder unused = this.f1112b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            Notification.Builder unused2 = this.f1112b.setExtras(dVar.D).setRemoteInputHistory(dVar.f1099s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                Notification.Builder unused3 = this.f1112b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                Notification.Builder unused4 = this.f1112b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                Notification.Builder unused5 = this.f1112b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            Notification.Builder unused6 = this.f1112b.setBadgeIconType(dVar.L).setSettingsText(dVar.f1098r).setShortcutId(dVar.M).setTimeoutAfter(dVar.N).setGroupAlertBehavior(dVar.O);
            if (dVar.B) {
                Notification.Builder unused7 = this.f1112b.setColorized(dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f1112b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<y> it2 = dVar.f1083c.iterator();
            while (it2.hasNext()) {
                Notification.Builder unused8 = this.f1112b.addPerson(it2.next().h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            Notification.Builder unused9 = this.f1112b.setAllowSystemGeneratedContextualActions(dVar.P);
            Notification.Builder unused10 = this.f1112b.setBubbleMetadata(e.c.a((e.c) null));
        }
        if (dVar.R) {
            if (this.f1113c.f1104x) {
                this.f1118h = 2;
            } else {
                this.f1118h = 1;
            }
            this.f1112b.setVibrate((long[]) null);
            this.f1112b.setSound((Uri) null);
            int i7 = notification.defaults & -2 & -3;
            notification.defaults = i7;
            this.f1112b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f1113c.f1103w)) {
                    this.f1112b.setGroup("silent");
                }
                Notification.Builder unused11 = this.f1112b.setGroupAlertBehavior(this.f1118h);
            }
        }
    }

    private void b(e.a aVar) {
        Notification.Action.Builder builder;
        int i3 = Build.VERSION.SDK_INT;
        IconCompat d4 = aVar.d();
        if (i3 >= 23) {
            builder = new Notification.Action.Builder(d4 != null ? d4.n() : null, aVar.h(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(d4 != null ? d4.c() : 0, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput addRemoteInput : z.b(aVar.e())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            Notification.Action.Builder unused = builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i4 >= 28) {
            Notification.Action.Builder unused2 = builder.setSemanticAction(aVar.f());
        }
        if (i4 >= 29) {
            Notification.Action.Builder unused3 = builder.setContextual(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.f1112b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        b bVar = new b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<y> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (y g3 : list) {
            arrayList.add(g3.g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }

    public Notification.Builder a() {
        return this.f1112b;
    }

    public Notification c() {
        Bundle a4;
        RemoteViews f4;
        RemoteViews d4;
        e.C0018e eVar = this.f1113c.f1096p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews e4 = eVar != null ? eVar.e(this) : null;
        Notification d5 = d();
        if (!(e4 == null && (e4 = this.f1113c.H) == null)) {
            d5.contentView = e4;
        }
        if (!(eVar == null || (d4 = eVar.d(this)) == null)) {
            d5.bigContentView = d4;
        }
        if (!(eVar == null || (f4 = this.f1113c.f1096p.f(this)) == null)) {
            d5.headsUpContentView = f4;
        }
        if (!(eVar == null || (a4 = e.a(d5)) == null)) {
            eVar.a(a4);
        }
        return d5;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            return this.f1112b.build();
        }
        if (i3 >= 24) {
            Notification build = this.f1112b.build();
            if (this.f1118h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f1118h != 2)) {
                    g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1118h == 1) {
                    g(build);
                }
            }
            return build;
        }
        this.f1112b.setExtras(this.f1117g);
        Notification build2 = this.f1112b.build();
        RemoteViews remoteViews = this.f1114d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1115e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1119i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f1118h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f1118h != 2)) {
                g(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1118h == 1) {
                g(build2);
            }
        }
        return build2;
    }
}
