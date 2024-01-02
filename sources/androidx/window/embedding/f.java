package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class f implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f539a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f540b;

    public /* synthetic */ f(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f539a = embeddingAdapter;
        this.f540b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m1translateActivityPairPredicates$lambda1(this.f539a, this.f540b, (Pair) obj);
    }
}
