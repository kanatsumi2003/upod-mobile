package q;

import a0.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
final class m extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2643a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f2644b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2644b = fVar;
        this.f2643a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i3);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int e4 = this.f2644b.e(this.f2643a);
        if (this.f2644b.h(e4)) {
            this.f2644b.m(this.f2643a, e4);
        }
    }
}
