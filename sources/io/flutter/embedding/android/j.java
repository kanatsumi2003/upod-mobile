package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import m1.c;

@TargetApi(19)
public class j extends View implements c {

    /* renamed from: a  reason: collision with root package name */
    private ImageReader f1501a;

    /* renamed from: b  reason: collision with root package name */
    private Image f1502b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f1503c;

    /* renamed from: d  reason: collision with root package name */
    private m1.a f1504d;

    /* renamed from: e  reason: collision with root package name */
    private b f1505e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1506f;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1507a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.embedding.android.j$b[] r0 = io.flutter.embedding.android.j.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1507a = r0
                io.flutter.embedding.android.j$b r1 = io.flutter.embedding.android.j.b.background     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1507a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.j$b r1 = io.flutter.embedding.android.j.b.overlay     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.a.<clinit>():void");
        }
    }

    public enum b {
        background,
        overlay
    }

    public j(Context context, int i3, int i4, b bVar) {
        this(context, g(i3, i4), bVar);
    }

    j(Context context, ImageReader imageReader, b bVar) {
        super(context, (AttributeSet) null);
        this.f1506f = false;
        this.f1501a = imageReader;
        this.f1505e = bVar;
        h();
    }

    private void e() {
        Image image = this.f1502b;
        if (image != null) {
            image.close();
            this.f1502b = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader g(int i3, int i4) {
        int i5;
        int i6;
        if (i3 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i3));
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (i4 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i4));
            i6 = 1;
        } else {
            i6 = i4;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i5, i6, 1, 3, 768) : ImageReader.newInstance(i5, i6, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        b1.b.f("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer a4 = this.f1502b.getHardwareBuffer();
            this.f1503c = Bitmap.wrapHardwareBuffer(a4, ColorSpace.get(ColorSpace.Named.SRGB));
            a4.close();
            return;
        }
        Image.Plane[] planes = this.f1502b.getPlanes();
        if (planes.length == 1) {
            Image.Plane plane = planes[0];
            int rowStride = plane.getRowStride() / plane.getPixelStride();
            int height = this.f1502b.getHeight();
            Bitmap bitmap = this.f1503c;
            if (!(bitmap != null && bitmap.getWidth() == rowStride && this.f1503c.getHeight() == height)) {
                this.f1503c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            this.f1503c.copyPixelsFromBuffer(buffer);
        }
    }

    public void a() {
        if (this.f1506f) {
            setAlpha(0.0f);
            d();
            this.f1503c = null;
            e();
            invalidate();
            this.f1506f = false;
        }
    }

    public void b(m1.a aVar) {
        if (a.f1507a[this.f1505e.ordinal()] == 1) {
            aVar.x(this.f1501a.getSurface());
        }
        setAlpha(1.0f);
        this.f1504d = aVar;
        this.f1506f = true;
    }

    public void c() {
    }

    @TargetApi(19)
    public boolean d() {
        if (!this.f1506f) {
            return false;
        }
        Image acquireLatestImage = this.f1501a.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f1502b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void f() {
        this.f1501a.close();
    }

    public m1.a getAttachedRenderer() {
        return this.f1504d;
    }

    public ImageReader getImageReader() {
        return this.f1501a;
    }

    public Surface getSurface() {
        return this.f1501a.getSurface();
    }

    public void j(int i3, int i4) {
        if (this.f1504d != null) {
            if (i3 != this.f1501a.getWidth() || i4 != this.f1501a.getHeight()) {
                e();
                f();
                this.f1501a = g(i3, i4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1502b != null) {
            k();
        }
        Bitmap bitmap = this.f1503c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f1501a.getWidth() && i4 == this.f1501a.getHeight()) && this.f1505e == b.background && this.f1506f) {
            j(i3, i4);
            this.f1504d.x(this.f1501a.getSurface());
        }
    }
}
