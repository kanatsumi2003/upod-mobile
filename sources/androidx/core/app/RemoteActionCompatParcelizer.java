package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f161a = (IconCompat) aVar.v(remoteActionCompat.f161a, 1);
        remoteActionCompat.f162b = aVar.l(remoteActionCompat.f162b, 2);
        remoteActionCompat.f163c = aVar.l(remoteActionCompat.f163c, 3);
        remoteActionCompat.f164d = (PendingIntent) aVar.r(remoteActionCompat.f164d, 4);
        remoteActionCompat.f165e = aVar.h(remoteActionCompat.f165e, 5);
        remoteActionCompat.f166f = aVar.h(remoteActionCompat.f166f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f161a, 1);
        aVar.D(remoteActionCompat.f162b, 2);
        aVar.D(remoteActionCompat.f163c, 3);
        aVar.H(remoteActionCompat.f164d, 4);
        aVar.z(remoteActionCompat.f165e, 5);
        aVar.z(remoteActionCompat.f166f, 6);
    }
}
