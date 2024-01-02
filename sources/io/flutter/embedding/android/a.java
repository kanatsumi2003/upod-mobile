package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Matrix f1430e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private final m1.a f1431a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f1432b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1433c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, float[]> f1434d = new HashMap();

    public a(m1.a aVar, boolean z3) {
        this.f1431a = aVar;
        this.f1432b = e0.a();
        this.f1433c = z3;
    }

    private void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer) {
        long j3;
        long j4;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i6 = i3;
        int i7 = i4;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i7 != -1) {
            long d9 = this.f1433c ? this.f1432b.c(motionEvent2).d() : 0;
            int d10 = d(motionEvent.getToolType(i3));
            float[] fArr = {motionEvent.getX(i3), motionEvent.getY(i3)};
            matrix.mapPoints(fArr);
            if (d10 == 1) {
                j3 = (long) (motionEvent.getButtonState() & 31);
                if (j3 == 0 && motionEvent.getSource() == 8194 && i7 == 4) {
                    this.f1434d.put(Integer.valueOf(motionEvent.getPointerId(i3)), fArr);
                }
            } else {
                j3 = d10 == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.f1434d.containsKey(Integer.valueOf(motionEvent.getPointerId(i3)));
            int i8 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d9);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) c(i7));
                j4 = 4;
            } else {
                byteBuffer2.putLong((long) i7);
                j4 = (long) d10;
            }
            byteBuffer2.putLong(j4);
            byteBuffer2.putLong((long) i8);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i3));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.f1434d.get(Integer.valueOf(motionEvent.getPointerId(i3)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j3);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i3));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d5 = 1.0d;
                d4 = 0.0d;
            } else {
                d4 = (double) motionRange.getMin();
                d5 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(d5);
            if (d10 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i6));
                d6 = 0.0d;
            } else {
                d6 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d6);
            byteBuffer2.putDouble((double) motionEvent.getSize(i3));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i3));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i3));
            byteBuffer2.putDouble(d6);
            byteBuffer2.putDouble(d6);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i6));
            if (d10 == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i6));
            } else {
                byteBuffer2.putDouble(d6);
            }
            byteBuffer2.putLong((long) i5);
            if (i8 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                d7 = (double) (-motionEvent2.getAxisValue(9));
            } else {
                d7 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d7);
            if (containsKey) {
                float[] fArr3 = this.f1434d.get(Integer.valueOf(motionEvent.getPointerId(i3)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d8 = 0.0d;
            } else {
                d8 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d8);
            byteBuffer2.putDouble(d8);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d8);
            if (containsKey && c(i7) == 9) {
                this.f1434d.remove(Integer.valueOf(motionEvent.getPointerId(i3)));
            }
        }
    }

    private int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 8) {
            return 3;
        }
        throw new AssertionError("Unexpected masked action");
    }

    private int c(int i3) {
        if (i3 == 4) {
            return 7;
        }
        if (i3 == 5) {
            return 8;
        }
        if (i3 == 6 || i3 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 != 3) {
            return i3 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z3 = motionEvent.isFromSource(2);
        boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z3 || !z4) {
            return false;
        }
        int b4 = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b4, 0, f1430e, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.f1431a.j(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f1430e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 35
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0027
            r4 = 5
            if (r2 != r4) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            if (r4 != 0) goto L_0x0031
            if (r2 == r10) goto L_0x002f
            r5 = 6
            if (r2 != r5) goto L_0x0031
        L_0x002f:
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x0042
        L_0x0034:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L_0x006f
        L_0x0042:
            r11 = 0
            if (r2 == 0) goto L_0x0060
        L_0x0045:
            if (r11 >= r0) goto L_0x0034
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L_0x005d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L_0x005d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L_0x005d:
            int r11 = r11 + 1
            goto L_0x0045
        L_0x0060:
            if (r11 >= r0) goto L_0x006f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L_0x0060
        L_0x006f:
            int r13 = r1.position()
            int r13 = r13 % 280
            if (r13 != 0) goto L_0x0081
            m1.a r13 = r12.f1431a
            int r14 = r1.position()
            r13.j(r1, r14)
            return r10
        L_0x0081:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.a.g(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
