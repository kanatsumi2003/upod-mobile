package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<a> mutators = new ArrayList();

    public class a {

        /* renamed from: a  reason: collision with root package name */
        private Matrix f1628a;

        /* renamed from: b  reason: collision with root package name */
        private Rect f1629b;

        /* renamed from: c  reason: collision with root package name */
        private float[] f1630c;

        /* renamed from: d  reason: collision with root package name */
        private b f1631d;

        public a(Matrix matrix) {
            this.f1631d = b.TRANSFORM;
            this.f1628a = matrix;
        }

        public a(Rect rect) {
            this.f1631d = b.CLIP_RECT;
            this.f1629b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f1631d = b.CLIP_RRECT;
            this.f1629b = rect;
            this.f1630c = fArr;
        }

        public Matrix a() {
            return this.f1628a;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i3, int i4, int i5, int i6, float[] fArr) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i3, int i4, int i5, int i6) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
