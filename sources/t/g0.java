package t;

import android.content.Context;
import android.util.SparseIntArray;
import q.g;
import r.a;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f2972a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private g f2973b;

    public g0(g gVar) {
        o.h(gVar);
        this.f2973b = gVar;
    }

    public final int a(Context context, int i3) {
        return this.f2972a.get(i3, -1);
    }

    public final int b(Context context, a.f fVar) {
        o.h(context);
        o.h(fVar);
        int i3 = 0;
        if (!fVar.e()) {
            return 0;
        }
        int f4 = fVar.f();
        int a4 = a(context, f4);
        if (a4 == -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f2972a.size()) {
                    i3 = -1;
                    break;
                }
                int keyAt = this.f2972a.keyAt(i4);
                if (keyAt > f4 && this.f2972a.get(keyAt) == 0) {
                    break;
                }
                i4++;
            }
            a4 = i3 == -1 ? this.f2973b.f(context, f4) : i3;
            this.f2972a.put(f4, a4);
        }
        return a4;
    }

    public final void c() {
        this.f2972a.clear();
    }
}
