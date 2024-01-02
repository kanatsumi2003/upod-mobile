package e0;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import d0.f;
import q.i;
import r.f;
import t.c;
import t.d;
import t.g;
import t.i0;
import t.k0;
import t.o;

public class a extends g<g> implements f {
    public static final /* synthetic */ int M = 0;
    private final boolean I = true;
    private final d J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z3, d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.g();
    }

    public static Bundle j0(d dVar) {
        dVar.f();
        Integer g3 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g3 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g3.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    public final int f() {
        return i.f2635a;
    }

    public final void k(f fVar) {
        o.i(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b4 = this.J.b();
            ((g) C()).l(new j(1, new i0(b4, ((Integer) o.h(this.L)).intValue(), "<<default account>>".equals(b4.name) ? o.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.g(new l(1, new q.a(8, (PendingIntent) null), (k0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    public final boolean o() {
        return this.I;
    }

    public final void p() {
        j(new c.d());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        if (!x().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
