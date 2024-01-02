package u0;

import android.content.Context;
import android.util.Log;
import i0.b;
import java.util.Random;
import k0.a;
import t.o;
import v0.e;
import x.d;

public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final Random f3091f = new Random();

    /* renamed from: g  reason: collision with root package name */
    static e f3092g = new f();

    /* renamed from: h  reason: collision with root package name */
    static x.c f3093h = d.b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f3094a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3095b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3096c;

    /* renamed from: d  reason: collision with root package name */
    private long f3097d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f3098e;

    public c(Context context, a aVar, b bVar, long j3) {
        this.f3094a = context;
        this.f3095b = aVar;
        this.f3096c = bVar;
        this.f3097d = j3;
    }

    public void a() {
        this.f3098e = true;
    }

    public boolean b(int i3) {
        return (i3 >= 500 && i3 < 600) || i3 == -2 || i3 == 429 || i3 == 408;
    }

    public void c() {
        this.f3098e = false;
    }

    public void d(e eVar) {
        e(eVar, true);
    }

    public void e(e eVar, boolean z3) {
        o.h(eVar);
        long a4 = f3093h.a() + this.f3097d;
        String c4 = i.c(this.f3095b);
        String b4 = i.b(this.f3096c);
        if (z3) {
            eVar.C(c4, b4, this.f3094a);
        } else {
            eVar.E(c4, b4);
        }
        int i3 = 1000;
        while (f3093h.a() + ((long) i3) <= a4 && !eVar.w() && b(eVar.p())) {
            try {
                f3092g.a(f3091f.nextInt(250) + i3);
                if (i3 < 30000) {
                    if (eVar.p() != -2) {
                        i3 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i3 = 1000;
                    }
                }
                if (!this.f3098e) {
                    eVar.G();
                    String c5 = i.c(this.f3095b);
                    String b5 = i.b(this.f3096c);
                    if (z3) {
                        eVar.C(c5, b5, this.f3094a);
                    } else {
                        eVar.E(c5, b5);
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
