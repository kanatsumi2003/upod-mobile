package e;

import android.app.Person;
import android.app.Person$Builder;
import androidx.core.graphics.drawable.IconCompat;

public class y {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f1122a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1123b;

    /* renamed from: c  reason: collision with root package name */
    String f1124c;

    /* renamed from: d  reason: collision with root package name */
    String f1125d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1126e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1127f;

    public IconCompat a() {
        return this.f1123b;
    }

    public String b() {
        return this.f1125d;
    }

    public CharSequence c() {
        return this.f1122a;
    }

    public String d() {
        return this.f1124c;
    }

    public boolean e() {
        return this.f1126e;
    }

    public boolean f() {
        return this.f1127f;
    }

    public String g() {
        String str = this.f1124c;
        if (str != null) {
            return str;
        }
        if (this.f1122a == null) {
            return "";
        }
        return "name:" + this.f1122a;
    }

    public Person h() {
        return new Person$Builder().setName(c()).setIcon(a() != null ? a().n() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
