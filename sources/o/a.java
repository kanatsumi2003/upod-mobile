package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import t.o;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f2548c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f2549d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f2550a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f2551b;

    a(Context context) {
        this.f2551b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        o.h(context);
        Lock lock = f2548c;
        lock.lock();
        try {
            if (f2549d == null) {
                f2549d = new a(context.getApplicationContext());
            }
            a aVar = f2549d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f2548c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c4;
        String c5 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c5) || (c4 = c(d("googleSignInAccount", c5))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m(c4);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        this.f2550a.lock();
        try {
            return this.f2551b.getString(str, (String) null);
        } finally {
            this.f2550a.unlock();
        }
    }
}
