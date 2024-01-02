package u0;

import android.net.Uri;
import android.text.TextUtils;
import t.o;

public class d {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : c(Uri.encode(str));
    }

    public static String c(String str) {
        o.h(str);
        return str.replace("%2F", "/");
    }
}
