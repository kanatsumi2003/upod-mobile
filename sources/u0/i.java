package u0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import g0.d;
import h0.a;
import i0.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.n;
import t.o;
import v0.e;

public class i {
    public static boolean a(Object obj, Object obj2) {
        return n.a(obj, obj2);
    }

    public static String b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            a aVar = (a) f0.n.b(bVar.b(false), 30000, TimeUnit.MILLISECONDS);
            if (aVar.a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + aVar.a());
            }
            return aVar.b();
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e4);
            return null;
        }
    }

    public static String c(k0.a aVar) {
        String str;
        if (aVar != null) {
            try {
                str = ((j0.a) f0.n.b(aVar.a(false), 30000, TimeUnit.MILLISECONDS)).a();
            } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                Log.e("StorageUtil", "error getting token " + e4);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    public static Uri d(d dVar, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = e.f3120k;
        if (str.toLowerCase().startsWith("gs://")) {
            String b4 = d.b(d.a(str.substring(5)));
            return Uri.parse("gs://" + b4);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || (!a(scheme.toLowerCase(), "http") && !a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String c4 = d.c(parse.getEncodedPath());
        if (indexOf == 0 && c4.startsWith("/")) {
            int indexOf2 = c4.indexOf("/b/", 0);
            int i3 = indexOf2 + 3;
            int indexOf3 = c4.indexOf("/", i3);
            int indexOf4 = c4.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            str2 = c4.substring(i3, indexOf3);
            c4 = indexOf4 != -1 ? c4.substring(indexOf4 + 3) : "";
        } else if (indexOf > 1) {
            str2 = parse.getAuthority().substring(0, indexOf - 1);
        } else {
            Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
        }
        o.e(str2, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(str2).encodedPath(c4).build();
    }

    public static long e(String str) {
        if (str == null) {
            return 0;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e4) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e4);
            return 0;
        }
    }
}
