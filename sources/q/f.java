package q;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.d;
import com.google.android.gms.common.api.GoogleApiActivity;
import e.e;
import p.a;
import p.b;
import s.o;
import s.p;
import t.a0;
import t.d0;
import x.g;

public class f extends g {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2628d = g.f2632a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2629e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final f f2630f = new f();

    /* renamed from: c  reason: collision with root package name */
    private String f2631c;

    public static f k() {
        return f2630f;
    }

    public Intent a(Context context, int i3, String str) {
        return super.a(context, i3, str);
    }

    public PendingIntent b(Context context, int i3, int i4) {
        return super.b(context, i3, i4);
    }

    public final String d(int i3) {
        return super.d(i3);
    }

    public int e(Context context) {
        return super.e(context);
    }

    public int f(Context context, int i3) {
        return super.f(context, i3);
    }

    public final boolean h(int i3) {
        return super.h(i3);
    }

    public Dialog i(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return n(activity, i3, d0.b(activity, a(activity, i3, "d"), i4), onCancelListener);
    }

    public PendingIntent j(Context context, a aVar) {
        return aVar.e() ? aVar.d() : b(context, aVar.b(), 0);
    }

    public boolean l(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog i5 = i(activity, i3, i4, onCancelListener);
        if (i5 == null) {
            return false;
        }
        q(activity, i5, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void m(Context context, int i3) {
        r(context, i3, (String) null, c(context, i3, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final Dialog n(Context context, int i3, d0 d0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(a0.d(context, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c4 = a0.c(context, i3);
        if (c4 != null) {
            builder.setPositiveButton(c4, d0Var);
        }
        String g3 = a0.g(context, i3);
        if (g3 != null) {
            builder.setTitle(g3);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i3)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog o(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(a0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        q(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final p p(Context context, o oVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p pVar = new p(oVar);
        context.registerReceiver(pVar, intentFilter);
        pVar.a(context);
        if (g(context, "com.google.android.gms")) {
            return pVar;
        }
        oVar.a();
        pVar.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof d) {
                l.u1(dialog, onCancelListener).t1(((d) activity).l(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    public final void r(Context context, int i3, String str, PendingIntent pendingIntent) {
        int i4;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i3), null}), new IllegalArgumentException());
        if (i3 == 18) {
            s(context);
        } else if (pendingIntent != null) {
            String f4 = a0.f(context, i3);
            String e4 = a0.e(context, i3);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) t.o.h(context.getSystemService("notification"));
            e.d n3 = new e.d(context).k(true).e(true).i(f4).n(new e.b().h(e4));
            if (x.e.b(context)) {
                t.o.j(g.d());
                n3.m(context.getApplicationInfo().icon).l(2);
                if (x.e.c(context)) {
                    n3.a(a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    n3.g(pendingIntent);
                }
            } else {
                n3.m(17301642).o(resources.getString(b.common_google_play_services_notification_ticker)).p(System.currentTimeMillis()).g(pendingIntent).h(e4);
            }
            if (g.g()) {
                t.o.j(g.g());
                synchronized (f2629e) {
                    str2 = this.f2631c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a4 = notificationManager.getNotificationChannel(str2);
                    String b4 = a0.b(context);
                    if (a4 == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b4, 4));
                    } else if (!b4.contentEquals(a4.getName())) {
                        a4.setName(b4);
                        notificationManager.createNotificationChannel(a4);
                    }
                }
                n3.f(str2);
            }
            Notification b5 = n3.b();
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                i.f2636b.set(false);
                i4 = 10436;
            } else {
                i4 = 39789;
            }
            notificationManager.notify(i4, b5);
        } else if (i3 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean t(Activity activity, s.e eVar, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n3 = n(activity, i3, d0.c(eVar, a(activity, i3, "d"), 2), onCancelListener);
        if (n3 == null) {
            return false;
        }
        q(activity, n3, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean u(Context context, a aVar, int i3) {
        PendingIntent j3;
        if (y.b.a(context) || (j3 = j(context, aVar)) == null) {
            return false;
        }
        r(context, aVar.b(), (String) null, a0.e.a(context, 0, GoogleApiActivity.a(context, j3, i3, true), a0.e.f15a | 134217728));
        return true;
    }
}
