package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class c implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f536a;

    public /* synthetic */ c(Set set) {
        this.f536a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m2translateActivityPredicates$lambda6(this.f536a, (Activity) obj);
    }
}
