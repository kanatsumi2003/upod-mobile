package i2;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.q;

public class h {

    public interface a {
        String a();

        String b();

        List<String> c();

        List<String> d(c cVar);

        String e();

        String g();
    }

    private static class b extends q {

        /* renamed from: d  reason: collision with root package name */
        public static final b f1401d = new b();

        private b() {
        }
    }

    public enum c {
        root(0),
        music(1),
        podcasts(2),
        ringtones(3),
        alarms(4),
        notifications(5),
        pictures(6),
        movies(7),
        downloads(8),
        dcim(9),
        documents(10);
        

        /* renamed from: d  reason: collision with root package name */
        private int f1414d;

        private c(int i3) {
            this.f1414d = i3;
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
