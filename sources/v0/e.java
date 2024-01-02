package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.storage.j;
import f0.l;
import g0.d;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t.o;
import u0.h;
import w0.a;
import w0.b;

public abstract class e {

    /* renamed from: k  reason: collision with root package name */
    public static final Uri f3120k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l  reason: collision with root package name */
    static a f3121l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static String f3122m;

    /* renamed from: a  reason: collision with root package name */
    protected Exception f3123a;

    /* renamed from: b  reason: collision with root package name */
    private h f3124b;

    /* renamed from: c  reason: collision with root package name */
    private Context f3125c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f3126d;

    /* renamed from: e  reason: collision with root package name */
    private int f3127e;

    /* renamed from: f  reason: collision with root package name */
    private String f3128f;

    /* renamed from: g  reason: collision with root package name */
    private int f3129g;

    /* renamed from: h  reason: collision with root package name */
    private InputStream f3130h;

    /* renamed from: i  reason: collision with root package name */
    private HttpURLConnection f3131i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f3132j = new HashMap();

    public e(h hVar, d dVar) {
        o.h(hVar);
        o.h(dVar);
        this.f3124b = hVar;
        this.f3125c = dVar.l();
        H("x-firebase-gmpid", dVar.q().c());
    }

    private final void B(String str, String str2) {
        E(str, str2);
        try {
            F();
        } catch (IOException e4) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + v(), e4);
            this.f3123a = e4;
            this.f3127e = -2;
        }
        D();
    }

    private void F() {
        if (w()) {
            A(this.f3130h);
        } else {
            x(this.f3130h);
        }
    }

    private void b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] bArr;
        int i3;
        String str3;
        o.h(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        StringBuilder sb = new StringBuilder("Android/");
        String g3 = g(this.f3125c);
        if (!TextUtils.isEmpty(g3)) {
            sb.append(g3);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb.toString());
        for (Map.Entry next : this.f3132j.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        JSONObject h3 = h();
        if (h3 != null) {
            bArr = h3.toString().getBytes("UTF-8");
            i3 = bArr.length;
        } else {
            bArr = i();
            i3 = j();
            if (i3 == 0 && bArr != null) {
                i3 = bArr.length;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            str3 = "0";
        } else {
            if (h3 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            str3 = Integer.toString(i3);
        }
        httpURLConnection.setRequestProperty("Content-Length", str3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArr != null && bArr.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArr, 0, i3);
                } finally {
                    bufferedOutputStream.close();
                }
            } else {
                Log.e("NetworkRequest", "Unable to write to the http request!");
            }
        }
    }

    private HttpURLConnection c() {
        Uri v3 = v();
        Map<String, String> m3 = m();
        if (m3 != null) {
            Uri.Builder buildUpon = v3.buildUpon();
            for (Map.Entry next : m3.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            v3 = buildUpon.build();
        }
        return f3121l.a(new URL(v3.toString()));
    }

    private boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f3123a = new SocketException("Network subsystem is unavailable");
        this.f3127e = -2;
        return false;
    }

    private static String g(Context context) {
        if (f3122m == null) {
            try {
                f3122m = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("NetworkRequest", "Unable to find gmscore in package manager", e4);
            }
            if (f3122m == null) {
                f3122m = "[No Gmscore]";
            }
        }
        return f3122m;
    }

    private static String l(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    private void y(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f3128f = sb.toString();
        if (!w()) {
            this.f3123a = new IOException(this.f3128f);
        }
    }

    private void z(HttpURLConnection httpURLConnection) {
        o.h(httpURLConnection);
        this.f3127e = httpURLConnection.getResponseCode();
        this.f3126d = httpURLConnection.getHeaderFields();
        this.f3129g = httpURLConnection.getContentLength();
        this.f3130h = w() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    /* access modifiers changed from: protected */
    public void A(InputStream inputStream) {
        y(inputStream);
    }

    public void C(String str, String str2, Context context) {
        if (d(context)) {
            B(str, str2);
        }
    }

    public void D() {
        HttpURLConnection httpURLConnection = this.f3131i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void E(String str, String str2) {
        if (this.f3123a != null) {
            this.f3127e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + e() + " " + v());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3125c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f3127e = -2;
            this.f3123a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection c4 = c();
            this.f3131i = c4;
            c4.setRequestMethod(e());
            b(this.f3131i, str, str2);
            z(this.f3131i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f3127e);
            }
        } catch (IOException e4) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + v(), e4);
            this.f3123a = e4;
            this.f3127e = -2;
        }
    }

    public final void G() {
        this.f3123a = null;
        this.f3127e = 0;
    }

    public void H(String str, String str2) {
        this.f3132j.put(str, str2);
    }

    public <TResult> void a(l<TResult> lVar, TResult tresult) {
        Exception f4 = f();
        if (!w() || f4 != null) {
            lVar.b(j.e(f4, p()));
        } else {
            lVar.c(tresult);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public Exception f() {
        return this.f3123a;
    }

    /* access modifiers changed from: protected */
    public JSONObject h() {
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] i() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return l(this.f3124b.a());
    }

    /* access modifiers changed from: protected */
    public Map<String, String> m() {
        return null;
    }

    public String n() {
        return this.f3128f;
    }

    public JSONObject o() {
        if (TextUtils.isEmpty(this.f3128f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f3128f);
        } catch (JSONException e4) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f3128f, e4);
            return new JSONObject();
        }
    }

    public int p() {
        return this.f3127e;
    }

    public Map<String, List<String>> q() {
        return this.f3126d;
    }

    public String r(String str) {
        List list;
        Map<String, List<String>> q3 = q();
        if (q3 == null || (list = q3.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public int s() {
        return this.f3129g;
    }

    /* access modifiers changed from: protected */
    public h t() {
        return this.f3124b;
    }

    public InputStream u() {
        return this.f3130h;
    }

    public Uri v() {
        return this.f3124b.c();
    }

    public boolean w() {
        int i3 = this.f3127e;
        return i3 >= 200 && i3 < 300;
    }

    /* access modifiers changed from: protected */
    public void x(InputStream inputStream) {
        y(inputStream);
    }
}
