package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.c0;
import io.flutter.embedding.android.d0;
import io.flutter.embedding.android.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import o1.c;

public class b0 implements c0.d {

    /* renamed from: a  reason: collision with root package name */
    private final c f1444a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Long, Long> f1445b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Long, d0.e> f1446c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final c0.b f1447d = new c0.b();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1448a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.flutter.embedding.android.x$a[] r0 = io.flutter.embedding.android.x.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1448a = r0
                io.flutter.embedding.android.x$a r1 = io.flutter.embedding.android.x.a.kDown     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1448a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.x$a r1 = io.flutter.embedding.android.x.a.kUp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1448a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.android.x$a r1 = io.flutter.embedding.android.x.a.kRepeat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.b0.a.<clinit>():void");
        }
    }

    public b0(c cVar) {
        this.f1444a = cVar;
        for (d0.e eVar : d0.a()) {
            this.f1446c.put(Long.valueOf(eVar.f1471c), eVar);
        }
    }

    private static x.a e(KeyEvent keyEvent) {
        boolean z3 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z3 ? x.a.kRepeat : x.a.kDown;
        }
        if (action == 1) {
            return x.a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l3 = d0.f1463b.get(Long.valueOf((long) keyEvent.getKeyCode()));
        return l3 != null ? l3 : Long.valueOf(i((long) keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = (long) keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l3 = d0.f1462a.get(Long.valueOf(scanCode2));
            if (l3 != null) {
                return l3;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(i((long) scanCode, 73014444032L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119 A[LOOP:2: B:53:0x0113->B:55:0x0119, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(android.view.KeyEvent r18, io.flutter.embedding.android.c0.d.a r19) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r18.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r18.getKeyCode()
            if (r0 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.lang.Long r11 = r17.g(r18)
            java.lang.Long r12 = r17.f(r18)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            io.flutter.embedding.android.d0$d[] r14 = io.flutter.embedding.android.d0.f1464c
            int r15 = r14.length
            r8 = 0
        L_0x0021:
            r6 = 1
            if (r8 >= r15) goto L_0x0047
            r1 = r14[r8]
            int r0 = r18.getMetaState()
            int r2 = r1.f1467a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            long r3 = r12.longValue()
            long r5 = r11.longValue()
            r0 = r17
            r7 = r18
            r16 = r8
            r8 = r13
            r0.n(r1, r2, r3, r5, r7, r8)
            int r8 = r16 + 1
            goto L_0x0021
        L_0x0047:
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.d0$e> r0 = r9.f1446c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r7.next()
            r1 = r0
            io.flutter.embedding.android.d0$e r1 = (io.flutter.embedding.android.d0.e) r1
            int r0 = r18.getMetaState()
            int r2 = r1.f1469a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            long r3 = r12.longValue()
            r0 = r17
            r5 = r18
            r0.o(r1, r2, r3, r5)
            goto L_0x0051
        L_0x0076:
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0081
            if (r0 == r6) goto L_0x007f
            return r10
        L_0x007f:
            r7 = 0
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            java.util.HashMap<java.lang.Long, java.lang.Long> r0 = r9.f1445b
            java.lang.Object r0 = r0.get(r11)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r8 = 0
            if (r7 == 0) goto L_0x00ca
            if (r2 != 0) goto L_0x0093
        L_0x0090:
            io.flutter.embedding.android.x$a r0 = io.flutter.embedding.android.x.a.kDown
            goto L_0x00a8
        L_0x0093:
            int r0 = r18.getRepeatCount()
            if (r0 <= 0) goto L_0x009c
            io.flutter.embedding.android.x$a r0 = io.flutter.embedding.android.x.a.kRepeat
            goto L_0x00a8
        L_0x009c:
            r1 = 0
            long r4 = r18.getEventTime()
            r0 = r17
            r3 = r11
            r0.p(r1, r2, r3, r4)
            goto L_0x0090
        L_0x00a8:
            io.flutter.embedding.android.c0$b r1 = r9.f1447d
            int r2 = r18.getUnicodeChar()
            java.lang.Character r1 = r1.a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x00cf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00d0
        L_0x00ca:
            if (r2 != 0) goto L_0x00cd
            return r10
        L_0x00cd:
            io.flutter.embedding.android.x$a r0 = io.flutter.embedding.android.x.a.kUp
        L_0x00cf:
            r1 = r8
        L_0x00d0:
            io.flutter.embedding.android.x$a r2 = io.flutter.embedding.android.x.a.kRepeat
            if (r0 == r2) goto L_0x00da
            if (r7 == 0) goto L_0x00d7
            r8 = r12
        L_0x00d7:
            r9.q(r11, r8)
        L_0x00da:
            io.flutter.embedding.android.x$a r2 = io.flutter.embedding.android.x.a.kDown
            if (r0 != r2) goto L_0x00ed
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.d0$e> r2 = r9.f1446c
            java.lang.Object r2 = r2.get(r12)
            io.flutter.embedding.android.d0$e r2 = (io.flutter.embedding.android.d0.e) r2
            if (r2 == 0) goto L_0x00ed
            boolean r3 = r2.f1472d
            r3 = r3 ^ r6
            r2.f1472d = r3
        L_0x00ed:
            io.flutter.embedding.android.x r2 = new io.flutter.embedding.android.x
            r2.<init>()
            long r3 = r18.getEventTime()
            r2.f1566a = r3
            r2.f1567b = r0
            long r3 = r12.longValue()
            r2.f1569d = r3
            long r3 = r11.longValue()
            r2.f1568c = r3
            r2.f1571f = r1
            r2.f1570e = r10
            r0 = r19
            r9.m(r2, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x0113:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0113
        L_0x0123:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.b0.h(android.view.KeyEvent, io.flutter.embedding.android.c0$d$a):boolean");
    }

    private static long i(long j3, long j4) {
        return (j3 & 4294967295L) | j4;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void j(c0.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(d0.c cVar, long j3, KeyEvent keyEvent) {
        p(false, Long.valueOf(cVar.f1466b), Long.valueOf(j3), keyEvent.getEventTime());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(d0.c cVar, KeyEvent keyEvent) {
        p(false, Long.valueOf(cVar.f1466b), Long.valueOf(cVar.f1465a), keyEvent.getEventTime());
    }

    private void m(x xVar, c0.d.a aVar) {
        this.f1444a.f("flutter/keydata", xVar.a(), aVar == null ? null : new y(aVar));
    }

    private void p(boolean z3, Long l3, Long l4, long j3) {
        x xVar = new x();
        xVar.f1566a = j3;
        xVar.f1567b = z3 ? x.a.kDown : x.a.kUp;
        xVar.f1569d = l3.longValue();
        xVar.f1568c = l4.longValue();
        xVar.f1571f = null;
        xVar.f1570e = true;
        if (!(l4.longValue() == 0 || l3.longValue() == 0)) {
            if (!z3) {
                l3 = null;
            }
            q(l4, l3);
        }
        m(xVar, (c0.d.a) null);
    }

    public void a(KeyEvent keyEvent, c0.d.a aVar) {
        if (!h(keyEvent, aVar)) {
            p(true, (Long) null, 0L, 0);
            aVar.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(d0.d dVar, boolean z3, long j3, long j4, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        d0.d dVar2 = dVar;
        ArrayList<Runnable> arrayList2 = arrayList;
        d0.c[] cVarArr = dVar2.f1468b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z4 = false;
        int i3 = 0;
        while (true) {
            d0.c[] cVarArr2 = dVar2.f1468b;
            boolean z5 = true;
            if (i3 >= cVarArr2.length) {
                break;
            }
            d0.c cVar = cVarArr2[i3];
            boolean containsKey = this.f1445b.containsKey(Long.valueOf(cVar.f1465a));
            zArr[i3] = containsKey;
            if (cVar.f1466b == j3) {
                int i4 = a.f1448a[e(keyEvent).ordinal()];
                if (i4 == 1) {
                    KeyEvent keyEvent2 = keyEvent;
                    boolArr[i3] = Boolean.FALSE;
                    if (!z3) {
                        arrayList2.add(new z(this, cVar, j4, keyEvent));
                    }
                } else if (i4 == 2) {
                    KeyEvent keyEvent3 = keyEvent;
                    boolArr[i3] = Boolean.valueOf(zArr[i3]);
                } else if (i4 != 3) {
                    KeyEvent keyEvent4 = keyEvent;
                } else {
                    if (!z3) {
                        arrayList2.add(new a0(this, cVar, keyEvent));
                    } else {
                        KeyEvent keyEvent5 = keyEvent;
                    }
                    boolArr[i3] = Boolean.valueOf(zArr[i3]);
                }
                z4 = true;
            } else {
                KeyEvent keyEvent6 = keyEvent;
                if (!z4 && !containsKey) {
                    z5 = false;
                }
                z4 = z5;
            }
            i3++;
        }
        KeyEvent keyEvent7 = keyEvent;
        if (z3) {
            for (int i5 = 0; i5 < dVar2.f1468b.length; i5++) {
                if (boolArr[i5] == null) {
                    if (z4) {
                        boolArr[i5] = Boolean.valueOf(zArr[i5]);
                    } else {
                        boolArr[i5] = Boolean.TRUE;
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i6 = 0; i6 < dVar2.f1468b.length; i6++) {
                if (boolArr[i6] == null) {
                    boolArr[i6] = Boolean.FALSE;
                }
            }
        }
        for (int i7 = 0; i7 < dVar2.f1468b.length; i7++) {
            if (zArr[i7] != boolArr[i7].booleanValue()) {
                d0.c cVar2 = dVar2.f1468b[i7];
                p(boolArr[i7].booleanValue(), Long.valueOf(cVar2.f1466b), Long.valueOf(cVar2.f1465a), keyEvent.getEventTime());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(d0.e eVar, boolean z3, long j3, KeyEvent keyEvent) {
        if (eVar.f1471c != j3 && eVar.f1472d != z3) {
            boolean z4 = !this.f1445b.containsKey(Long.valueOf(eVar.f1470b));
            if (z4) {
                eVar.f1472d = !eVar.f1472d;
            }
            p(z4, Long.valueOf(eVar.f1471c), Long.valueOf(eVar.f1470b), keyEvent.getEventTime());
            if (!z4) {
                eVar.f1472d = !eVar.f1472d;
            }
            p(!z4, Long.valueOf(eVar.f1471c), Long.valueOf(eVar.f1470b), keyEvent.getEventTime());
        }
    }

    /* access modifiers changed from: package-private */
    public void q(Long l3, Long l4) {
        if (l4 != null) {
            if (this.f1445b.put(l3, l4) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f1445b.remove(l3) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
