package androidx.window.layout;

import kotlin.jvm.internal.i;

final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        i.e(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
