package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.window.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f169k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f170a;

    /* renamed from: b  reason: collision with root package name */
    Object f171b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f172c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f173d;

    /* renamed from: e  reason: collision with root package name */
    public int f174e;

    /* renamed from: f  reason: collision with root package name */
    public int f175f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f176g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f177h;

    /* renamed from: i  reason: collision with root package name */
    public String f178i;

    /* renamed from: j  reason: collision with root package name */
    public String f179j;

    public IconCompat() {
        this.f170a = -1;
        this.f172c = null;
        this.f173d = null;
        this.f174e = 0;
        this.f175f = 0;
        this.f176g = null;
        this.f177h = f169k;
        this.f178i = null;
    }

    private IconCompat(int i3) {
        this.f172c = null;
        this.f173d = null;
        this.f174e = 0;
        this.f175f = 0;
        this.f176g = null;
        this.f177h = f169k;
        this.f178i = null;
        this.f170a = i3;
    }

    static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f4 = (float) min;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i3) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i3 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f174e = i3;
            if (resources != null) {
                try {
                    iconCompat.f171b = resources.getResourceName(i3);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f171b = str;
            }
            iconCompat.f179j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon package", e6);
            return null;
        }
    }

    private static int h(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    private static String p(int i3) {
        switch (i3) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                return "BITMAP_MASKABLE";
            case R.styleable.SplitPairRule_splitRatio /*6*/:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i3 = this.f170a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f171b);
        }
        if (i3 == 2) {
            return this.f174e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int i3 = this.f170a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.f171b);
        }
        if (i3 == 2) {
            return TextUtils.isEmpty(this.f179j) ? ((String) this.f171b).split(":", -1)[0] : this.f179j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i3 = this.f170a;
        return (i3 != -1 || Build.VERSION.SDK_INT < 23) ? i3 : h((Icon) this.f171b);
    }

    public Uri i() {
        int i3 = this.f170a;
        if (i3 == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.f171b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f171b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        String str;
        StringBuilder sb;
        Uri i3 = i();
        String scheme = i3.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i3);
            } catch (Exception e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(i3);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f171b));
            } catch (FileNotFoundException e5) {
                e = e5;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(i3);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    public void l() {
        Parcelable parcelable;
        this.f177h = PorterDuff.Mode.valueOf(this.f178i);
        switch (this.f170a) {
            case -1:
                parcelable = this.f173d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                parcelable = this.f173d;
                if (parcelable == null) {
                    byte[] bArr = this.f172c;
                    this.f171b = bArr;
                    this.f170a = 3;
                    this.f174e = 0;
                    this.f175f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case R.styleable.SplitPairRule_splitRatio /*6*/:
                String str = new String(this.f172c, Charset.forName("UTF-16"));
                this.f171b = str;
                if (this.f170a == 2 && this.f179j == null) {
                    this.f179j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f171b = this.f172c;
                return;
            default:
                return;
        }
        this.f171b = parcelable;
    }

    public void m(boolean z3) {
        this.f178i = this.f177h.name();
        switch (this.f170a) {
            case -1:
                if (z3) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case R.styleable.SplitPairRule_splitMinWidth /*5*/:
                if (z3) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f171b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f172c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f172c = ((String) this.f171b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f172c = (byte[]) this.f171b;
                return;
            case 4:
            case R.styleable.SplitPairRule_splitRatio /*6*/:
                this.f172c = this.f171b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f173d = (Parcelable) this.f171b;
    }

    @Deprecated
    public Icon n() {
        return o((Context) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r5 = a(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r0 = r4.f176g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r5.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r0 = r4.f177h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r0 == f169k) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r5.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon o(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f170a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x00ba;
                case 0: goto L_0x0008;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0096;
                case 3: goto L_0x0089;
                case 4: goto L_0x0080;
                case 5: goto L_0x006a;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L_0x0020
            android.net.Uri r5 = r4.i()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto L_0x00a9
        L_0x0020:
            if (r5 == 0) goto L_0x004f
            java.io.InputStream r5 = r4.k(r5)
            if (r5 == 0) goto L_0x0034
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L_0x007b
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00a9
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x004f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x006a:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L_0x0077
            java.lang.Object r5 = r4.f171b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00a9
        L_0x0077:
            java.lang.Object r5 = r4.f171b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x007b:
            android.graphics.Bitmap r5 = a(r5, r1)
            goto L_0x00a5
        L_0x0080:
            java.lang.Object r5 = r4.f171b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L_0x00a9
        L_0x0089:
            java.lang.Object r5 = r4.f171b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f174e
            int r1 = r4.f175f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L_0x00a9
        L_0x0096:
            java.lang.String r5 = r4.e()
            int r0 = r4.f174e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L_0x00a9
        L_0x00a1:
            java.lang.Object r5 = r4.f171b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x00a5:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L_0x00a9:
            android.content.res.ColorStateList r0 = r4.f176g
            if (r0 == 0) goto L_0x00b0
            r5.setTintList(r0)
        L_0x00b0:
            android.graphics.PorterDuff$Mode r0 = r4.f177h
            android.graphics.PorterDuff$Mode r1 = f169k
            if (r0 == r1) goto L_0x00b9
            r5.setTintMode(r0)
        L_0x00b9:
            return r5
        L_0x00ba:
            java.lang.Object r5 = r4.f171b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.o(android.content.Context):android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f170a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f171b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f170a
            java.lang.String r1 = p(r1)
            r0.append(r1)
            int r1 = r4.f170a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f171b
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f174e
            r0.append(r1)
            int r1 = r4.f175f
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f175f
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f179j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f171b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f171b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f176g
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f176g
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f177h
            android.graphics.PorterDuff$Mode r2 = f169k
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f177h
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
