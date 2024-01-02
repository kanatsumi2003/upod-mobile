package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f535b;

    public /* synthetic */ b(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f534a = embeddingAdapter;
        this.f535b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m0translateActivityIntentPredicates$lambda3(this.f534a, this.f535b, (Pair) obj);
    }
}
