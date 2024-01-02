package t;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class g1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h1 f2974a;

    /* synthetic */ g1(h1 h1Var, f1 f1Var) {
        this.f2974a = h1Var;
    }

    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f2974a.f2980f) {
                c1 c1Var = (c1) message.obj;
                e1 e1Var = (e1) this.f2974a.f2980f.get(c1Var);
                if (e1Var != null && e1Var.i()) {
                    if (e1Var.j()) {
                        e1Var.g("GmsClientSupervisor");
                    }
                    this.f2974a.f2980f.remove(c1Var);
                }
            }
            return true;
        } else if (i3 != 1) {
            return false;
        } else {
            synchronized (this.f2974a.f2980f) {
                c1 c1Var2 = (c1) message.obj;
                e1 e1Var2 = (e1) this.f2974a.f2980f.get(c1Var2);
                if (e1Var2 != null && e1Var2.a() == 3) {
                    String valueOf = String.valueOf(c1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b4 = e1Var2.b();
                    if (b4 == null) {
                        b4 = c1Var2.b();
                    }
                    if (b4 == null) {
                        String d4 = c1Var2.d();
                        o.h(d4);
                        b4 = new ComponentName(d4, "unknown");
                    }
                    e1Var2.onServiceDisconnected(b4);
                }
            }
            return true;
        }
    }
}
