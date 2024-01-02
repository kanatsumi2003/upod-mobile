package r1;

import android.media.ImageReader;
import o1.d;

public final /* synthetic */ class j implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f2709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.b f2710b;

    public /* synthetic */ j(u uVar, d.b bVar) {
        this.f2709a = uVar;
        this.f2710b = bVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f2709a.k0(this.f2710b, imageReader);
    }
}
