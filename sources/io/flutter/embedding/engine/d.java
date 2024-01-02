package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

public final /* synthetic */ class d implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1626a;

    public /* synthetic */ d(long j3) {
        this.f1626a = j3;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f1626a, imageDecoder, imageInfo, source);
    }
}
