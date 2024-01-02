package p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class j {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f2610a;

    public j(Context context, String str) {
        this.f2610a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j3 = this.f2610a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f2610a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f2610a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f2610a.edit().putStringSet(str2, hashSet).putLong("fire-count", j3 - 1).commit();
    }

    private synchronized String b(long j3) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j3).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j3));
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(long j3, String str) {
        String b4 = b(j3);
        if (!this.f2610a.getString("last-used-date", "").equals(b4)) {
            long j4 = this.f2610a.getLong("fire-count", 0);
            if (j4 + 1 == 30) {
                a();
                j4 = this.f2610a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f2610a.getStringSet(str, new HashSet()));
            hashSet.add(b4);
            this.f2610a.edit().putStringSet(str, hashSet).putLong("fire-count", j4 + 1).putString("last-used-date", b4).commit();
        }
    }
}
