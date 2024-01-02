package r1;

import android.app.Activity;
import androidx.core.content.d;
import o1.o;

final class a0 {

    /* renamed from: a  reason: collision with root package name */
    boolean f2687a = false;

    static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        boolean f2688a = false;

        /* renamed from: b  reason: collision with root package name */
        final c f2689b;

        a(c cVar) {
            this.f2689b = cVar;
        }

        public boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
            c cVar;
            String str;
            String str2;
            if (this.f2688a || i3 != 9796) {
                return false;
            }
            this.f2688a = true;
            if (iArr[0] != 0) {
                cVar = this.f2689b;
                str = "CameraAccessDenied";
                str2 = "Camera access permission was denied.";
            } else if (iArr.length <= 1 || iArr[1] == 0) {
                this.f2689b.a((String) null, (String) null);
                return true;
            } else {
                cVar = this.f2689b;
                str = "AudioAccessDenied";
                str2 = "Audio access permission was denied.";
            }
            cVar.a(str, str2);
            return true;
        }
    }

    interface b {
        void a(o oVar);
    }

    interface c {
        void a(String str, String str2);
    }

    a0() {
    }

    private boolean b(Activity activity) {
        return d.a(activity, "android.permission.RECORD_AUDIO") == 0;
    }

    private boolean c(Activity activity) {
        return d.a(activity, "android.permission.CAMERA") == 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(c cVar, String str, String str2) {
        this.f2687a = false;
        cVar.a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void e(Activity activity, b bVar, boolean z3, c cVar) {
        if (this.f2687a) {
            cVar.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
        } else if (!c(activity) || (z3 && !b(activity))) {
            bVar.a(new a(new z(this, cVar)));
            this.f2687a = true;
            e.b.e(activity, z3 ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
        } else {
            cVar.a((String) null, (String) null);
        }
    }
}
