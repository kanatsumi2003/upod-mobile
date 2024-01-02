package t;

import android.content.Context;
import android.content.res.Resources;
import q.k;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3029a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3030b;

    public r(Context context) {
        o.h(context);
        Resources resources = context.getResources();
        this.f3029a = resources;
        this.f3030b = resources.getResourcePackageName(k.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f3029a.getIdentifier(str, "string", this.f3030b);
        if (identifier == 0) {
            return null;
        }
        return this.f3029a.getString(identifier);
    }
}
