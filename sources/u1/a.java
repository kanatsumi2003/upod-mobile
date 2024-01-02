package u1;

import android.hardware.camera2.CaptureRequest;
import r1.d0;

public class a extends s1.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f3105b = b.auto;

    public a(d0 d0Var) {
        super(d0Var);
    }

    public String a() {
        return "ExposureLockFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        if (c()) {
            builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(this.f3105b == b.locked));
        }
    }

    public boolean c() {
        return true;
    }

    public b d() {
        return this.f3105b;
    }

    public void e(b bVar) {
        this.f3105b = bVar;
    }
}
