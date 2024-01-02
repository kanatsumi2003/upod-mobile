package a2;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import r1.d0;

public class a extends s1.a<b> {

    /* renamed from: b  reason: collision with root package name */
    private b f31b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<b, Integer> f32c;

    public a(d0 d0Var) {
        super(d0Var);
        b bVar = b.fast;
        this.f31b = bVar;
        HashMap<b, Integer> hashMap = new HashMap<>();
        this.f32c = hashMap;
        hashMap.put(b.off, 0);
        hashMap.put(bVar, 1);
        hashMap.put(b.highQuality, 2);
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b.minimal, 3);
            hashMap.put(b.zeroShutterLag, 4);
        }
    }

    public String a() {
        return "NoiseReductionFeature";
    }

    public void b(CaptureRequest.Builder builder) {
        if (c()) {
            Log.i("Camera", "updateNoiseReduction | currentSetting: " + this.f31b);
            builder.set(CaptureRequest.NOISE_REDUCTION_MODE, this.f32c.get(this.f31b));
        }
    }

    public boolean c() {
        int[] c4 = this.f2882a.c();
        return c4 != null && c4.length > 0;
    }
}
