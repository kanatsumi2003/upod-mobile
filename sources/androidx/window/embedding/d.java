package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplitRule f537a;

    public /* synthetic */ d(SplitRule splitRule) {
        this.f537a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m4translateParentMetricsPredicate$lambda4(this.f537a, (WindowMetrics) obj);
    }
}
