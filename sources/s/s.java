package s;

import android.os.IBinder;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2857d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IBinder f2858e;

    public /* synthetic */ s(g gVar, IBinder iBinder) {
        this.f2857d = gVar;
        this.f2858e = iBinder;
    }

    public final void run() {
        this.f2857d.q(this.f2858e);
    }
}
