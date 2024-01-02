package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;

@ExperimentalWindowApi
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    WindowMetricsCalculator decorate(WindowMetricsCalculator windowMetricsCalculator);
}
