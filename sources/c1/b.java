package c1;

import c1.c;
import java.nio.ByteBuffer;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f651d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f652e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c.f f653f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f654g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f655h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f656i;

    public /* synthetic */ b(c cVar, String str, c.f fVar, ByteBuffer byteBuffer, int i3, long j3) {
        this.f651d = cVar;
        this.f652e = str;
        this.f653f = fVar;
        this.f654g = byteBuffer;
        this.f655h = i3;
        this.f656i = j3;
    }

    public final void run() {
        this.f651d.m(this.f652e, this.f653f, this.f654g, this.f655h, this.f656i);
    }
}
