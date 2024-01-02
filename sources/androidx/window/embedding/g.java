package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f541d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f542e;

    public /* synthetic */ g(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f541d = splitListenerWrapper;
        this.f542e = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m5accept$lambda1(this.f541d, this.f542e);
    }
}
