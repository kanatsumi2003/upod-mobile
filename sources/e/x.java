package e;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import e.e;

class x {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1120a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1121b = new Object();

    static Bundle a(e.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d4 = aVar.d();
        bundle.putInt("icon", d4 != null ? d4.c() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(z zVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(z[] zVarArr) {
        if (zVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[zVarArr.length];
        for (int i3 = 0; i3 < zVarArr.length; i3++) {
            z zVar = zVarArr[i3];
            bundleArr[i3] = b((z) null);
        }
        return bundleArr;
    }
}
