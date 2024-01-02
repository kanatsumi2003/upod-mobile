package y;

import android.content.Context;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f3188b = new d();

    /* renamed from: a  reason: collision with root package name */
    private c f3189a = null;

    public static c a(Context context) {
        return f3188b.b(context);
    }

    public final synchronized c b(Context context) {
        if (this.f3189a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3189a = new c(context);
        }
        return this.f3189a;
    }
}
