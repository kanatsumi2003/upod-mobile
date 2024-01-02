package d2;

import android.graphics.Rect;
import h.a;

final class b {
    static Rect a(float f4, Rect rect, float f5, float f6) {
        float a4 = a.a(f4, f5, f6);
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / a4);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / a4);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }
}
